/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import org.junit.Assert
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages._

import java.time.LocalDate

class ReturnsStepDef extends BaseStepDef {

  val host: String           = TestConfiguration.url("one-stop-shop-returns-frontend")
  val exclusionsHost: String = TestConfiguration.url("one-stop-shop-exclusions-frontend")

  val lastYear = LocalDate.now().minusYears(1).getYear.toString
  val fourYearsAgo = LocalDate.now().minusYears(3).getYear.toString

  Given("^the user navigates to a previously submitted return$") { () =>
    ReturnPage.navigateToPreviouslySubmittedReturn()
  }

  Given("^the user navigates to past returns history$") { () =>
    ReturnPage.navigateToPastReturnsHistory()
  }

  Then("""^the user has been directed to the payments service$""") { () =>
    ReturnPage.paymentsUrl()
  }

  Then("""^the user is directed to the Welsh transition page$""") { () =>
    driver.getCurrentUrl contains s"$host/no-welsh-service?redirectUrl"
  }

  Then("""^the user is directed back to the index page$""") { () =>
    driver.getCurrentUrl shouldBe s"$host/your-account"
  }

  When(
    """^the user enters (first|second) EU country total sales of (.*) for (first|second) selected VAT rate on the (.*) page$"""
  ) { (index: String, netValueData: String, vatRate: String, urlPage: String) =>
    CommonPage.checkDoubleIndexURL(index, vatRate, urlPage, "")
    CommonPage.enterData("value", netValueData)
    CommonPage.submitForm()
  }

  When(
    """^the user confirms the vat for the (first|second) EU country as the suggested amount for the (first|second) selected VAT rate on the (.*) page$"""
  ) { (indexCountry: String, indexVatRate: String, urlPage: String) =>
    CommonPage.checkDoubleIndexURL(indexCountry, indexVatRate, urlPage, "")
    driver.findElement(By.id("value_0")).click()
    CommonPage.submitForm()
  }

  When(
    """^the user enters a different amount of VAT totalling (.*) for the (first|second) EU country and the (first|second) selected VAT rate on the (.*) page$"""
  ) { (newVatAmount: String, indexCountry: String, indexVatRate: String, urlPage: String) =>
    CommonPage.checkDoubleIndexURL(indexCountry, indexVatRate, urlPage, "")
    driver.findElement(By.id("value_1")).click()
    CommonPage.enterData("amount", newVatAmount)
    CommonPage.submitForm()
  }

  When("""^the user ticks the (first|second) checkbox on the (first|second) (.*) page$""") {

    (checkbox: String, index: String, url: String) =>
      index match {
        case "first"  => CommonPage.checkUrl(url + "/1")
        case "second" => CommonPage.checkUrl(url + "/2")
        case _        => throw new Exception("Index doesn't exist")
      }
      CommonPage.tickCheckbox(checkbox)
  }

  Then("""^the user clicks the Save and come back later button$""") { () =>
    driver.findElement(By.id("saveProgress")).click()
  }

  Then("""^the user submits their return$""") { () =>
    CommonPage.clickSubmit()
    CommonPage.checkUrl("return-submitted")
  }

  Then("""^the user sees the no returns message$""") { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(htmlBody.contains("You have not submitted any returns."))
  }

  Then("""^the user sees the exclusion submission message$""") { () =>
    val hmrcExclusionMessage = driver.findElement(By.className("govuk-warning-text__text")).getText
    Assert.assertTrue(
      hmrcExclusionMessage.contains(
        "After you submit this return, you will not be able to make any corrections using the One Stop Shop service."
      )
    )
  }

  Then("""^the user sees the final return message on the dashboard$""") { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(htmlBody.contains("This is your final return on this service."))
  }

  Then("""^the user sees the next available return due message$""") { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(htmlBody.contains(CommonPage.generateNextAvailableReturn()))
  }

  When("""^the user manually navigates to the (.*) start page$""") { (period: String) =>
    ReturnPage.navigateToReturnStartPage(period)
  }

  When("""^the user manually navigates to the start page for the current period$""") { () =>
    ReturnPage.navigateToReturnStartPage(CommonPage.currentPeriod())
  }

  Then("""^the user selects the (.*) option""") { (option: String) =>
    option match {
      case "Continue my return"               => driver.findElement(By.id("value_0")).click()
      case "Delete my return and start again" => driver.findElement(By.id("value_1")).click()
      case _                                  => throw new Exception("Link doesn't exist")
    }
    CommonPage.clickContinue()
  }

  Then("""^the user selects the (.*) return period""") { (option: String) =>
    option match {
      case "first"  => driver.findElement(By.id("value_0")).click()
      case "second" => driver.findElement(By.id("value_1")).click()
      case _        => throw new Exception("Link doesn't exist")
    }
    CommonPage.clickContinue()
  }

  Then(
    """^the user transferring (from|to) another MSID is (offered|submitting) a (partial|full) return for the correct period$"""
  ) { (transferDirection: String, returnStage: String, returnType: String) =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    val heading  = driver.findElement(By.tagName("h1")).getText
    if (transferDirection == "to" && returnStage == "offered" && returnType == "full") {
      Assert.assertTrue(heading.contains("1 April to 30 June 2023"))
    } else if (transferDirection == "to" && returnStage == "submitting" && returnType == "full") {
      Assert.assertTrue(htmlBody.contains("1 April to 30 June 2023"))
    } else if (transferDirection == "to" && returnType == "partial") {
      Assert.assertTrue(htmlBody.contains("1 July to 8 September 2023"))
    } else if (transferDirection == "from" && returnType == "partial") {
      Assert.assertTrue(htmlBody.contains("9 June to 30 June 2023"))
    } else {
      Assert.assertTrue(heading.contains("1 July to 30 September 2023"))
    }

  }

  Then(
    """^the user is presented with the corrections warning regarding their final return$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(htmlBody.contains("You can correct a previous return when you submit your final one."))
  }

  Then(
    """^the user transferring (to|from) another MSID has the correct partial dates in the past return$"""
  ) { (direction: String) =>
    if (direction == "to") {
      ReturnPage.checkTransferringToOtherMSIDPastReturn()
    } else {
      ReturnPage.checkTransferringFromOtherMSIDPastReturn()
    }

  }

  Then("""^the link to (Leave|Rejoin|Cancel your request to leave) this service is not displayed on the dashboard$""") {
    (link: String) =>
      val htmlBody = driver.findElement(By.tagName("body")).getText

      link match {
        case "Leave"                        => Assert.assertFalse(htmlBody.contains("Leave this service"))
        case "Rejoin"                       => Assert.assertFalse(htmlBody.contains("Rejoin this service"))
        case "Cancel your request to leave" => Assert.assertFalse(htmlBody.contains("Cancel your request to leave"))
        case _                              => throw new Exception("Link doesn't exist")
      }
  }

  Then(
    """^the user has been redirected to the rejoin journey$"""
  ) { () =>
    CommonPage.checkRejoinUrl()
  }

  Then(
    """^a dashboard message is displayed for a return outstanding for more than 3 years$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        s"You must complete your January to March $fourYearsAgo return with the countries where you made your sales."
      )
    )
  }

  When(
    """^the user manually navigates to their (.*) return$"""
  ) { (returnPeriod: String) =>
    ReturnPage.navigateToPastReturn(returnPeriod)
  }

  When("""^the user accesses the start return link via secure messages$""") { () =>
    ReturnPage.navigateToSecureStartReturn()
  }

  Then("""^they are presented with the regular heading for starting a return$""") { () =>
    val htmlH1 = driver.findElement(By.tagName("h1")).getText
    Assert.assertTrue(htmlH1.equals(s"Do you want to start your return for 1 January to 31 March $lastYear?"))
  }

}

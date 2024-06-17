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
import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.CommonPage
import uk.gov.hmrc.test.ui.pages.CommonPage.{checkTransferringToOtherMSIDPastReturn, clickContinue, selectLink}

class ReturnsStepDef extends BaseStepDef {

  val host: String           = TestConfiguration.url("one-stop-shop-returns-frontend")
  val exclusionsHost: String = TestConfiguration.url("one-stop-shop-exclusions-frontend")

  Given("^the user navigates to the auth page$") { () =>
    CommonPage.goToAuthPage()
  }

  Given("^the user accesses the service$") { () =>
    CommonPage.goToStartOfJourney()
  }

  Given("^the user navigates to the start your return page$") { () =>
    CommonPage.navigateToStartYourReturnPage()
  }

  Given("^the user navigates to a previously submitted return$") { () =>
    CommonPage.navigateToPreviouslySubmittedReturn()
  }

  Given("^the user navigates to past returns history$") { () =>
    CommonPage.navigateToPastReturnsHistory()
  }

  Given("^the (user|assistant) signs in as an Organisation Admin with VAT enrolment (.*) and strong credentials$") {
    (user: String, vrn: String) =>
      driver.findElement(By.id("redirectionUrl")).clear()
      driver
        .findElement(By.id("redirectionUrl"))
        .sendKeys(s"$host/your-account")
      val selectCredentialStrength = new Select(driver.findElement(By.id("credentialStrength")))
      selectCredentialStrength.selectByValue("strong")
      val selectAffinityGroup      = new Select(driver.findElement(By.id("affinityGroupSelect")))
      selectAffinityGroup.selectByValue("Organisation")

      if (user == "assistant") {
        val selectAffinityGroup = new Select(driver.findElement(By.id("credential-role-select")))
        selectAffinityGroup.selectByValue("Assistant")
      }

      driver.findElement(By.id("enrolment[0].name")).sendKeys("HMRC-MTD-VAT")
      driver
        .findElement(By.id("input-0-0-name"))
        .sendKeys("VRN")
      driver
        .findElement(By.id("input-0-0-value"))
        .sendKeys(vrn)
      driver.findElement(By.id("enrolment[1].name")).sendKeys("HMRC-OSS-ORG")
      driver
        .findElement(By.id("input-1-0-name"))
        .sendKeys("VRN")
      driver
        .findElement(By.id("input-1-0-value"))
        .sendKeys(vrn)
      driver.findElement(By.cssSelector("Input[value='Submit']")).click()
  }
  Given("^the user signs in as an Organisation Admin with Hmrc Mdt enrolment (.*) and strong credentials$") {
    (vrn: String) =>
      driver.findElement(By.id("redirectionUrl")).clear()
      driver
        .findElement(By.id("redirectionUrl"))
        .sendKeys(s"$host/your-account")
      val selectCredentialStrength = new Select(driver.findElement(By.id("credentialStrength")))
      selectCredentialStrength.selectByValue("strong")
      val selectAffinityGroup      = new Select(driver.findElement(By.id("affinityGroupSelect")))
      selectAffinityGroup.selectByValue("Organisation")
      driver.findElement(By.id("enrolment[0].name")).sendKeys("HMRC-MTD-VAT")
      driver
        .findElement(By.id("input-0-0-name"))
        .sendKeys("VRN")
      driver
        .findElement(By.id("input-0-0-value"))
        .sendKeys(vrn)
      driver.findElement(By.cssSelector("Input[value='Submit']")).click()
  }
  Given("^the user signs in as an Organisation Admin with Hmrc Oss VAT enrolment (.*) and strong credentials$") {
    (vrn: String) =>
      driver.findElement(By.id("redirectionUrl")).clear()
      driver
        .findElement(By.id("redirectionUrl"))
        .sendKeys(s"$host/your-account")
      val selectCredentialStrength = new Select(driver.findElement(By.id("credentialStrength")))
      selectCredentialStrength.selectByValue("strong")
      val selectAffinityGroup      = new Select(driver.findElement(By.id("affinityGroupSelect")))
      selectAffinityGroup.selectByValue("Organisation")
      driver.findElement(By.id("enrolment[0].name")).sendKeys("HMRC-OSS-VAT")
      driver
        .findElement(By.id("input-1-0-name"))
        .sendKeys("VRN")
      driver
        .findElement(By.id("input-1-0-value"))
        .sendKeys(vrn)
      driver.findElement(By.cssSelector("Input[value='Submit']")).click()
  }

  When("""^the user answers (yes|no) on the (.*) page$""") { (data: String, url: String) =>
    CommonPage.checkUrl(url)
    CommonPage.selectAnswer(data)
  }

  Then("""^the user has been directed to the payments service$""") { () =>
    CommonPage.paymentsUrl()
  }

  Then("""^the user is on the (.*) page$""") { (url: String) =>
    CommonPage.checkUrl(url)
  }

  Then("""^the user is directed to the Welsh transition page$""") { () =>
    driver.getCurrentUrl contains s"$host/no-welsh-service?redirectUrl"
  }

  Then("""^the user is directed back to the index page$""") { () =>
    driver.getCurrentUrl shouldBe s"$host/your-account"
  }

  When("""^the user adds (.*) on the (first|second) (.*) page$""") { (data: String, index: String, url: String) =>
    index match {
      case "first"  => CommonPage.checkUrl(url + "/1")
      case "second" => CommonPage.checkUrl(url + "/2")
      case _        => throw new Exception("Index doesn't exist")
    }
    CommonPage.enterData(data = data)
    CommonPage.submitForm()
  }

  When("""^the user selects (.*) on the (first|second|third|fourth|fifth) (.*) page$""") {
    (data: String, index: String, url: String) =>
      index match {
        case "first"  => CommonPage.checkUrl(url + "/1")
        case "second" => CommonPage.checkUrl(url + "/2")
        case "third"  => CommonPage.checkUrl(url + "/3")
        case "fourth" => CommonPage.checkUrl(url + "/4")
        case "fifth"  => CommonPage.checkUrl(url + "/5")
        case _        => throw new Exception("Index doesn't exist")
      }
      CommonPage.selectValueAutocomplete(data)
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

  Then("""^the user clicks the continue button$""") { () =>
    clickContinue()
  }

  Then("""^the user clicks the Save and come back later button$""") { () =>
    driver.findElement(By.id("saveProgress")).click()
  }

  Then("""^the user submits their return$""") { () =>
    clickContinue()
    CommonPage.checkUrl("return-submitted")
  }

  Then("""^the user is informed their return cannot be submitted$""") { () =>
    clickContinue()
    CommonPage.checkUrl("return-not-submitted")
  }

  Then("""^the user clicks on the (.*) link$""") { (link: String) =>
    link match {
      case "Start your return"                =>
        driver.findElement(By.id("start-your-return")).click()
      case "Continue your return"             =>
        driver.findElement(By.id("continue-your-return")).click()
      case "Back to your account"             =>
        driver.findElement(By.id("back-to-your-account")).click()
      case "View past returns"                =>
        driver.findElement(By.id("view-past-returns")).click()
      case "1 July to 30 September 2021"      =>
        driver.findElement(By.id("period")).click()
      case "1 July to 8 September 2023"       =>
        selectLink("past-returns\\/2023-Q3")
      case "9 June to 30 June 2023"           =>
        selectLink("past-returns\\/2023-Q2")
      case "continue to complete your return" =>
        driver.findElement(By.id("continueToYourReturn")).click()
      case "return to your account"           =>
        driver.findElement(By.id("backToYourAccount")).click()
      case "sign out and come back later"     =>
        driver.findElement(By.id("signOut")).click()
      case "Make a payment"                   =>
        driver.findElement(By.id("make-a-payment")).click()
      case "Change your registration"         =>
        driver.findElement(By.id("change-your-registration")).click()
      case "Leave this service"               =>
        driver.findElement(By.id("leave-this-service")).click()
      case "Rejoin this service"              =>
        driver.findElement(By.id("rejoin-this-service")).click()
      case "Cancel your request to leave"     =>
        driver.findElement(By.id("cancel-request-to-leave")).click()
      case _                                  =>
        throw new Exception("Link doesn't exist")
    }
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
    CommonPage.navigateToReturnStartPage(period)
  }

  When("""^the user manually navigates to the (.*) link$""") { (link: String) =>
    CommonPage.navigateToBtaLink(link)
  }

  When("""^the user manually navigates to the start page for the current period$""") { () =>
    CommonPage.navigateToReturnStartPage(CommonPage.currentPeriod())
  }

  Then("""^the user clicks on the Back to your account button$""") { () =>
    driver.findElement(By.id("back-to-your-account")).click()
  }

  Then("""^the user clicks on the (.*) breadcrumb""") { (id: String) =>
    driver
      .findElement(By.id(id))
      .click()
  }

  Then("""^the user selects the (.*) option""") { (option: String) =>
    option match {
      case "Continue my return"               => driver.findElement(By.id("value_0")).click()
      case "Delete my return and start again" => driver.findElement(By.id("value_1")).click()
      case _                                  => throw new Exception("Link doesn't exist")
    }
    clickContinue()
  }

  Then("""^the user selects the (.*) return period""") { (option: String) =>
    option match {
      case "first"  => driver.findElement(By.id("value_0")).click()
      case "second" => driver.findElement(By.id("value_1")).click()
      case _        => throw new Exception("Link doesn't exist")
    }
    clickContinue()
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
      checkTransferringToOtherMSIDPastReturn()
    } else {}

  }

  Then(
    """^the user has been redirected to the exclusions service$"""
  ) { () =>
    CommonPage.checkExclusionsUrl()
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

  When("""^the user manually navigates to the self exclude journey$""") { () =>
    CommonPage.goToExclusionsJourney()
  }

  Then(
    """^they are presented with the correct banner for trader with an exclusion date in the future with outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains("You have requested to leave this service. You must complete and pay any outstanding returns.")
    )
  }

  Then(
    """^they are presented with the correct banner for trader with an exclusion date in the past and no outstanding actions$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains("You have left this service.")
    )
  }

  Then("""^they are shown the correct returns message for no outstanding returns$""") { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        "You can no longer use this service to correct previous returns. You must make any VAT corrections directly with the country where you made the sales."
      )
    )
  }

  Then("""^the returns tile shows final return is completed$""") { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(htmlBody.contains("You've completed your final return."))
  }

  Then(
    """^they are presented with the correct banner for trader with an exclusion date in the past with a return due$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains("You have left this service. You must complete and pay any outstanding returns.")
    )
  }

  Then("""^they are shown the correct returns message for outstanding returns$""") { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(htmlBody.contains("You can correct a previous return when you submit your final one."))
  }

  Then(
    """^they are presented with the correct banner for trader removed from service and has outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains("We've removed you from this service, but you must complete and pay your final return.")
    )
  }

  Then(
    """^they are presented with the correct banner for trader removed from service and has no outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains("We've removed you from this service.")
    )
  }

  Then(
    """^they are presented with the correct banner for a quarantined trader with outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        "We've removed you from this service, but you must complete and pay your final return. You cannot rejoin until"
      )
    )
  }

  Then(
    """^they are presented with the correct banner for a quarantined trader with no outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        "We've removed you from this service. You cannot rejoin until"
      )
    )
  }

  Then(
    """^the user has been redirected to the rejoin journey$"""
  ) { () =>
    CommonPage.checkRejoinUrl()
  }

}

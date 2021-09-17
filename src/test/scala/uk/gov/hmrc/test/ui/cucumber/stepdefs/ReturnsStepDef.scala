/*
 * Copyright 2021 HM Revenue & Customs
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
import uk.gov.hmrc.test.ui.pages.CommonPage

class ReturnsStepDef extends BaseStepDef {

  Given("^the user accesses the service$") { () =>
    CommonPage.goToStartOfJourney()
  }

  Given("^the user signs in as an Organisation Admin with VAT enrolment (.*) and strong credentials$") {
    (vrn: String) =>
      driver.findElement(By.name("redirectionUrl")).clear()
      driver
        .findElement(By.name("redirectionUrl"))
        .sendKeys("http://localhost:10204/pay-vat-on-goods-sold-to-eu/northern-ireland-returns-payments/your-account")
      val selectCredentialStrength = new Select(driver.findElement(By.id("credentialStrength")))
      selectCredentialStrength.selectByValue("strong")
      val selectAffinityGroup      = new Select(driver.findElement(By.id("affinityGroupSelect")))
      selectAffinityGroup.selectByValue("Organisation")
      driver.findElement(By.id("enrolment[0].name")).sendKeys("HMRC-MTD-VAT")
      driver
        .findElement(By.xpath("/html/body/main/div[2]/form/div[1]/div[26]/table/tbody/tr[2]/td[2]/input"))
        .sendKeys("VRN")
      driver
        .findElement(By.xpath("/html/body/main/div[2]/form/div[1]/div[26]/table/tbody/tr[2]/td[3]/input"))
        .sendKeys(vrn)
      driver.findElement(By.cssSelector("Input[value='Submit']")).click()
  }

  When("""^the user answers (yes|no) on the (.*) page$""") { (data: String, url: String) =>
    CommonPage.checkUrl(url)
    CommonPage.selectAnswer(data)
  }

  Then("""^the user is on the (.*) page$""") { (url: String) =>
    CommonPage.checkUrl(url)
  }

  Then("""^the user is directed back to the index page$""") { () =>
    driver.getCurrentUrl shouldBe "http://localhost:10204/pay-vat-on-goods-sold-to-eu/northern-ireland-returns-payments/your-account"
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

  When("""^the user selects (.*) on the (first|second) (.*) page$""") { (data: String, index: String, url: String) =>
    index match {
      case "first"  => CommonPage.checkUrl(url + "/1")
      case "second" => CommonPage.checkUrl(url + "/2")
      case _        => throw new Exception("Index doesn't exist")
    }
    CommonPage.selectValueAutocomplete(data)
  }

  When(
    """^the user enters (first|second) EU country total sales of (.*) for (first|second) selected VAT rate on the (.*) page$"""
  ) { (index: String, netValueData: String, vatRate: String, urlPage: String) =>
    CommonPage.checkVatAndSalesURL(index, vatRate, urlPage)
    CommonPage.enterData("value", netValueData)
    CommonPage.submitForm()
  }

  When(
    """^the user confirms the vat for the (first|second) EU country as the suggested amount for the (first|second) selected VAT rate on the (.*) page$"""
  ) { (indexCountry: String, indexVatRate: String, urlPage: String) =>
    CommonPage.checkVatAndSalesURL(indexCountry, indexVatRate, urlPage)
    driver.findElement(By.id("value_0")).click()
    CommonPage.submitForm()
  }

  When(
    """^the user enters a different amount of VAT totalling (.*) for the (first|second) EU country and the (first|second) selected VAT rate on the (.*) page$"""
  ) { (newVatAmount: String, indexCountry: String, indexVatRate: String, urlPage: String) =>
    CommonPage.checkVatAndSalesURL(indexCountry, indexVatRate, urlPage)
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
    driver.findElement(By.xpath("//*[@id='main-content']/div/div/form/button")).click()
  }

  Then("""^the user submits their return$""") { () =>
    CommonPage.clickContinue()
    CommonPage.checkUrl("return-submitted")
  }

  Then("""^the user clicks on the (.*) link$""") { (link: String) =>
    link match {
      case "Start your return"           =>
        driver
          .findElement(By.xpath("/html/body/div/main/div/div/div[1]/div[1]/div/p[2]/a"))
          .click()
      case "Back to your account"        =>
        driver
          .findElement(By.xpath("/html/body/div/main/div/div/div[1]/p[6]/a"))
          .click()
      case "View past returns"           =>
        driver
          .findElement(By.xpath("/html/body/div/main/div/div/div[1]/div[2]/div/p/a"))
          .click()
      case "1 July to 30 September 2021" =>
        driver
          .findElement(By.xpath("/html/body/div/main/div/div/div[2]/div/ul/li/a"))
          .click()
      case _                             => throw new Exception("Link doesn't exist")
    }
  }

  Then("""^the user sees the no returns message$""") { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(htmlBody.contains("You have not submitted any returns for this year."))
  }

  Then("""^the user sees the no returns due message$""") { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(htmlBody.contains("You do not have any returns due"))
  }

  When("""^the user manually navigates to the start page$""") { () =>
    driver
      .navigate()
      .to("http://localhost:10204/pay-vat-on-goods-sold-to-eu/northern-ireland-returns-payments/2021-Q3/start")
  }
  Then("""^the user clicks on the Back to your account button$""") { () =>
    driver.findElement(By.xpath("/html/body/div/main/div/div/a")).click()
  }

}

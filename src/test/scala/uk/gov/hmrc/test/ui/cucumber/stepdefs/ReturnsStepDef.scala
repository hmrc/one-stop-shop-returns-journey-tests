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
        .sendKeys("http://localhost:10204/pay-vat-on-goods-sold-to-eu/northern-ireland-returns/")
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

      eventually {
        driver.getCurrentUrl should be("http://localhost:10204/pay-vat-on-goods-sold-to-eu/northern-ireland-returns/")
      }
  }

  When("""^the user navigates to the start page$""") { () =>
    driver
      .navigate()
      .to("http://localhost:10204/pay-vat-on-goods-sold-to-eu/northern-ireland-returns/2021-Q3/startReturn")
  }

  When("""^the user answers (yes|no) on the (.*) page$""") { (data: String, url: String) =>
    CommonPage.checkUrl(url)
    CommonPage.selectAnswer(data)
  }

  Then("""^the user is on the (.*) page$""") { (url: String) =>
    CommonPage.checkUrl(url)
  }

  Then("""^the user is directed back to the index page$""") { () =>
    driver.getCurrentUrl shouldBe "http://localhost:10204/pay-vat-on-goods-sold-to-eu/northern-ireland-returns"
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
    """^the user enters (first|second) EU country total sales of (.*) and vat of (.*) for (first|second) selected VAT rate on the (.*) page$"""
  ) { (index: String, netValueData: String, vatData: String, vatRate: String, urlPage: String) =>
    (index, vatRate) match {
      case ("first", "first")   => CommonPage.checkUrl(urlPage + "/1/1")
      case ("first", "second")  => CommonPage.checkUrl(urlPage + "/1/2")
      case ("second", "first")  => CommonPage.checkUrl(urlPage + "/2/1")
      case ("second", "second") => CommonPage.checkUrl(urlPage + "/2/2")
      case _                    => throw new Exception("Combination of Vat rate and index doesn't exist")
    }
    CommonPage.enterData("netValueOfSales", netValueData)
    CommonPage.enterData("vatOnSales", vatData)
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

}

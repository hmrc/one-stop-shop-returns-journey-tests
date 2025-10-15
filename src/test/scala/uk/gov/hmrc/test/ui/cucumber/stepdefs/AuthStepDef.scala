/*
 * Copyright 2025 HM Revenue & Customs
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
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages._

class AuthStepDef extends BaseStepDef {

  val host: String = TestConfiguration.url("one-stop-shop-returns-frontend")

  Given("^the user navigates to the auth page$") { () =>
    AuthPage.goToAuthPage()
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

}

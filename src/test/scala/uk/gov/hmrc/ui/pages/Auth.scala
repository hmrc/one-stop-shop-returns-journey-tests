/*
 * Copyright 2026 HM Revenue & Customs
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

package uk.gov.hmrc.ui.pages

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import uk.gov.hmrc.configuration.TestEnvironment
import org.scalatest.matchers.should.Matchers.*

import scala.util.Random

object Auth extends BasePage {

  private val authUrl: String             = TestEnvironment.url("auth-login-stub") + "/auth-login-stub/gg-sign-in"
  private val registrationUrl: String     =
    TestEnvironment.url("one-stop-shop-registration-frontend")
  private val journeyUrl: String          = "/pay-vat-on-goods-sold-to-eu/northern-ireland-register"
  private val dashboardUrl: String        =
    TestEnvironment.url("one-stop-shop-returns-frontend")
  private val dashboardJourneyUrl: String = "/pay-vat-on-goods-sold-to-eu/northern-ireland-returns-payments"

  var credId: String = "1234123412341234"

  def goToAuthorityWizard(): Unit = {
    get(authUrl)
    fluentWait.until(ExpectedConditions.urlContains(authUrl))
  }

  def checkAuthUrl(): Unit =
    getCurrentUrl should startWith(authUrl)

  def loginUsingAuthorityWizard(vrn: String, affinityGroup: String, accountType: String, journey: String): Unit = {

    getCurrentUrl should startWith(authUrl)

    sendKeys(By.name("redirectionUrl"), s"$dashboardUrl$dashboardJourneyUrl")

    if (journey == "saveReturn") {
      generateCredId()
      sendKeys(By.name("authorityId"), retrieveCredId())
    } else if (journey == "retrieveReturn") {
      sendKeys(By.name("authorityId"), retrieveCredId())
    }

    sendKeys(By.id("enrolment[0].name"), "HMRC-MTD-VAT")
    sendKeys(By.id("input-0-0-name"), "VRN")
    sendKeys(By.id("input-0-0-value"), vrn)

    selectByValue(By.id("affinityGroupSelect"), "Organisation")

    if (accountType == "hasOSSEnrolment") {
      sendKeys(By.id("enrolment[1].name"), "HMRC-OSS-ORG")
      sendKeys(By.id("input-1-0-name"), "VRN")
      sendKeys(By.id("input-1-0-value"), vrn)
    }

    click(By.cssSelector("Input[value='Submit']"))

    if (vrn == "777777771") {
      fluentWait.until(ExpectedConditions.urlContains("delete-all-fixed-establishment"))
    }
  }

  def retrieveCredId(): String =
    credId

  def generateCredId(): Unit =
    credId = Random.between(1000000000000000L, 9000000000000000L).toString

}

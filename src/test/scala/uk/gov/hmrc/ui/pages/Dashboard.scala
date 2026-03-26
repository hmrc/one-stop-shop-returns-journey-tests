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

package uk.gov.hmrc.ui.pages

import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.scalatest.matchers.should.Matchers.*
import uk.gov.hmrc.configuration.TestEnvironment
import uk.gov.hmrc.selenium.webdriver.Driver

object Dashboard extends BasePage {

  private val dashboardUrl: String        =
    TestEnvironment.url("one-stop-shop-returns-frontend")
  private val dashboardJourneyUrl: String = "/pay-vat-on-goods-sold-to-eu/northern-ireland-returns-payments"

  def goToDashboardJourney(): Unit =
    get(dashboardUrl + dashboardJourneyUrl)

  def checkJourneyUrl(page: String): Unit =
    val url = s"$dashboardUrl$dashboardJourneyUrl/$page"
    fluentWait.until(ExpectedConditions.urlContains(url))
    getCurrentUrl should startWith(url)

  def checkProblemPage(): Unit = {
    fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")))
    val h1 = Driver.instance.findElement(By.tagName("h1")).getText
    Assert.assertTrue(h1.equals("Sorry, there is a problem with the service"))
  }

  def insufficientEnrolmentPage(): Unit = {
    fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")))
    val h1 = Driver.instance.findElement(By.tagName("h1")).getText
    Assert.assertTrue(h1.equals("You cannot use this service"))
  }

  def clickLink(link: String): Unit =
    click(By.id(link))

  def checkName(nameType: String): Unit = {
    val htmlBody = Driver.instance.findElement(By.tagName("body")).getText
    if (nameType == "organisation") {
      Assert.assertTrue(htmlBody.contains("Company Name"))
    } else {
      Assert.assertTrue(htmlBody.contains("first middle last"))
    }
  }

  def clickBackButton(): Unit =
    Driver.instance
      .navigate()
      .back()

  def goToPage(page: String): Unit =
    get(s"$dashboardUrl$dashboardJourneyUrl/$page")
}

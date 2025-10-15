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

package uk.gov.hmrc.test.ui.pages

import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.conf.TestConfiguration

import java.time.LocalDate

object ReturnPage extends BasePage with Matchers {

  val host: String = TestConfiguration.url("one-stop-shop-returns-frontend")

  def goToStartOfJourney(): Unit =
    get(s"$host/your-account")

  def navigateToStartYourReturnPage(): Unit = {
    val lastYear = LocalDate.now().minusYears(1).getYear.toString
    get(s"$host/$lastYear-Q2/start")
  }

  def navigateToPreviouslySubmittedReturn(): Unit =
    get(s"$host/past-returns/2022-Q1")

  def navigateToPastReturnsHistory(): Unit =
    get(s"$host/past-returns")

  def paymentsUrl(): Unit =
    fluentWait.until(ExpectedConditions.urlContains("pay/select-payment-amount?traceId="))

  def navigateToReturnStartPage(period: String): Unit =
    get(s"$host/$period/start")

  def checkTransferringToOtherMSIDPastReturn(): Unit = {
    val htmlH1 = Driver.instance.findElement(By.tagName("h1")).getText
    Assert.assertTrue(htmlH1.contains("1 July to 8 September 2023"))
  }

  def checkTransferringFromOtherMSIDPastReturn(): Unit = {
    val htmlH1 = Driver.instance.findElement(By.tagName("h1")).getText
    Assert.assertTrue(htmlH1.contains("9 June to 30 June 2023"))
  }

  def navigateToPastReturn(returnPeriod: String): Unit = {

    val period = returnPeriod match {
      case "Q1 2018" => "2018-Q1"
      case "Q3 2018" => "2018-Q3"
      case _         => "period doesn't exist"
    }
    get(s"$host/past-returns/$period")
  }

  def navigateToSecureStartReturn(): Unit =
    get(s"$host/start-return")

}

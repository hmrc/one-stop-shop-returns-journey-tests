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

package uk.gov.hmrc.test.ui.pages

import org.junit.Assert
import org.openqa.selenium.By
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.driver.BrowserDriver

object ReturnPage extends BrowserDriver with Matchers {

  val host: String             = TestConfiguration.url("one-stop-shop-returns-frontend")

  def goToStartOfJourney(): Unit =
    driver
      .navigate()
      .to(s"$host/your-account")

  def navigateToStartYourReturnPage(): Unit =
    driver
      .navigate()
      .to(s"$host/2022-Q2/start")

  def navigateToPreviouslySubmittedReturn(): Unit =
    driver
      .navigate()
      .to(s"$host/past-returns/2022-Q1")

  def navigateToPastReturnsHistory(): Unit =
    driver
      .navigate()
      .to(s"$host/past-returns")

  def paymentsUrl(): Unit =
    driver.getCurrentUrl should include("pay/select-payment-amount?traceId=")

  def navigateToReturnStartPage(period: String): Unit =
    driver
      .navigate()
      .to(s"$host/$period/start")

  def checkTransferringToOtherMSIDPastReturn(): Unit = {
    val htmlH1 = driver.findElement(By.tagName("h1")).getText
    Assert.assertTrue(htmlH1.equals("1 July to 8 September 2023"))
  }

  def checkTransferringFromOtherMSIDPastReturn(): Unit = {
    val htmlH1 = driver.findElement(By.tagName("h1")).getText
    Assert.assertTrue(htmlH1.equals("9 June to 30 June 2023"))
  }

  def navigateToPastReturn(returnPeriod: String): Unit = {

    val period = returnPeriod match {
      case "Q1 2018" => "2018-Q1"
      case "Q3 2018" => "2018-Q3"
      case _ => "period doesn't exist"
    }
    driver
      .navigate()
      .to(s"$host/past-returns/$period")
  }

}

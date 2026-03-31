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

import org.openqa.selenium.support.ui.ExpectedConditions
import uk.gov.hmrc.configuration.TestEnvironment

object BTA extends BasePage {

  private val dashboardUrl: String =
    TestEnvironment.url("one-stop-shop-returns-frontend")
  private val dashboardJourneyUrl: String = "/pay-vat-on-goods-sold-to-eu/northern-ireland-returns-payments"

  def navigateToBtaLink(link: String): Unit =
    get(s"$dashboardUrl$dashboardJourneyUrl/test-only/$link")

  def checkWelshTransition(page: String): Unit = {

    val url =
      s"$dashboardUrl$dashboardJourneyUrl/no-welsh-service?redirectUrl=%2Fpay-vat-on-goods-sold-to-eu%2Fnorthern-ireland-returns-payments%2F"

    val urlToCheck = if (page == "dashboard") {
        s"${url}your-account"
    } else if (page == "startReturn") {
        s"${url}2021-Q3%2Fstart"
    } else if (page == "continueReturn") {
        s"${url}2021-Q3%2Freturn-continue"
    } else if (page == "returnsHistory") {
        s"${url}past-returns"
    } else {
        s"${url}outstanding-payments"
    }
    fluentWait.until(ExpectedConditions.urlContains(urlToCheck))
  }
}

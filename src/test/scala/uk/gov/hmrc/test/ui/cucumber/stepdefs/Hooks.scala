/*
 * Copyright 2022 HM Revenue & Customs
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

import io.cucumber.scala.{EN, ScalaDsl, Scenario}
import org.openqa.selenium.{OutputType, TakesScreenshot}
import uk.gov.hmrc.test.ui.cucumber.data.{RegistrationData, ReturnsData}
import uk.gov.hmrc.test.ui.cucumber.utils.MongoConnection
import uk.gov.hmrc.test.ui.driver.BrowserDriver

class Hooks extends ScalaDsl with EN with BrowserDriver {
  After { scenario: Scenario =>
    if (scenario.isFailed) {
      val screenshotName = scenario.getName.replaceAll(" ", "_")
      val screenshot     = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.BYTES)
      scenario.attach(screenshot, "image/png", screenshotName)
    }
  }

  Before {
    driver.manage().deleteAllCookies()
  }

  private def resetAll(): Unit = {
    MongoConnection.dropRegistrations()
    MongoConnection.dropReturns()
    MongoConnection.dropCorrections()
    MongoConnection.dropSavedAnswers()
    MongoConnection.dropCachedVatReturns()
    MongoConnection.insert(RegistrationData.data, "one-stop-shop-registration", "registrations")
    MongoConnection.insert(ReturnsData.data, "one-stop-shop-returns", "returns")
  }

  Before("@Returns") {
    resetAll()
  }

  Before("@Exclusions") {
    resetAll()
  }
}

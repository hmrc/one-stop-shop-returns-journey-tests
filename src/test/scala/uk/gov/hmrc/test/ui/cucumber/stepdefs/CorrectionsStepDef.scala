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

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.CommonPage

class CorrectionsStepDef extends BaseStepDef {

  When(
    """^the user selects the (first|second) country as (.*) for the (first|second|third) period on the (.*) page$"""
  ) { (countryIndex: String, countryName: String, periodIndex: String, urlPage: String) =>
    CommonPage.checkDoubleIndexURL(periodIndex, countryIndex, urlPage, "")
    CommonPage.selectValueAutocomplete(countryName)
  }

  When(
    """^the user adds the (first|second) (declared|undeclared) correction amount as (.*) for the (first|second|third) period on the (.*) page$"""
  ) { (countryIndex: String, declared: String, correctionAmount: String, periodIndex: String, urlPage: String) =>
    val appendText =
      if (declared == "declared") {
        "?undeclaredCountry=false"
      } else {
        "?undeclaredCountry=true"
      }
    CommonPage.checkDoubleIndexURL(periodIndex, countryIndex, urlPage, appendText)
    CommonPage.enterData("value", correctionAmount)
    CommonPage.submitForm()
  }

  When(
    """^the user changes the answer to (.*)$"""
  ) { (answer: String) =>
    CommonPage.driver.findElement(By.id("value")).clear()
    CommonPage.enterData("value", answer)
    CommonPage.submitForm()
  }

  When(
    """^the user continues from the vat-payable-check page$"""
  ) { () =>
    CommonPage.driver.findElement(By.id("continue")).click()
  }
}

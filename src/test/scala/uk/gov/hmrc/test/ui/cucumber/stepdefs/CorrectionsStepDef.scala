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

class CorrectionsStepDef extends BaseStepDef {

  When("""^the user selects the (first|second) country as (.*) for the (first|second) period on the (.*) page$""") {
    (countryIndex: String, countryName: String, periodIndex: String, urlPage: String) =>
      CommonPage.checkDoubleIndexURL(periodIndex, countryIndex, urlPage)
      CommonPage.selectValueAutocomplete(countryName)
  }

  When(
    """^the user adds the (first|second) correction amount as (.*) for the (first|second) period on the (.*) page$"""
  ) { (countryIndex: String, correctionAmount: String, periodIndex: String, urlPage: String) =>
    CommonPage.checkDoubleIndexURL(periodIndex, countryIndex, urlPage)
    CommonPage.enterData("value", correctionAmount)
    CommonPage.submitForm()
  }
}

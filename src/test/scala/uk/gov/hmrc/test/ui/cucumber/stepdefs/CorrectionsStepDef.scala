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

import org.junit.Assert
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.CommonPage

import java.time.LocalDate

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

  Then(
    """^the user can only see corrections available for returns that were due within the last three years$"""
  ) { () =>
    val fourYearsAgo  = LocalDate.now().minusYears(4).getYear.toString
    val threeYearsAgo = LocalDate.now().minusYears(3).getYear.toString
    val twoYearsAgo   = LocalDate.now().minusYears(2).getYear.toString

    val htmlBody = driver.findElement(By.tagName("body")).getText

    Assert.assertFalse(
      htmlBody.contains(s"1 January to 31 March $fourYearsAgo")
    )
    Assert.assertFalse(
      htmlBody.contains(s"1 April to 30 June $fourYearsAgo")
    )
    Assert.assertFalse(
      htmlBody.contains(s"1 July to 30 September $fourYearsAgo")
    )
    Assert.assertFalse(
      htmlBody.contains(s"1 October to 31 December $fourYearsAgo")
    )

    val currentMonth = LocalDate.now().getMonthValue

    currentMonth match {
      case 1 | 2 | 3 | 4 =>
        Assert.assertTrue(
          htmlBody.contains(s"1 January to 31 March $threeYearsAgo")
        )
        Assert.assertTrue(
          htmlBody.contains(s"1 April to 30 June $threeYearsAgo")
        )
        Assert.assertTrue(
          htmlBody.contains(s"1 July to 30 September $threeYearsAgo")
        )
        Assert.assertTrue(
          htmlBody.contains(s"1 October to 31 December $threeYearsAgo")
        )
      case 5 | 6 | 7     =>
        Assert.assertFalse(
          htmlBody.contains(s"1 January to 31 March $threeYearsAgo")
        )
        Assert.assertTrue(
          htmlBody.contains(s"1 April to 30 June $threeYearsAgo")
        )
        Assert.assertTrue(
          htmlBody.contains(s"1 July to 30 September $threeYearsAgo")
        )
        Assert.assertTrue(
          htmlBody.contains(s"1 October to 31 December $threeYearsAgo")
        )
      case 8 | 9 | 10    =>
        Assert.assertFalse(
          htmlBody.contains(s"1 January to 31 March $threeYearsAgo")
        )
        Assert.assertFalse(
          htmlBody.contains(s"1 April to 30 June $threeYearsAgo")
        )
        Assert.assertTrue(
          htmlBody.contains(s"1 July to 30 September $threeYearsAgo")
        )
        Assert.assertTrue(
          htmlBody.contains(s"1 October to 31 December $threeYearsAgo")
        )
      case 11 | 12       =>
        Assert.assertFalse(
          htmlBody.contains(s"1 January to 31 March $threeYearsAgo")
        )
        Assert.assertFalse(
          htmlBody.contains(s"1 April to 30 June $threeYearsAgo")
        )
        Assert.assertFalse(
          htmlBody.contains(s"1 July to 30 September $threeYearsAgo")
        )
        Assert.assertTrue(
          htmlBody.contains(s"1 October to 31 December $threeYearsAgo")
        )
      case _             => "not a  valid month"
    }

    Assert.assertTrue(
      htmlBody.contains(s"1 January to 31 March $twoYearsAgo")
    )
    Assert.assertTrue(
      htmlBody.contains(s"1 April to 30 June $twoYearsAgo")
    )
  }
}

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
import uk.gov.hmrc.test.ui.pages.{CheckYourAnswersPage, CommonPage}

class CheckYourAnswersStepDef extends BaseStepDef {

  Then("""^the user selects the (change|remove) link for (.*)$""") { (linkType: String, link: String) =>
    CommonPage.selectLink(link)
  }

  When("""^the user clicks continue on the (first|second) (.*) page$""") { (index: String, url: String) =>
    index match {
      case "first"  => CommonPage.checkUrl(url + "/1")
      case "second" => CommonPage.checkUrl(url + "/2")
      case _        => throw new Exception("Index doesn't exist")
    }
    CommonPage.clickContinue()
  }

  Then("""^the user clicks change for (.*)$""") { (option: String) =>
    option match {
      case "NI sales excluding VAT"   =>
        driver.findElement(By.id("change-sales-excluding-vat-ni")).click()
      case "NI VAT charged"           =>
        driver.findElement(By.id("change-vat-charged-ni")).click()
      case "EU sales excluding VAT"   =>
        driver.findElement(By.id("change-sales-excluding-vat-eu")).click()
      case "EU VAT charged"           =>
        driver.findElement(By.id("change-vat-charged-eu")).click()
      case "Corrections"              =>
        driver.findElement(By.id("change-corrections")).click()
      case "Periods with corrections" =>
        driver.findElement(By.id("change-correction-periods")).click()
      case _                          =>
        throw new Exception("Change link doesn't exist")
    }
  }

  Then("""^the NI answers have been removed from the check-your-answers page$""") { () =>
    CheckYourAnswersPage.checkCYAText()
  }
}

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
import uk.gov.hmrc.test.ui.pages.{CommonPage, ReturnPage}
import uk.gov.hmrc.test.ui.pages.CommonPage.{clickBackButton, clickContinue, clickSubmit, selectLink}

class CommonStepDef extends BaseStepDef {

  Given("^the user accesses the service$") { () =>
    ReturnPage.goToStartOfJourney()
  }

  Given("^the user navigates to the start your return page$") { () =>
    ReturnPage.navigateToStartYourReturnPage()
  }

  When("""^the user answers (yes|no) on the (.*) page$""") { (data: String, url: String) =>
    CommonPage.checkUrl(url)
    CommonPage.selectAnswer(data)
  }

  Then("""^the user is on the (.*) page$""") { (url: String) =>
    CommonPage.checkUrl(url)
  }

  When("""^the user adds (.*) on the (first|second) (.*) page$""") { (data: String, index: String, url: String) =>
    index match {
      case "first"  => CommonPage.checkUrl(url + "/1")
      case "second" => CommonPage.checkUrl(url + "/2")
      case _        => throw new Exception("Index doesn't exist")
    }
    CommonPage.enterData(data = data)
    CommonPage.submitForm()
  }

  When("""^the user selects (.*) on the (first|second|third|fourth|fifth) (.*) page$""") {
    (data: String, index: String, url: String) =>
      index match {
        case "first"  => CommonPage.checkUrl(url + "/1")
        case "second" => CommonPage.checkUrl(url + "/2")
        case "third"  => CommonPage.checkUrl(url + "/3")
        case "fourth" => CommonPage.checkUrl(url + "/4")
        case "fifth"  => CommonPage.checkUrl(url + "/5")
        case _        => throw new Exception("Index doesn't exist")
      }
      CommonPage.selectValueAutocomplete(data)
  }

  Then("""^the user clicks the (continue|submit) button$""") { (button: String) =>
    if (button == "submit") {
      clickSubmit()
    } else {
      clickContinue()
    }
  }

  Then("""^the user clicks on the (.*) link$""") { (link: String) =>
    link match {
      case "Start your return"                   =>
        driver.findElement(By.id("start-your-return")).click()
      case "Continue your return"                =>
        driver.findElement(By.id("continue-your-return")).click()
      case "Back to your account"                =>
        driver.findElement(By.id("back-to-your-account")).click()
      case "View past returns"                   =>
        driver.findElement(By.id("view-past-returns")).click()
      case "July to September for two years ago" =>
        driver.findElement(By.id("period")).click()
      case "July to September 2023"              =>
        selectLink("past-returns\\/2023-Q3")
      case "April to June 2023"                  =>
        selectLink("past-returns\\/2023-Q2")
      case "continue to complete your return"    =>
        driver.findElement(By.id("continueToYourReturn")).click()
      case "return to your account"              =>
        driver.findElement(By.id("backToYourAccount")).click()
      case "sign out and come back later"        =>
        driver.findElement(By.id("signOut")).click()
      case "Make a payment"                      =>
        driver.findElement(By.id("make-a-payment")).click()
      case "Change your registration"            =>
        driver.findElement(By.id("change-your-registration")).click()
      case "Leave this service"                  =>
        driver.findElement(By.id("leave-this-service")).click()
      case "Rejoin this service"                 =>
        driver.findElement(By.id("rejoin-this-service")).click()
      case "Cancel your request to leave"        =>
        driver.findElement(By.id("cancel-request-to-leave")).click()
      case _                                     =>
        throw new Exception("Link doesn't exist")
    }
  }

  Then("""^the user clicks on the Back to your account button$""") { () =>
    driver.findElement(By.id("back-to-your-account")).click()
  }

  Then("""^the user clicks back on the browser$""") { () =>
    clickBackButton()
  }

}

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

package uk.gov.hmrc.ui.specs

import uk.gov.hmrc.ui.pages.*

class SaveForLaterSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth      = Auth

  Feature("Save For Later journeys") {

    Scenario("A user can save their progress and return to the last page they were on") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user enters returns data")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("eu-country-from-northern-ireland/1")
      dashboard.selectCountry("Spain")
      dashboard.checkJourneyUrl("eu-vat-rates-from-northern-ireland/1")
      dashboard.tickCheckbox("first")
      dashboard.tickCheckbox("second")
      dashboard.continue()
      dashboard.checkJourneyUrl("eu-sales-from-northern-ireland/1/1")
      dashboard.enterAnswer("50000")
      dashboard.checkJourneyUrl("vat-on-sales-from-northern-ireland/1/1")
      dashboard.selectSuggestedVat()
      dashboard.checkJourneyUrl("eu-sales-from-northern-ireland/1/2")
      dashboard.enterAnswer("75000")
      dashboard.checkJourneyUrl("vat-on-sales-from-northern-ireland/1/2")
      dashboard.selectSuggestedVat()
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland/1")

      When("the user clicks the Save and come back later button")
      dashboard.clickLink("saveProgress")
      dashboard.checkSavedReturn()

      And("the user clicks on the continue to complete your return link")
      dashboard.clickLink("continueToYourReturn")

      Then("the user is able to carry on their saved return")
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland/1")
      dashboard.continue()

      And("the user answers no on the add-sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("add-sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      And("the user continues to enter return data")
      dashboard.checkJourneyUrl("sales-from-eu")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("eu-country-sold-from/1")
      dashboard.selectCountry("Spain")
      dashboard.checkJourneyUrl("eu-country-sold-to/1/1")
      dashboard.selectCountry("Bulgaria")
      dashboard.checkJourneyUrl("eu-vat-rates-from-eu/1/1")

      When("the user clicks the Save and come back later button")
      dashboard.clickLink("saveProgress")
      dashboard.checkSavedReturn()

      And("the user clicks on the continue to complete your return link")
      dashboard.clickLink("continueToYourReturn")

      Then("the user is able to carry on their saved return")
      dashboard.checkJourneyUrl("eu-vat-rates-from-eu/1/1")

      When("the user clicks the Save and come back later button")
      dashboard.clickLink("saveProgress")
      dashboard.checkSavedReturn()

      And("the user clicks on the return to your account link")
      dashboard.clickLink("backToYourAccount")

      Then("the user is returned to their dashboard")
      dashboard.checkJourneyUrl("your-account")
    }

    Scenario("A user can access their saved return from 'Your account' and complete it") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "saveReturn")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user enters returns data")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("eu-country-from-northern-ireland/1")
      dashboard.selectCountry("Spain")
      dashboard.checkJourneyUrl("eu-vat-rates-from-northern-ireland/1")
      dashboard.tickCheckbox("first")
      dashboard.continue()
      dashboard.checkJourneyUrl("eu-sales-from-northern-ireland/1/1")
      dashboard.enterAnswer("50000")
      dashboard.checkJourneyUrl("vat-on-sales-from-northern-ireland/1/1")
      dashboard.selectSuggestedVat()
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("add-sales-from-northern-ireland")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("sales-from-eu")

      When("the user clicks the Save and come back later button")
      dashboard.clickLink("saveProgress")
      dashboard.checkSavedReturn()

      And("the user clicks on the sign out and come back later link")
      dashboard.clickLink("signOut")

      Then("the user signs back into the service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "retrieveReturn")
      dashboard.checkJourneyUrl("your-account")

      And("the user clicks on the Continue your return link")
      dashboard.clickLink("continue-your-return")
      dashboard.checkJourneyUrl("return-continue")

      When("the user selects the Continue my return option")
      dashboard.clickLink("value_0")
      dashboard.continue()

      Then("the user is able to continue their saved return")
      dashboard.checkJourneyUrl("sales-from-eu")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("eu-country-sold-from/1")
      dashboard.selectCountry("Spain")
      dashboard.checkJourneyUrl("eu-country-sold-to/1/1")
      dashboard.selectCountry("Bulgaria")
      dashboard.checkJourneyUrl("eu-vat-rates-from-eu/1/1")
      dashboard.tickCheckbox("first")
      dashboard.continue()
      dashboard.checkJourneyUrl("eu-sales-from-eu/1/1/1")
      dashboard.enterAnswer("123456")
      dashboard.checkJourneyUrl("vat-on-sales-from-eu/1/1/1")
      dashboard.selectSuggestedVat()
      dashboard.checkJourneyUrl("check-sales-from-eu/1/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("add-sales-from-eu-to-eu/1")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("add-sales-from-eu")
      dashboard.answerRadioButton("no")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user can delete an in progress return and start again") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "saveReturn")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user enters returns data")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("eu-country-from-northern-ireland/1")
      dashboard.selectCountry("Spain")
      dashboard.checkJourneyUrl("eu-vat-rates-from-northern-ireland/1")
      dashboard.tickCheckbox("first")
      dashboard.continue()
      dashboard.checkJourneyUrl("eu-sales-from-northern-ireland/1/1")
      dashboard.enterAnswer("50000")
      dashboard.checkJourneyUrl("vat-on-sales-from-northern-ireland/1/1")
      dashboard.selectSuggestedVat()
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("add-sales-from-northern-ireland")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("sales-from-eu")

      When("the user clicks the Save and come back later button")
      dashboard.clickLink("saveProgress")
      dashboard.checkSavedReturn()

      And("the user clicks on the return to your account link")
      dashboard.clickLink("backToYourAccount")

      Then("the user is returned to their dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user clicks on the Continue your return link")
      dashboard.clickLink("continue-your-return")
      dashboard.checkJourneyUrl("return-continue")

      When("the user selects the Delete my return and start again option")
      dashboard.clickLink("value_1")
      dashboard.continue()

      And("the user answers yes on the return-delete-confirm page")
      dashboard.checkJourneyUrl("return-delete-confirm")
      dashboard.answerRadioButton("yes")

      Then("the user is returned to their dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user answers no on the sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      And("the user answers no on the sales-from-eu page")
      dashboard.checkJourneyUrl("sales-from-eu")
      dashboard.answerRadioButton("no")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario(
      "A user is advised to come back later and their return is saved when submitting a return where the registration is not found on Core"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("222222222", "Organisation", "hasOSSEnrolment", "saveReturn")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user answers no on the sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      And("the user answers no on the sales-from-eu page")
      dashboard.checkJourneyUrl("sales-from-eu")
      dashboard.answerRadioButton("no")

      And("the user submits their return")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()

      And("the user is on the return-not-submitted page")
      dashboard.checkJourneyUrl("return-not-submitted")

      When("the user clicks on the return to your account link")
      dashboard.clickLink("backToYourAccount")
      dashboard.checkJourneyUrl("your-account")

      And("the user clicks on the Continue your return link")
      dashboard.clickLink("continue-your-return")
      dashboard.checkJourneyUrl("return-continue")

      When("the user selects the Continue my return option")
      dashboard.clickLink("value_0")
      dashboard.continue()

      Then("the user is on the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
    }

    Scenario(
      "Return saved when there is an issue connecting to EIS/Core during submission"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("222222223", "Organisation", "hasOSSEnrolment", "saveReturn")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user answers no on the sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      And("the user answers no on the sales-from-eu page")
      dashboard.checkJourneyUrl("sales-from-eu")
      dashboard.answerRadioButton("no")

      And("the user submits their return")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()

      And("the user is on the return-service-down page")
      dashboard.checkJourneyUrl("return-service-down")

      When("the user clicks on the return to your account link")
      dashboard.clickLink("backToYourAccount")
      dashboard.checkJourneyUrl("your-account")

      And("the user clicks on the Continue your return link")
      dashboard.clickLink("continue-your-return")
      dashboard.checkJourneyUrl("return-continue")

      When("the user selects the Continue my return option")
      dashboard.clickLink("value_0")
      dashboard.continue()

      Then("the user is on the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
    }
  }
}

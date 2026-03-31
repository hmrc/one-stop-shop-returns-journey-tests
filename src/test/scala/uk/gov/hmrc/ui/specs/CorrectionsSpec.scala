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

package uk.gov.hmrc.ui.specs

import uk.gov.hmrc.ui.pages.*

class CorrectionsSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth = Auth

  Feature("Corrections journeys") {

    Scenario("A user adds corrections for their previous return") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
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

      And("the user answers yes on the correct-previous-return page")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("yes")

      And("the user answers yes on the correction-return-single-period/1 page")
      dashboard.checkJourneyUrl("correction-return-single-period/1")
      dashboard.answerRadioButton("yes")

      And("the user selects the first correction country")
      dashboard.checkJourneyUrl("correction-country/1/1")
      dashboard.selectCountry("Croatia")

      And("the user enters the correction amount for a previously declared country")
      dashboard.checkJourneyUrl("country-vat-correction-amount/1/1?undeclaredCountry=false")
      dashboard.enterAnswer("1000")

      And("the user answers yes on the vat-payable-confirm/1/1 page")
      dashboard.checkJourneyUrl("vat-payable-confirm/1/1")
      dashboard.answerRadioButton("yes")

      And("the user continues through the vat-payable-check/1/1 page")
      dashboard.checkJourneyUrl("vat-payable-check/1/1")
      dashboard.continue()

      And("the user answers yes on the vat-correction-list/1 page")
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.answerRadioButton("yes")

      And("the user enters a second correction country")
      dashboard.checkJourneyUrl("correction-country/1/2")
      dashboard.selectCountry("France")

      And("the user enters the correction amount for a previously declared country")
      dashboard.checkJourneyUrl("country-vat-correction-amount/1/2?undeclaredCountry=false")
      dashboard.enterAnswer("-1000")

      And("the user answers yes on the vat-payable-confirm/1/2 page")
      dashboard.checkJourneyUrl("vat-payable-confirm/1/2")
      dashboard.answerRadioButton("yes")

      And("the user continues through the vat-payable-check/1/2 page")
      dashboard.checkJourneyUrl("vat-payable-check/1/2")
      dashboard.continue()

      And("the user answers no on the vat-correction-list/1 page")
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.answerRadioButton("no")

      And("the user continues through the vat-correction-periods page")
      dashboard.checkJourneyUrl("vat-correction-periods")
      dashboard.continue()

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user adds a correction for a country that was not on their previous return") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
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

      And("the user answers yes on the correct-previous-return page")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("yes")

      And("the user answers yes on the correction-return-single-period/1 page")
      dashboard.checkJourneyUrl("correction-return-single-period/1")
      dashboard.answerRadioButton("yes")

      And("the user selects the first correction country")
      dashboard.checkJourneyUrl("correction-country/1/1")
      dashboard.selectCountry("Bulgaria")

      And("the user answers yes on the add-new-country/1/1 page")
      dashboard.checkJourneyUrl("add-new-country/1/1")
      dashboard.answerRadioButton("yes")

      And("the user enters the correction amount for a previously undeclared country")
      dashboard.checkJourneyUrl("country-vat-correction-amount/1/1?undeclaredCountry=true")
      dashboard.enterAnswer("5000")

      And("the user answers yes on the vat-payable-confirm/1/1 page")
      dashboard.checkJourneyUrl("vat-payable-confirm/1/1")
      dashboard.answerRadioButton("yes")

      And("the user continues through the vat-payable-check/1/1 page")
      dashboard.checkJourneyUrl("vat-payable-check/1/1")
      dashboard.continue()

      And("the user answers no on the vat-correction-list/1 page")
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.answerRadioButton("no")

      And("the user continues through the vat-correction-periods page")
      dashboard.checkJourneyUrl("vat-correction-periods")
      dashboard.continue()

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user says no to adding a correction to their return") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
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

      And("the user answers no on the correct-previous-return page")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("no")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user is offered a single period to correct and chooses No") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
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

      And("the user answers yes on the correct-previous-return page")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("yes")

      And("the user answers no on the correction-return-single-period/1 page")
      dashboard.checkJourneyUrl("correction-return-single-period/1")
      dashboard.answerRadioButton("no")

      And("the user continues through the no-correction-periods-available page")
      dashboard.checkJourneyUrl("no-correction-periods-available")
      dashboard.continue()

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user changes data on their correction in progress and via vat-payable-check") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
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

      And("the user enters correction data for a country")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("correction-return-single-period/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("correction-country/1/1")
      dashboard.selectCountry("Croatia")
      dashboard.checkJourneyUrl("country-vat-correction-amount/1/1?undeclaredCountry=false")
      dashboard.enterAnswer("2000")

      And("the user answers no on the vat-payable-confirm/1/1 page and changes the amount")
      dashboard.checkJourneyUrl("vat-payable-confirm/1/1")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("country-vat-correction-amount/1/1?undeclaredCountry=false")
      dashboard.enterAnswer("3000")
      dashboard.checkJourneyUrl("vat-payable-confirm/1/1")
      dashboard.answerRadioButton("yes")

      And("the user clicks the change link on the vat-payable-check/1/1 page and amends their answer again")
      dashboard.checkJourneyUrl("vat-payable-check/1/1")
      dashboard.selectChangeOrRemoveLink("first-change-country-vat-correction-amount\\/1\\/1")
      dashboard.checkJourneyUrl("country-vat-correction-amount/1/1?undeclaredCountry=false")
      dashboard.enterAnswer("1500")
      dashboard.checkJourneyUrl("vat-payable-confirm/1/1")
      dashboard.answerRadioButton("yes")

      And("the user continues through the vat-payable-check/1/1 page")
      dashboard.checkJourneyUrl("vat-payable-check/1/1")
      dashboard.continue()

      And("the user answers yes on the vat-correction-list/1 page")
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.answerRadioButton("yes")

      And("the user enters a second correction country")
      dashboard.checkJourneyUrl("correction-country/1/2")
      dashboard.selectCountry("France")

      And("the user enters the correction amount for a previously declared country")
      dashboard.checkJourneyUrl("country-vat-correction-amount/1/2?undeclaredCountry=false")
      dashboard.enterAnswer("-1000")

      And("the user answers yes on the vat-payable-confirm/1/2 page")
      dashboard.checkJourneyUrl("vat-payable-confirm/1/2")
      dashboard.answerRadioButton("yes")

      And("the user continues through the vat-payable-check/1/2 page")
      dashboard.checkJourneyUrl("vat-payable-check/1/2")
      dashboard.continue()

      And("the user answers no on the vat-correction-list/1 page")
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.answerRadioButton("no")

      And("the user continues through the vat-correction-periods page")
      dashboard.checkJourneyUrl("vat-correction-periods")
      dashboard.continue()

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user changes and removes data on their correction in vat-correction-list") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
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

      And("the user enters correction data for two countries")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("correction-return-single-period/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("correction-country/1/1")
      dashboard.selectCountry("Croatia")
      dashboard.checkJourneyUrl("country-vat-correction-amount/1/1?undeclaredCountry=false")
      dashboard.enterAnswer("1000")
      dashboard.checkJourneyUrl("vat-payable-confirm/1/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("vat-payable-check/1/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("correction-country/1/2")
      dashboard.selectCountry("France")
      dashboard.checkJourneyUrl("country-vat-correction-amount/1/2?undeclaredCountry=false")
      dashboard.enterAnswer("-1000")
      dashboard.checkJourneyUrl("vat-payable-confirm/1/2")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("vat-payable-check/1/2")
      dashboard.continue()

      And("the user changes the answer for the first country")
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.selectChangeOrRemoveLink("second-change-vat-payable-check\\/1\\/1")
      dashboard.checkJourneyUrl("second-change-vat-payable-check/1/1")
      dashboard.selectChangeOrRemoveLink("second-change-country-vat-correction-amount\\/1\\/1\\?undeclaredCountry\\=false")
      dashboard.checkJourneyUrl("second-change-country-vat-correction-amount/1/1?undeclaredCountry=false")
      dashboard.enterAnswer("4500")
      dashboard.checkJourneyUrl("second-change-vat-payable-confirm/1/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("second-change-vat-payable-check/1/1")
      dashboard.continue()

      And("the user deletes the second country")
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.selectChangeOrRemoveLink("remove-country-correction\\/1\\/2")
      dashboard.checkJourneyUrl("remove-country-correction/1/2")
      dashboard.answerRadioButton("yes")

      And("the user answers no on the vat-correction-list/1 page")
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.answerRadioButton("no")

      And("the user continues through the vat-correction-periods page")
      dashboard.checkJourneyUrl("vat-correction-periods")
      dashboard.continue()

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }
  }
}

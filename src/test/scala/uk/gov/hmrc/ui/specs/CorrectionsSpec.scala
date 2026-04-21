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

class CorrectionsSpec extends BaseSpec {

  private val dashboard  = Dashboard
  private val auth       = Auth
  private val correction = Correction

  Feature("Corrections journeys") {

    Scenario("A user adds corrections for their previous return") {

      Given("the user accesses the OSS Returns Service")
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

      Given("the user accesses the OSS Returns Service")
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

      Given("the user accesses the OSS Returns Service")
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

      Given("the user accesses the OSS Returns Service")
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

      Given("the user accesses the OSS Returns Service")
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

      Given("the user accesses the OSS Returns Service")
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
      dashboard.selectChangeOrRemoveLink(
        "second-change-country-vat-correction-amount\\/1\\/1\\?undeclaredCountry\\=false"
      )
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

    Scenario("A user changes and removes data on their correction in vat-correction-periods") {

      Given("the user accesses the OSS Returns Service")
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
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.answerRadioButton("no")

      And("the user removes corrections by period")
      dashboard.checkJourneyUrl("vat-correction-periods")
      dashboard.selectChangeOrRemoveLink("third-change-vat-correction-list\\/1")
      dashboard.checkJourneyUrl("third-change-vat-correction-list/1")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("vat-correction-periods")
      dashboard.selectChangeOrRemoveLink("remove-period-correction\\/1")
      dashboard.checkJourneyUrl("remove-period-correction/1")
      dashboard.answerRadioButton("yes")

      And("the user answers no on the correct-previous-return page")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("no")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user can submit a return with only minus corrections for a previously declared country") {

      Given("the user accesses the OSS Returns Service")
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

      And("the user adds minus correction data for one previously declared country")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("correction-return-single-period/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("correction-country/1/1")
      dashboard.selectCountry("Croatia")
      dashboard.checkJourneyUrl("country-vat-correction-amount/1/1?undeclaredCountry=false")
      dashboard.enterAnswer("-1000")
      dashboard.checkJourneyUrl("vat-payable-confirm/1/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("vat-payable-check/1/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("vat-correction-periods")
      dashboard.continue()

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user submits a full return with corrections") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user enters sales from Northern Ireland")
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
      dashboard.enterAlternativeVatAmount("12345")
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("add-sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      And("the user enters sales from the EU")
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
      dashboard.enterAnswer("350000")
      dashboard.checkJourneyUrl("vat-on-sales-from-eu/1/1/1")
      dashboard.enterAlternativeVatAmount("71234")
      dashboard.checkJourneyUrl("check-sales-from-eu/1/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("add-sales-from-eu-to-eu/1")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("add-sales-from-eu")
      dashboard.answerRadioButton("no")

      And("the user enters corrections for two countries")
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
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("vat-correction-periods")
      dashboard.continue()

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user adds corrections for multiple previous returns") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000004", "Organisation", "hasOSSEnrolment", "dashboard")
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

      And("the user adds correction data for one period")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("correction-return-period/1")
      dashboard.selectReturnPeriod("first")
      dashboard.checkJourneyUrl("correction-country/1/1")
      dashboard.selectCountry("Croatia")
      dashboard.checkJourneyUrl("add-new-country/1/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("country-vat-correction-amount/1/1?undeclaredCountry=true")
      dashboard.enterAnswer("1000")
      dashboard.checkJourneyUrl("vat-payable-confirm/1/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("vat-payable-check/1/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("vat-correction-list/1")
      dashboard.answerRadioButton("no")

      Then("the user adds corrections for another period")
      dashboard.checkJourneyUrl("vat-correction-periods-add")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("correction-return-period/2")
      dashboard.selectReturnPeriod("first")
      dashboard.checkJourneyUrl("correction-country/2/1")
      dashboard.selectCountry("Denmark")
      dashboard.checkJourneyUrl("add-new-country/2/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("country-vat-correction-amount/2/1?undeclaredCountry=true")
      dashboard.enterAnswer("5000")
      dashboard.checkJourneyUrl("vat-payable-confirm/2/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("vat-payable-check/2/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("vat-correction-list/2")
      dashboard.answerRadioButton("no")

      Then("the user adds corrections for the remaining period")
      dashboard.checkJourneyUrl("vat-correction-periods-add")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("correction-return-single-period/3")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("correction-country/3/1")
      dashboard.selectCountry("Belgium")
      dashboard.checkJourneyUrl("country-vat-correction-amount/3/1?undeclaredCountry=false")
      dashboard.enterAnswer("250.63")
      dashboard.checkJourneyUrl("vat-payable-confirm/3/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("vat-payable-check/3/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("vat-correction-list/3")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("vat-correction-periods")
      dashboard.continue()

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user can't correct periods that were due over 3 years ago") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000008", "Organisation", "hasOSSEnrolment", "dashboard")
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

      And("the user is on the correction-return-period/1 page")
      dashboard.checkJourneyUrl("correction-return-period/1")

      And("the user can only see corrections available for returns that were due within the last three years")
      correction.checkCorrectionsAvailable()
    }
  }
}

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

class CheckYourAnswersSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth = Auth

  Feature("Check your answers journeys") {

    Scenario("A user follows a basic journey and amends NI answers using Check Your Answers functionality") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
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

      Then("the user is on the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")

      When("the user clicks the change link for check-sales-from-northern-ireland")
      dashboard.selectChangeOrRemoveLink("check-sales-from-northern-ireland")
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland")

      And("the user answers yes on the check-sales-from-northern-ireland page")
      dashboard.answerRadioButton("yes")

      dashboard.checkJourneyUrl("check-eu-country-from-northern-ireland/1")
      dashboard.selectCountry("Denmark")

      And("the user enters the first country total sales for first VAT rate")
      dashboard.checkJourneyUrl("check-eu-sales-from-northern-ireland/1/1")
      dashboard.enterAnswer("50000")

      And("the user confirms the suggested amount of VAT")
      dashboard.checkJourneyUrl("check-vat-on-sales-from-northern-ireland/1/1")
      dashboard.selectSuggestedVat()

      And("the user continues on the check-sales-from-northern-ireland/1 page")
      dashboard.checkJourneyUrl("change-check-sales-from-northern-ireland/1")
      dashboard.continue()

      And("the user answers no on the add-sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("check-add-sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      When("the user clicks change for NI VAT charged")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.clickLink("change-vat-charged-ni")

      And("the user answers no for check-add-sales-from-northern-ireland")
      dashboard.checkJourneyUrl("check-add-sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      Then("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user follows a basic journey and amends EU answers using Check Your Answers functionality") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
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

      Then("the user is on the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")

      When("the user clicks the change link for check-sales-from-eu")
      dashboard.selectChangeOrRemoveLink("check-sales-from-eu")
      dashboard.checkJourneyUrl("check-sales-from-eu")

      And("the user answers yes on the sales-from-eu page")
      dashboard.checkJourneyUrl("check-sales-from-eu")
      dashboard.answerRadioButton("yes")

      And("the user selects a country on the eu-country-sold-from page")
      dashboard.checkJourneyUrl("check-eu-country-sold-from/1")
      dashboard.selectCountry("Lithuania")

      And("the user selects a country on the eu-country-sold-to page")
      dashboard.checkJourneyUrl("check-eu-country-sold-to/1/1")
      dashboard.selectCountry("Slovakia")

      And("the user selects the first checkbox on the eu-vat-rates-from-eu page")
      dashboard.checkJourneyUrl("check-eu-vat-rates-from-eu/1/1")
      dashboard.tickCheckbox("first")
      dashboard.continue()

      And("the user enters the first country total sales for first VAT rate")
      dashboard.checkJourneyUrl("check-eu-sales-from-eu/1/1/1")
      dashboard.enterAnswer("123456")

      And("the user confirms the suggested amount of VAT")
      dashboard.checkJourneyUrl("check-vat-on-sales-from-eu/1/1/1")
      dashboard.selectSuggestedVat()

      And("the user continues on the check-sales-from-eu/1/1 page")
      dashboard.checkJourneyUrl("change-check-sales-from-eu/1/1")
      dashboard.continue()

      And("the user answers yes on the add-sales-from-eu-to-eu/1 page")
      dashboard.checkJourneyUrl("check-add-sales-from-eu-to-eu/1")
      dashboard.answerRadioButton("yes")

      And("the user selects a country on the eu-country-sold-to page")
      dashboard.checkJourneyUrl("check-eu-country-sold-to/1/2")
      dashboard.selectCountry("Estonia")

      And("the user selects the first checkbox on the eu-vat-rates-from-eu page")
      dashboard.checkJourneyUrl("check-eu-vat-rates-from-eu/1/2")
      dashboard.tickCheckbox("first")
      dashboard.continue()

      And("the user enters the first country total sales for first VAT rate")
      dashboard.checkJourneyUrl("check-eu-sales-from-eu/1/2/1")
      dashboard.enterAnswer("123456")

      And("the user confirms the suggested amount of VAT")
      dashboard.checkJourneyUrl("check-vat-on-sales-from-eu/1/2/1")
      dashboard.selectSuggestedVat()

      And("the user continues on the check-sales-from-eu/1/2 page")
      dashboard.checkJourneyUrl("change-check-sales-from-eu/1/2")
      dashboard.continue()

      And("the user answers no on the add-sales-from-eu-to-eu/1 page")
      dashboard.checkJourneyUrl("check-add-sales-from-eu-to-eu/1")
      dashboard.answerRadioButton("no")

      And("the user answers yes on the add-sales-from-eu page")
      dashboard.checkJourneyUrl("check-add-sales-from-eu")
      dashboard.answerRadioButton("yes")

      And("the user selects a country on the eu-country-sold-from page")
      dashboard.checkJourneyUrl("check-eu-country-sold-from/2")
      dashboard.selectCountry("Austria")

      And("the user selects a country on the eu-country-sold-to page")
      dashboard.checkJourneyUrl("check-eu-country-sold-to/2/1")
      dashboard.selectCountry("Sweden")

      And("the user selects the first checkbox on the eu-vat-rates-from-eu page")
      dashboard.checkJourneyUrl("check-eu-vat-rates-from-eu/2/1")
      dashboard.tickCheckbox("first")
      dashboard.continue()

      And("the user enters the first country total sales for first VAT rate")
      dashboard.checkJourneyUrl("check-eu-sales-from-eu/2/1/1")
      dashboard.enterAnswer("123456")

      And("the user confirms the suggested amount of VAT")
      dashboard.checkJourneyUrl("check-vat-on-sales-from-eu/2/1/1")
      dashboard.selectSuggestedVat()

      And("the user continues on the check-sales-from-eu/2/1 page")
      dashboard.checkJourneyUrl("change-check-sales-from-eu/2/1")
      dashboard.continue()

      And("the user answers no on the add-sales-from-eu-to-eu/2 page")
      dashboard.checkJourneyUrl("check-add-sales-from-eu-to-eu/2")
      dashboard.answerRadioButton("no")

      And("the user answers no on the add-sales-from-eu page")
      dashboard.checkJourneyUrl("check-add-sales-from-eu")
      dashboard.answerRadioButton("no")

      Then("the user clicks change for EU VAT charged")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.clickLink("change-vat-charged-eu")

      And("the user answers no on the check-add-sales-from-eu page")
      dashboard.checkJourneyUrl("check-add-sales-from-eu")
      dashboard.answerRadioButton("no")

      Then("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user provides answers then amends to remove info using Check Your Answer functionality") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user answers yes on the sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("yes")

      And("the user selects a country on the eu-country-from-northern-ireland page")
      dashboard.checkJourneyUrl("eu-country-from-northern-ireland/1")
      dashboard.selectCountry("Spain")

      And("the user selects the first and second checkbox on the eu-vat-rates-from-northern-ireland page")
      dashboard.checkJourneyUrl("eu-vat-rates-from-northern-ireland/1")
      dashboard.tickCheckbox("first")
      dashboard.tickCheckbox("second")
      dashboard.continue()

      And("the user enters the first country total sales for first VAT rate")
      dashboard.checkJourneyUrl("eu-sales-from-northern-ireland/1/1")
      dashboard.enterAnswer("50000")

      And("the user confirms the suggested amount of VAT")
      dashboard.checkJourneyUrl("vat-on-sales-from-northern-ireland/1/1")
      dashboard.selectSuggestedVat()

      And("the user enters the first country total sales for second VAT rate")
      dashboard.checkJourneyUrl("eu-sales-from-northern-ireland/1/2")
      dashboard.enterAnswer("75000")

      And("the user confirms the suggested amount of VAT")
      dashboard.checkJourneyUrl("vat-on-sales-from-northern-ireland/1/2")
      dashboard.selectSuggestedVat()

      And("the user continues on the check-sales-from-northern-ireland/1 page")
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland/1")
      dashboard.continue()

      And("the user answers yes on the add-sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("add-sales-from-northern-ireland")
      dashboard.answerRadioButton("yes")

      And("the user selects another country on the eu-country-from-northern-ireland page")
      dashboard.checkJourneyUrl("eu-country-from-northern-ireland/2")
      dashboard.selectCountry("France")

      And("the user selects the first checkbox on the eu-vat-rates-from-northern-ireland page")
      dashboard.checkJourneyUrl("eu-vat-rates-from-northern-ireland/2")
      dashboard.tickCheckbox("first")
      dashboard.continue()

      And("the user enters the second country total sales for first VAT rate")
      dashboard.checkJourneyUrl("eu-sales-from-northern-ireland/2/1")
      dashboard.enterAnswer("500000")

      And("the user confirms the suggested amount of VAT")
      dashboard.checkJourneyUrl("vat-on-sales-from-northern-ireland/2/1")
      dashboard.selectSuggestedVat()

      And("the user continues on the check-sales-from-northern-ireland/2 page")
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland/2")
      dashboard.continue()

      And("the user answers no on the add-sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("add-sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      And("the user answers no on the sales-from-eu page")
      dashboard.checkJourneyUrl("sales-from-eu")
      dashboard.answerRadioButton("no")

      When("the user clicks change for check-sales-from-northern-ireland")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.selectChangeOrRemoveLink("check-sales-from-northern-ireland")

      And("the user answers no for check-sales-from-northern-ireland")
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      Then("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }
  }
}

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

class ReturnSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth      = Auth

  Feature("Dashboard journeys") {

    Scenario("User accesses the IOSS Returns Service") {

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

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }
  }
}

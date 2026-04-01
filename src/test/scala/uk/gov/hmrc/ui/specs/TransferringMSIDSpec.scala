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

class TransferringMSIDSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth = Auth
  private val transferringMSID = TransferringMSID

  Feature("Transferring MSID journeys") {

    Scenario("A user who has transferred from another member state has a partial first return") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000007", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      And("the user transferring from another MSID is offered a partial return for the correct period")
      dashboard.checkJourneyUrl("start")
      transferringMSID.transferringDates("from", "offered", "partial")

      Then("the user answers yes on the start page")
      dashboard.answerRadioButton("yes")

      And("the user enters return data")
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
      dashboard.continue()
      dashboard.checkJourneyUrl("add-sales-from-northern-ireland")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("eu-country-from-northern-ireland/2")
      dashboard.selectCountry("France")
      dashboard.checkJourneyUrl("eu-vat-rates-from-northern-ireland/2")
      dashboard.tickCheckbox("first")
      dashboard.continue()
      dashboard.checkJourneyUrl("eu-sales-from-northern-ireland/2/1")
      dashboard.enterAnswer("500000")
      dashboard.checkJourneyUrl("vat-on-sales-from-northern-ireland/2/1")
      dashboard.selectSuggestedVat()
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland/2")
      dashboard.continue()
      dashboard.checkJourneyUrl("add-sales-from-northern-ireland")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("sales-from-eu")
      dashboard.answerRadioButton("no")

      And("the user transferring from another MSID is submitting a partial return for the correct period")
      dashboard.checkJourneyUrl("check-your-answers")
      transferringMSID.transferringDates("from", "offered", "partial")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A user who has transferred from another member state has a partial first return in their past returns and a second full return period available") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000077", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the View past returns link")
      dashboard.clickLink("view-past-returns")

      Then("the user is on the past-returns page")
      dashboard.checkJourneyUrl("past-returns")

      And("the user clicks on the April to June 2023 link")
      transferringMSID.selectReturn("past-returns\\/2023-Q2")

      And("the user is on the past-returns/2023-Q2 page")
      dashboard.checkJourneyUrl("past-returns/2023-Q2")

      And("the user transferring from another MSID has the correct partial dates in the past return")
      transferringMSID.pastReturnDates("from")

      And("the user clicks back on the browser to get back to their account")
      dashboard.clickBackButton()
      dashboard.clickBackButton()
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      And("the user transferring from another MSID is offered a full return for the correct period")
      dashboard.checkJourneyUrl("start")
      transferringMSID.transferringDates("from", "offered", "full")

      Then("the user answers yes on the start page")
      dashboard.answerRadioButton("yes")

      And("the user enters return data")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("sales-from-eu")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("check-your-answers")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }
  }
}

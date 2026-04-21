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

class BTASpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth      = Auth
  private val bta       = BTA

  Feature("BTA journeys") {
    Scenario("A user enters the Your Account page via BTA, submits a nil return and has the correct link back to BTA") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the your-account-from-bta link")
      bta.navigateToBtaLink("your-account-from-bta")
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

      And("the user clicks the back to your account link")
      dashboard.clickLink("back-to-your-account")

      And("the user is on the business-account page")
      dashboard.checkExternalServiceUrl("business-account")
    }

    Scenario(
      "A user enters the Start Your Return page via BTA, submits a nil return and has the correct link back to BTA"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the start-your-return-from-bta/2021-Q3 link")
      bta.navigateToBtaLink("start-your-return-from-bta/2021-Q3")

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

      And("the user clicks the back to your account link")
      dashboard.clickLink("back-to-your-account")

      And("the user is on the business-account page")
      dashboard.checkExternalServiceUrl("business-account")
    }

    Scenario(
      "A user with one outstanding payment clicks the BTA payment link and is directed to the payments service"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the payments-from-bta link")
      bta.navigateToBtaLink("payments-from-bta")

      Then("the user is redirected to the payments service")
      dashboard.checkExternalServiceUrl("pay/select-payment-amount?traceId=")
    }

    Scenario(
      "A user with multiple outstanding payments clicks the BTA payment link and is directed to the payment choice page"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("444444444", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the payments-from-bta link")
      bta.navigateToBtaLink("payments-from-bta")

      Then("the user is on the outstanding-payments page")
      dashboard.checkJourneyUrl("outstanding-payments")
    }

    Scenario(
      "A Welsh user enters the Your Account page via BTA and sees the Welsh transition page before 'Your Account'"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the your-account-from-bta?lang=cy link")
      bta.navigateToBtaLink("your-account-from-bta?lang=cy")

      Then("the user is on the dashboard Welsh transition page")
      bta.checkWelshTransition("dashboard")

      And("the user clicks continue is returned to their account")
      dashboard.continue()
      dashboard.checkJourneyUrl("your-account")
    }

    Scenario(
      "A Welsh user enters the Start Your Return page via BTA and sees the Welsh transition page before they start their return"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the start-your-return-from-bta/2021-Q3?lang=cy link")
      bta.navigateToBtaLink("start-your-return-from-bta/2021-Q3?lang=cy")

      Then("the user is on the start return Welsh transition page")
      bta.checkWelshTransition("startReturn")

      And("the user clicks continue then is on the start page of the return")
      dashboard.continue()
      dashboard.checkJourneyUrl("start")
    }

    Scenario(
      "A Welsh user enters the Continue Your Return page via BTA and sees the Welsh transition page before they continue their return"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user answers the first few questions of their return")
      dashboard.clickLink("start-your-return")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("eu-country-from-northern-ireland/1")
      dashboard.selectCountry("Spain")

      And("the user clicks the Save and come back later button")
      dashboard.clickLink("saveProgress")

      And("the user clicks on the sign out and come back later link")
      dashboard.clickLink("signOut")

      Then("the user signs back into the service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user browses to the continue-return-from-bta/2021-Q3?lang=cy link")
      bta.navigateToBtaLink("continue-return-from-bta/2021-Q3?lang=cy")

      Then("the user is directed to the continue return Welsh transition page")
      bta.checkWelshTransition("continueReturn")

      And("the user clicks continue then is on the return-continue page")
      dashboard.continue()
      dashboard.checkJourneyUrl("return-continue")
    }

    Scenario(
      "A Welsh user enters the Submitted Returns page via BTA and sees the Welsh transition page before the Past Returns page"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the returns-history-from-bta?lang=cy link")
      bta.navigateToBtaLink("returns-history-from-bta?lang=cy")

      Then("the user is on the returns history Welsh transition page")
      bta.checkWelshTransition("returnsHistory")

      And("the user clicks continue then is on the past-returns page")
      dashboard.continue()
      dashboard.checkJourneyUrl("past-returns")
    }

    Scenario(
      "A user enters the Your Account page via BTA with the en specific parameter and is directed straight to 'Your Account'"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the your-account-from-bta?lang=en link")
      bta.navigateToBtaLink("your-account-from-bta?lang=en")

      Then("the user is redirected back to your-account page")
      dashboard.checkJourneyUrl("your-account")
    }

    Scenario(
      "A Welsh user with multiple outstanding payments clicks the BTA payment link and and sees the Welsh transition page before the payment choice page"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("444444444", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the payments-from-bta?lang=cy link")
      bta.navigateToBtaLink("payments-from-bta?lang=cy")

      Then("the user is on the payment Welsh transition page")
      bta.checkWelshTransition("payments")

      And("the user clicks continue then is on the outstanding-payments page")
      dashboard.continue()
      dashboard.checkJourneyUrl("outstanding-payments")
    }

    Scenario(
      "A user enters the Continue Your Return page via BTA, submits a small return and has the correct link back to BTA"
    ) {

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

      When("the user clicks the Save and come back later button")
      dashboard.clickLink("saveProgress")
      dashboard.checkSavedReturn()

      And("the user clicks on the sign out and come back later link")
      dashboard.clickLink("signOut")

      Then("the user signs back into the service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "retrieveReturn")
      dashboard.checkJourneyUrl("your-account")

      When("the user manually navigates to the continue-return-from-bta/2021-Q3 page")
      bta.navigateToBtaLink("continue-return-from-bta/2021-Q3")

      Then("the user is on the return-continue page")
      dashboard.checkJourneyUrl("return-continue")

      When("the user selects the Continue my return option")
      dashboard.clickLink("value_0")
      dashboard.continue()

      Then("the user is able to continue their saved return")
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("add-sales-from-northern-ireland")
      dashboard.answerRadioButton("no")
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
  }
}

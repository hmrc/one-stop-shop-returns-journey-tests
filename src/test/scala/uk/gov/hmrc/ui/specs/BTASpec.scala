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

class BTASpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth = Auth

  Feature("BTA journeys") {
    Scenario("A user enters the Your Account page via BTA, submits a nil return and has the correct link back to BTA") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the your-account-from-bta link")
      dashboard.navigateToBtaLink("your-account-from-bta")
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

    Scenario("A user enters the Start Your Return page via BTA, submits a nil return and has the correct link back to BTA") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the start-your-return-from-bta/2021-Q3 link")
      dashboard.navigateToBtaLink("start-your-return-from-bta/2021-Q3")

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

    Scenario("A user with one outstanding payment clicks the BTA payment link and is directed to the payments service") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the payments-from-bta link")
      dashboard.navigateToBtaLink("payments-from-bta")

      Then("the user is redirected to the payments service")
      dashboard.checkExternalServiceUrl("pay/select-payment-amount?traceId=")
    }

    Scenario("A user with multiple outstanding payments clicks the BTA payment link and is directed to the payment choice pag") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("444444444", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user manually navigates to the payments-from-bta link")
      dashboard.navigateToBtaLink("payments-from-bta")

      Then("the user is on the outstanding-payments page")
      dashboard.checkJourneyUrl("outstanding-payments")
    }

  }
}

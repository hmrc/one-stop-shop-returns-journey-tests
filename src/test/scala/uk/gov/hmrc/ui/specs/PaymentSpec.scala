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

class PaymentSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth      = Auth

  Feature("Payment journeys") {
    Scenario("A user has one outstanding payment and is taken straight to the payment service from My Account") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the Make a payment link")
      dashboard.clickLink("make-a-payment")

      Then("the user is redirected to the payments service")
      dashboard.checkExternalServiceUrl("pay/select-payment-amount?traceId=")
    }

    Scenario("A user has multiple outstanding payments and is taken to the payment choice page from My Account") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("444444444", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the Make a payment link")
      dashboard.clickLink("make-a-payment")

      Then("the user is on the outstanding-payments page")
      dashboard.checkJourneyUrl("outstanding-payments")

      And("the user selects the second return period")
      dashboard.selectReturnPeriod("second")

      Then("the user is redirected to the payments service")
      dashboard.checkExternalServiceUrl("pay/select-payment-amount?traceId=")
    }
  }
}

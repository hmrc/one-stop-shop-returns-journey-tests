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

class AmendSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth      = Auth

  Feature("Amend registration journey") {
    Scenario("A user can navigate from Your Account to Change Your Registration in the registration service") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the Change your registration link")
      dashboard.clickLink("change-your-registration")

      Then("the user is redirected to the IOSS registration service")
      dashboard.checkRegistrationJourneyUrl("change-your-registration")
    }
  }
}

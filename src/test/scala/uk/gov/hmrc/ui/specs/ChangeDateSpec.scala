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

class ChangeDateSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth      = Auth

  Feature("Change date over two years journeys") {

    Scenario("User has a change date over two years - review registration") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("323232323", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user clicks the Review your registration details link")
      dashboard.checkJourneyUrl("2023-Q2/review-registration")
      dashboard.selectCssLink("start-amend-journey")

      Then("the user is redirected to the registration service to review their registration")
      dashboard.checkRegistrationJourneyUrl("change-your-registration")
    }

    Scenario("User has a change date over two years - skip for now") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("323232323", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user clicks the Skip for now button")
      dashboard.checkJourneyUrl("2023-Q2/review-registration")
      dashboard.clickLink("skip-and-back-to-your-account")

      Then("the user is able to progress the return")
      dashboard.checkJourneyUrl("2023-Q2/want-to-upload-file")
    }
  }
}

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

class KickoutSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth = Auth

  Feature("Kickout journeys") {

    Scenario("A user has not registered for the One Shop Stop scheme - no OSS enrolment") {

      Given("the user accesses the IOSS Returns Service with no OSS enrolment")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("121212121", "Organisation", "vatOnly", "dashboard")

      Then("the user is on the cannot-use-not-registered page")
      dashboard.checkJourneyUrl("cannot-use-not-registered")
    }

    Scenario("A user has not registered for the One Shop Stop scheme - no ETMP registration") {

      Given("the user accesses the IOSS Returns Service with no OSS enrolment")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("121212121", "Organisation", "hasOSSEnrolment", "dashboard")

      Then("the user is on the cannot-use-not-registered page")
      dashboard.checkJourneyUrl("cannot-use-not-registered")
    }

    Scenario("A user selects no to starting return for sales period where there are no other sales periods available") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers no on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("no")

      And("the user is on the no-other-periods-available page")
      dashboard.checkJourneyUrl("no-other-periods-available")

      And("the user clicks the back to your account link")
      dashboard.clickLink("back-to-your-account")
      dashboard.checkJourneyUrl("your-account")
    }

    Scenario("A user cannot start a return later than the most overdue return") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user manually navigates to the 2021-Q4 start page")
      dashboard.navigateToReturnStartPage("2021-Q4")

      And("the user is on the cannot-start-return page")
      dashboard.checkJourneyUrl("cannot-start-return")

      And("the user clicks the back to your account link")
      dashboard.clickLink("back-to-your-account")
      dashboard.checkJourneyUrl("your-account")
    }

    Scenario("A user cannot complete a return for the current period by manually browsing to the URL") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000005", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the user sees the next available return due message")
      dashboard.nextAvailableReturnDueMessage()

      When("the user manually navigates to the start page for the current period")
      dashboard.navigateToReturnStartPage("current")

      And("the user is on the no-other-periods-available page")
      dashboard.checkJourneyUrl("no-other-periods-available")

      And("the user clicks the back to your account link")
      dashboard.clickLink("back-to-your-account")
      dashboard.checkJourneyUrl("your-account")
    }

    Scenario("An excluded user is unable to complete a return for a period they were no longer registered") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600001212", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user manually navigates to the start page for the first excluded period")
      dashboard.navigateToReturnStartPage("excluded")

      And("the user is on the excluded-cannot-use-service page")
      dashboard.checkJourneyUrl("excluded-cannot-use-service")
    }
  }
}

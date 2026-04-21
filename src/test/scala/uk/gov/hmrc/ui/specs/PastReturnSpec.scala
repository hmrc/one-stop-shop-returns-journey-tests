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

import java.time.LocalDate

class PastReturnSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth      = Auth

  private val twoYearsAgo = LocalDate.now().minusYears(2).getYear.toString

  Feature("Past Returns journeys") {
    Scenario("A user views one of their past returns") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the View past returns link")
      dashboard.clickLink("view-past-returns")

      Then("the user is on the past-returns page")
      dashboard.checkJourneyUrl("past-returns")

      And("the user clicks on the July to September two years ago link")
      dashboard.clickLink("period")

      And("the user is on their past return for July to September two years ago")
      dashboard.checkJourneyUrl((s"past-returns/$twoYearsAgo-Q3"))
    }

    Scenario("A user has no past returns to view") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the View past returns link")
      dashboard.clickLink("view-past-returns")

      Then("the user is on the past-returns page")
      dashboard.checkJourneyUrl("past-returns")

      And("the user sees the no returns message")
      dashboard.noPastReturns()
    }

    Scenario("A user tries to start a duplicate return for the same period") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user manually attempts to start the return from Q3 two years ago")
      dashboard.navigateToReturnStartPage(s"$twoYearsAgo-Q3")

      And("the user is on their past return for July to September two years ago")
      dashboard.checkJourneyUrl(s"past-returns/$twoYearsAgo-Q3")
    }

    Scenario("A user is not able view a submitted return for a period over 6 years ago") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("166666666", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user manually navigates to their Q1 2018 return")
      dashboard.goToPage("past-returns/2018-Q1")

      Then("the user is on the no-longer-able-to-view-return page")
      dashboard.checkJourneyUrl("no-longer-able-to-view-return")

      When("the user manually navigates to their Q3 2018 return")
      dashboard.goToPage("past-returns/2018-Q3")

      Then("the user is on the no-longer-able-to-view-return page")
      dashboard.checkJourneyUrl("no-longer-able-to-view-return")
    }
  }
}

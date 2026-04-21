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

class ExpiredVrnRejoinSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth      = Auth
  private val exclusion = Exclusion

  Feature("Expired VRN Rejoin journeys") {
    Scenario("A trader who has left the service with outstanding returns and now has an expired VRN") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      Then(
        "the user is shown the correct banner for an expired VRN trader who has left the service and has outstanding returns"
      )
      exclusion.expiredVrnBanner("self", true)

      And("the link to Rejoin this service is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("rejoin")
    }

    Scenario("A trader who has left the service with no outstanding returns and now has an expired VRN") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000003", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      Then(
        "the user is shown the correct banner for an expired VRN trader who has left the service and has no outstanding returns"
      )
      exclusion.expiredVrnBanner("self", false)

      And("the link to Rejoin this service is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("rejoin")
    }

    Scenario("A trader who has been removed from the service with outstanding returns and now has an expired VRN") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000004", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      Then(
        "the user is shown the correct banner for an expired VRN trader who has been removed from the service and has outstanding returns"
      )
      exclusion.expiredVrnBanner("hmrc", true)

      And("the link to Rejoin this service is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("rejoin")
    }

    Scenario("A trader who has been removed from the service with no outstanding returns and now has an expired VRN") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000005", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      Then(
        "the user is shown the correct banner for an expired VRN trader who has been removed from the service and has no outstanding returns"
      )
      exclusion.expiredVrnBanner("hmrc", false)

      And("the link to Rejoin this service is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("rejoin")
    }

    Scenario(
      "A trader who has left the service with outstanding returns older than 3 years and now has an expired VRN"
    ) {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000006", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      Then(
        "the user is shown the correct banner for an expired VRN trader who has left the service and has outstanding returns"
      )
      exclusion.expiredVrnBanner("self", true)

      And("the dashboard message is displayed for a return outstanding for more than 3 years")
      exclusion.moreThanThreeYearsOutstanding()

      And("the link to Rejoin this service is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("rejoin")
    }
  }
}

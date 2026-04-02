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

class ExclusionSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth      = Auth
  private val exclusion = Exclusion

  Feature("Exclusion journeys") {
    Scenario("An HMRC excluded user who has more than one return remaining does not have final return content") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000011", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And(
        "the user is shown the correct banner for a trader who has been removed from the service and has outstanding returns"
      )
      exclusion.exclusionsBanner("hmrc", true)
      exclusion.correctionsAvailable()

      And("the link to Rejoin this service is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("rejoin")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("they are presented with the regular heading for starting a return")
      exclusion.returnHeadingNotFinalReturn()

      And("the user starts the first return from last year")
      exclusion.firstReturnLastYear()

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
    }

    Scenario("An HMRC excluded user who has one return remaining is shown the final return content") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000012", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And(
        "the user is shown the correct banner for a trader who has been removed from the service and has outstanding returns"
      )
      exclusion.exclusionsBanner("hmrc", true)

      And("the user sees the final return message on the dashboard")
      exclusion.finalReturnDashboard()

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      And("the user starts the first return from last year")
      exclusion.firstReturnLastYear()

      And("the user answers no on the sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      And("the user answers no on the sales-from-eu page")
      dashboard.checkJourneyUrl("sales-from-eu")
      dashboard.answerRadioButton("no")

      And("the user sees the exclusion submission message on the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      exclusion.exclusionSubmissionMessage()

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("An HMRC excluded user who has filed their last return is not able to access the subsequent return") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600001212", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And(
        "the user is shown the correct banner for a trader who has been removed from the service and has no outstanding returns"
      )
      exclusion.exclusionsBanner("hmrc", false)

      And("the user manually navigates to the start your return page")
      dashboard.navigateToReturnStartPage("excluded")

      Then("the user is on the excluded-cannot-use-service page")
      dashboard.checkJourneyUrl("excluded-cannot-use-service")
    }

    Scenario("A user completes their final return when excluded by HMRC with reason 4 - quarantined") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000014", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And(
        "the user is shown the correct banner for a trader who has been quarantined from the service and has outstanding returns"
      )
      exclusion.exclusionsBanner("quarantined", true)

      And("the user sees the final return message on the dashboard")
      exclusion.finalReturnDashboard()

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

      And("the user sees the exclusion submission message on the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      exclusion.exclusionSubmissionMessage()

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("A non-excluded user selects Leave this service from the dashboard") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Leave this service' link")
      dashboard.clickLink("leave-this-service")

      Then("the user has been redirected to the exclusions service")
      dashboard.checkExclusionsJourneyUrl()
    }

    Scenario("An excluded user cannot access the exclusions journey") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000013", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the link to Leave this service is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("leave")
    }

    Scenario(
      "A user who is excluded in the future sees the correct dashboard messages when they have outstanding returns"
    ) {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000018", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And(
        "the user is shown the correct banner for a trader with a future exclusion date and has outstanding returns"
      )
      exclusion.exclusionsBanner("future", true)

      And("the link to Rejoin this service is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("rejoin")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user is on the 2024-Q1/start page")
      dashboard.checkJourneyUrl("2024-Q1/start")
    }

    Scenario("A user who has left the service and has no outstanding actions") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000019", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And(
        "the user is shown the correct banner for a trader with an exclusion date in the past and no outstanding returns"
      )
      exclusion.exclusionsBanner("past", false)

      And("they are shown the correct returns message for no outstanding returns")
      exclusion.noCorrections()

      And("the returns tile shows final return is completed")
      exclusion.finalReturnCompletedTile()

      When("the user clicks on the 'Rejoin this service' link")
      dashboard.clickLink("rejoin-this-service")

      Then("the user has been redirected to the rejoin journey")
      dashboard.checkRegistrationJourneyUrl("rejoin-already-made-sales")
    }

    Scenario("A user who has left the service and has outstanding returns") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000020", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And(
        "the user is shown the correct banner for a trader with a future exclusion date and has outstanding returns"
      )
      exclusion.exclusionsBanner("past", true)

      And("they are shown the correct returns message for outstanding returns")
      exclusion.correctionsAvailable()

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user is on the 2024-Q1/start page")
      dashboard.checkJourneyUrl("2024-Q1/start")
    }

    Scenario("A user who has been removed from the service and has no outstanding returns") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000021", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And(
        "the user is shown the correct banner for a trader who has been removed from the service and has no outstanding returns"
      )
      exclusion.exclusionsBanner("hmrc", false)
      exclusion.noCorrections()
      exclusion.finalReturnCompletedTile()

      When("the user clicks on the 'Rejoin this service' link")
      dashboard.clickLink("rejoin-this-service")

      Then("the user has been redirected to the rejoin journey")
      dashboard.checkRegistrationJourneyUrl("rejoin-already-made-sales")
    }

    Scenario("A user who has been quarantined and has outstanding returns") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000025", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And(
        "the user is shown the correct banner for a trader who has been quarantined from the service and has outstanding returns"
      )
      exclusion.exclusionsBanner("quarantined", true)
      exclusion.correctionsAvailable()

      And("the link to Rejoin this service is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("rejoin")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user is on the start page")
      dashboard.checkJourneyUrl("start")
    }

    Scenario("A user who has been quarantined and has no outstanding returns") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000026", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And(
        "they are presented with the correct banner for a quarantined trader with no outstanding returns"
      )
      exclusion.exclusionsBanner("quarantined", false)
      exclusion.noCorrections()
      exclusion.finalReturnCompletedTile()

      And("the link to Rejoin this service is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("rejoin")

      And("the user manually navigates to the start your return page")
      dashboard.navigateToReturnStartPage("excluded")

      Then("the user is on the excluded-cannot-use-service page")
      dashboard.checkJourneyUrl("excluded-cannot-use-service")
    }

    Scenario("A user who is excluded can cancel their request to leave within the correct timescales") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000027", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Cancel your request to leave' link")
      dashboard.clickLink("cancel-request-to-leave")

      Then("the user has been redirected to the exclusions service")
      dashboard.checkExclusionsJourneyUrl()
    }

    Scenario("A user who is excluded cannot cancel their request to leave outside of the correct timescales") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("600000017", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the link to Cancel your request to leave is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("cancel")
    }

    Scenario("A user who is excluded by HMRC cannot reverse exclusion - ceased trade") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000030", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the link to Cancel your request to leave is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("cancel")
    }

    Scenario("A user who is excluded by HMRC cannot reverse exclusion - no longer meets conditions") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000031", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the link to Cancel your request to leave is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("cancel")
    }

    Scenario(
      "A user who is not excluded does not have the option to enter the reversal or rejoin journeys on the dashboard"
    ) {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      And("the link to Cancel your request to leave is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("cancel")

      And("the link to Rejoin this service is not displayed on the dashboard")
      exclusion.leaveRejoinLinkNotDisplayed("rejoin")
    }

    Scenario("A user who has reversed their exclusion can leave the service again") {

      Given("the user accesses the IOSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000029", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Leave this service' link")
      dashboard.clickLink("leave-this-service")

      Then("the user has been redirected to the exclusions service")
      dashboard.checkExclusionsJourneyUrl()
    }
  }
}

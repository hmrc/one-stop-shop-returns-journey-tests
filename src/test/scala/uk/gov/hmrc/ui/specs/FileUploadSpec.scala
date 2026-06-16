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

class FileUploadSpec extends BaseSpec {

  private val dashboard = Dashboard
  private val auth      = Auth
  private val fileUpload = FileUpload

  Feature("File upload journeys") {

    Scenario("Trader who is not an online marketplace uses the file upload functionality to submit their return") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user answers yes on the want-to-upload-file page")
      dashboard.checkJourneyUrl("want-to-upload-file")
      dashboard.clickLink("value")
      dashboard.continue()

      And("the user uploads the file 'nonOnlineMarketplace.csv'")
      dashboard.checkJourneyUrl("file-upload")
      fileUpload.uploadFile("nonOnlineMarketplace.csv")

      And("the user answers yes to the file-uploaded page")
      fileUpload.fileUploadedUrlCheck("2024-Q4")
      fileUpload.selectFileUpload("Yes")

      And("the user answers no on the correct-previous-return page")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("no")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("Trader who is an online marketplace uses the file upload functionality to submit their return") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("300000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user answers yes on the want-to-upload-file page")
      dashboard.checkJourneyUrl("want-to-upload-file")
      dashboard.clickLink("value")
      dashboard.continue()

      And("the user uploads the file 'onlineMarketplace.csv'")
      dashboard.checkJourneyUrl("file-upload")
      fileUpload.uploadFile("onlineMarketplace.csv")

      And("the user answers yes to the file-uploaded page")
      fileUpload.fileUploadedUrlCheck("2023-Q2")
      fileUpload.selectFileUpload("Yes")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }
  }
}

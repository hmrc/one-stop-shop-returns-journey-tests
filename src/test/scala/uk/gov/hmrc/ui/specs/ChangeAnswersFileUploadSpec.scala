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

class ChangeAnswersFileUploadSpec extends BaseSpec {

  private val dashboard  = Dashboard
  private val auth       = Auth
  private val fileUpload = FileUpload

  Feature("Changing answers with file upload journeys") {

    Scenario("Trader adds a file with NI sales only and EU sales manually") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user answers yes on the sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("yes")

      And("the user answers yes on the want-to-upload-file page")
      dashboard.checkJourneyUrl("want-to-upload-file")
      dashboard.clickLink("value")
      dashboard.continue()

      And("the user uploads the file 'ossNiSales.csv'")
      dashboard.checkJourneyUrl("file-upload")
      fileUpload.uploadFile("ossNiSales.csv")

      And("the user answers yes to the file-uploaded page")
      fileUpload.fileUploadedUrlCheck("2021-Q3")
      fileUpload.selectFileUpload("Yes")

      When("the user is on the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")

      Then("the user clicks change for Sales from EU countries")
      dashboard.selectChangeOrRemoveLink("check-sales-from-eu")

      And("the user answers yes on the check-sales-from-eu page")
      dashboard.checkJourneyUrl("check-sales-from-eu")
      dashboard.answerRadioButton("yes")

      And("the user manually enters sales for the EU")
      //currently going to file upload
      dashboard.checkJourneyUrl("check-eu-country-sold-from/1")
      dashboard.selectCountry("Lithuania")
      dashboard.checkJourneyUrl("check-eu-country-sold-to/1/1")
      dashboard.selectCountry("Slovakia")
      dashboard.checkJourneyUrl("check-eu-vat-rates-from-eu/1/1")
      dashboard.tickCheckbox("first")
      dashboard.continue()
      dashboard.checkJourneyUrl("check-eu-sales-from-eu/1/1/1")
      dashboard.enterAnswer("123456")
      dashboard.checkJourneyUrl("check-vat-on-sales-from-eu/1/1/1")
      dashboard.selectSuggestedVat()
      dashboard.checkJourneyUrl("change-check-sales-from-eu/1/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("check-add-sales-from-eu-to-eu/1")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("check-eu-country-sold-to/1/2")
      dashboard.selectCountry("Estonia")
      dashboard.checkJourneyUrl("check-eu-vat-rates-from-eu/1/2")
      dashboard.tickCheckbox("first")
      dashboard.continue()
      dashboard.checkJourneyUrl("check-eu-sales-from-eu/1/2/1")
      dashboard.enterAnswer("123456")
      dashboard.checkJourneyUrl("check-vat-on-sales-from-eu/1/2/1")
      dashboard.selectSuggestedVat()
      dashboard.checkJourneyUrl("change-check-sales-from-eu/1/2")
      dashboard.continue()
      dashboard.checkJourneyUrl("check-add-sales-from-eu-to-eu/1")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("check-add-sales-from-eu")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("check-eu-country-sold-from/2")
      dashboard.selectCountry("Austria")
      dashboard.checkJourneyUrl("check-eu-country-sold-to/2/1")
      dashboard.selectCountry("Sweden")
      dashboard.checkJourneyUrl("check-eu-vat-rates-from-eu/2/1")
      dashboard.tickCheckbox("first")
      dashboard.continue()
      dashboard.checkJourneyUrl("check-eu-sales-from-eu/2/1/1")
      dashboard.enterAnswer("123456")
      dashboard.checkJourneyUrl("check-vat-on-sales-from-eu/2/1/1")
      dashboard.selectSuggestedVat()
      dashboard.checkJourneyUrl("change-check-sales-from-eu/2/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("check-add-sales-from-eu-to-eu/2")
      dashboard.answerRadioButton("no")
      dashboard.checkJourneyUrl("check-add-sales-from-eu")
      dashboard.answerRadioButton("no")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("Trader adds a file with EU sales only and NI sales manually") {
      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
      dashboard.checkJourneyUrl("your-account")

      When("the user clicks on the 'Start your return' link")
      dashboard.clickLink("start-your-return")

      Then("the user answers yes on the start page")
      dashboard.checkJourneyUrl("start")
      dashboard.answerRadioButton("yes")

      And("the user answers no on the sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      And("the user answers yes on the sales-from-eu page")
      dashboard.checkJourneyUrl("sales-from-eu")
      dashboard.answerRadioButton("yes")

      And("the user answers yes on the want-to-upload-file page")
      dashboard.checkJourneyUrl("want-to-upload-file")
      dashboard.clickLink("value")
      dashboard.continue()

      And("the user uploads the file 'ossEuSales.csv'")
      dashboard.checkJourneyUrl("file-upload")
      fileUpload.uploadFile("ossEuSales.csv")

      And("the user answers yes to the file-uploaded page")
      fileUpload.fileUploadedUrlCheck("2021-Q3")
      fileUpload.selectFileUpload("Yes")

      When("the user is on the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")

      Then("the user clicks change for Sales from NI")
      dashboard.selectChangeOrRemoveLink("check-sales-from-northern-ireland")

      And("the user answers yes on the check-sales-from-northern-ireland page")
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland")
      dashboard.answerRadioButton("yes")

      And("the user manually enters sales for NI")
      //currently going to file upload
      dashboard.checkJourneyUrl("check-eu-country-from-northern-ireland/1")
      dashboard.selectCountry("Denmark")
      dashboard.checkJourneyUrl("check-eu-sales-from-northern-ireland/1/1")
      dashboard.enterAnswer("50000")
      dashboard.checkJourneyUrl("check-vat-on-sales-from-northern-ireland/1/1")
      dashboard.selectSuggestedVat()
      dashboard.checkJourneyUrl("change-check-sales-from-northern-ireland/1")
      dashboard.continue()
      dashboard.checkJourneyUrl("check-add-sales-from-northern-ireland")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("check-eu-country-from-northern-ireland/2")
      dashboard.selectCountry("Cyprus")
      dashboard.checkJourneyUrl("check-eu-vat-rates-from-northern-ireland/2")
      dashboard.tickCheckbox("first")
      dashboard.continue()
      dashboard.checkJourneyUrl("check-eu-sales-from-northern-ireland/2/1")
      dashboard.enterAnswer("50000")
      dashboard.checkJourneyUrl("check-vat-on-sales-from-northern-ireland/2/1")
      dashboard.selectSuggestedVat()
      dashboard.checkJourneyUrl("change-check-sales-from-northern-ireland/2")
      dashboard.continue()
      dashboard.checkJourneyUrl("check-add-sales-from-northern-ireland")
      dashboard.answerRadioButton("no")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("Trader does a nil return then adds file upload via NI section") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000003", "Organisation", "hasOSSEnrolment", "dashboard")
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

      And("the user answers no on the correct-previous-return page")
      dashboard.checkJourneyUrl("correct-previous-return")
      dashboard.answerRadioButton("no")

      When("the user is on the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")

      Then("the user clicks change on the Sales from Northern Ireland section")
      dashboard.selectChangeOrRemoveLink("check-sales-from-northern-ireland")

      And("the user adds sales for both NI and EU via NI section")
      dashboard.checkJourneyUrl("check-sales-from-northern-ireland")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("change-want-to-upload-file")
      dashboard.clickLink("value")
      dashboard.continue()
      dashboard.checkJourneyUrl("file-upload")
      fileUpload.uploadFile("ossBothSales.csv")
      fileUpload.fileUploadedUrlCheck("2024-Q4")
      fileUpload.selectFileUpload("Yes")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }

    Scenario("Trader does a nil return then adds file upload via EU section") {

      Given("the user accesses the OSS Returns Service")
      auth.goToAuthorityWizard()
      auth.loginUsingAuthorityWizard("100000002", "Organisation", "hasOSSEnrolment", "dashboard")
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

      When("the user is on the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")

      Then("the user clicks change on the Sales from EU section")
      dashboard.selectChangeOrRemoveLink("check-sales-from-eu")

      And("the user adds sales for both NI and EU via EU section")
      dashboard.checkJourneyUrl("check-sales-from-eu")
      dashboard.answerRadioButton("yes")
      dashboard.checkJourneyUrl("change-want-to-upload-file")
      dashboard.clickLink("value")
      dashboard.continue()
      dashboard.checkJourneyUrl("file-upload")
      fileUpload.uploadFile("ossBothSales.csv")
      fileUpload.fileUploadedUrlCheck("2021-Q3")
      fileUpload.selectFileUpload("Yes")

      And("the user submits their return successfully via the check-your-answers page")
      dashboard.checkJourneyUrl("check-your-answers")
      dashboard.submit()
      dashboard.checkJourneyUrl("return-submitted")
    }
  }
}

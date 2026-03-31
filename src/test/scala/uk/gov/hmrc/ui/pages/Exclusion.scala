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

package uk.gov.hmrc.ui.pages

import org.junit.Assert
import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver

import java.time.LocalDate

object Exclusion extends BasePage {

  private val fourYearsAgo = LocalDate.now().minusYears(4).getYear.toString

  def expiredVrnBanner(exclusionType: String, returnsOutstanding: Boolean): Unit = {

    val textToDisplay = (exclusionType, returnsOutstanding) match {
      case ("self", false) =>
        "You have left this service.\nYou are no longer VAT registered. You must re-register for VAT to use the One Stop Shop service."
      case ("self", true)  =>
        "You have left this service. You must complete and pay any outstanding returns.\nYou are no longer VAT registered. You must re-register for VAT to use the One Stop Shop service."
      case ("hmrc", false) =>
        "We've removed you from this service.\nYou are no longer VAT registered. You must re-register for VAT to use the One Stop Shop service."
      case ("hmrc", true)  =>
        "We've removed you from this service, but you must complete and pay your final return. You cannot rejoin until 1 April 2026\nYou are no longer VAT registered. You must re-register for VAT to use the One Stop Shop service."
      case _               => "not a valid combination"
    }
    val htmlBody      = Driver.instance.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        textToDisplay
      )
    )
  }

  def leaveRejoinLinkNotDisplayed(linkType: String): Unit = {

    val link     = linkType match {
      case "leave"  => "Leave this service"
      case "rejoin" => "Rejoin this service"
      case "cancel" => "Cancel your request to leave"
      case _        => "not a valid link"
    }
    val htmlBody = Driver.instance.findElement(By.tagName("body")).getText
    Assert.assertFalse(
      htmlBody.contains(
        link
      )
    )
  }

  def moreThanThreeYearsOutstanding(): Unit = {
    val htmlBody = Driver.instance.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        s"You must complete your January to March $fourYearsAgo return with the countries where you made your sales."
      )
    )
  }
}

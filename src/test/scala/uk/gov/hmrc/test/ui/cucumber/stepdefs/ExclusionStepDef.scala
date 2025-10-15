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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import org.junit.Assert
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.{CommonPage, ExclusionPage}

import java.time.LocalDate

class ExclusionStepDef extends BaseStepDef {

  Then(
    """^the user has been redirected to the exclusions service$"""
  ) { () =>
    ExclusionPage.checkExclusionsUrl()
  }

  When("""^the user manually navigates to the self exclude journey$""") { () =>
    ExclusionPage.goToExclusionsJourney()
  }

  Then(
    """^they are presented with the correct banner for trader with an exclusion date in the future with outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains("You have asked to leave this service. You must complete and pay any outstanding returns.")
    )
  }

  Then(
    """^they are presented with the correct banner for trader with an exclusion date in the past and no outstanding actions$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains("You have left this service.")
    )
  }

  Then(
    """^they are presented with the correct banner for trader with an exclusion date in the past with a return due$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains("You have left this service. You must complete and pay any outstanding returns.")
    )
  }

  Then("""^they are shown the correct returns message for no outstanding returns$""") { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        "You can no longer use this service to correct previous returns. You must make any VAT corrections directly with the country where you made the sales."
      )
    )
  }

  Then("""^the returns tile shows final return is completed$""") { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(htmlBody.contains("You've completed your final return."))
  }

  Then("""^they are shown the correct returns message for outstanding returns$""") { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(htmlBody.contains("You can correct a previous return when you submit your final one."))
  }

  Then(
    """^they are presented with the correct banner for trader removed from service and has outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains("We've removed you from this service, but you must complete and pay your final return.")
    )
  }

  Then(
    """^they are presented with the correct banner for trader removed from service and has no outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains("We've removed you from this service.")
    )
  }

  Then(
    """^they are presented with the correct banner for a quarantined trader with outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        "We've removed you from this service, but you must complete and pay your final return. You cannot rejoin until"
      )
    )
  }

  Then(
    """^they are presented with the correct banner for a quarantined trader with no outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        "We've removed you from this service. You cannot rejoin until"
      )
    )
  }

  Then(
    """^they are presented with the correct banner for expired VRN trader who has left the service and has outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        "You have left this service. You must complete and pay any outstanding returns.\nYou are no longer VAT registered. You must re-register for VAT to use the One Stop Shop service."
      )
    )
  }

  Then(
    """^they are presented with the correct banner for expired VRN trader who has left the service and has no outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        "You have left this service.\nYou are no longer VAT registered. You must re-register for VAT to use the One Stop Shop service."
      )
    )
  }

  Then(
    """^they are presented with the correct banner for expired VRN trader removed from service and has outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        "We've removed you from this service, but you must complete and pay your final return. You cannot rejoin until 1 April 2026\nYou are no longer VAT registered. You must re-register for VAT to use the One Stop Shop service."
      )
    )
  }

  Then(
    """^they are presented with the correct banner for expired VRN trader removed from service and has no outstanding returns$"""
  ) { () =>
    val htmlBody = driver.findElement(By.tagName("body")).getText
    Assert.assertTrue(
      htmlBody.contains(
        "We've removed you from this service.\nYou are no longer VAT registered. You must re-register for VAT to use the One Stop Shop service."
      )
    )
  }

  When("""^the user starts the first return from last year$""") { () =>
    val lastYear = LocalDate.now().minusYears(1).getYear.toString
    CommonPage.checkUrl(s"$lastYear-Q1/start")
    CommonPage.selectAnswer("yes")
  }

}

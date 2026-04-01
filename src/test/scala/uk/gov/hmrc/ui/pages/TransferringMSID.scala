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

object TransferringMSID extends BasePage {

  def transferringDates(transferDirection: String, returnStage: String, returnType: String): Unit = {

    val htmlBody = Driver.instance.findElement(By.tagName("body")).getText
    val heading  = Driver.instance.findElement(By.tagName("h1")).getText
    if (transferDirection == "to" && returnStage == "offered" && returnType == "full") {
      Assert.assertTrue(heading.contains("1 April to 30 June 2023"))
    } else if (transferDirection == "to" && returnStage == "submitting" && returnType == "full") {
      Assert.assertTrue(htmlBody.contains("1 April to 30 June 2023"))
    } else if (transferDirection == "to" && returnType == "partial") {
      Assert.assertTrue(htmlBody.contains("1 July to 8 September 2023"))
    } else if (transferDirection == "from" && returnType == "partial") {
      Assert.assertTrue(htmlBody.contains("9 June to 30 June 2023"))
    } else {
      Assert.assertTrue(heading.contains("1 July to 30 September 2023"))
    }
  }

  def selectReturn(link: String): Unit =
    click(By.cssSelector(s"a[href*=$link]"))

  def pastReturnDates(direction: String): Unit = {
    val htmlH1 = Driver.instance.findElement(By.tagName("h1")).getText

    if (direction == "to") {
      Assert.assertTrue(htmlH1.contains("1 July to 8 September 2023"))
    } else {
      Assert.assertTrue(htmlH1.contains("9 June to 30 June 2023"))
    }
  }
}

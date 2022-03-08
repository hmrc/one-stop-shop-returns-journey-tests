/*
 * Copyright 2022 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.driver.BrowserDriver

import java.time.LocalDate

object CommonPage extends BrowserDriver with Matchers {

  val host: String = TestConfiguration.url("one-stop-shop-returns-frontend")

  def goToStartOfJourney(): Unit =
    driver
      .navigate()
      .to(s"$host/your-account")

  def checkUrl(url: String): Unit =
    driver.getCurrentUrl should endWith(url)

  def selectAnswer(data: String): Unit = {
    data match {
      case "yes" => driver.findElement(By.id("value")).click()
      case "no"  => driver.findElement(By.id("value-no")).click()
      case _     => throw new Exception("Option doesn't exist")
    }
    clickContinue()
  }

  def enterData(inputId: String = "value", data: String): Unit =
    driver.findElement(By.id(inputId)).sendKeys(data)

  def submitForm(): Unit =
    clickContinue()

  def tickCheckbox(checkbox: String): Unit =
    checkbox match {
      case "first"  => driver.findElement(By.id("value_0")).click()
      case "second" => driver.findElement(By.id("value_1")).click()
      case _        => throw new Exception("Checkbox doesn't exist")
    }

  def selectValueAutocomplete(data: String): Unit = {
    val inputId = "value"
    driver.findElement(By.id(inputId)).sendKeys(data)
    waitForElement(By.id(inputId))
    driver.findElement(By.cssSelector("li#value__option--0")).click()
    clickContinue()
  }

  def waitForElement(by: By) =
    new WebDriverWait(driver, 3).until {
      ExpectedConditions.presenceOfElementLocated(by)
    }

  def clickContinue(): Unit =
    driver.findElement(By.id("continue")).click()

  def selectLink(link: String): Unit =
    driver.findElement(By.cssSelector(s"a[href*=$link]")).click()

  def checkDoubleIndexURL(firstIndex: String, secondIndex: String, urlPage: String, appendText: String): Unit =
    (firstIndex, secondIndex) match {
      case ("first", "first")   => CommonPage.checkUrl(urlPage + "/1/1" + appendText)
      case ("first", "second")  => CommonPage.checkUrl(urlPage + "/1/2" + appendText)
      case ("second", "first")  => CommonPage.checkUrl(urlPage + "/2/1" + appendText)
      case ("second", "second") => CommonPage.checkUrl(urlPage + "/2/2" + appendText)
      case _                    => throw new Exception("Index combination is invalid")
    }

  def currentPeriod(): String =
    LocalDate.now().getYear + "-" + getQuarter(LocalDate.now().getMonthValue)

  def getQuarter(month: Int): String =
    month match {
      case 1 | 2 | 3    => "Q1"
      case 4 | 5 | 6    => "Q2"
      case 7 | 8 | 9    => "Q3"
      case 10 | 11 | 12 => "Q4"
    }

  def navigateToReturnStartPage(period: String): Unit =
    driver
      .navigate()
      .to(s"$host/$period/start")

}

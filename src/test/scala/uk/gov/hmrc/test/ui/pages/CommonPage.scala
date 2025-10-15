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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait}
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.selenium.webdriver.Driver

import java.time.format.DateTimeFormatter
import java.time.{Clock, LocalDate}

object CommonPage extends BasePage with Matchers {

  val exclusionsHost: String   = TestConfiguration.url("one-stop-shop-exclusions-frontend")
  val registrationHost: String = TestConfiguration.url("one-stop-shop-registration-frontend")

  def checkUrl(url: String): Unit = {
    fluentWait.until(ExpectedConditions.urlContains(url))
    getCurrentUrl should endWith(url)
  }

  def selectAnswer(data: String): Unit = {
    data match {
      case "yes" => click(By.id("value"))
      case "no"  => click(By.id("value-no"))
      case _     => throw new Exception("Option doesn't exist")
    }
    clickContinue()
  }

  def enterData(inputId: String = "value", data: String): Unit =
    sendKeys(By.id(inputId), data)

  def submitForm(): Unit =
    clickContinue()

  def tickCheckbox(checkbox: String): Unit =
    checkbox match {
      case "first"  => click(By.id("value_0"))
      case "second" => click(By.id("value_1"))
      case _        => throw new Exception("Checkbox doesn't exist")
    }

  def selectValueAutocomplete(data: String): Unit = {
    val inputId = "value"
    sendKeys(By.id(inputId), data)
    waitForElement(By.id(inputId))
    click(By.cssSelector("li#value__option--0"))
    clickContinue()
  }

  def waitForElement(by: By) =
    new FluentWait(Driver.instance).until(ExpectedConditions.presenceOfElementLocated(by))

  def clickContinue(): Unit =
    click(By.id("continue"))

  def clickSubmit(): Unit =
    click(By.id("submit"))

  def selectLink(link: String): Unit =
    click(By.cssSelector(s"a[href*=$link]"))

  def checkDoubleIndexURL(firstIndex: String, secondIndex: String, urlPage: String, appendText: String): Unit =
    (firstIndex, secondIndex) match {
      case ("first", "first")   => CommonPage.checkUrl(urlPage + "/1/1" + appendText)
      case ("first", "second")  => CommonPage.checkUrl(urlPage + "/1/2" + appendText)
      case ("second", "first")  => CommonPage.checkUrl(urlPage + "/2/1" + appendText)
      case ("second", "second") => CommonPage.checkUrl(urlPage + "/2/2" + appendText)
      case ("third", "first")   => CommonPage.checkUrl(urlPage + "/3/1" + appendText)
      case _                    => throw new Exception("Index combination is invalid")
    }

  def currentPeriod(): String =
    s"${LocalDate.now().getYear}-${getQuarter(LocalDate.now().getMonthValue)}"

  def getQuarter(month: Int): String =
    month match {
      case 1 | 2 | 3    => "Q1"
      case 4 | 5 | 6    => "Q2"
      case 7 | 8 | 9    => "Q3"
      case 10 | 11 | 12 => "Q4"
    }

  private def nextQuarter: LocalDate = {
    val today                    = LocalDate.now(Clock.systemUTC())
    val endMonthOfQuarter        = (((today.getMonthValue - 1) / 3) + 1) * 3
    val dateInLastMonthOfQuarter = today.withMonth(endMonthOfQuarter)
    val lastDayOfCurrentQuarter  = dateInLastMonthOfQuarter.withDayOfMonth(dateInLastMonthOfQuarter.lengthOfMonth)

    lastDayOfCurrentQuarter.plusDays(1)
  }

  def generateNextAvailableReturn(): String = {
    val today               = LocalDate.now()
    val currentQuarterStart = nextQuarter.minusMonths(3)
    val currentQuarterEnd   = today.withMonth(currentQuarterStart.getMonthValue).plusMonths(2)

    s"You can complete your " +
      s"${currentQuarterStart.format(DateTimeFormatter.ofPattern("MMMM"))} to " +
      s"${currentQuarterEnd.format(DateTimeFormatter.ofPattern("MMMM yyyy"))} return from " +
      s"${nextQuarter.format(DateTimeFormatter.ofPattern("d MMMM yyyy"))}."
  }

  def checkRejoinUrl(): Unit =
    getCurrentUrl should startWith(s"$exclusionsHost/rejoin-already-made-sales")

  def clickBackButton(): Unit =
    Driver.instance
      .navigate()
      .back()

}

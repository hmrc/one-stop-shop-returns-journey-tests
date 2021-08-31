/*
 * Copyright 2021 HM Revenue & Customs
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
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.pages.CommonPage.waitForElement

object CommonPage extends BrowserDriver with Matchers {

  def goToStartOfJourney(): Unit =
    driver.navigate().to("http://localhost:10204/pay-vat-on-goods-sold-to-eu/northern-ireland-returns/")

  def checkUrl(url: String): Unit =
    driver.getCurrentUrl should endWith(url)

  def selectAnswer(data: String): Unit = {
    data match {
      case "yes" => driver.findElement(By.id("value")).click()
      case "no"  => driver.findElement(By.id("value-no")).click()
      case _     => throw new Exception("Option doesn't exist")
    }
    driver.findElement(By.xpath("//*[@id='main-content']/div/div/form/button")).click()
  }

  def enterData(inputId: String = "value", data: String): Unit =
    driver.findElement(By.id(inputId)).sendKeys(data)

  def submitForm(): Unit =
    driver.findElement(By.xpath("//*[@id='main-content']/div/div/form/button")).click()

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
    driver.findElement(By.xpath("//*[@id='main-content']/div/div/form/button")).click()
  }

  def waitForElement(by: By) =
    new WebDriverWait(driver, 3).until {
      ExpectedConditions.presenceOfElementLocated(by)
    }

  def clickContinue(): Unit =
    driver.findElement(By.xpath("//*[@id='main-content']/div/div/form/button")).click()

}

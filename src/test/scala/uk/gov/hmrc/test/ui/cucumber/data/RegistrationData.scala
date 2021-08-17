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

package uk.gov.hmrc.test.ui.cucumber.data

object RegistrationData {
  val data: List[String] =
    List(
      s"""
      |{
      |    "_id" : ObjectId("611bc5b242e4691ffa61688f"),
      |    "vrn" : "100000002",
      |    "registeredCompanyName" : {
      |        "value" : "JdvsPrYnu9UNGko5WYymGLunQ/9faekXHvhzCg==",
      |        "nonce" : "ZeU1Gm068oLqKBzIypFnPtR9admvOcWYRp4aVIC1egL5pxfn1HYYvJqnUj4GBuOjkRHxkUQmMysSH82YO5V8weGMkJq+WNRfrxnB5G4yxPb4fXb5V7g3BhTYlyS7ws9z"
      |    },
      |    "tradingNames" : [
      |        {
      |            "value" : "2xzH4UPoR7qx3y3Jc6N/SupWPQ==",
      |            "nonce" : "SynKFCCzhGcW7J/yPs6Un8Lm96yswXuydwyYe5nOx0Y20MNIXdn9/EqTDXnMp01rbA7Fx5muxIKgxnf4YACE6Qt7qRoj8Q+6ULZkcXBuhI5mOzDP0Ku95+7AVEe+ap5I"
      |        }
      |    ],
      |    "vatDetails" : {
      |        "registrationDate" : "2020-01-01",
      |        "address" : {
      |            "line1" : {
      |                "value" : "14hGaO0ysYEDW7CR7UwN5UQJYmcEo0gfoffv2A==",
      |                "nonce" : "cXmUZ9d9aPTK3FxrxQQftWHyZYnstA8auq8yYFjAAgmNyCy5vHutfVvKkquX3k0JEJFwZ7mK4eU/CCpgb9faM+4aRMbFBQ2RP/E/LwkLYtShUkAMEpgNeT5bEEdAUcQs"
      |            },
      |            "line2" : {
      |                "value" : "oVn0q+KgwqBnHSTQ0fveqqiaBk0/q9OMVQ==",
      |                "nonce" : "P8QzKTtLfzQqsn0hiSg1jAatHbSzmyXI/hgUsLaYpEIEQelwP6BwzIg7ZsVDruNYb8Ip2K+LWMqHi8XAjh0nfcJ9jTwtZ/21/RHqWtBYil6BPlYU0bV66o6sWEpBIt32"
      |            },
      |            "postCode" : {
      |                "value" : "Pf/TXrVHUaFOZh1EmRNpfsfQX1is2NW8",
      |                "nonce" : "KTPyRiWGwhD9WCXNqyN7WUGpY1hhXMesMW7o8h92/5XZHjZjfaqdQy6v16eKD6BAyyqYA3awOJJ5Tnog+TO8ctHGLS0ziiFspsoH+GTV2m7Nn29zPUEmGZc2GNEiM7RT"
      |            },
      |            "countryCode" : {
      |                "value" : "xsKD2GChaXrLF4hxxG+ntJa4",
      |                "nonce" : "vSK+OZdkJOQ02WvYpSNCnafY/403dROHcuYdo09LmxWPrtmwNT2mWa/y64YjLGcz5/v+w3SGnm58cQkPspBoJte+Yvb1GuXXpwOimobaahPnZ2zGyi1klBS+Q19d/1fD"
      |            }
      |        },
      |        "partOfVatGroup" : {
      |            "value" : "IOCYJGlCo3CG555loTZE/325HZo=",
      |            "nonce" : "gfnnFoHW/N9fs9KQZbelBHO2liQQC+IMMST6qfbpH7mHFDIln4LNNfpK4yvjNDt2/YtMP9NdGJ1V+UtOd1azenl2BY2X2Xin5lF88/Ak4hXqWEICCRgB+dxgEyaW9r/4"
      |        },
      |        "source" : "etmp"
      |    },
      |    "euRegistrations" : [],
      |    "contactDetails" : {
      |        "fullName" : {
      |            "value" : "/twTY992ahU9iCuma2J/QobqXIE1oQr1DN4mAQ==",
      |            "nonce" : "nkyT0Bfr9cBJx/+AUwa8W59wHim+xwjuL/MJIWZ37OzN1aCs2my5U/KjQqJuzOKkSKOPxttrIwdExbbBCXS9hulPSsLoDHef719mm5HUPcs5g8g+39Mjy8ircjZ9GUDW"
      |        },
      |        "telephoneNumber" : {
      |            "value" : "8zHb0y+WLIy7RW3C0xTRYflbPRC43X3AJzM=",
      |            "nonce" : "HfvkEn5yKIM417Ru3fa/Nk4CxqsIpcufhQyKwPTo5I2rx5tvOR+dQyDN5dbOhKIrUYAoPKMQiFc6iCz3MP9mPXE3Gus7KFiqn98Wzc5xrfojJWpfeYWDHHtPfcJe5Cwn"
      |        },
      |        "emailAddress" : {
      |            "value" : "0lQPAfHOQZ8sSk1UWeGjsW6cDISfiJWmQndZ+FR2WqpI",
      |            "nonce" : "9EvsuPFRlY4JnlYXW+ZyvY1i9huWgoXdaacDNgkWvTqP8Nem/Ith4b8ZrSYCD9sEjPm37/96LlsXML1hh/pgsaKtng6Ekdfd5fqPklL1WBF7UvuoT44qkqTEEiR2fA+X"
      |        }
      |    },
      |    "websites" : [],
      |    "commencementDate" : "2021-08-09",
      |    "previousRegistrations" : [],
      |    "bankDetails" : {
      |        "accountName" : {
      |            "value" : "YVP3PnKk4jo/OzgO6LZCjDYH10IlO7hJFFbF61g93/jX",
      |            "nonce" : "0w57m+9oOBYAiyUoBSUNx36jKuETUblYfVAee9jsuGwcLQ5Y1XnWkij/oBgI7CYOEnqvEdflWkZKvCsQ70R6xVy98sK/juE5EbjMKkteqBNzaqcteOn4vryxd1gKc0AC"
      |        },
      |        "iban" : {
      |            "value" : "4Bt6qaUz5eRB8ozjcAx88px4zja5iVL79UGhrPozufxUg/ktaNI=",
      |            "nonce" : "Lxl0my/NY+DixuhhwWrMFBQmGFoi1WjwK+Zpcmv0bEmMKmo6up+R/duTCP1N+57XkH8t7Xnk4MCKkc2ELSBIF5oVvNZ/z67hDy3K2m9ialoW2RLQNthNoL1T8Jbn6ikj"
      |        }
      |    },
      |    "isOnlineMarketplace" : {
      |        "value" : "WOgXXQIi3JLLXzBuyP3B/ZOeSa1X",
      |        "nonce" : "suJraCvZanb1lCbHev+9Vz3pStxehtqQY48h+jBKfh4bK+qzYMRXBwycr/MBpNZTQA7N3A1hNK//YpdlToH0vV9+oyNnP8OZ8D65TTkEwwF9KON6eAOGqvbR9yh3GJvp"
      |    },
      |    "niPresence" : "principalPlaceOfBusinessInNi",
      |    "submissionReceived" : "2021-08-17T14:20:34.746Z",
      |    "lastUpdated" : "2021-08-17T14:20:34.746Z",
      |    "dateOfFirstSale" : "2021-08-09"
      |}""".stripMargin
    )
}

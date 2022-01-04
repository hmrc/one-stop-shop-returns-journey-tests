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
      |}
      """.stripMargin,
      s"""
      |{
      |    "_id" : ObjectId("61829039e7383c63ea118f5d"),
      |    "vrn" : "100000003",
      |    "registeredCompanyName" : {
      |        "value" : "fTs2HblwbFKRpSMSBUIajWWfhBivYxJ7BJoK1w==",
      |        "nonce" : "770iizyxzlsousLp4lxEUh6FjfdQES43jJCeM62ATJBe+co6vZDzFFQI641+cD/w50egW+RLe9eIyzFRtdQ2wE57LHBxjtkZC2D/uOPTyX/dhs4OGxgHbUUpjLgmUUXx"
      |    },
      |    "tradingNames" : [],
      |    "vatDetails" : {
      |        "registrationDate" : "2020-01-01",
      |        "address" : {
      |            "line1" : {
      |                "value" : "iYkT2jxOeEyK28ozSoBCb5Vjyf9glUS2QiU9Rg==",
      |                "nonce" : "LcN2Tjj7lSonobfhPugG6X/r9FF6TpdGInxLA3JzEhefGOGEcLToHE+Wq9MHUXJwUR1Kc/x5+CVNfFuxsSUKhUUGP281ciQyC1AVQS7dJL9hgklEM/rYjTu3m7Pa3JI2"
      |            },
      |            "line2" : {
      |                "value" : "pqOLyYGWToEfA/oMZ1skalAZibGC2n9w3g==",
      |                "nonce" : "hKTO3aAToSYF1UPuj+WT55MmOKL3bYHI7YQC6cCR+v5trKPEz61F0uHR9lsQS/dG4Fzdvb5ZyZuku/3J9dWyqvkYNEBfHoIhH2TOoM1Mwbo6wKutsDX4IitIhr8qJ4+E"
      |            },
      |            "postCode" : {
      |                "value" : "NG7uRXwTzbSrSbWKu2yP4ZJwa8DgFnQO",
      |                "nonce" : "kymdy5ZGcHH5LsJDN3bBfgYuEHfFE+nZX5JI6jMiS20bXYGRo7JSwhH3kp31pbrDMp8d4/VoHZ0uuPoRjrYtkJ5DnGjNGQwJ3shBr6nYFhtMY6KfT4zx35mNxqnQ0QqB"
      |            },
      |            "countryCode" : {
      |                "value" : "pvsWHhxAothp3klqp6Gfc/lf",
      |                "nonce" : "5J+9N285T+OrSTloNVjURmMXPzvLlLloZXBKPThj894F7D+plPuAUZ4mKw3zHP7M6asPGBftleqDd/ojj4ultMKm2u8SxWzQ/NDczMd3hFictQqZd2rn5+28eXu+g68f"
      |            }
      |        },
      |        "partOfVatGroup" : {
      |            "value" : "7jgkgFP+dEVp4xiTkXM+MEK2LiE=",
      |            "nonce" : "B2KTxrN/zikq2GCJlJF7gED5RnDOcYnKK1wuhzlJN4rI/492f0BIF2kh8p5TNCWVj8FO565quKBj+doHkS3diWXXf74jjdoUt6sYO/KkfJYMgFYAul/hTaq35bP6mLR2"
      |        },
      |        "source" : "etmp"
      |    },
      |    "euRegistrations" : [],
      |    "contactDetails" : {
      |        "fullName" : {
      |            "value" : "qC1VgfjoMf30Q9kdwNJrHV0iC9w=",
      |            "nonce" : "id1S7Bk1PxAbvGV9mpxkLBBTr54EE1OQ411fzY6GJitYGUxSIpIwmOQ6W77VWqA1Ljj6oxcw0M50dZ3vaoEywDTC20YryJ+mE90AmoCqrWe8DdyLmPLb+d0cQAAL6ybh"
      |        },
      |        "telephoneNumber" : {
      |            "value" : "AnAgACC8pb8vIEqiSISwVNkOSNS01wk=",
      |            "nonce" : "zpzHZrnRQFCeDUxqcUPM8nS0rhm9MOvzH0h1jxzaTPHRfTkv1UfETCTj3tVNDkymKgKiPIxcuisDIFrAh+qungNu2fgwnWvMtcS2j9aW19fPIJTIsdiiVt8cCtnjMVu/"
      |        },
      |        "emailAddress" : {
      |            "value" : "SFHeyXw8Cm+/ZNv6/+T0tvWxegea274v+JjSWhg=",
      |            "nonce" : "OVM7uUe/eQRlHoghCSvQLL5dj51XYXMhgbiyLPguwGw/GDKWWvtIT51hAJeekMKUB95fj60KjMlvYMG58yQnYiQN0PMEYU3XVSf/6KtSuHNQ7WFTA+kybYUy1hGLkPj7"
      |        }
      |    },
      |    "websites" : [],
      |    "commencementDate" : "2021-07-03",
      |    "previousRegistrations" : [],
      |    "bankDetails" : {
      |        "accountName" : {
      |            "value" : "hwIBtst1k33oduPcxfIr030TL8mS+WsjWA==",
      |            "nonce" : "IVdodm/uolDCjeXrDAa7fFakA4oaOnTgqfesoe90n1n0mcJwyb+pmIumijLiivrcRlvf8RohvwnUWCgQrDHhSjJXBOdWY6/hWTiieMnHwnp/eslRLsixMxnCK3GiiiCu"
      |        },
      |        "iban" : {
      |            "value" : "kkhH3EelKM3o9q4NqTZ0mhQt++hANtTA7jDdUQOyAoudcAa1p2U=",
      |            "nonce" : "jjWhZhiosCDoyOIjY0rC/HgLvYntXbG5yxcx/cCjl8pBqRwk+txaUijTjObrphmrb1W67qoizL+iUNxvpbcCsqKs9dcAKANiHsZZfK6Uv37N+uZco74TvUyseXNDw3XF"
      |        }
      |    },
      |    "isOnlineMarketplace" : {
      |        "value" : "XbVHKGLVSN10k1LKYNVXTUtOTZtn",
      |        "nonce" : "Ij/Sv6nbV9m4ZYbND9/DMIxlGcsOuIZqCpxZuuNkNk7R58ILP+f4jWKdhn2pcCcqYPHbf3FfBoi7uIjG3ncOac1bRw1YKFLJ8YuSCH/M6YAska+/3YG2rAIHB6tW21o5"
      |    },
      |    "niPresence" : "principalPlaceOfBusinessInNi",
      |    "submissionReceived" : "2021-11-03T13:35:53.592Z",
      |    "lastUpdated" : "2021-11-03T13:35:53.592Z"
      |}""".stripMargin,
      s"""
      {
        "_id" : ObjectId("6182b59ce7383c63ea118f5e"),
        "vrn" : "100000004",
        "registeredCompanyName" : {
          "value" : "WoqteMCZu2BJ/u18SK0KuQu+sT4O5rUc+ovlHA==",
          "nonce" : "GbsGTypBsXmTbRg3bgQjtU8SFIJFa5MexBiIBxbQZ1xPaT5128D/yoz1Lu2qX6GRdXhHYlbi/F9iBXGVeEF5T6UgS3EsTMTUry0hsWwChX+6ICuSTD6lymdmbl7AnfvQ"
        },
        "tradingNames" : [],
        "vatDetails" : {
          "registrationDate" : "2020-01-01",
          "address" : {
          "line1" : {
          "value" : "JpInM4mFltg8uLcFT6diZX08OCbaoszF1DYcsA==",
          "nonce" : "IM/nqlW2KubBtx9Dqmh5TRLjZsHIq5vc0mVGhYU7H/MQ+l027x2Qw7cFkCu3AVnByEsUka3BJ+lgzDWRyqLsHWivj80FmA5FA9qxU7LNyogTjXkM5N11oRAe0zSXWcER"
        },
          "line2" : {
          "value" : "s6InL4MBxuHNP4I9yFFFI2pj8w7OWaTmCw==",
          "nonce" : "liJ7Fn6RqmqIscOvqfemC3xrziACpthjBWUuKOgkP3UOgKEeIfhkcCS6IxpUTu+5hhAOalT47oHr/7QuN5eAMyLli2Kr0BOiF6N05230NY8FDhhIvfE9EBoJthNva+BY"
        },
          "postCode" : {
          "value" : "3bS1u8NSFHbvo1EWT5vztr/J1VlhrJBb",
          "nonce" : "e2XzMs7XXBrar09dY60U50qAuJ4AxW9hK6i0iU3V3jw8RD1jCuCpFsqhOWQjnsh76qHDlMu6UUOcSobGp08vZFw77BiA4kiwd9Zqq7rWPCzI4hI+ZvUreAi1QoRFWiQK"
        },
          "countryCode" : {
          "value" : "xbet85ZOngzHpjmFLXV5lyCg",
          "nonce" : "yHwmQ8rDQ/CgyOj2kxSTljh5astsUu0pf20rbcvKwRJeY4W+1Hkh2Rn3xQcq254V+eBOAfQz9mdOkSt5GBeYqoXgRfYl55j5oBaLhfx7q4eaLw/hI8BZIDTul0GPdPJy"
        }
        },
          "partOfVatGroup" : {
          "value" : "JDnIT/4KfzaZehHwRWJeRi3c+Wg=",
          "nonce" : "u6r6bN/pGlLVuPOJ//VgPb5BHiyIXhHM9gQnlX1YHTSQHRq9IPa9BceBl8BG6ifcR0gplmhT6mkFwbVXD27X3bVidt9ZxnSRqMS99T3eOH8mIUFCqLpwOTBhEQ7QndJ2"
        },
          "source" : "etmp"
        },
        "euRegistrations" : [],
        "contactDetails" : {
          "fullName" : {
          "value" : "Dh6y6kN6gC9oYxsShe5u3clmnnk=",
          "nonce" : "dSwZnXwOt5VRiA6uoiClQ1icP3hrPXu/yIzQZr6Aee3aUlwBs/Sea6IYhETL/iPhFN4AKV9v/JPFvGMWw3IS0CdwPTOw7K3K46Ob5srLeUKHgQr6mW6w9w7BzhNuXDIY"
        },
          "telephoneNumber" : {
          "value" : "C+KJRZSvtFnHbp7xhONjZ/hcZDyJY31wAzA=",
          "nonce" : "Q9WqmtK/rugSWfBuRJ/15bGnXevKLa35o1yHRAkcY9CuKlmpX7EzsxT2lxPgbVoAHBbqogCQwYv56PI8d6cndTKDh37PDfttOjhbmzE9+FKGfmwngMIqLWggZFalZSqW"
        },
          "emailAddress" : {
          "value" : "zqDwGSy+eZCDJkkXWU4KzJUkZp+Qn/srANHO64o=",
          "nonce" : "08CRMeV3ybpPWHPpQ9NlTHE+jelcGEwvEP7/wfQ+OAPIFr9obmBg7SW0RHVn0e2idxnE8dBApJ8ub8T3GXSPmFRN10gThz/Fkh4XHAnJzBShMJtdkOCtEHCsMVt+kpp4"
        }
        },
        "websites" : [],
        "commencementDate" : "2021-07-03",
        "previousRegistrations" : [],
        "bankDetails" : {
          "accountName" : {
          "value" : "GRNHtfexz6HuqUQZ8m/rsfuYe0Y=",
          "nonce" : "eq6KHZ0mrnuxKGGccrPywkYP+JXlRONKX3clcfteIDFRyIee3/vdiKMnjD8/oNVHHnPLw4PfknB/CiJnPb3qoZAVKI4mm3O63VwnCGo3V47NyKTNM4M80jmoDumi2ORh"
        },
          "iban" : {
          "value" : "9gf4eVKOZ0k+k2vx6tOlUeQG0pbliAuNVJ4S0ocJVxQYFqA62Pw=",
          "nonce" : "a39wmysSGeYJs+zGjDRFFzE8OvrH1vYXjDGbqI4aU6TvBQRy4+KwNsDLjPvFw5GbtT1L4vbxjU9OCQFmOotIY6vsp1mz+kYd7PwtjGXMXtLALY1x7jzaLxhKQI6O3u3U"
        }
        },
        "isOnlineMarketplace" : {
          "value" : "hS97vDzr4La9lavtPh8/fhcN2ioe",
          "nonce" : "VEtcrRRpCiuGuZNQIpLv8zr3zzgA5EAuPLVgkswLKBf8ntZHNDIxCZZdVp1hU/LVpPvk/nNj6VbGw+hcVMw+cXYOtseD+reW/w7Jyqm+Vr/1dkUVukv4FrbRX/g29WE8"
        },
        "niPresence" : "principalPlaceOfBusinessInNi",
        "submissionReceived" : "2021-11-03T16:15:24.896Z",
        "lastUpdated" : "2021-11-03T16:15:24.896Z"
      }""".stripMargin
    )
}

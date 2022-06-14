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

import java.time.LocalDate

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
      }""".stripMargin,
      s"""
      {
        "_id" : ObjectId("61dc100c24ea875fce8a616a"),
        "vrn" : "100000005",
        "registeredCompanyName" : {
            "value" : "lyLQ620Ufvw+AYEri5BgKLKsp2ezTBHX2udXTQ==",
            "nonce" : "P/s885UH/RQ9mPTujRscBi+n2w27z+E/A3Uxn5y00aXWxFrwWEqYfc1TBZCJEKjo2nU1EjFIYCxdEC58E2gRTU3kulDP/ipGH3ZTauoQK7F1mwSnHngbpSj770M2MEHj"
        },
        "tradingNames" : [],
        "vatDetails" : {
            "registrationDate" : "2020-01-01",
            "address" : {
                "line1" : {
                    "value" : "XfIXgAdbSd44Yzdg+3JZJ0pvw47FYp2hzxfu4Q==",
                    "nonce" : "+U5usR/Wsb+r5itPPsoKe0MFQXglWfAuJRHrIwcpiafv5BCTbRZEDQS0ltiF/nqlohMcZE+bGutmuJ1VaZc8CBoOQU7aeo2+NTDYZfiur+DMLG1X+yFRQ5d3sD+Ci+Zg"
                },
                "line2" : {
                    "value" : "zEqYmh8VKYfQQ3s4ByVg9R2biITSYNmU6w==",
                    "nonce" : "SdaflYeEtKhoklwj3xEQTn655/1AauPl+TeQkF19IAEOlKQZnR4bUydXB6Z4S4ynpGNsQNypcRZPanMSzoYWd7JOF7SRfozAfMJmJtPMWAvWdasJyhLqjZ8fzmUx0F4q"
                },
                "postCode" : {
                    "value" : "LYfupyLDrobqXSXFeYSXdrtlanuoNUoB",
                    "nonce" : "Ae52YAzXK8SbW+q93nQpH6ZaFCz4s+QfxQvC225x6xT6RY9Zv65r3M+TFaD5HHFZzwu4+KCinW7YAe/WINsr13heoiOyhySCnUb7dyDaGlNxaL4Oohlbr5mr/gwF6VPV"
                },
                "countryCode" : {
                    "value" : "XX6MM3lPSIJ4SxHY8/4QbC+e",
                    "nonce" : "6TMgVkbbwCSUaXk58+ab4WIiyxe4QSavk2ptmZH5DSLBcvwe3mviI54CiLH2YdftR09Mqx6N3/jUCo4XC8WDX+MAQI9OylfG1CSAZ3XpjKoRxsB9NAjmMxM7F+XfvWdo"
                }
            },
            "partOfVatGroup" : {
                "value" : "n+YLcz8SyrjVQT7iyqJNz/QTvVE=",
                "nonce" : "nbceBWo1SqyLzzwKUYIP06bEyc1zVD5xl//N0syckVXz10fdmf+9jTp9ss0LvdLdxL++WCOqttp7ENZ2DtQdnf0vUSdBdWUHJgAVAg2pLc6j1q/D4O6AYYiJE6MVodOf"
            },
            "source" : "etmp"
        },
        "euRegistrations" : [],
        "contactDetails" : {
            "fullName" : {
                "value" : "+xr4Ji26tFFHeAeJYzLnGSobY14=",
                "nonce" : "2EtumPr8b1rM1mJov2F6ySvYUrgPZEM/xoMYcHsXek15q5zMtYMjuc3L0R+nG314jMNUTPqk+HeTkWYY2C5tNbANkdGVUJbPnm5xIeFuQ5o1HcMzwvFxDCBYnTjZihCA"
            },
            "telephoneNumber" : {
                "value" : "7HYjKeerSzkFP8tlPNWr1hpaGUptE9Bs9Mk=",
                "nonce" : "f5Ez+MDzhriu0eIL7gLd7LC/zN1Cta0eksuYqZxqshIzL+VF/zvQXl5mkzYF4E2+Dnoo1wZ5H3MOno/zrT2aNJFJzZAdgklI+JkSj2PvAal6vnQa3YasnfbXfeYqOGke"
            },
            "emailAddress" : {
                "value" : "uoQO94YrdWat4Ec/M/sd0Rtu2Ez1tRJ75k9fM9g=",
                "nonce" : "zmTwvaEhThytSk8OHjSGh5Hp7YA9/41vW0NBWJ6VLFx9WdTaUMyPQqeBAuJ/DaD1dIo+RlC9lKVrPkx1+ACP2cFYV//sCue8fLvqMju5F7FPxrySzlG26fX1MUBPjcOF"
            }
        },
        "websites" : [],
        "commencementDate" : "${LocalDate.now()}",
        "previousRegistrations" : [],
        "bankDetails" : {
            "accountName" : {
                "value" : "BD3yGX6UY8ODUlP5WvZlZAArNmw=",
                "nonce" : "Cl11aqk6katE8u+tSabhMiEqZsjDERs4ayyeW/bGc8tGIs9gHDfwoZa7lRm4rEuRZgnsIurYpKUkVKpU659uaZF1gZGGmqylhS2CXY9h32mFVKiOejabbXKhOkl5bfOJ"
            },
            "iban" : {
                "value" : "paitFQ1hLT5F6qnDfzie91U6uC5HEQqzQYiTyoW10JUCelIun4A=",
                "nonce" : "uMXn/TrjZRsgmC1979xUuIBa5tUmweLJEgFHfFljxQ1bOhkkS7cUmSmzeE1wagKRvHLzu1rfWRXyvyPFkBzhXUau7xUBAp/Hi7jfApEDJh9902CFIvqqCFrk4aPdpS39"
            }
        },
        "isOnlineMarketplace" : {
            "value" : "2TJXXbPsIbiHxIYqpeSRX7PfrQvO",
            "nonce" : "xO/BOGh8adewHnZZhFogeiVbwR1XsNtJkFQXh5yMN8BMvdwpZWg9eugtdDfSRY/ifs1tEKvAq8xVGp8Ck6Ae+Jd6GTM0C5lXsdiwhN7UjZmVBqwwrhQCAMNZLB2JmhhF"
        },
        "niPresence" : "principalPlaceOfBusinessInNi",
        "submissionReceived" : "2022-01-10T10:53:00.595Z",
        "lastUpdated" : "2022-01-10T10:53:00.595Z"
    }""".stripMargin,
      s"""
      {
        "_id" : ObjectId("61fbdb6ff77dda43dc1ea5ad"),
        "vrn" : "222222222",
        "registeredCompanyName" : {
          "value" : "+opu0ioOfy/CFN8fi1T+un7ZvLe+dh8Z+JDPnQ==",
          "nonce" : "9xKP2Ir8n6uuPXZZz8ERsTassWojfbsFUeEpWtF6P2lOZGQT8FuK1haiClLMNavVUewlDxjdO2ANdIEszlqz7TypjsMxLA2nQ2lJp3MpKDe/53h6yAUIagfFTx+DtXxw"
        },
        "tradingNames" : [],
        "vatDetails" : {
          "registrationDate" : "2020-01-01",
          "address" : {
          "line1" : {
          "value" : "28XzgEZkc2uinlRcFFIsa1gPR+5NKcMgo7yNZQ==",
          "nonce" : "wbG3Nkqe51vJA1Txpxw1onGWAh+aKgDW7/kaqPAsM+6+m/AYHqE+M5zXR87nsIDu/o7mzHAVXBPH1BnDBHWMw5yGJav89e9KmXX3Vuk0f7WRVZQAlpU3GaAuA6u+yzFx"
        },
          "line2" : {
          "value" : "et0lw4V7vaU1RtNcN/FCUdzdfj4CPD7Qcw==",
          "nonce" : "eoZ/XCN13jLWo/Wdl+8fbmoijh/brDndF1SRP0egfofNV98bVEg3UCQi7kga9KrAXUYQl8PtTG3Ajr3tQk9VmnsvyVrDvhtAatF0E3nTbcpw763kvEC/rjgm2RGIu5VP"
        },
          "postCode" : {
          "value" : "/IMrU17oZQhdd5xLqDQ499fvHIX30qzz",
          "nonce" : "fuKVCjbAY3pBHhPZ4NFJKw/1Gl9GwsUGCzhZxSAN44oLqWJAXKOZwC0jt3Ua+vDUPQ1G2gglFExDT3mmEv+qG0BTLHqdRQObmOxBxp2tiB/xCjlD4u/EklyQOdyC9f+0"
        },
          "countryCode" : {
          "value" : "tKEMTTnH6b5SjnVh5JGr5FYt",
          "nonce" : "t4uVcK0eaqGYESOW7KqATWemTCmJeV4AkasWpOVRytrfR9dTTzOGzYWi+7nltMqSL9ta73FUxcdRRLYAGtWVHw1eUfRrJ0YG6Zftzm9XtaL0L3BvPFHAZZTVK/YsD4ib"
        }
        },
          "partOfVatGroup" : {
          "value" : "/2EWuhqVOGP+PumXFI2gqponfFA=",
          "nonce" : "I4+ymzIdrZs9ihUQM/MZtKMynkw2xP7hjIzN4sdMZTkSLyjTnV3TUkO3m5BA/5Yu0jPuuNJiGzNK5EeLvYFTuKpMOfOsx+f1dUXwNKbgRpIOAD/UMPSIsn/xRWCb6mag"
        },
          "source" : "etmp"
        },
        "euRegistrations" : [],
        "contactDetails" : {
          "fullName" : {
          "value" : "AgW8qFJXt6L8MzWGAXDZiaZ3Hhs=",
          "nonce" : "4GobaNhQD2Fmm0PfzjG6O8dUN1YXlztVZdxpW4kwoPaUzTpY7hoBxuwqjguk06k+05kRwAYNO9YFZsA++nUpveVUVFVmxUBESG2XwvaZ03UJYkdrlGU2rLsU3AzNygw6"
        },
          "telephoneNumber" : {
          "value" : "Z/mIazjOctRzVJhrbPPALzPrRWt5YXjhYQ==",
          "nonce" : "PccyDLVmGhNb41NCCRe06E/3/BfxJxEKJlAqv82vXaKUUvk4typdax40R80SbBEglulP5hkO7dmckOtoyzoBpBuUE+fuLKsJJSo3L/5dgGJl+MwxbFcE81qgQMvpBw8u"
        },
          "emailAddress" : {
          "value" : "Xlyl6pVUG5FtgPVVy8oOvuGxA86ZcGsFXWE0bGs=",
          "nonce" : "JPuJ+hoyILGm0MfXa61xxKSJbk1bzpui6/6THIpVH0nMlXMB4byN2P4NQbfRoFuc4Ii3IffZpXexMzyKWRAItzRIBthv4avWgmV8oHtKDAdr58xuXH1qvi/aT+5+mFI+"
        }
        },
        "websites" : [],
        "commencementDate" : "2021-07-03",
        "previousRegistrations" : [],
        "bankDetails" : {
          "accountName" : {
          "value" : "41DPX7VeNcQsmztInn6QnJ/jQrA=",
          "nonce" : "y6gjDhukNThfaGXnOnCaAM+zV6zGjtv6xaJNWjt15ix0Xt3eJ7cmiMC+lku+bBSc3cd+S/S04yTJmaHafsojnbEmxr4Q85iBVdaQL2f1cJC7gaewZBExeyimDdA7WE64"
        },
          "iban" : {
          "value" : "Y6YoAzViQiHRB8WATNztksILrlxCkQbb+r8MYg2WUHzMNY10PVY=",
          "nonce" : "y4U4+CMdT9agBBM3zY9FezbqD/sSkFsUzw4Zacv0FEAQLQtUr4RULA7CsXVJjdHm+GHNAnb7w3Tw4ncC2sdYGJYn+D/26JxDO//QaS6yDCMoxiHqkeDIj6+kzEIp4nBC"
        }
        },
        "isOnlineMarketplace" : {
          "value" : "ofkeKFFlAaiUYbRoqAGsSsLs8np2",
          "nonce" : "n5jRnn24BVuKzzrSfIS1QJbOa9EQTeqFLdZsQImMZdQeoDnLWaKIPZ/PmEsYuyKShcBsT0E3c1JhBUUIgw7scjWFVNH8iLTZQ7L39zQKoP4cy4GF2PT1/WuGtPIHgj6h"
        },
        "niPresence" : "principalPlaceOfBusinessInNi",
        "submissionReceived" : "2022-02-03T13:41:03.523Z",
        "lastUpdated" : "2022-02-03T13:41:03.523Z"
      }""".stripMargin,
      s"""
      {
    "_id" : ObjectId("620a747acf0f0c001a966a42"),
    "vrn" : "222222223",
    "registeredCompanyName" : {
        "value" : "Z660LC3NRqGZrHKiVzEF/XvvndBGUArkVXOtyw==",
        "nonce" : "DAWtUIEdFGjC0bs+nLB975HLAgQM9JXsRCNdSj5gYp70gcuJN5vPH1o2a+VV7t2nn28cNpVLyb24Z6nGcQvhsG2VivWZIfzo308N9+AGXp6tK8lCwqxvZcoLtQ6yEh32"
    },
    "tradingNames" : [],
    "vatDetails" : {
        "registrationDate" : "2020-01-01",
        "address" : {
            "line1" : {
                "value" : "9Qa0k65OA/pNV3Ne8kXWzvDgIR8GAvtDMatoQA==",
                "nonce" : "OMMKKfQX03CoUl1ejBEtXIbQd7D4K5Mq+Sx3cN6K0aaeoUjR+wjnXPKnbOmtFDoOFkiBjFvHdQFdws3KPhkBd6L9IOM45uAgsGsJXQpg2OGDiswxduWSn1VM7so/dzPY"
            },
            "line2" : {
                "value" : "UEuVa+NnTBEFKRI+nVnUZ1gK10prHXUdvg==",
                "nonce" : "RUUfSZpmZnqBoPOsQIhH34SaVULeuGr8GIpJx0MYPoegwKMoCskc/bWR1qZ3MMDadbkLNBmvA7Ur6dZ4SBYQlt5NdmVrJN/fBFjCMPvvpRznx0aojk32jP6A3RuwTMWl"
            },
            "postCode" : {
                "value" : "NI3jzvge/f7xos+hEQWWlIJUV2ZP8Sst",
                "nonce" : "/nERzRNl2r287LrADx173Vaa3uoRuLcGtEXZ2/S7dhKeB1AnJPqtrWz0XRIJmvAOkCuaN3q7pa19nEC+F7JrfnydCt/T4CRw+5cGza5kDpvOBz4wbxUeoqQVUZc/0gGL"
            },
            "countryCode" : {
                "value" : "zcKGyMreatnKpQJPQhzuFGgA",
                "nonce" : "GgXOXaTThQ/M8EzhDfLNVYTiBIns3HZB2f1Qy27KVMfRrLTylqZxcDxRRBu8T0gk2aE4Zbri65Iz5hartoVmXJ37ZcbmSC8K61n8QFumkB7OmyaU43qt1zybcWkMP6Hl"
            }
        },
        "partOfVatGroup" : {
            "value" : "CFc3p88pq/odN62N74sFiZmZoaQ=",
            "nonce" : "HTmo8z5fZW79LoUv7oDGzheSscodrzitnqpfd9saKyAjmK2AKf1nWYQ7aYmf12oyb7XGnrV0uhBgdKHgURZgWHYU3OGgJzrdXgGv+0XASHUz9m8d0pfyIocOLFV7iE/Z"
        },
        "source" : "etmp"
    },
    "euRegistrations" : [],
    "contactDetails" : {
        "fullName" : {
            "value" : "feGGks9JLe/JfRuDEUMDXtUD3as=",
            "nonce" : "6ASSWa9RD00nj+mAmNOcF9NR3GiMsO5JoKvN2v/BrBz1xJKdVslFH5/NIu6ZYwuZRKBUkxRvzoulpXFu+8N9HgAq38Y11NF07z104WDH/ztM+OrFO2T8i0vfnQFK9vnO"
        },
        "telephoneNumber" : {
            "value" : "TLwiEIT/Q2t90kmOluHYdeXAn5LIdA==",
            "nonce" : "Ra6DA/XZi8AZzkkJpL/J9lofuy3h1nyVFgLH9pBnz/aV96dQtFVuLE4mBs9dimFX6Qd7qoSI5xNj1NMXcR+GOyKCnBtRWr5TkzTCjt9SpL27kmCzWyS6UD8TsjCbyFfB"
        },
        "emailAddress" : {
            "value" : "mpK8xdc26lxVPvel6UXt8hYOkPPt9o13ibEJMl0=",
            "nonce" : "oKa3lFlTWNNYuVImZXZQGWOQCjK4/gMFmt/PlerDElgo4ohcem69uSmIaJacafsYckm3yABCDbJYBQcewT+blujSAMFdHW1GFJkW34qpzRTn8wAAYZZvB5A5kh1iTZ0t"
        }
    },
    "websites" : [],
    "commencementDate" : "2021-07-14",
    "previousRegistrations" : [],
    "bankDetails" : {
        "accountName" : {
            "value" : "vVZhViephD0r7umWxoR0FZgDyYI=",
            "nonce" : "50iIAn584UWTAHHqJXTG44RkBFkAf0KTA9Uavmk+WYOtf9Vf/O0o3KdSvOlmfkllSmn6VUgvzS+CkVE57bKZxKa/7gEAEqRqy8nEr4m75sCkCMlqc8UO+KfPVDZWH+Al"
        },
        "iban" : {
            "value" : "rJAjREt58orZ1UeFeKcp9hb+MU4xAk9YLE9EP0AdQyxPwJhGY0U=",
            "nonce" : "aEuzYzdV5KPPd+1BwPN3XSr4gEoHaQbBg3uOKPEA6WgDWrRbGpTMizgdWRq6r/4gAF+c89yuO+3KJTEahkMims7Wq/MAgrjoavjFBt95gCJSua2wg2nlxx6EL981qcuJ"
        }
    },
    "isOnlineMarketplace" : {
        "value" : "6BrP8S3+4jjfAlKMktS2JpPkfjbw",
        "nonce" : "lBNrH34QYhWRrBgY6kODYA1uzp4hc3d9pDNBUFcK/KlneDI2VlkMZdkgwP6VkAKRPyrtk0l9TjJxZZrY9yvMg4bXi1nGmihw+8E/MMrF/Zoe9QJ9GkH/G4yMBKx2rQwp"
    },
    "niPresence" : "principalPlaceOfBusinessInNi",
    "submissionReceived" : "2022-02-14T15:25:46.686Z",
    "lastUpdated" : "2022-02-14T15:25:46.686Z"
    }""".stripMargin,
      s"""
      {
        "_id" : ObjectId("62a856306af7db087cb53f4a"),
        "vrn" : "100000006",
        "registeredCompanyName" : {
          "value" : "zPkYE+LTxy3WTrh0QVdp2Dh/8KQsd0PtStUYNw==",
          "nonce" : "//s8IXwSkzwxl0SNxaYCVLfQbBctgPKTxUu7RP2r+GF8g1+7vIw9T1qT7w3qhC4ygz+4HzOMVHz+UYJ/tNf7uqePCL9KZz+84VJ7zy1A603bKNTtH7w1gygZOhU0z9N6"
        },
        "tradingNames" : [],
        "vatDetails" : {
          "registrationDate" : "2020-01-01",
          "address" : {
          "line1" : {
          "value" : "DwsBvtNLmdmRz4DSm5P0Evl5rCUp2Qk9RMXQMw==",
          "nonce" : "pKh/olWXcl1lbYVfVuqiDBbUsmpAPMfFx1JhSwJm12TMc8dPEPgerhROnp+HTxbN79cJukyeDpNaLzz7HbwfqTv2+ZtaSIW3viIIB6a7s2qCX/TyZ433fsQIdOvytWzA"
        },
          "line2" : {
          "value" : "bhwX5O0jMLQTwJpazEI360LWBNpBbAEGJg==",
          "nonce" : "dcc3hb9TafTNHoVAy7UJfN1+b41NyvHQ/ynUksOp8wW6DkfiDF4S/8mIPcG9u3aigcFazcBDW26fiqoMYPlVptbp4mmCw4+rRHjmKV1hkxDI2oIltp3QU7ZODdLziXCJ"
        },
          "postCode" : {
          "value" : "g3jHR8Zv+kNbF5Ke+oiY2K1Q2Ni+6d0l",
          "nonce" : "I+gOBrh67Rod7P2YOk/WOT8yRgACSgdlIPJa2nImUsCyHj6Z5yFaQHwLSErDFgWa0VrVbnzmwLOENQopdvQi6Z6xfwp1eX0zHaLcfLR/gtZOF/TkOCbn5RJPnO6IEs9g"
        },
          "countryCode" : {
          "value" : "dT1/fvBF64P0cabNuuNGYqqH",
          "nonce" : "sC0uMMkMxpUyAcdpRmzrmySTV0d+2Wsj0uPgx9MWIepPTgwrGnjFPUidLwaCEP9hwQQpnHeEcwHcpLerPPDMS0LjVAFBWK5ujF83+Fuhh3UjaQUO8/9eQ2xq+j8oJ+7d"
        }
        },
          "partOfVatGroup" : {
          "value" : "82bPm5+Tk18YdkVeJHzNnezYWKM=",
          "nonce" : "gdrvECnlN94QgZzyQ2ph0SJTJ8VR6QfcBswLefdcEX8iTdij508F2px0l0eKze0tzpcVUxtzzd1XxMZgUM+/4WBJpywCrJArY1Zrvf+r/0bN0QPGcITGoTMNMQLAaHJT"
        },
          "source" : "etmp"
        },
        "euRegistrations" : [],
        "contactDetails" : {
          "fullName" : {
          "value" : "SU7cGK07JWXHp9sDTz9FRgff1Ew=",
          "nonce" : "lavYgVDKO+zKAj1zPOSGMV8z8alMl+dS9QRO7HosIoVHe69HN6a/cZBxNGFPpvK5BVDo2woelBjDkmzSG3cmZO57O2onbe5mP2xfJWR5OOW/G5gqr19xNG4H66ZzO6aM"
        },
          "telephoneNumber" : {
          "value" : "TC8y30Xi+Ep+si189f1PPyxLMhPH2nKJ",
          "nonce" : "Uc8nPdmMRKbSqhkvvX9+LGWfH7/b8lMZu98ob5zL+R1VjmiqSavVM/UPcJrxV9X0UGVSIiKfBJvxg5dC2AUWATbxO6daRIBYEwFMwu/czlanP15c4aEghUbjsomczl5G"
        },
          "emailAddress" : {
          "value" : "MZXjQGer87fos6PtauQdeTSrFRFnb4PniIwkKXk=",
          "nonce" : "vvq1BxyPCay5x2Zct7SnQ2iVJwpfKaUNVA9GJG6MDyEECZFiURmHW8FCXWpd+pQmoWZ21LbM2nKdMdE1q0m0CTkwozD1pdjajMpee1h8iKfeobZSqz4/O+w6RctfE+we"
        }
        },
        "websites" : [],
        "commencementDate" : "2021-07-14",
        "previousRegistrations" : [],
        "bankDetails" : {
          "accountName" : {
          "value" : "POlPbYdtvikfqDprUPPoHUs+ZeU=",
          "nonce" : "dPntyERtYat6SXnpXmXwxsrqX9PMXTJHSMhU7mCvtMTPYH/ubW4h7M17YQgAbGo8Cp0HQIyBcBcT0NgSmC/xssqCQBA1y3/XgjpIVXe5B5wQsuZzoT+IyfGBmA9Cw/+C"
        },
          "iban" : {
          "value" : "dPmI9UqdfYWW1IlOjgc5LCEhGbNV4w6Y9+gDZa1+C2vdYkC3bd4=",
          "nonce" : "XLqfhvCKGzYEl22jrLeyN9PTb+liyPL1Q+ZbSBmHDpCps49mmJYzvV0fB+A/2huFIkFVBEv4fN26i8zu0kLBSnZvbz7U0gURayyrKMP72rRIuV1luv8R/7tWbiOoHt8/"
        }
        },
        "isOnlineMarketplace" : {
          "value" : "L7LRtyZV54mrQIRWYUTSrdLGEtZL",
          "nonce" : "aHaaucYykAF6fHIo0dVgT5nWV6V4P+LlU/AiKeIYuJ8g1GYCaVNuNNM7wE1DNck97ejeNkoGmZGLK2hU4CqIc2qcwYS5Q4hX/ID605kLrNkTQxrSkCFzkmVPDaBSZ3MC"
        },
        "niPresence" : "principalPlaceOfBusinessInNi",
        "submissionReceived" : "2022-06-14T09:34:40.433Z",
        "lastUpdated" : "2022-06-14T09:34:40.433Z"
      }""".stripMargin
    )
}

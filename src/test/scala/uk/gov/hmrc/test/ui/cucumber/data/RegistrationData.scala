/*
 * Copyright 2023 HM Revenue & Customs
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
        "_id" : ObjectId("627290223a9a64703b8c3730"),
        "vrn" : "100000006",
        "registeredCompanyName" : {
          "value" : "c575WqKja81Y7GBqgpjbQ3tasi5BlqpaWxCiuA==",
          "nonce" : "QBkiYoFwiTmdxG/16HMz8X9CvOOHDY9AKWpDWxghEBEhCMTRbP9opnAAhUhKS8cS/hXUn2J0cz+BFW9pSxzswszZP+cQr6YHJMm120ozMggUK04U+2YZ2ct+4/hv8olR"
        },
        "tradingNames" : [],
        "vatDetails" : {
          "registrationDate" : "2020-01-01",
          "address" : {
          "line1" : {
          "value" : "djs/SrUp6ecfZP3qz9vw5SSB+CU3Oxn5A0XS7A==",
          "nonce" : "jhGiSikvRKLwPX0IZ5VKj+ZZM3lQIvJcosuS1APsvauZA2wtPvYenMx1ku2MsGqxstmnaMuBSSHihxaZWTgyNamU5xjsgLqUhT5GVfMwFvmc2gJqgDGKYWVMaZsRhaJv"
        },
          "line2" : {
          "value" : "7RLgEIXTHCEu7YfQ5Vb7cHXMdz/ulbGkeA==",
          "nonce" : "1VivWZvwyuqqCx4S2RJ1RwivMoC/FHpjZR+A+woPH97Z5/A71s82UmZBswZINnzFjtERmvMpClugQ8ceKCJn26Y3jXhuW0Sf7lfTYsXyNHX/2cmHUYu22g2SxZJ8vg65"
        },
          "postCode" : {
          "value" : "rn8mM13wJeDTVlUH8mlKL0jRJrQtSQ+F",
          "nonce" : "+gOXSc7ixxJdyd2j210zndd/k+zJvY4wUIcr1Ka6ooNHV49a19uhi23XpHRbrqSTUFDtMISnM1mCn2BBnM84yljgHMrZjMA+UJL7Gy0pg/8Lg9V4gLgzQHV5i213FGia"
        },
          "countryCode" : {
          "value" : "LuWWuY7zWXGOHrQtmAziI+rY",
          "nonce" : "2LYSsNjgR1oDi+/BpMx4+cWbjXXSXJrnUPcizvzoqCxtvd5apM6BU7G69eSkrn5o3deJGRqTJRBuNzYQq1JP87ZskBZ5OR+w+FCxsTVjpXNOCfRyAcFqYXfC4sRE9F4q"
        }
        },
          "partOfVatGroup" : {
          "value" : "MLIvMmMeuZS3HwBp3u49tv5Tbck=",
          "nonce" : "1AphxUwzzRUugQcVGAKGfXIil450Kcc/mFcSROfDoiIMuHcWP6ijSGl4NQGBctADiDry0PXd0hTGSckBauF1vU66yTuFgBOxAa8ltMJq8CL7edrCxvCeyqLT9v6FL3gB"
        },
          "source" : "etmp"
        },
        "euRegistrations" : [
        {
          "country" : {
            "code" : {
            "value" : "TmXWVdPYe51HLpgXsvl0OoUt",
            "nonce" : "PnggqYPwFMj2mA8cuJKFPa/Gw4inaaBPGFQ/qPJoTHy8aXV0rNufWbkm4oGSX1cXyO6BB0+zA11+JiJH7lXXpkt6j9vW3+rFaFeh8cDClYKqdCk0ZE5SiFzdCXKNVJMu"
          },
            "name" : {
            "value" : "Q8OLauMddSJpbrw7G37oEQk5gqJPiIFzN8mHBGgklGTm/g==",
            "nonce" : "rqbVHBrPnsXHlfSUJ9hcCF38FnosXa6tOzxqZnQjZn38ZMHOnKQ8dUpTo/e4oHs8WX7ERjBK3l2hUavPrJ2VtmRdDQx+Sd+6/DLGE4VKpsg7GWgifryX9wkOo74ZsBd5"
          }
          },
          "taxIdentifier" : {
            "identifierType" : {
            "value" : "6OYd7EhSEYaMU8EWxQhlIj5u+Q==",
            "nonce" : "YXFq83zVx+auV7QWqNBBW0JwW5APDaBuvgxMxYh7gleGCRmKbxwkCBE0b4/TC/TBkmOKUmvf0brAxjEAHFqNQPbtJkfYkVStmfwBZPZbKvZ6kTwMm1ccYz5dvKsRngTD"
          },
            "value" : {
            "value" : "+ZHxpXXswGTdROYwB9AkNTWlW7EOUFWHdg==",
            "nonce" : "hU0R0q+xVRjEv3EvzZStv1tmOT8t2y/dKRcPsyaikQn6eUc/sRNmkOSA1r1/tDk6vSQY62eaFBKAl595ZKRPpK95wW0eCwbkxux87lUOPitN8hpq4HkuuuheGFeBkSuy"
          }
          },
          "sendsGoods" : {
            "value" : "W4iIz/LKOU3iSjU7XDFjFV5Z3hc=",
            "nonce" : "px3+rikNQYy/mAvUkPRAU1qZq3COoHnALv1TvdT30XsJMno3/wQr/b/mQpmFPkFRrjs1+CMfox+HJkwCC43iAcZO77lrBFbdOxtt+YnxWMKTkPh4NVLVPmhHnvKX4+K5"
          },
          "tradingName" : {
            "value" : "Vc6XMvCd07BAjKWqiEJFc4NNnL/m1SZCInHktA==",
            "nonce" : "0M677DfcM8lpHq0c+QmJg1JNHCm3hak2Tmm3i+Z/CFch0T+VeUyDrawo95bL9sf2jsv1G8EGejF/VABHqgmoat6ZQwYHRwCVOs6Nwyob0AWoxh70JkaVuOa4f69is0Ai"
          },
          "address" : {
            "line1" : {
            "value" : "GbwwEgDnIwgnboaLn93AsBgEFmqCICP568Pw5IgC",
            "nonce" : "vbOba6D2PRbJh2RIQU9cM6r3ujuYgsDgO6fvb/dT0oQZuVElV7SxSTPBYUZP0smp3LIXkPzwXQuGGqHq16FbOPdea7oxkjkYeUy7iMdxDWkftHeyeTKlnpGUVIjtBSiY"
          },
            "townOrCity" : {
            "value" : "qV4paOJJSgzqIs7n3Pks16eManAeOB1qiQ==",
            "nonce" : "xX65oypKzBOF+NofHVAoqn5R5I3bPa/+80YAxhkSTCWPgtunn9xpMVV8wfmIkthDjslO+y1UqLjrGcLrd4g5PeQh3DByeGu19ZXAXYszVq4viTKUSVJg+1ojhPYOQ7DA"
          },
            "stateOrRegion" : {
            "value" : "0L5KymOM8xrSiBpCiA5IuhCJNVe09ST6Sm4a",
            "nonce" : "dPqWURV16iiq2wK+4dEY6BVOAbbnuAWzZbfHd+yQiDjQFFVTIZtZ6KMNSjcooj8U01o+GE8NqFlG1bk+WsJS3QgtUSVgT2rSYgR2cbzlYrPPj64lMvT1ySD7LOTt68i+"
          },
            "postCode" : {
            "value" : "qE/huD9a34jnNzFdSuKhOUl3JTEHkQo=",
            "nonce" : "bZZu36q51Kl79faW0/vzPC//J616TUoOipt/YPz6RZBFvZO4uZlUQ1UlgZjZ/lLMb0lM3kHY60vDMMplDYGQ9mgtGoXtYn8At5Tt+PYxuwz04oJ/t3s34W2/GMwPhSbT"
          },
            "country" : {
            "code" : "CY",
            "name" : "Republic of Cyprus"
          }
          }
        },
        {
          "country" : {
            "code" : {
            "value" : "Qkcl+h3eqjjQJoN0sgU5zisN",
            "nonce" : "iFkP7XVvu2CvgukuPGxxAcJ6W2SrEokVJmDBgjX/d6C75c1rieug0WGySSZ1jBrjyEea9rMONjyXF8huErre6BunRjkui1bLkMRNTkAFligcTDVh549GvREMtkjiNy//"
          },
            "name" : {
            "value" : "K91ohQz5tYqo/D/wB3yS+qd/bQKhYtE=",
            "nonce" : "2RRUGbxA1Tcrf61VRENwmwhSV4PTEjX7/WCzIbm2RAIQTH9BqoDtcPBy5yjEeZEkYd56Dqm0s3/VnCI+gOrjtrPmMt/9kYjziKKUw3tTSk2hCs0vBaGpajXHhkMuafcC"
          }
          },
          "taxIdentifier" : {
            "identifierType" : {
            "value" : "hIXJXvvW4kTqoXR/rObF4IJ+W6QY",
            "nonce" : "t8K9pM0LDWEIBMuaG22nDSvXHyZBXtrX4iB1MFKFKy9UJaPaNWxiIP1XF5y7N4B+IBRTiTl1ONx8xzyRytu3Xt9Sbtd9C2yBjX5hHkwbXm+Cy/cw1EiIfA9NItTdfZlO"
          },
            "value" : {
            "value" : "n4CToNx89ooQLaCduHkxvmfox0XtV/c=",
            "nonce" : "umrYY37IDT2vrw10MEuOfh8emzS618nrjB8W8riVmuqPO4XdZYLBZtSi2rVYhKy5I1bNzA+ybSuTTGKDNBg0ulk2FeHOdcJbAg/hBxZAibBRksVNNiyCryY1O/F6kcNB"
          }
          },
          "sendsGoods" : {
            "value" : "ozflf8Mid842W8+PCalIjOJDWiA=",
            "nonce" : "XOHfbbVPsvuPSwlJ9YFCuFoC3P5/2/wszbY+iJdpuOsddd3FjuuzUdV251KEzG+jKeBL7izWLA4dyled6bTQdRP//FnkbzEER207r9AH4gnrV27X1QnTxV2WA9pDoKsC"
          },
          "tradingName" : {
            "value" : "xgYp99cLYzWGgkQhhca20zvBaiwFVsLEQgzqQL8=",
            "nonce" : "BQuBO8Pex2l5kUdA3XKvct30kM5xIHuqXtlFEWWmezXAhtxES4qT2iKkD673gyD4TzUfvE6uoHYlgm9lQdJBrFb+JDBcI48HPpT4D++R3zyU+pVHRM69Q7NKXBKf3Xtq"
          },
          "address" : {
            "line1" : {
            "value" : "kZRBexIbetbX41djioe0U8QuswdG2o7WizDgA6Ay",
            "nonce" : "jv9QRrNytB3NbbQxt4c0JRyKlDhe5avRAFnwLg5e1S6ho1xee6QCZW5Z+8fKzl5kN09n53I9OYTl9ECnfnxzOGdO3w9L7Ss8PaeOyOpGLsDvqLGyEfQ0SdfvZWL2Xh7V"
          },
            "townOrCity" : {
            "value" : "iWrGXSw78c/Z2J15n9a5MfD8C9CEsCiSEg==",
            "nonce" : "iYjVjbfJxBOAsV9qY4BQQSKwUJ2V/n5Rvi5TSYXU5Ah0X3JfwpNBKWiVoMQltQyJIGvT0EOxgLpaXzbRS8yE9tOBpcZCDULW9eu/li+uzmOasyXiFa1OPpocU0lSKvv3"
          },
            "stateOrRegion" : {
            "value" : "83jTTnhNtpBPYuhBYZ4mEDkK78wfZsHHe7I=",
            "nonce" : "G+67p0/Wk+e0h9oTBQxqS3DY40pX/uMa0xdCNVbJieAwa3QtL1MSx9XvS41wR+a8niP3toct0VwH3zKlaFttYzzIwOrMk1lxv1QBh+KCq/+LBGy6Wj+QQsX3y5WSY54+"
          },
            "postCode" : {
            "value" : "Kj4CK5EZbyTtO3MDLbJPSlB/rC/5/YLl4w==",
            "nonce" : "ao7ZL1kEeoAhO4zcOWofigd4yNSAF2TMGQbWNZRJ225qDqQp3gPmIyIBcxSNtQs5Sk24Ks4VcGO7xLslV7G3I3KcdjRjrrP0zH3XILHO1dhe86JxvYbJCV1Q/t1z7glJ"
          },
            "country" : {
            "code" : "EE",
            "name" : "Estonia"
          }
          }
        },
        {
          "country" : {
            "code" : {
            "value" : "OXRDTgvRDTaRgg/nyHzA4tdv",
            "nonce" : "tfkuWl1Qf6SBux6m0HeYxa42OQOW3kkrApprc/eoo/DNxGXp3UPldX17V4YGynCmXN63TDuYLBGvyRslSEA1+LI2iKiwF39Avse90EnHfNmQcwJwaV7WT+McgfxsV1sX"
          },
            "name" : {
            "value" : "nkZ1J29PD/9UZY3tuYYyQ0XeziSmKg==",
            "nonce" : "pzkoRvc7J4WZwuQ+zTNjNmpxXAlU1thOa9ZHOnze3hWQTCtpD7SwS0ckplmVK3+ct7p19+2OEtsH+h0VEFa/ymsb2vdAF/e3KhoI45489zxI/mE05NZL9GVJYO9F5eFU"
          }
          },
          "taxIdentifier" : {
            "identifierType" : {
            "value" : "HCHI6f96blwj5tyuXpUnghw5gQ==",
            "nonce" : "ihRBHjIqCbbhYw+CDGCUN5XuUogpRRU2HZvqsrZn2g5Tg4xA6YrjcClMms8XsgY/waHPhzJ6RMaMwlXBTx9UqHbYbxHrzlwmiAVwtOwzm68aADXbTaBvREejAo3f7HZR"
          },
            "value" : {
            "value" : "Zh7IyTWd8KLIy1RXoKKpEYFW5fg=",
            "nonce" : "OvamlA9TUl48sKtqpGKCXyuRVoXZkw8mBuM0SCBTsXQXWRRLugg8kby7JlO1jgwuPeT/fSaYRmA0k3N93MwrzHQC+WmVgDu9I+8Hve4Tye6CJMF5BeyKr9wPcC33g0Sw"
          }
          },
          "sendsGoods" : {
            "value" : "F6iHuS+H8t41oxtyOmy9zxQ8UbO0",
            "nonce" : "/QBML0cK0xtBSX2iJSYySsgeybke/BaV6xdIpqxXvn8dGflpaL9C2m1/8unojYUklzFsBH07vqnGYud7jBNqo3NPuHNYK8updPRdgdrer6ZuwcUvxuhzP6Caw7ZUl6ke"
          }
        },
        {
          "country" : {
            "code" : {
            "value" : "51fR3ULZK3xvimgh8sGvO1IQ",
            "nonce" : "TXsjad7ZYAmnB4xn+m7JJk3lhrCHkGt1V5Rm+KVkaSA1M9LBYxZ6LbkNUR9the3VfVfa1OBaeES+dXVcVZlPEqZcM00F18mAqgKkrVbQ7p7GhVweS3LuU55gqAB9OPmE"
          },
            "name" : {
            "value" : "6/93ApjEOTj4q90wNkAfYUuCKnv2tg==",
            "nonce" : "fzH6cmt7Kes3ylqTamEkHMuJQe18eb27LOLZw87pKZaVBKsbWpAjoKW863lPxb8dwZnFnypmQzhszP1ZktZ8yR4IRYsdYQ4iLdJO233Sl+GJfILmwv5sDZSYeNx6QD7P"
          }
          }
        }
        ],
        "contactDetails" : {
          "fullName" : {
          "value" : "S0ZIxi9ggWxntJ+Bdyya2PDXmKk=",
          "nonce" : "MFqnk0owOs/IiEVZNOhpBGukR1mrEGaYOr3vkJP+gDGrQ13dTWxrInpTHUq9f53g5TNL10uVU/5vBNRKMAlgLw/aokHdC6+0lrCeVBWwDd00Styvb0uvXGkGvzmnPHNm"
        },
          "telephoneNumber" : {
          "value" : "LGauHumv+HGjk4ISLP+3tssqOgac9Q==",
          "nonce" : "0P5JSheyZh1Zc/c0btpBlkQXzKBEv069LX9XlwtfGQLijYsd6jq5CDSnYf65ZNU3wlAbeV218zCweTUKo+qXa4jl5G2wWY6yeQYpE8sVKG7OuKrViXxxfbdjuf23Ksiy"
        },
          "emailAddress" : {
          "value" : "V4G7Bekm0oOhGcvIFNYH+cgNwh+JJ2ucJXHuzhs=",
          "nonce" : "ZIx1AGsBS4LzcXxN7nU7Jqu4+OgpwtFYUFG0CEKNmBLGATB/2a0gwzfzI9CoTXNPNnpefF+EjNjPuwzQJ5DIOKUOxoEcRA18cO9XV41iEtghK2CZMXVKMJ4Gt1UaNyiI"
        }
        },
        "websites" : [],
        "commencementDate" : "2021-07-04",
        "previousRegistrations" : [],
        "bankDetails" : {
          "accountName" : {
          "value" : "UjeKqH9O+4RjEjXp5gDb1Zjkri0=",
          "nonce" : "JXAMmmumVWxocR3PaIqO9UiWk8JlORHtSxA0YBnBltK7G4wYWqeRgMLyxbUeQUjKT/MjN/8lA/ltzioR50/PfX75YUXbZsh1kj0vbpz4XZvUhVFpVP5jNCrV0lzzIzZ+"
        },
          "iban" : {
          "value" : "JVTApcYsPr2uQswVgvXiy/9oX5E8M16ZYm9r83hMr5rsBnyfD7M=",
          "nonce" : "pZ/xbxO5M1mZj1x9dWn9S2tvWCrDrWbTL0K1I0qMS4/0O6aRpjsNzIjAqOOk9IrSNkXWo+T5lE1yZ8xRTyBPfWvi9MN/LF7akG1+aur2Ko/Oam8WHlxej6CHIRTSs6j0"
        }
        },
        "isOnlineMarketplace" : {
          "value" : "nsh2uHawdcP//RI60q38F4Gja/MF",
          "nonce" : "pHYsLwrT40Zo4E+R1057kQlKQ++XPSOhzI7IYUmFXEf2egfymp6+vwaQyWSg88v2iKYj+nagw9w4Vy6UHihbhoEWjpRpbRIYywgUZSUEFY/MU0QEiREy0a6Cgt2B3vzw"
        },
        "submissionReceived" : "2022-05-04T14:39:30.517Z",
        "lastUpdated" : "2022-05-04T14:39:30.517Z"
      }""".stripMargin,
      s"""
      {
    "_id" : ObjectId("62a860d66af7db087cb53f4b"),
    "vrn" : "444444444",
    "registeredCompanyName" : {
        "value" : "UM+eUcwLVrToSaErHwTzWTLu5deM5DNUnR5ngQ==",
        "nonce" : "vR+pol+dnJPDnT4SlCmcvO1DPwNLVENRNn6rwDOkODi7E+QE5E4lkLNBTvC33l4rqY/MLVw2F96nGlpQIGFcxKr3TUc84li2nj198HL/M2DbS9NMWLoleN6EPyGl1AVI"
    },
    "tradingNames" : [],
    "vatDetails" : {
        "registrationDate" : "2020-01-01",
        "address" : {
            "line1" : {
                "value" : "FI7JvHdIDm3Nvdqs2tUKvLc7HsK/CT6tbZZZdg==",
                "nonce" : "cB2BmTUhzhbZnMgZL9jiA6MpUs8nd/ReHqO6jqaAl9R0OZleiCzXKeT5sII2jmkOUg9L6g9cDH5F4ZzNVhJx6uaiv4/1kkH53hHQFDDK3n3ssSkO4hwyeBHjDt1NMN9e"
            },
            "line2" : {
                "value" : "aApLy5q8C3CKCZLjsbMhmecJmqNa0hY7/w==",
                "nonce" : "yVAhvE7GpDX43u6/SBBJSr0s6SB9t4SPyDTlgkK8Iug5ix1EymiugsGrcnujSW7I2qvI+fO2G1I8i2Ai/GPDLDKKq0SFkrHHYYcasRa2RO43C/qbL5cxLWd0XnQ7YXXa"
            },
            "postCode" : {
                "value" : "hW7pmFhOWryr6qy0O3LU1HBSXY+/qAXm",
                "nonce" : "Jy8TIADn12NpXvdI34oPPp4m4kEzc9H09ss1qgxM9409Du3svjVrCjUi88ybUScChjC7C+9O3BCc4uG3YLuxCjynpaCIMMb5LLkuKVp0r++UyorwYk4yGS3RbOoA0F8Y"
            },
            "countryCode" : {
                "value" : "WQlIqVYCUWWNPfpfNAtOAJP5",
                "nonce" : "lH0ZnmtVP788huGA3W004v97EnMvxJVePb9De7+LHcjxjREOsdRstwN3SfG2XSlc/ZWT4vEB1jvJeEMfj+5XPSBYb6L/8BpcUt0ZPV7XVDt7xJFzV8yvvmlayfq8IYl6"
            }
        },
        "partOfVatGroup" : {
            "value" : "Pt4SBYYxSIOm42Wz4p32KnWOyuU=",
            "nonce" : "/XZ3D7IgU6dfPWfsG9UXJSmQ19ZGq+L+bZ1bQXgjQi03Dqj0dvWHH3oCBFVrv9p8u2Nz4GJeqWRX/GVZBP+PRtrSeQSyEIFMbRcge83x5E72OyeZ8qNUOO9U7LvSzzo5"
        },
        "source" : "etmp"
    },
    "euRegistrations" : [],
    "contactDetails" : {
        "fullName" : {
            "value" : "2HpE1CJ4UePyxLtSa4h2yP+cIhc=",
            "nonce" : "KoSaEFm6ms1lcP/XGgcop1sH/uv1RacMK7YKHHpDm1D0D63o+wqXUGvZYyeyGsNsWHbO0nai3wjyXKE63eH04KXQ0tE562ZJ75pCXxhK9xVVvwM3d+S4o/NQeGl0qrds"
        },
        "telephoneNumber" : {
            "value" : "pE5cKEBMgMPHdNMDNT0cECqwCy0=",
            "nonce" : "+bCgrN4yr0NPNi2Th40RkjShU3eAQnlCwq2fREkawnxGhEpFibWsPsXtsg3+r40zQkrlMQUJ0Iu0HBsKUsXgSYujGO+1yBIQoArv+QWF2YjWeG8CXJv2TMaSBwOkLNST"
        },
        "emailAddress" : {
            "value" : "xupLS0VO8/+HD8IwPy9YxPYHpg0h39Sa/84gU8I=",
            "nonce" : "s+QAKsIRKKvzIfs4/nl8xasJMSQzlL4Axqo41bVnHiCMp8jjSRPsIyXUL3UH6P/6V+QZDqTFGW5q/pLTWsqK4/cLCaRywXTEeoP+e4oux51rfO2jeIsf4ZtV43/l7/Hb"
        }
    },
    "websites" : [],
    "commencementDate" : "2021-07-14",
    "previousRegistrations" : [],
    "bankDetails" : {
        "accountName" : {
            "value" : "95nZpqAU8yTyaWFnqDrtDgQGQUc=",
            "nonce" : "eRTIVr080DEGE7ueeJ0rjqsdwFmzwnLEJpJ6ix1ail/R/QBihNWTAdozvO1t/D02RJxYHKpXP+GZ7gmvMh98F68znXMrLb+aKKruNjSQJBjX71nmDLhY+LPM1XOe8ELy"
        },
        "iban" : {
            "value" : "3z602KC3EioGtqSJybqDcnmYG0vJYZLQYsoSENsR6Xcta+u39yg=",
            "nonce" : "Y1Lh10jQfSjIL85cBRqRg1HRMdXVpSLIFAYnSVAdbiQSn5tapBP5IL941VpfxKuMCeEuyVa+MkaaxUFfrFnCKSXeeMRl5a5jy8gPsGXRi0NKH08RcCKzhqciv/oeq0K1"
        }
    },
    "isOnlineMarketplace" : {
        "value" : "1gKriHHUBGVut6rFfWxcSa2wQ5va",
        "nonce" : "q3+UE5oOqTOc88mDmmMn5ABQj3d/ZxXcL/LapQTeKeFbZhvUhNfQ8n4fY91VMOEhiM3UjHqxu6GJw5ytSgBR6dintYxzYj13EAhfDrK4Kv+A4oD2wqs9UWBlqh3CP+PI"
    },
    "niPresence" : "principalPlaceOfBusinessInNi",
    "submissionReceived" : "2022-06-14T10:20:06.210Z",
    "lastUpdated" : "2022-06-14T10:20:06.210Z"
}""".stripMargin,
      s"""
  {
    "_id" : ObjectId("6320c0bfdb6a862d0512286e"),
    "vrn" : "600000011",
    "registeredCompanyName" : {
        "value" : "oa8nrnGZaUMcbKx5qE+DLIWK78G2qJrHagEd+g==",
        "nonce" : "9TMBfuBQHh8QG3albrOXNhmv6+DjT0gMlpapINX0wL6AO+kCa3+ncFW3TyPdpA+wdhA8FowBBBzsuQiEkSZgJdaB8/Wxp+rvoV02kFiGI6+fulpVdwMqtwFHK4992G7N"
    },
    "tradingNames" : [

    ],
    "vatDetails" : {
        "registrationDate" : "2020-01-01",
        "address" : {
            "line1" : {
                "value" : "v1afxf90gkr5UwrnxZuZwJ2WbQF1yp1djQSqMA==",
                "nonce" : "r2Zja904MJz4kGuL3vrFul6kCgjyiSObZtKowSZ75uTbSTKhqPwtUhr02cwpM/IegXNHw1oAUkver7vzN1s+O8FxlN1aj9pkRcbUFMY7JX5aYZxkEsHJqANrg780o+e6"
            },
            "line2" : {
                "value" : "/14Qcgc8I7AC4sMd3lhd1NVOehhSX2HJtw==",
                "nonce" : "hk0emGYGekcYEtmoxvWY1coyFcrdIMIvwTP9ZikbDXOsDuSki1Z6SUMkQ92hiwiS6WFKcYS4ZD/qW8Ttjw/+GYLL0mt1ofe/w0V1mph4SmB1S2XAk7H27YxgFcfm0iQP"
            },
            "postCode" : {
                "value" : "pX8dusPk3OoDltduzHRzwu7Wq+mJD+vC",
                "nonce" : "FQ4KRTuTZmGN2/FcOVRyxJHrkTE7dLalObvjJiK1REN/2bTnrjSeMw7BRf475IC0GTJLLY/Qzde9oqTuF4u4H/4BTW5T5RBg443yIN8bA1arPvP0X52bEKLd4fXIpla4"
            },
            "countryCode" : {
                "value" : "JM2XMNyRasREbwzf+CJjJcrq",
                "nonce" : "0TkkSZJatkbDXTYGo6q0rvAUr0SsAewxkSGP8SuvWfzl9NHYJl6LF7lE5XhQme9voC2qkiwa3+IsKmwQ2KH6dkUrf8zyJGLXttq5bCWJ5c412laqiU/bV9hXURMJZwLz"
            }
        },
        "partOfVatGroup" : {
            "value" : "eVkK8WeyITOcRPnqynImvuz50U8=",
            "nonce" : "XwW3Y1SGepE70J06ARDWSZh1Cdij0qFcF3UmkXhetLuSxlSfumZ/3jEx2XvriSCF7XjYmoFKqL1x4eoLEnanJKyWd8U2raKiqFVGrEZAR3f8Ykf2E/ADSFFryIdLX/E1"
        },
        "source" : "etmp"
    },
    "euRegistrations" : [
        {
            "country" : {
                "code" : {
                    "value" : "IVj2KyY9bxvsyDDSmyR0qPwA",
                    "nonce" : "Ewao/r1yDsHO8ntJoet54xj6BBNUr0JrB6O3AU6pLAbWVTEhIv1ANfnrBv9aCfyyBGZFN2YYjymmKi20wO+NEg0E4dsDGxhVs+SF6YFSC2ICWaktWshcBv+T4dZ7h2VR"
                },
                "name" : {
                    "value" : "5a/1ctz3/uLmuLew1q6I0JhDJLWvaQ==",
                    "nonce" : "P7cwcWgH/wrnmgG88bs0rKVOJgxRolXu5+grcWDtELMwWZKE8nSiHnGRoIg+KCayAhWrXje6w5SHDi364P10iTh0YpsqBOIV0npxiChfHjRYVLSkwX0bBFrmDq80dk7H"
                }
            },
            "taxIdentifier" : {
                "identifierType" : {
                    "value" : "EecVa7DrMf5THfMPdL2M7gm5iw==",
                    "nonce" : "m86uQNiHX3xyR5605MwiiHqBnuSBlRbMl8t2IRStqJYbU7chbkgXQZWsj3nA0hk+6YE+Nv0/jJPGcuFpmxAi4drRezkAlhsuKpySOzfFYGFACESUA6UGzlcw2gddo2+c"
                },
                "value" : {
                    "value" : "+uGAivKsVrDAP2G48CKt1Kf0A/C2FOFL7taq",
                    "nonce" : "jRJd4zvqU7cu1QCxdiEXGfLnpq30lAkswapULxgIVmG9QkLnYkS/IFBmtj52bi+CflZ6MvoznWk2njSiZnnC6jsE6e9ZtGzNRTJZf4Qcm8slLiVXr+rOUjsN3oBQAwKc"
                }
            },
            "fixedEstablishment" : {
                "tradingName" : {
                    "value" : "2sEc7z5mT7XAlHHHGaQ2FXMUyA==",
                    "nonce" : "pHebExUx5pYZfiyZz2W6RYYyBDFliaEs8Qi+U8AqhKxYcJEfvwrAuEhKXGhF9yLVqwAyJEaU5uZiMvEFPisVxZqcB7KZbE/kFSeCThtgPDvO7IYHoHC0nvZsZF41h8N5"
                },
                "address" : {
                    "line1" : {
                        "value" : "lNjyCudTBbb7HscaTClqIb+54DLEJBN2ai+h",
                        "nonce" : "+JNfqR9Jb8Ik78i+rVdpE5GbAS0B2nT9mIysgYVCTVQ5m9Jp6AD3SqKUsx9JiiB8GnaAQ9bLDWbIgS7Pe+TFHTsl2Jnm8D3jYJq4bt6CIQnwAiBXncwslUnn+c6vqHGn"
                    },
                    "townOrCity" : {
                        "value" : "BCfB8hvAF0bFir1yEcAycAg/C/v3JkpTEA==",
                        "nonce" : "RV796TTB4v3vNtGrhGqvrdszE8Vg9q7kCF/0u8DR4gU1c7B+bmDaRxMjUzFa0UuKH3AlE9a5e+evsr6KTbLvveAKFG+q4GF1mkSrXRqYXmdoZ361v2XDDwStBaUHepr3"
                    },
                    "country" : {
                        "code" : "FR",
                        "name" : "France"
                    }
                }
            }
        }
    ],
    "contactDetails" : {
        "fullName" : {
            "value" : "2PXOL44BDwmk7GpxvHZ7N8s6dnOK/pqy+LU=",
            "nonce" : "9+CsURIy2xcpBTD/9UBaXcfY/riDDB0qAotucgePsL4gIlSWimk6/PnhQauLSpvTdMXrLBbEccY/Sip71+cFjrShwpCBN/XcaGp6A2OjOj0b6cdysH08atoZYLTragSf"
        },
        "telephoneNumber" : {
            "value" : "6+cJmKSH9tIZ4ag6GA61Y92UK81pHXGjIsM+",
            "nonce" : "58AAeyrRQSPKVGC12Drg74AHviKJFH8eh8E/m9Te7OUIBI5OhOLrvwizU+qEEDyl1KmL12+YyeRc4XORokzBgg4LHq5depkOdi8YlyfcOL926L95CrhJ+cbhtW+2v5k8"
        },
        "emailAddress" : {
            "value" : "SEax5NHTct7Njz/u/GoN3Kj9xTbHbI/t1/6t+UN/",
            "nonce" : "a1LyN4vhByaxKB+YB9aJ9zPh9tkfBcwuzRTK5O6ekfbXwx1Zbrk/apciMmdv5EeWyM3Rkr6c0FK1JPdR3dumHlxVtMGe60AGqwOfSlmMM3gsONBCpScZQ8SDe44YCCfB"
        }
    },
    "websites" : [

    ],
    "commencementDate" : "2022-01-01",
    "previousRegistrations" : [

    ],
    "bankDetails" : {
        "accountName" : {
            "value" : "Vy7wrQ7ZZ6WRCp4cGM1JgdD4gHg=",
            "nonce" : "JufZaFXt4mBe1NVDJG1tl2woEXyAJF+uG56XeF7PHP/GLOcOv0BT6eKf/948iN6oA7iXzH75FHYodRXF0aO29h0if6Cobt++kXjkqn3Qs8bGw9m/i8UKuKE6KuyXljWe"
        },
        "iban" : {
            "value" : "h5dmwqldOjoDHW1Q+X4T1FQqgPL9jmq+fTFzbRXi0GwfJNJLR64=",
            "nonce" : "PLrv15ZtxXQYAVLscyRJARn11p3FFhfwv4YQ3EqH7si6nv898WRyiVFaQqHdCe/20SFjCMLYmSyPN9JEmrnTQ8j3DjQObyzQJ/Gsw/IIw0UFJz4EXtIl8WLCrvWcOh1w"
        }
    },
    "isOnlineMarketplace" : {
        "value" : "6orojTzBYDWTvQ78nE/Use+M8pQE",
        "nonce" : "dGYZgAYpXmvF5v7uD66UOkOOSuKbmv3IzdGqkNFMIBLKgU6eqm463CTDijZ46EK0bwEcmB8+IA1ydAB+Zgv8pYJUSoH6bE1x6d0300q5QnqXHLiaLKBTsHyt6+MS40Mo"
    },
    "submissionReceived" : "2022-09-13T17:41:19.808Z",
    "lastUpdated" : "2022-09-13T17:41:19.808Z",
    "dateOfFirstSale" : "2022-07-10"
}

}""".stripMargin,
      s"""
      {
        "_id" : ObjectId("6320ff09804b0116ac9bc200"),
        "vrn" : "600000012",
        "registeredCompanyName" : {
          "value" : "ug4fE3C7o//EIqt+2+/kB1iLe+JcK5B0otc5Sg==",
          "nonce" : "49svKopom/XWAhVDo1uKpJUMv0HGj0ZkeVe7xO8x7gat3y/deMhNFiCCYjy5g331Dg7J54rOSksOp8P6SfBM945KAZhcUvYg4dWrgcxV+I6HErneXULfDGH1z/PtlAX7"
        },
        "tradingNames" : [

        ],
        "vatDetails" : {
          "registrationDate" : "2020-01-01",
          "address" : {
          "line1" : {
          "value" : "Bf7+rogPA2Ez63uVt5r09Fi2hsxija0hHML2ow==",
          "nonce" : "Ba109Fhe9RyOJJLGoAKhnlA3KJBPB3+TmS751nwpfPhLzOYyuBpHSCcdghGJ1W3PzBOIa1mrQZW0ILhNYmG8bK4KRGOVmGEaOiRPfaf9KK2JV3co4LR0dSz1IBC9ojKg"
        },
          "line2" : {
          "value" : "tBU74K2u5uUmT6fWc7G8jrP0zTQX3tXcTA==",
          "nonce" : "8dyZ5C3zVqJIWKCf1eVLXq2LR3fbZfUvs9iIQsaHPwwX/lg6vmMijn4Z9tmnWClkQkf7a76pZKivVflFEJS2b/ZehSYlIT5GVAIVHAb+G9HUjNc/sK2XIT7uqAPpsE6b"
        },
          "postCode" : {
          "value" : "jOz9eq7Lr5LXvpSXZhCQhf5pteTpfS7v",
          "nonce" : "Zl0sNnNLBTKxqcXIo7atpppu4VunFJdr6mBUhu4fl1QlC2p2fPgIhFBnoyJubO4EFayaZGA9+8UWZwcD0cuPocidQx2eg+kUZgBouiCf5Xt8JRZ3Nsmsa23uQuGcsMcC"
        },
          "countryCode" : {
          "value" : "naME4vICgMcH+H1lGx5/R3Pn",
          "nonce" : "Gi3F4+8auzfYy4ryd+Mv3z/3BvI0e1LbwAQI40V7RcGaHOSQJ0F2zBIGdv8vuc6Im0XH9rmSVMN0AYzbRzOPcDGrDzoMuRnkRjDbdKtObK8S7S8Vos310j6y2Rckmdkz"
        }
        },
          "partOfVatGroup" : {
          "value" : "c3zIEuXvZSAXDGIQtpjX8hN3c8M=",
          "nonce" : "Mu4f6brQtE51zHcDsZnu3jYOwr8skCeVg0Q0JmeGAQeKtf/7TDQcIFHQ4WnSYFLpXEyvLP0hRkxzLx0Zo9B0iIOGliIFnBGfs23paoWGmQIL8V14ERFml26umW5eNaaB"
        },
          "source" : "etmp"
        },
        "euRegistrations" : [
        {
          "country" : {
            "code" : {
            "value" : "6G52Ygnfkhi7AqzrYGXQ11mV",
            "nonce" : "cWL+XtsJjTmtUyDI5eeq/tJc3O4eReIgrYLjApdKg51ZaWNu22Zf/FCP6/XqMQ6qUfoV3oBa1SWJVOB2gs4I7ov6RKIWX0iz+CuTtvfdpAOKwKwE1nkqhQaHzb2Kct1q"
          },
            "name" : {
            "value" : "hQwG3htqF4IIOE8UpidR3X+g/EtGRlI=",
            "nonce" : "fDTkVQljILOw5Al8pOm8LpOkffR5Ph1Jniak/u1XjONaSMym2+3il8CLxjZvx/YMsSVvo3mYwR4ZefTZ0rU7fvFslWbwnKm1ck0g+VDXv/nqb/BnTwMmAwIIw0/qIzTS"
          }
          },
          "taxIdentifier" : {
            "identifierType" : {
            "value" : "es+llLunkbcHGBSxfc3L/nDw4Q==",
            "nonce" : "o2WgXcAzYnVHieThPqDZFVHcoybLdE7aURlhSCv6zKNzhH2ZxbQEuFC0W3id7/qstOTZmeVe9YbK44/UcmWLBvMpAJg9IJD0xZIujDc6wdZfzwzxE/3YugaP+ne6iZOb"
          },
            "value" : {
            "value" : "YwOte0s2pu5tSYggLIuRm79EFhiIv8pZUQ==",
            "nonce" : "oM728kuKq7fhphVe1aN+oerI8NlyE+Qzhuhhz+4u2i3r9VUn4WokBBTJspZUw6Cex9LtiVTJW9v7sfFjD9wILEVxZGuUvvpMXu0G8v3sxEWI/PhmvZWXq17SMsJIc0Kd"
          }
          },
          "fixedEstablishment" : {
            "tradingName" : {
            "value" : "WqK+Od8eeovbLVo95d+k4ARyBaCsabZGAQ==",
            "nonce" : "UO2BWIvpyC9kEERUkzoMsfOxvgxLiRerIUavqA2tEStF+rkuKowcl+y4stC9wuuZycwxdkJPZkrd4tF09xwFAxFMMca085egh3qu0vFNQ0ce/Y2WAIBe3aXxmFzfFbLD"
          },
            "address" : {
            "line1" : {
            "value" : "ZJ9gOyilvPMWo4BzI/kvuS4TCdyVk4iM1yKz",
            "nonce" : "HYp8ioN+43GJAoq5fp7ArPQfsdnna/VBDeuEk+hNfNpMbVZD9Z6TjVklZ3TfUQQlDgBs7z3GFBMBAeiIJVbaW7raoauq1TbVECj859n0JlUC0AqZJ4zt2L3HemgG5whx"
          },
            "townOrCity" : {
            "value" : "2q2ziw0+DgAVS0PeqdIYeQ3Jazddywz2dA==",
            "nonce" : "PjS4/VudXlpLfKe8N9Ghlhzv1B3/n8dnUgxoG+Pvfaq05IrL+xtETL3ruu95yjkbFZY7vB/WpSLhcSVZGRWIvF8LB7gbEK4zsKdqyJKKUommvPc5Ap/o4oInkVJpnVjI"
          },
            "country" : {
            "code" : "DE",
            "name" : "Germany"
          }
          }
          }
        }
        ],
        "contactDetails" : {
          "fullName" : {
          "value" : "YOztIk+AtVplNpxnp47faALmkw==",
          "nonce" : "C99bS47S7peOnWRHEz8+mFNnQEGKWnU2qFcdAtAEibdnfAV9vUUXSsxlSQnPjiGWgIorpznjonrT45XE0waLo2S9Vnz8u3BgtR5xKjNlhrh/pPP3taqi6QY9f9Ha9Nhl"
        },
          "telephoneNumber" : {
          "value" : "JLagHyu/ylxmMMV63KOkym9ft1/h8GD8/izM",
          "nonce" : "G4dZC25J0ajJB8g6PxRa826cU7MjojiJ9qnjh9ogKa/D/jzFDMt10z9mGQDmp36KO7IH5SH/mjzfV+8kAxPuJDwuxzd2znG0NbASdTCtR1buHXHCvbHeqiZIavgGOq7D"
        },
          "emailAddress" : {
          "value" : "TG6oKyEwaP/RdSV0mX39P4Nvdxh+Raw6AeFq5iCi",
          "nonce" : "9aq16kYA5j2h6xQUw9aJzTl6ocWFE9N3Vco8zsrLhzJRbljzpZvrJkp5AHcK7AFMVJjO7K6Z0HRSKK13pqdMT6uTizq1aNlzEONW34rO2EBfHrf2gwQa4ESau/td8mJ4"
        }
        },
        "websites" : [

        ],
        "commencementDate" : "2022-01-01",
        "previousRegistrations" : [

        ],
        "bankDetails" : {
          "accountName" : {
          "value" : "kZkdrjMvAo7Ompo4OmoJktE7+w==",
          "nonce" : "NOyKm8p08LSYHyB70cdRdnjMrW57ESzBao5GHGoHZYhKnQFdBuCMrSQF0qWldJHdUWFYZCq6qege7My0qpj4o16ueSjcTf7Pr2IV2WJrc+DTM1s4gHQKdkJy4ToU/l/6"
        },
          "iban" : {
          "value" : "2bCJXP4zMA8PLfQwYOMU3BUyT34VWzogOLz4uoRYlZpp2RD9Za8=",
          "nonce" : "5hx6cmWw1EJNZ7tbHkADngRnXQGMQQixmkcusG3H/tgPsDtKH3CGumw5IRHb6kv0b83CsKltHhOZgVPkRPJa1BT4RwAV0JlFYsARL9yu+BhzhlGwAYCed+j5f/yPq27+"
        }
        },
        "isOnlineMarketplace" : {
          "value" : "DzGwS8a58CMq7if6S7Kt3n59MeGy",
          "nonce" : "Qk5RW3a85DcEijTRxGpMEoJpLyLPpctFeYR/ndbOjREqFZbbHsFbmc5GvKg8qnvxzq1ef65r8C7gC4FUPs5EhTsJkH+vuXqPW061w5r19c2CqANszaAr8R5caN0Y6IYP"
        },
        "niPresence" : "principalPlaceOfBusinessInNi",
        "submissionReceived" : "2022-09-13T22:07:05.331Z",
        "lastUpdated" : "2022-09-13T22:07:05.331Z",
        "dateOfFirstSale" : "2022-07-08"
        }""".stripMargin,
      s"""
      {
        "_id": ObjectId
        ("6324985472333e4ba0d619df")
        ,
        "vrn": "600000013"
        ,
        "registeredCompanyName": {
          "value": "IWLNhc879BE/H7XaHZzJnK4UIsYKVOyXNDmVDg==",
          "nonce": "U5PEmERCFD7MDk5nEJPiOm3lC3KndIXRyULXSYPVgNWlx1Gov9QuiZmhDEN+ykrnD9uxddw8HwhBuPTsKjrHavcurJEcBd8cqUShsafmDgVWdyybxpHzZuDZPuLDHYuH"
        }
        ,
        "tradingNames":
        [

        ],
        "vatDetails": {
          "registrationDate": "2020-01-01",
          "address": {
          "line1": {
          "value": "gvhAMfcW734ydsJheZgKBsRK881jP3IvnxyLAA==",
          "nonce": "D/cfPTOfSs9lDW11E5bc1Ocilo1eF/MJNCvpbxbDGfvNKo010A2LQSy5dWQk8S8WFzd/cb2yA59hs9iUMBWBMGEEra3Z4oe4jp+qNhYwkqJTMOtPfr4pYIK/0ZfVD/jq"
        },
          "line2": {
          "value": "1uKj2WeO/QBYkA5xnRuqrnCsIPWWaWlNCg==",
          "nonce": "3IKX+vJ+onJ+jB4ymohYw+dczHa4yn6COayA/7ZvieVv8IVuxe12sC3JI+xUx1NHuuOj/Iwq/RJa29K+GuL1z7CYQ/qaJj8NpKO9h95EL5PZaAp0TyXCKXQn+hg/wQst"
        },
          "postCode": {
          "value": "DBMLTJAhNcGKg7HRPDKhO96mSx8c0/gc",
          "nonce": "A2rzFL5YgrO1yLdWWVxPCGvsqSh0Sygi6/OrB0po+8ByAy6jkuV3R0I4LYIc8y0I5tc1rFJobrqbzkDInKESescd5Wjg05aNIRTYAVySrjp8JjQxAgAaBmo3yzMIf/8d"
        },
          "countryCode": {
          "value": "aFVubT9mbMb6wX39P2wyczRB",
          "nonce": "P37vquWIPzC8TZ2W0GNqy/TsNy4Wt+crcpBNPewGZtrifhAGAz2GTqXX+2CMF7koClcfzsaSAmdqtXNf5+Qzr5TL8PJv7826EBDE+806F35Z5ykl4cfy+Dq2RzKt9zPE"
        }
        },
          "partOfVatGroup": {
          "value": "LXUzEFxbHxzKyo7yQAZLGzIBSlY=",
          "nonce": "ZaeuKyxqGQ8zqZL2IEV81x0eeBlTQZ3/IObApacvJQArfywwSL9x+5MKRWeNhxI13vjvlFPYYWBdptRH8EzmXjEDPEXQyVfJN3kb58WFXnrDmMS+4piqYYD/Q12W8/JU"
        },
          "source": "etmp"
        }
        ,
        "euRegistrations":
        [
        {
          "country": {
            "code": {
            "value": "/hPtR2bgeNJgO76Okpv1u3lV",
            "nonce": "BCC8Yvsz2GZ/d3+M/DxikeLZ4JAzAPrfvhvxiJ9ikWXs4jiadKMW33UNA0erzxglHwJn1ErYj4CZam/N+/kHiDW5fhcAHF5gESmXz+Al/4DfCheIqaIT/i2vh4UgS4AB"
          },
            "name": {
            "value": "i9Cc6XGMh8VNXPiildCs+nN00J1XIQU=",
            "nonce": "nL27hh4vCEdSfz/YjjjHFuvrtDgeqTOTVaYIHGETJBFc2uh1MWmDLxb4mNWPuO9ZSo7ahTG31qYw4mP+1BHwcGQmwx4DYqLX+zCpUEkkGtACv2UV1GqTDcALllP5CtNo"
          }
          }
          ,
          "taxIdentifier": {
            "identifierType": {
            "value": "ZH7ghB/heXie3Br3GDT99Y+kyQ==",
            "nonce": "pP2Ch+gSM7yBDC/o++ihTokNp4Hmny0PZBB4ow1Qfh8ZhFWqQ1lGvvOf0whS6zQDNc/I+prTgrYdPaecfprrjUn+dHFneVEcMVLKIqfpQqdNcH3W9dO3YRH8EYWIi7fU"
          },
            "value": {
            "value": "3img1keNkYGK/8cEhwKW6j7APNfWEwFA6Q==",
            "nonce": "RwSlc0vlHW2aeoC4LmexXsUWawYVPK+sqB1JElHZHBohM+cXc4GaSwAhKnhJh3KXCBXYJOE66oaI9Vg0HRPZ/5RmJ0QTX1AuqWk0XIzsgnjdJnoiaXCHQ5QSghpW8qC1"
          }
          }
          ,
          "fixedEstablishment": {
            "tradingName": {
            "value": "OmznUuClBj+2hDuF5EEjEYmWDHSCOanT0w==",
            "nonce": "oAzbNGzfd9lMjjc83Pag4bJ+YMCyO3b70YEa7l228CdwYctXujf5vDyiwcHIfEYMW3KiL1LrTFd883AnMY2WT/R1Rmy9bsH4nb2UpFZDPWmUJ/y/SJavONfwbxAn6trd"
          },
            "address": {
            "line1": {
            "value": "Ph5UYl/o3UhLV3iSyaxOYMGQLb3MpxZ90NFl",
            "nonce": "zecPULSXz6DvX3DpBCQK7HY+Z+N7ul3+CDv8iLIJ8LgeKUcPKVj+AkRb5vMVI/SjAmPLsEgaBETlWeoQnFB6y7r2JXz68ZcPFQxHv2yW7zeRZlruXjWuRnQj7MS1+aw0"
          },
            "townOrCity": {
            "value": "chn48u8W2K32DDIbTeCBtFZRL40X3AOHUsM=",
            "nonce": "Q8Q7TkyyROnulz+Cxa560lOh1eLJ7zh3OMgRMpJgvSbGjjguWMLYAkQPntfWdPHeDhbaTwbwblucNTWYV30viq6ARUSdh99eEk/Ibwsd+Olfsr09Y2Nhgt1uctKSMVEN"
          },
            "country": {
            "code": "DE",
            "name": "Germany"
          }
          }
          }
        }
        ],
        "contactDetails": {
          "fullName": {
          "value": "Ge0PSkUDVCR3Ok04HIBEaM+HVRL17tbFoPg=",
          "nonce": "A3ILnyTMopu3FY5R8O5nIys7NPw2V1dAtY6aqJXqB0ClP1xBVxkVlFd1ZR9dJeIvFB6GjLsa+UewsnwF8OHFpG7ssun2A4kj+yxFaeDOVu9zAcGlg4NproUuyqHVsRps"
        },
          "telephoneNumber": {
          "value": "NTBcMptwNkgCI2rHGjnyV7TOHBW4v1IC5INI",
          "nonce": "J63L61nIn6wugOd/j39Aybpcn5Y8Bo1Yhp77tCv41Na6YaEC2td9DL7LyB+wdoEKOy+dfcm8ildsnVvvHeLREyqbDGEGkz4RnJbTTp5WtmFf7uvnwZpAA7sPcybPcKPn"
        },
          "emailAddress": {
          "value": "UbOyeOqa5B6OToG/721AKgHoM3w02Xfz8z/F7fFe",
          "nonce": "qGtzLUsUKizPUI99p2/JftGCvL4Yq0Bbmphg1Pp6f+WR/Eqi3NzBLOa/oeXDpi9ZFVCAm8+l8itUAtvr3zX+1bsZp7aregs4vFD1m7xdYCIPGa1DNujx3MabaL7F/uon"
        }
        }
        ,
        "websites":
        [

        ],
        "commencementDate": "2021-11-01"
        ,
        "previousRegistrations":
        [

        ],
        "bankDetails": {
          "accountName": {
          "value": "TnU3mWR1iz5vyeCKZKOGrhPbrg==",
          "nonce": "6otLsR4QKujh18InA/9a4WGvYQLBln5vqP/Tn0Xfit0uqVhLaSTg3TmpwWwd+szIBaI4xdtIpu902gDa0SR/Kux4jcfWnuAVF/d8yg7AnSGEmx0hJieQEVgLfrusUZrZ"
        },
          "iban": {
          "value": "Qk3J0KSDwfSCBbZdJN4v8IVXphdDQQFMBHXqVQ4yg6Sr/Nq5uRU=",
          "nonce": "SD5LdZwg1K/W8Q/flAmwNE6t/yrjiszqd0Gxr2RsIdNiUKPT8Wy4VoE8dwqQ2+exe58X6sFrhUni0jOsJ8Rf7Qu9C2jv7icxvHPNCM9GN2SoUh0MwpxZHu2E2nbWwTi8"
        }
        }
        ,
        "isOnlineMarketplace": {
          "value": "uApCBxlsmMl9Y0aN998lv4OuX+z1",
          "nonce": "01kCMHj9x02zmwSpPC45wNs22Q3nJDIfxXxQYoSrDEfjabI5k/J0jdGrPyjoTlIrekPiDbWx8Uv4qIBbGYrufNqrTgKu63Bh/K5a+tSSsqLdmGLxa9O0koHY0MdsXO60"
        }
        ,
        "niPresence": "principalPlaceOfBusinessInNi"
        ,
        "submissionReceived": "2022-09-16T15:37:56.181Z"
        ,
        "lastUpdated": "2022-09-16T15:37:56.181Z"
        ,
        "dateOfFirstSale": "2022-07-09"
          }""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("644bb1ca2f38792a790af11a"),
         |    "vrn" : "777777778",
         |    "registeredCompanyName" : {
         |        "value" : "tAR8Nzjk299oeK8K9Ef0MnsW9JgO0yzAKzLj1MuskXic",
         |        "nonce" : "jk/WoS/u/CUHJW45+rkWWWGfQb5YEbDqkWXqguohXkgEPQ78tEWaBZ5b53CaRoCchM+l5UhNirNGSONkZqVzcJDfHa8WKCtdgOLqjHZL+54Sou0/3AYwvgARRJArmvSv"
         |    },
         |    "tradingNames" : [],
         |    "vatDetails" : {
         |        "registrationDate" : "2020-01-01",
         |        "address" : {
         |            "line1" : {
         |                "value" : "t0lpKEsMpbxyYktEBxYPQHIQMUfw4AZthjCb3Q==",
         |                "nonce" : "HUowRAIY/GbJoJIdq6FKiAJUROuZCG8VArwJTvHyd9CnKVG/z4ALyEjsl1QYADldCOyNmtjciiV4F6w5YF+2QLmIiQB4DZ+6ySuFA/kuOlR4zjryYD1WGTvOe3D7ThC9"
         |            },
         |            "line2" : {
         |                "value" : "qlC4iJsOtPD3MKyYJrWlQiDMldzQkR2dEw==",
         |                "nonce" : "XR1LvJNcDwgo08W8RlCCj06WrwT1558s1akpXhEMnFCPM1BBvX7E2nLwJA4idSIHjb9AUkammqyqkW5HZcKeI3/g6NUL1iDxMsjsdNmrcYMFUI97FfVP95MW/5vGH5V+"
         |            },
         |            "postCode" : {
         |                "value" : "COJQZdiiZCRWinjw0I3cCu3F+PDbYMoM",
         |                "nonce" : "Tl3KmPENztGsPCS8TSV++c9Wtbe3tGD+x41q3CYDhPMJV6AtOZdepN+MY2kwwWn2XzlNnIsMdsC/9xFkx1cOsyroYCf6yYPM8kM2C0RK3Nzl1M0kcU2HlDC6CNasJekC"
         |            },
         |            "countryCode" : {
         |                "value" : "f1bc5K9YuJN8Vhe2kH89gzlc",
         |                "nonce" : "Sw9kt9dHgfRw1/hh+ui5wT5jH/GLsrPuVToEM7bl2ypjI1qZuIJkmbQG7xulIA3ow2PzVlVeUkRtkbOhaiBpyY5n77HFb9HAblBzrTBgBAg0EZM/ms8z2yfbz8gy2uy3"
         |            }
         |        },
         |        "partOfVatGroup" : {
         |            "value" : "udLBDZiIBNZzMoDLKjlGUwWGKsop",
         |            "nonce" : "fxlMuYk9SG36cIWZHJYMVBKFwOuHSxCZXU0FXu71B6mOI8mrVbRqvvhNAUpgy4fIvprFNcsGwjm+lNTQIghCNyreCJIDhrJRB8OjSuyH/iAjcH7ntyenAYWi173nHT5e"
         |        },
         |        "source" : "etmp"
         |    },
         |    "euRegistrations" : [],
         |    "contactDetails" : {
         |        "fullName" : {
         |            "value" : "WMSsMz2MK4sexSm8K8wmHO27CCg=",
         |            "nonce" : "aD80E9AxhJ66M2qp9zDOAhswDAOXxJngyHLmIW2UemlGlkm1h9qIgRd05AT3ZnXxb7jyMed4fEq57pXs1eB+xK5EAtngnS2tN+9m8cucv6N8VGSFIeTU3naNQXZ3GXfB"
         |        },
         |        "telephoneNumber" : {
         |            "value" : "jQz5MMkUT47apUtqU4fB5a4fRHyw",
         |            "nonce" : "EUs4IjBlscfBXmFcZup0avLlxAdNMc4llOXJKtGT7JfdwKNn2vFikjgyzmDtSdklWr3uGpfgZo29WnJrW4fqMDAPpYLr5iN5V2TIjw5aohoypWqR3RaghNb0NR3yd8TN"
         |        },
         |        "emailAddress" : {
         |            "value" : "NdM2ldWPiaWNNHPmQeTGfhdlIBSjk8jqnVtfMOo=",
         |            "nonce" : "jVcdTpYqnuHSuRKiIQo/J/d/MirexUMugONkuXSudTuR57cNJvvjS5zQLo4Kwvt6ShVHzcSP5CA+qYUCRk3uNCGq9UCtIC+XjsmBwby9AH+xh4p9CihcLT+yJfRkm+Sq"
         |        }
         |    },
         |    "websites" : [],
         |    "commencementDate" : "2023-01-27",
         |    "previousRegistrations" : [],
         |    "bankDetails" : {
         |        "accountName" : {
         |            "value" : "9/KELb7r1vJ21GQ9UFXc0RWdvPs=",
         |            "nonce" : "ir6+Slet8LzRINXQVpdIR2uFCnzKtGoIHSqk+qkwHmxFcEAm61fA63t+lNOxOBvOuxz3cMFCb0wwtwoZreJ99JJIQOaE+OHPk9ZOnrTrmohKhL7xG0MIdO6XgiOl47OR"
         |        },
         |        "iban" : {
         |            "value" : "fL4s4IhX2MqpcCBx0pN5Qwa5hZRpe3xt2dcdOxqNlfD3dSkvUqc=",
         |            "nonce" : "gPwHAp8IdxUW1HoSeO/PRKPIdar72In8Ht6ovQ+6wfICM41vT7iRovpd108nqoT12kCX0X88boZ5D8XJmX8DW7UugUNh5EMoW7AjkEev+zPPr68lKppA34zKROAw+KmJ"
         |        }
         |    },
         |    "isOnlineMarketplace" : {
         |        "value" : "F6aNq3FNljD5agMT0vYxbVOkYJVe",
         |        "nonce" : "qzLWPJyhx+L2KhUg7gacyu1mJ3/L627hEEftJ/sY3DOAfSgdou9SuoAHIJhTw7naRHXgIhR5W2DpYNmkG6+1x+lI9WsDHO1oBwyvLELUGzgDKlQzPbxE/8iDbShxWXke"
         |    },
         |    "niPresence" : "principalPlaceOfBusinessInNi",
         |    "submissionReceived" : "2023-04-28T11:45:14.817993Z",
         |    "lastUpdated" : "2023-04-28T11:45:14.817994Z",
         |    "dateOfFirstSale" : "2023-01-27"
         |}
         |""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("64faf2eaecde034b36c6e4a6"),
         |    "vrn" : "600000014",
         |    "registeredCompanyName" : {
         |        "value" : "CgSQvkBvdNjD+hh5SUiPkcViDqVmXqX5X/pNGQ==",
         |        "nonce" : "bugf6m8MzczB73X3y82GNEpaTsGS7Tvw7/ZPL5Y3QFlXGpqrTsAUctGGtQ5nc5bM2ogyQ64erc8kbvdZOiHhmtCXkmOLmee1iKEd4YvmTq4U6b++3no/v+eWiF39KSsV"
         |    },
         |    "tradingNames" : [],
         |    "vatDetails" : {
         |        "registrationDate" : "2020-01-01",
         |        "address" : {
         |            "line1" : {
         |                "value" : "qhWGnQc0axp//vaKibHOpnQVLDrd0UsMMMEQEQ==",
         |                "nonce" : "E5FQ6Pi6iM/ZMDVRng3z/1FAq2UcGZ+J3MLDc++4XgULvaPIrnqHMjNs9p9kzKGQOVZEMQko+PQ0HcDuzwVZgU/2NIiY5d9AfJZESkuCpXw9iCktXSYNRIAEkLA7jefs"
         |            },
         |            "line2" : {
         |                "value" : "t8Hcom69C8sJ2pTVBys2NHtvmNk2rSGUCA==",
         |                "nonce" : "6fBMCtNBIFUZ4VOObNxr4gVuxdLqYflvnvQj4XxEd23zX5c/1QDEy5GjjpCrnIQc0ZG4xbqK+WjVsb8EjppOv34eNTFAQkAfucTpUP+KAEwgfnPSuo1G46sMoYHpSAPI"
         |            },
         |            "postCode" : {
         |                "value" : "cB1mNCMbbcZC6EdlElIfubm6VeKLbLtf",
         |                "nonce" : "Akfldcl9jSgzpw2acTJo/Rr4gEgvXM6OrPdm/KeSBimLaJZ+fHeAtEPKI8zmdId3eu6C3arhx4euzZkKITY5cW5Vb74nuyVHvLEZXq+PlH8Ia6q/e5qk75gmUti53mqz"
         |            },
         |            "countryCode" : {
         |                "value" : "MnD0LWmhSpJsG0/AK1dhVG1S",
         |                "nonce" : "zn2h4nmkDYo6gHdA8g+ftmbg7XbYe46rmlBwnDzOcQYZKERirh+gs/DPcXszGb39VN16Thiu6K1pN6uDMQPOq5EqnAJXUHdJ3oxW93A2zrHdQe/5fzWVORk8QGtJiF09"
         |            }
         |        },
         |        "partOfVatGroup" : {
         |            "value" : "athWH+O4VXkWLC2vdul/47Rd92Z3",
         |            "nonce" : "sABmWIIPTNME3vcN9E+AGPXchLJF3NLaVYkxApPfqK+UHfZQTIMBqIu227iY4x9pFgF+uEHfa9HDW17VQ7LOj+0ixk97VRBZG/CjJeFlqO6OK4nW9bpcx8+ahe1/gg/A"
         |        },
         |        "source" : "etmp"
         |    },
         |    "euRegistrations" : [],
         |    "contactDetails" : {
         |        "fullName" : {
         |            "value" : "RLGMgmfqbJlakJVqthg9/36Piu8yGbA97A==",
         |            "nonce" : "dcDzQiNBCEYjb2jk7EVIiLIXyT2hcWV1zm4liGTCXkZhpVe1RSuggJ0f4Hb8KALvTvIxnXPgdG+MSOrpOxRwaD0r0Exeht6HqcQBiCyKYNzkpaoC02RrB7W+mPCDsSDt"
         |        },
         |        "telephoneNumber" : {
         |            "value" : "B9IBCTu3HbHdS6f9WA/YCEaeTLR8FKitoA==",
         |            "nonce" : "Fnuf559fCd+QZZmB3EXUR51QUQ59CtzJt9DBVEOXyHvIJse0x9aEIcq7NtSQRk1uolq/R/FczsmDIMxuoTMbWMpUkmoepFaMt06gHgjJWaSBpU2DGlPjqi1R0bO9QIDY"
         |        },
         |        "emailAddress" : {
         |            "value" : "+x7T2HLTOWG1JsIAp6FBZkqq7S/v6El+EMbZatY=",
         |            "nonce" : "Hj1m3pJiJDbVqSnZhheifKw7rJPmUM4bw9mCQgCBN6oHtmu/XmzJa51CEWTiyTHsJFSsw3zal2qD3ngBVnbCWMvr5MN59BCSNLxdX58jjCuVZ/2gkRlg4mZ4fXdyQIrl"
         |        }
         |    },
         |    "websites" : [],
         |    "commencementDate" : "2022-04-01",
         |    "previousRegistrations" : [],
         |    "bankDetails" : {
         |        "accountName" : {
         |            "value" : "zbiLjhpqKIMuSTib6fI0bobggnY=",
         |            "nonce" : "Z5qmZCTnJILv7PXlNiXzMx0lcnDjyW/NZ/PadWAURtDPlbZRqxY40O3g110iJloYHq3T/SNDLxM6FI5126ErYdfz3xlJ23ibfWArJ0V5uUcAkXZ3G1wUIoWFRGivkvpV"
         |        },
         |        "iban" : {
         |            "value" : "kJDN232z6Ingdcpv+4ECmX0kd47STT4Yz7wmZC1Dv3KO5WtyrRM=",
         |            "nonce" : "k4Dk/LtJwZWvOcfCfU7FcPUKvGtsO6+YQbq1rUHUMvlIBxHlNHKId4P5j0JqUyBCHewo9ClSIntlNs6tQHiA0MtPbHxJDtC58WLh6iLENN1OzOicooT8uy26EUgnERgd"
         |        }
         |    },
         |    "isOnlineMarketplace" : {
         |        "value" : "NJIDJl1VMTetX1A3ZPLUiz9syta/",
         |        "nonce" : "Nq6OJnino1drEEh+GgQNyQIpaZzXvyJUHV/Z3H7TnWZ7F33ugN6biGFsOxijT3s8JhJwwbQ1jdlg22t0RNiiPmk6k2We2+Rnvt/YpASfDxD5rNd+NHDpPDF2IBTC9TqA"
         |    },
         |    "submissionReceived" : "2023-09-08T10:09:45.990413Z",
         |    "lastUpdated" : "2023-09-08T10:09:45.990413Z",
         |    "dateOfFirstSale" : "2023-09-01"
         |}
         |""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("657c7259aa33c00381abd161"),
         |    "vrn" : "100000007",
         |    "registeredCompanyName" : {
         |        "value" : "1TgcrWTCq2YHoIq+4zO4J4sIYBGe9GSJvbT6Og==",
         |        "nonce" : "aQIPxIvBkzAOabQHsemh28nm9nty4tjYWjRaDk+0NBpZyIoCJJF1+EgahpnWmnoceKlxJz6V6JFpnoWZJ49m7D8tK6bytC/XWNTOedsNwyCo8tMxgNwvxS2UNIPSqZDy"
         |    },
         |    "tradingNames" : [],
         |    "vatDetails" : {
         |        "registrationDate" : "2020-01-01",
         |        "address" : {
         |            "line1" : {
         |                "value" : "6Fc8TeqA/ROvlgI0bx1nGj3GvAjRTUqTNCHNoQ==",
         |                "nonce" : "hbwOPW4ZjuPbQvxU8Ke3eZ1wiWWsITSG0MOz/QK1BZM+YtHsafzPowmYQVQnYrx3bbhGs63Kd9RyGantSXWAFAHcC8MGZLJhnXT8YnX/IFOzX/v6nYtdqRN/oGN9VfcJ"
         |            },
         |            "line2" : {
         |                "value" : "HKGHyN8dC4jJ7M5P0ELxDFxxFR6jc5A8eg==",
         |                "nonce" : "+/ZrxS9z4YWgjdzTM7bpc5gxTVbble8jbvPQTcjiSjzXF86KPxkNqRyN12Myi4u8pvEex9ViAAuqbGFZUUswCdjsWccr31J33JKPDJUz6TR/BxcblTyx3K5kzDXveG7/"
         |            },
         |            "postCode" : {
         |                "value" : "eXoZUPtiWM7YEg4De05v1Ztw+EqFr2/s",
         |                "nonce" : "bMdToayMXHBs96xbjifrl44ADgvRc+VpBDzXegikoPZRjUthOdu9xdAHeZ6LwNihN8as61gymkNyUp2YWsgFD1UYkTlYfxAtqQzSDzeXx/Q/pdR7eDXHtlzduOooLy4t"
         |            },
         |            "countryCode" : {
         |                "value" : "/D0lWbnlAMlQvbYIb3DHXMTl",
         |                "nonce" : "FQUHlTYXrx8dJHIiqqZHdnz8B7mIbqwO0sE7ckC7wSE8CMEh2aydhHzFrEqwK2NhwaP7KklH9Qij29GXuBSq/1wEPPIjBQREp/EzjIT6A8+Qb6IRqIsdQ5m0SKnitNow"
         |            }
         |        },
         |        "partOfVatGroup" : {
         |            "value" : "iaGtmlShm+v1sk+HSn51bXy78Vqf",
         |            "nonce" : "s8pmniHYLipsZxXgO2B6mYHAHsZSv7KM8ZubZf+78O3o1vuaRTol7qt4+dGCAyZxOwsRfweyeK56QtigdlUFxA3RqbYHeZGIv0aZ09Y8UaqwKfmxPt9iHIJpjZi37xnx"
         |        },
         |        "source" : "etmp"
         |    },
         |    "euRegistrations" : [],
         |    "contactDetails" : {
         |        "fullName" : {
         |            "value" : "KFxmUhzbF55gWvTtdZdWsGbctlQ=",
         |            "nonce" : "DgiQz3s/1doaorBNi8f1LtGyEHdtsicNc+dOe37Iy5jfBgfLZvj/tKFO0UmI3FicQkDDHmtUnqGqI0bMX/3VmI/ZX8FZgQOxULBhkJ2p5VM3AsGZTrnshuhr5wv1SgCQ"
         |        },
         |        "telephoneNumber" : {
         |            "value" : "IFOkVW37xo+NTbT0FODcXhtRGS54PErhlX8/ucSp",
         |            "nonce" : "U6lTlcChcaO3GMPX9Cf6zby5ckXO3B4XupDrKMVjuXCjveHrDuletR4hCcHk+OlpOf38vJTkaGkGW0TWpxiwAmb8LvSrcnx0s9fzKZdnTs+ezPumMxHf984f9DPB/bXd"
         |        },
         |        "emailAddress" : {
         |            "value" : "JIrQlA/ZoCI7Cqk2byNK7rHo156qK5RLbMvCHp0=",
         |            "nonce" : "5VUS2YbwzAb6YH1J7UwEm3NTq+ZWBqR7Go9tKvQIC31ot6/t2L65OKqKR2CJsU9TqRexhWlOjZ6Lpg5lFMHKPoo7SZfisbwaMz0gHNP0liCor3Pqjv7qMY7Ri2vZnBFQ"
         |        }
         |    },
         |    "websites" : [],
         |    "commencementDate" : "2023-04-03",
         |    "previousRegistrations" : [
         |        {
         |            "country" : {
         |                "code" : {
         |                    "value" : "YtoOTv6vwDCPHQ6CDzhlRXWO",
         |                    "nonce" : "S8nMpo8pVfzs2qOZIG44Glz/Ni+ozLT6khVCvPr7x6xcLatTMOSiQdSpSvk8Js7HIeCeiY/7yamcldnrUo43iMPKr4vZe7WVQ4dmqV37Qt8egW26KtV4uVaoRY7j2qe3"
         |                },
         |                "name" : {
         |                    "value" : "618COHRRRj0sqkltm/8vEdv33UQ+5A==",
         |                    "nonce" : "Gu9U6bd2aHjiCijy6XqUPl9Sax4rFdtwbtN548tSAJ6iJP2xJ1Or5bHVw1hO1F6miP1FOjVYsrb7ghpEwEgiQmsw0Z2LNDRoxRNpag3YxtE0e6R5pTAOtZOl2s42PA1u"
         |                }
         |            },
         |            "previousSchemeDetails" : [
         |                {
         |                    "previousScheme" : {
         |                        "value" : "+I9AfmiXv2SfPKHqIC7p/SGOYA0=",
         |                        "nonce" : "N5lbKS3IOrwPmB5olshFN3AqXsatUNlQpbSPRmFGhH2diYKJ69woA/9E9rREv3vZZYw4g2TIQr2nFJ5rTKsv5ldy6mAX1dOQOx7uxX+iZ8bcUMrmHTMGvW2qspB1LWZx"
         |                    },
         |                    "previousSchemeNumbers" : {
         |                        "previousSchemeNumber" : {
         |                            "value" : "+sau/+jwA82HsnCSu2mKVIh2BV8s8fwBjDOCFl/u",
         |                            "nonce" : "qGx5ZezaifoRYsOKmI+iSwP0GB/w5yfXbYvbqxOWGVrbDSqjh0H0TaEr4ifDAEbdlf/AWZ8h4NWUjzDPHALspZ7mlocLpnkKASOVWValHrXwGTSSyRoq7zG43RxncTwm"
         |                        }
         |                    }
         |                }
         |            ]
         |        }
         |    ],
         |    "bankDetails" : {
         |        "accountName" : {
         |            "value" : "3JxLaZB6U/3HFS7goajeWO5yzOU=",
         |            "nonce" : "32PH22DsnF/NLMRvW7Zr5sUNx4/oeGZd5Zmr1bwzmNUwFawTdMRXz/3C1g1uUk8PVRjTlEurbYO8HupokLeaYJRU6aU2Y67pg7/6tt4F8X23KMY/H6xHvStsM9DWc/Vq"
         |        },
         |        "iban" : {
         |            "value" : "ojbklqGjbbThdLQTNFs2eTkBUQbakKKn5f4CJCdEYH+aXiMnBbE=",
         |            "nonce" : "oVpo981S0drxseB0jHh89B6dt9JtbxJTrb/8LXy/6+Nh6ut9Ua78YXBTM1c63Ev/SPs7YIyhN4xh+jkD5BnhNqlo4Y//5ozC+VF4yFgGUKTFA2JPMONH9SwCkFhoOxqy"
         |        }
         |    },
         |    "isOnlineMarketplace" : {
         |        "value" : "vxLYMFLmfCwA3BJmoLb6eGW7xvHf",
         |        "nonce" : "SyB7S0Fd/kHeUDA6SWY6f6npBFQN5Y0tyWbRjRJFMYLjIDFicKPnLw+v7k787Y4BNaS/nu1EuwZXtcenRQopdQAeMHssnywdWGzHpL/8bCtYpnGdLWdVeTqpC9UF782j"
         |    },
         |    "niPresence" : "principalPlaceOfBusinessInNi",
         |    "submissionReceived" : "2023-12-15T15:35:53.909561Z",
         |    "lastUpdated" : "2023-12-15T15:35:53.909561Z",
         |    "dateOfFirstSale" : "2023-04-03"
         |}
         |""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("658026c946b1524274f64eb3"),
         |    "vrn" : "600000015",
         |    "registeredCompanyName" : {
         |        "value" : "s3s5ZKif/6/Vd6/pZhmXBUHiijjCH9bLBWpwFA==",
         |        "nonce" : "0h7LWgRMINnQ03qf8XVop9SF7JZL4uSEOwR0TYAkEmkhHoEOX7Tcrqw4eMC0vDyOt96e0RYYl7vNHDDz7QzSFKTgqnik5M+ZPG8r+IR97KhDvTfl0WEfff1M/9in5YnR"
         |    },
         |    "tradingNames" : [],
         |    "vatDetails" : {
         |        "registrationDate" : "2020-01-01",
         |        "address" : {
         |            "line1" : {
         |                "value" : "p9nYuHnXSDYO2kfUKKYsLyzmJP+pZiq9vwoxYg==",
         |                "nonce" : "V5qit2hfbdBTEDt0Vn/IprUY1krAX4b6zrwULZsRCFwSAFv7f98DvnVYuSgx/BN+ajgXHiBFFUGGNKDppbOPfiuLt7Khr/P35AQs7mdMy+G5+gHmjMdwc10Pr5HDhMyZ"
         |            },
         |            "line2" : {
         |                "value" : "ld9cFsQScITIuh8oYBO+t+LintZ4C2jOkw==",
         |                "nonce" : "m+0JGHJheppkRYXjh9rZQSbKGR2H2wD9Mte/Tfa/8a+nFeaB1ty+LZCUPonUVe2aioUY31cz+iQ486gOWRcXhqA64Fb09J24MhYO87xB9JJHmc5Lzf3+rXIWZ74XGNKR"
         |            },
         |            "postCode" : {
         |                "value" : "tP9L0SR81pHvaoVZ8/yrxxB9kbugzf4p",
         |                "nonce" : "jgiHVZa+NOQtECC2gXYF8VXnJGbbmfQMFCKvqvC8qCFbJpPlHD+NjB0M1Vb7M4rtPL70ceTUkjOn3A6jLWsPVT1ae7Td/K1MzQzNi97EnWhUctbkeUpEfPmr79AhVmQG"
         |            },
         |            "countryCode" : {
         |                "value" : "GP36HAh0z3tKJ1hqaHg41Kbl",
         |                "nonce" : "hvZiHcQn9rTRtO8i9SQKAHW3IHDkw0hzQvF3tG3VmJq3yxlr4pkSdoDITbCV+E0i8DwbUn8j1D4ZGFFSt/yxZj3lZoALLR6ASM/oN0wcuY7bX0fGybXYCtpQmATA1TLH"
         |            }
         |        },
         |        "partOfVatGroup" : {
         |            "value" : "nN3O5c3moYMc2qbnCIredtOKkSyj",
         |            "nonce" : "tT46iFJz+OblENVma0MYCKZaa4u/t/upxKGCMpnr4KS644YM/QHRNyBIanpmWVzTwO9U4ptV9/D4Lmh/gXaGusI7M3cz5ctZG1SdenIF07zH9X/WzW2OF4k6cR8Z5BJ2"
         |        },
         |        "source" : "etmp"
         |    },
         |    "euRegistrations" : [],
         |    "contactDetails" : {
         |        "fullName" : {
         |            "value" : "dClaeIAjaZJnaV5eoiSCONdQdwo=",
         |            "nonce" : "exG+GGTC0M+6pJNsUqsDrOKRaj9xKy6DKGPQZEBvb/cFHJkMn2smIWAmYSXbo4Nn57iMjI158xAdmM1dhSB0xcGfKi2TOEJjdhgkwghmMUhyf6xuwLrFLTAmztqN9C2d"
         |        },
         |        "telephoneNumber" : {
         |            "value" : "aum+R6rmX90ON6S2RtN/sAe1VIq80viQCZUEJw==",
         |            "nonce" : "dlNNj5mEX2P+9Aa0ftw/pbthcT/oRhZHz0LkKWZg6Fo+Ad6AOcG0drdnlaXkXvGenGH+xZlWRjBY1D2FolEpKRwoG/QXm0rZScPRY6H2UFsDKd47MAH3w6OgLqpIplJJ"
         |        },
         |        "emailAddress" : {
         |            "value" : "6G9QJ5x0wO/5qVa7aCoJ6FbeuX+H8mbaRiMmUC4=",
         |            "nonce" : "FngqYtECiuWmFAP7fcDDJ+ONEd1IKUFOGrq+qsMKpsbQfmtdOtKmtEjM54i5zzZfEJVDqBHIUCYTzPBo9yKWsQjZ1dAnHYNaVgyiVaWKiLIXk5Q/JNfQjpvEF/Y82Sf9"
         |        }
         |    },
         |    "websites" : [],
         |    "commencementDate" : "2023-04-03",
         |    "previousRegistrations" : [],
         |    "bankDetails" : {
         |        "accountName" : {
         |            "value" : "C6QggYIipybrL2ZtMyC1jbgzU6g=",
         |            "nonce" : "AusYTmed2GfnLubDbBGyU3lxKYDG4LI7rfvubtR6UWbHautKvV0LHXzBO8PZa6LeuEGYAkk9f14sXCCShHJHkD+owCU4iSElKpI+viVOXJfNo2fwWLA5AkKSFbgoOMkf"
         |        },
         |        "iban" : {
         |            "value" : "bsGZP8ou8YnzdVyT9pVM4MtJAlGylhhOVk6J77aMKJpiir8RaGU=",
         |            "nonce" : "Pj9mwcsoyhbm9P1of9Q8e+UITGvsmUxuZBbw+Bu8XfHrZvWqSGSODKzSk17DlTKt6dOT/UWf+/9/xZBfURcDnDuLyI4SClC9DBMeBxUoieRkeDZEc9oqpLfQVS+FPZMB"
         |        }
         |    },
         |    "isOnlineMarketplace" : {
         |        "value" : "yCzokg6/MZv5vbG2aKK7ZK5TamVL",
         |        "nonce" : "c9HTN+YkbergHclhK5CbCL22u6CHyPSNAoRHLLopVJCNC9TaUFV7ZBQlzW1gRLooFzXurLOL9C1UzGdI1M5D2s1rnynJQMi9dZFlLYuTZkXe9iRq5ejxAyj7sXviyXnc"
         |    },
         |    "niPresence" : "principalPlaceOfBusinessInNi",
         |    "submissionReceived" : "2023-12-18T11:02:33.551364Z",
         |    "lastUpdated" : "2023-12-18T11:02:33.551364Z"
         |}
         |""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("6475d8fa18128b30fa58a71d"),
         |    "vrn" : "777777771",
         |    "registeredCompanyName" : {
         |        "value" : "UnjgNI/1egzkhfPs0FnfxExXmvw5C3aSbZ6LSQ==",
         |        "nonce" : "8oooPC2xMgAna7VqF73hlhNxZeRPONTDgkr82+ZZtFp6DIvm/R6lSNlun0Xe0iU9XC8rVaZdB5ViIH+uK1VB4ES/z6z2Ya+uW/4uomf3mD7Pmyw2edDS2NExLchWgCTk"
         |    },
         |    "tradingNames" : [],
         |    "vatDetails" : {
         |        "registrationDate" : "2020-01-01",
         |        "address" : {
         |            "line1" : {
         |                "value" : "IMYG0LIjVF1QquU4jaiENU+ZNS0uSEmEN3wdEA==",
         |                "nonce" : "EYeoHyXI/+qkegf1fq/dvsHuFCWQPCBd+ZTJML6oge0FSoI7YYMio6UNqyqP2azDuRDqGK2mVgZ/Et28Ysa3/9oBSNBN7zXTjcdx11NlsfKgFav1xB1sgZ9TrREaOLHp"
         |            },
         |            "line2" : {
         |                "value" : "OClc84g4/kdk1j2aCKkqoG8si37zbM9wiw==",
         |                "nonce" : "V41l/4g5RHU6AZN1VDbPAEv22ci7/1Z/SeuimXbFbbWIdpPnI4h7Si+NEDc9rnbYAdJ7xgzsdG4ayY2HQxf/LsR9mnslQOhwhHbx06gDWGChoCzoIjm9eacxLzne6kBx"
         |            },
         |            "postCode" : {
         |                "value" : "9FWHlVio1g2fvTE25g5yXjSNmJjUCruj",
         |                "nonce" : "WYO11ru4T5Q1sUoEmERIIvBcJc1xKzU3CRuoujtyqptVJpWI9MueJ7frfCmSH1nIUmXaIVbVTAMwNrACTgPBctrt5ycemfl0cKu/3Ucqw0lxADcumqV8hxYqBc8hS2co"
         |            },
         |            "countryCode" : {
         |                "value" : "ZghMHG9j/ROBInUt0L5hqlYK",
         |                "nonce" : "C49v7F8XYCDuHLemYCc3sZjfmXxsszQu7aNpEHFq/IFT83oYDYxRzJOJDXcQHWGCDHw1iorLe+WjGKBEJ/p4+tXU0lE8Jhhvh+u9dyLCAwXqiKYTbtiLvMzOtWsmjfxG"
         |            }
         |        },
         |        "partOfVatGroup" : {
         |            "value" : "HUQ3ptnGV7SRutI1pKFVNaxXRsF9",
         |            "nonce" : "ZwULbUg8GAH+LNRIhsdNCv0Li9TCJkdN4PmpCS364Sto4rL4mplMJIj2sUKceUxALKXMXjx2/5Trvukwho5+e9VWcDkY5a/psNKDQjU3s2y336sMOtXfXO0gYqmLPGFP"
         |        },
         |        "source" : "etmp"
         |    },
         |    "euRegistrations" : [
         |        {
         |            "country" : {
         |                "code" : {
         |                    "value" : "tTVhhhdpNSDJhBSD7dZ16x+Q",
         |                    "nonce" : "QpmTRVfopJ/Cqt7sJk/wK/VnEH6QfbiqPanv0RFax5Ixuy/UdQFJ9V9iLZerfUcUR2+rxBbp+XsUq7+Egf/I7tRyLeMcJOa80Qg2yb7ABtCX5L5TzDklkKvfd4dNGsxs"
         |                },
         |                "name" : {
         |                    "value" : "XnwPhLdLqdUkEO5u0tBFxN8/j1lsYQ==",
         |                    "nonce" : "tgiN/0/hk3rC5L+9PvrHDFt7nInZCocyNYXu66uOA8iIC6cechAn/MT46q1MvDTjnjfM3xzkzNukIux3JUZKg6l2bikHkM+Qnay/gH9sfcssg8iOAdXPhhMA/lA/t06H"
         |                }
         |            },
         |            "taxIdentifier" : {
         |                "identifierType" : {
         |                    "value" : "QIxJ8W4ffCKZNi5wE3vd0BJqpA==",
         |                    "nonce" : "0xd27RCdbv4mCj8gisjydX04Qn6+sZkJ1RYUTrxqgXCUDIemuel6aFBfB9SUVknSS9XJj9jDGfeWvokGCMhG1wIy2X3eWAvaxZf3d4d+XQg/03ExO7IJCBAy622xeayL"
         |                },
         |                "value" : {
         |                    "value" : "Jyi4I7me6bzThX+7oM7tLOlSefUpTjRw7xQU5SI=",
         |                    "nonce" : "il74wbRWVXUCuOb8Avt/fjnqhBmOjkLs30xwWagDjlASuY7c/6+dZzgbfT6MfXjyCiKxq1jW84F4+ARqFeKbhVaaCgr1TNd6YZVEMHEOrsxQWltDipIBPa3M64uiayVN"
         |                }
         |            },
         |            "fixedEstablishment" : {
         |                "tradingName" : {
         |                    "value" : "ptaFUSLpqYfQGC2m446N8LUz9PZdaDZeIBxLy7VU",
         |                    "nonce" : "2XdW19scC4/TgIfqDXgp1mSE9uEv4wC6aLyNg6xszWRjHHa5pl7WFNvsyfzGkzNTXM2vEIXL+EYwbAelMgGrLLYDsNta3H7WkZPXvByNNi8brkzAMwaR+DqHQAZPnyau"
         |                },
         |                "address" : {
         |                    "line1" : {
         |                        "value" : "pYZNnQtdj1UoxTYL1A5qDmc34iqYpf4LEbyJ4XHC",
         |                        "nonce" : "mUVTa9PR6eemybfYZBlR/i0kRTjuhYju1wAiGh/R3fV7VHLjcgyoBBB5tpFza0GYaMDjZPS5XU+h/GLJpAYOgFzR4DMsA5qiV2wXybGAvkss/5w52jpljP7MY0f98Nfx"
         |                    },
         |                    "townOrCity" : {
         |                        "value" : "VRnhquBl0IIrVBcAQa4JN0fvvsIqLCFxlw==",
         |                        "nonce" : "Mb6FCBjpL8eHLYzQjelzfUTMOpr9Vg11ZqESZzNr1If41wszl0GGE64W0eNUgftxc6KMLLOK5ub4H0WWnkIkTHGEMG6pYkvcZhqzs3KTWqzEzBN7qHnpagdhF5rqmj0V"
         |                    },
         |                    "stateOrRegion" : {
         |                        "value" : "A9bLCwKa8g0QTAldOznuMnHdDUdjBYb/oZQ=",
         |                        "nonce" : "mpJdAkgAEnvoaO6ZVkaGiXf0ZdQpTpu73FfVZXcKzuEidjbiMswrHcdZU8NbmVRsTH5vaTkyNBBP5xuVNlMh+sae6AvOL1SiaAhJqnau/aQn+UQUayf0b420t0K5O1D9"
         |                    },
         |                    "postCode" : {
         |                        "value" : "EHWWKFxUtBZeub77RMFoGWbbDOtr5L6Ow5AW",
         |                        "nonce" : "x+iYNiQqQO5BOaZdjral6Hk93b0oV19x0uCgqZmD7FjkMavq9A1ToOuIH5Zk+He1k7JA3SLroHESBraBfKQeSyToGtlSTLvQfPNOGKsg6tckQL3PECAgTXg2BAlA872z"
         |                    },
         |                    "country" : {
         |                        "code" : "FR",
         |                        "name" : "France"
         |                    }
         |                }
         |            }
         |        },
         |        {
         |            "country" : {
         |                "code" : {
         |                    "value" : "hphL0j+EzRvXiDrTjyvoN2L9",
         |                    "nonce" : "qc1cfxJJrbtCNluuNrbZwdQ5eHSMu6dnB5xpKBfMpGZFNB04gDItvOYn3co6Xgl9snGxmGDhIRgsoWt5GimbhH0N1ETW1pTqEJhCDiqFQ/MVcF+Gk1TZ54PDbL/GS9H2"
         |                },
         |                "name" : {
         |                    "value" : "JJ46XXn2dlBOjpH5W1a6wC9A1izkO9c=",
         |                    "nonce" : "pTMQwUsaWyZhUgmaD5T59UYCLONlG3nSkU80CiIpQL52+s0JMDQ3mzCcxlXEYqw2g6UkfYrXaZwVIFKC4cI0j119lNDHaabo8S2d38WUEhGVtXHLGDxnuoZaegNBhBun"
         |                }
         |            },
         |            "taxIdentifier" : {
         |                "identifierType" : {
         |                    "value" : "csp08prxgrL22lKc7fuGKVIA7t7C",
         |                    "nonce" : "PEdBKa2rWH1tDb5paxMpjfUMFREgsr4mW4uyAlo2Kxc/bZvSeLddKQket/3UcnW8Ob8JbV4Rzdq2nBAIpAB6iaeZoWjd1e2jeLXX2RPBPOwKEuMi5I2KY8+A5/WriC+e"
         |                },
         |                "value" : {
         |                    "value" : "mgcQlUQ1Z3zRX4ynCs4jFMTNBirBdYI=",
         |                    "nonce" : "4HMa25Gc+A3p8+h70TfhCGEU5untPo9Mav3XAMbCQOqZolOwhrsOFjv7Xx5KTOSgjJRdxiCbpe4BWilO1aWWDvVhcxia1JaQXgNlrOLaOwVyAN5c0jgAomNvt8eBi3Qt"
         |                }
         |            },
         |            "tradeDetails" : {
         |                "tradingName" : {
         |                    "value" : "Dat64val7UbKbUVzX3rR+xCXiuCo6/Cyojd0PII2W5kU",
         |                    "nonce" : "eU/r9AU45kC50rRvddFdmK6elYUZOiaDK2eScarL8c0b3da/tG+VROWA59XP+htUBW4Ef6r9rbOAiZ/XONYCnwkGMUdSojqk2hKUhg4/bmPh5KVfmY/MVtJTF/OSR+UX"
         |                },
         |                "address" : {
         |                    "line1" : {
         |                        "value" : "euUBlw4EYLBc79n7xOfJt7/O80Dlb33wzTNDMWp1",
         |                        "nonce" : "QY3mtdCEH+LGdPP7kN/6lWE+AuFd41AQ8cWYBiRcGwso90fwMfG+TWCe7quyR0FFjXRnOrr4ugMg7WmQyuukmVP/ltHBOpzLam8G8pHq9VqbJ1q6RjLoHIk6HmTX3GvQ"
         |                    },
         |                    "townOrCity" : {
         |                        "value" : "54g7oYop/yADM8R/aRf2BpS4mNtvcTGlzw==",
         |                        "nonce" : "20i0HoNJoBo/BY5W79aaxXOJNfDVAGgyQlIKhfV7frIqa+UnxW5cqtqYyk+/aEQdD5S5dUZgmjwuwyWAtz4VAaJy7GUWjlZUxbxBByZvw2YlqrztPRpKssIvcxp68slC"
         |                    },
         |                    "stateOrRegion" : {
         |                        "value" : "PazLzIylmOfIqsOaZjjTDiOjzWWDC+Bs5Pg=",
         |                        "nonce" : "23ba7yZvP5Fo4eRHD92GmFIGQU2rqEoUXm3o1aWKi7KFmuBAnqaBCPMM2c4HgmHKO/hcdZpbMt1mRvErJySMBIgxjPmbvWWFDVOEpUY6EmAKRDTtwRNkakJrAqPzYWrS"
         |                    },
         |                    "postCode" : {
         |                        "value" : "bVIWBK5hoEIzJ6/jGYvupdO7AhxS67A=",
         |                        "nonce" : "iQ+TX1gm36IlXObCuZkvVqTAl8FRpLcMfLuEbo2aNvMgHaaBpAuE8ovdBIxEO+e4lwrku7JIlQYY6a9LBeVcZvtFMR28uSFi2a3uql8btmrrCH8T+mSxHcvJPdb9Scp1"
         |                    },
         |                    "country" : {
         |                        "code" : "BE",
         |                        "name" : "Belgium"
         |                    }
         |                }
         |            }
         |        },
         |        {
         |            "country" : {
         |                "code" : {
         |                    "value" : "E7mDteuDwyj4hMUZawCziTqg",
         |                    "nonce" : "wQzRrUbEDU1PXEyCcoseCE0tSmBVg7WYKA5TrPdl5EW9hf7+yeLUoh5u4B+tnDBT0gcrhaYXKeT8HZ9CxIrshWHECGlTFYi23wpAhWILPbLeySto3IS5ZuvwjnkfX/Ku"
         |                },
         |                "name" : {
         |                    "value" : "yl7kAXMvQuASLBvT7T4DU+Ejgu7a08OK",
         |                    "nonce" : "aZ5xIAZtqLRqSXeXWtR1vqHhvzdeO4oykc7tArZHhCMmVoAbbVaaCSxqWglI/S1w58ptQeQCIpMqAsMrlW7gt3hdYRWEap/hjrfq4mUr77B62kcuk3XOKrsK6JC3syYS"
         |                }
         |            },
         |            "taxIdentifier" : {
         |                "identifierType" : {
         |                    "value" : "5oyUeOgnLrbtataetxU4+Ch8cw==",
         |                    "nonce" : "7MU6WDREe3eZwWzJVvCn0zO+mxFIxoqsh3xuhiZcnjhZfIgenvaRQq0VuRkYB+SjarGWJ1+91V2VJ3vM1iC7b2gSkPosQQlkGJHJUNwLA5cTsW4pM8cwF6NSC7p2HSqd"
         |                },
         |                "value" : {
         |                    "value" : "hOnSIfyl2D0Fswd0qeSYo3V9YRJjAdbSAoLF",
         |                    "nonce" : "yvSMirWDpSKaeEyth5gMylU0WZqNQOby4Y9Xtw7VKONWdGDe6E1LdokKUbdMbyMX+77OZyr6thwgQlQmmIXz8tWU+XOH3EOKiRhTi5zB+hT4bzUSt9LugbyojK6kyfca"
         |                }
         |            },
         |            "fixedEstablishment" : {
         |                "tradingName" : {
         |                    "value" : "PSlMhXokTROzh3denJBtajdZujuV5n8iIGQgjtRDiA==",
         |                    "nonce" : "Z5vxuZQ3Mv9hIObPf6YxRclGfCNhJQkn5tz/Oam/sT5dMmxq/W9TR0leUAsG6ySjMol2CD/AmDk+2Do55POzBntoLH1gPol/U+39PhD5S9xil//xCbPfrfsKOoBWl+8Z"
         |                },
         |                "address" : {
         |                    "line1" : {
         |                        "value" : "2DnNzeUYQkOYoLwcE+FGxq7YskGea4/uWrIvQiKz",
         |                        "nonce" : "UmXv3opO0M8UWIs89ta3Yjx8TjtgJz1RjheODfEvTdehfDAxxnSYdl13TFqZtSxNR2rOR7FaK2/K0wqlyjjyfM8cLMik/UNGBZhhFWxTMVXrh9chQ+sVHoOad47214h/"
         |                    },
         |                    "townOrCity" : {
         |                        "value" : "ryFvmpp+ej7LmPLfLsvp1qgW3tOj1GwzaA==",
         |                        "nonce" : "EErvQco0mGshI4JdxlsbbWSgzQPuaaZLQKnQ/x/Y/pOJ8pAlkhOVtHwsWg8lMBeo+7W71AEyJL8g3Wi0Ui/pC/MDGhvqSjmPCi/3KknWmsEVdrwve4/51as+YTWH9FGt"
         |                    },
         |                    "stateOrRegion" : {
         |                        "value" : "UNI4jHXfKstPLQY/QousBOuBdJJy3/MAJBg=",
         |                        "nonce" : "heJx5prxGp7GiDCKYqewC4RShr5rpb9vvD/nWRLC7s+i95MW8Adip4AG/lFV+ao7zs0esASHenYxI7iwvMQ5fSP3HQirzr2NYQfkDu3vQZnXPXWxKpXV934gGTfBFsP3"
         |                    },
         |                    "postCode" : {
         |                        "value" : "unevI1W9dNtVahSM7yKQaPVSOklhvvg=",
         |                        "nonce" : "p7uJuaK8kVAM6qUXoU0L49Jhtia6fj0bUbsUVyGRcO0f5YDpRTxFgio1N49obG0/kT879mYEW7NZoOz80LGkzdUR7sS63bILCREPiG5FlaJ+OJZ7UB7pwTPEvmSgKrBy"
         |                    },
         |                    "country" : {
         |                        "code" : "BG",
         |                        "name" : "Bulgaria"
         |                    }
         |                }
         |            }
         |        },
         |        {
         |            "country" : {
         |                "code" : {
         |                    "value" : "zdYSFzfgZKc7I2JB9jG4fwqp",
         |                    "nonce" : "MWrjhxYaVesecBjt5xTAbmoJjRW0nYNfbmOZmhZ5wT3Ni06qqq7fg5j/Kk0DPGNh1FtN6g0l2Lb1I2VfwHdekgoNp7wkfB8UBFU3tA80r4wV55GTu9wu0DMQIlvOvzr7"
         |                },
         |                "name" : {
         |                    "value" : "sYd9w0FYVrbBWOf+F5t+aTGqV76mmzb9hDquAXCb",
         |                    "nonce" : "5p/1MKJHmFDR/Svs5ewJWhC1chkz61RDQBwu21tNxY0r7FS8IIClb49t3A7Ek9hyzI3k931a4AUo5VODXxWw5W2gQEKaz+nab9YWJ70vCxLqUlZAsd1daH2d242Sx+GH"
         |                }
         |            },
         |            "vatNumber" : {
         |                "value" : "Jgw0rmUlDHy7BfUpx+MKbSlbSHDN5FSe4J7D",
         |                "nonce" : "0tor7mkw6djRUxohnkF3Bl/dGHgESRf5Yxig/bdgtm2dllpZMYeFydSce+k4i0kV+sAp4bLjXFUdgLFTkxmgFye94J+YKPWnaqueZAdKd2xfHhSSUhbZSN9c4qq155Fe"
         |            }
         |        }
         |    ],
         |    "contactDetails" : {
         |        "fullName" : {
         |            "value" : "sHjorf6lBC7cc+rmpKufkDrSefSx8hUhmw==",
         |            "nonce" : "I0pu1KhSM8PdE+Lpa3ESEZFgkpfi9QL3tjvnj69pkZ+jGJDAAjlhUJA4lRc6Y/a4FxtaDGHClIWoE5NaZzPlNEW/uQmZde/emOS5bOu77lEyqEJrZQnFHs82feh3NAi1"
         |        },
         |        "telephoneNumber" : {
         |            "value" : "LPdb7OjudJtmcxT4CHcXiLgCwUpKOL9p",
         |            "nonce" : "j/wwM9280wC9XGJjDy/2GCNZUn45cJo+ycso4K5HBI6wA57BdWyWUcX8HdW5El9D08uPWEtYuIXp8QbPUvno7IXCKx/PgXCAQyGHInyF1PV9jWM+QWEnDPj8K5o2HD5R"
         |        },
         |        "emailAddress" : {
         |            "value" : "6KQ7n+bHoQa2Mohs6JWRvdWC4YShSPykfysiQKA=",
         |            "nonce" : "ci1r3RX/C5qGYKXrbDTpuY4AwK6UsMF3+FWWmBkWzL50Gl7qGCXjwaB5k31Q40cMkqgA1GhErN+thdgUmMAZ9NLDovWtXFywrrd+rcVLMMj0QK+NI8izEPGz6/eFwvDr"
         |        }
         |    },
         |    "websites" : [],
         |    "commencementDate" : "2022-01-01",
         |    "previousRegistrations" : [],
         |    "bankDetails" : {
         |        "accountName" : {
         |            "value" : "6Izbx1Fqjn6e3xLTeAEFmQ40Kt8=",
         |            "nonce" : "ccPt13SqW+oocYOPGWMcVWSXC2cBgzSI6G4b4QbmtuSEAIxupnYxP2pLXT6ZtaF+tTCBqwoRyh0ZWW8M8YlbbOhLuyNkF2U9I4gqmRjfvITaWiHzKWgz/12MHOin4hBl"
         |        },
         |        "iban" : {
         |            "value" : "owCcgBWxUQXCvE3C85GHMZGMN37FXdQSSAUiFpmXtoJcWxfttCA=",
         |            "nonce" : "X7+XXVSn6YGFKlikik4CFNjULJbguIBKkGc9Z3Ti7yphxuLoKOO8iNfptcI9Z3UP6k0QtxaellrvwdwDPZ/1unlkkHOCx0Q0KKIcs2CwFCVhE8yV+BnArWPYA3taq2rI"
         |        }
         |    },
         |    "isOnlineMarketplace" : {
         |        "value" : "sZCzUnHMijRWeYjR/cl1aVw/HXFi",
         |        "nonce" : "etUvHgzpX1hPGfAETUgkE42oAZ90efb+flTo3X0YMIn2YXbUAKXASkinIifymlE/AK4aHRbFSUd1sq2hZkvVxXfxvOMcU9/XtMA6Ldqf9EdQvN9OhEZo/urKdlFb+cIe"
         |    },
         |    "niPresence" : "principalPlaceOfBusinessInNi",
         |    "submissionReceived" : "2023-05-30T11:07:38.271416Z",
         |    "lastUpdated" : "2023-05-30T11:07:38.271417Z",
         |    "dateOfFirstSale" : "2023-05-01"
         |}
         |""".stripMargin
    )
}

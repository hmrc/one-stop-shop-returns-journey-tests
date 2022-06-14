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

object ReturnsData {
  val data: List[String] =
    List(
      s"""
         |{
         |    "_id" : ObjectId("6182972956e55d310ac69a05"),
         |    "vrn" : "100000003",
         |    "period" : {
         |        "year" : 2021,
         |        "quarter" : "Q3"
         |    },
         |    "reference" : "XI/XI100000003/Q3.2021",
         |    "paymentReference" : "NI100000003Q321",
         |    "salesFromNi" : [
         |        {
         |            "countryOfConsumption" : {
         |                "code" : {
         |                    "value" : "Os36MrCHHxCWQEpN3lgrOwrZ",
         |                    "nonce" : "AmmaC5I6NAJnxcYDPmdcdvJ/qs6ny8Eb82n9LFfqMnzYbNeEDQRgJ2hMBWHwdLD2pCEwnbyGJelrco67ZS34iEEQ16Rq2xaP7g0OxuEeGoMCnuy2RBB5tktxDeBHN8ID"
         |                },
         |                "name" : {
         |                    "value" : "fAP3tKVnCaURV8gyLaBoLs1oHDDxkJU=",
         |                    "nonce" : "rZCYs3h77/qsWFNZdbe8FUaco8KXDKAyGsJ5xHTblgjPjjFZ9T2Epbb5EB7hxzTM586WVimQsPkCdyn88gYK0hhVTgDKUMz2gfYLwP+nm/W8dNKrPCwPDXF1HuiSbLle"
         |                }
         |            },
         |            "amounts" : [
         |                {
         |                    "vatRate" : {
         |                        "rate" : {
         |                            "value" : "Vr2zsunB8T8+9obtDvWTS/Td",
         |                            "nonce" : "FMbY0/Sn+ae6+V8z0g5xlaRLJJMl6S8V0ynisH0kylYtod0TU/N+GpfvSJrwwJjDvGfld4rxwqklPGwaevQZvxL2VG2ftqNqdETrUVr6t+f20o42vKUtG8F6OqLrfHao"
         |                        },
         |                        "rateType" : {
         |                            "value" : "RUCeU5EW8spQUhKFXWQXfKaMbPH/vA3t",
         |                            "nonce" : "Hohftq9mTtMWin4Pq9Z2BPT8SW8T5b7DOfOVwOMsHCBykOMTvhde/lHKL/ySlBQOID91P8zVrTl/PPHUMmh51VICvtucqEbDv00I+zsxdOUKxpqTNysEg0u4nBBAF3ln"
         |                        }
         |                    },
         |                    "netValueOfSales" : {
         |                        "value" : "FcSRJdjmliTgy6y7046TLHcM2ULAQw==",
         |                        "nonce" : "JLFIM8V2woP+zeqfjNsTyDYpxzQ8Ugo1tDl+EEJ9mvjsdIAV6s6Iudfg9+Ne75GVfENLSiEB0t7R7iOuoNnSMevCM+lPh7jr4H9eS7jF8VUvjH/fllJT230JHBcnOVeW"
         |                    },
         |                    "vatOnSales" : {
         |                        "choice" : {
         |                            "value" : "3N03glDIUa474WCgmCHmzM/BtPeCEk5F",
         |                            "nonce" : "5RDhh60i9adqs2j77Jlbr6teZkhp7Vcohnhc/JFIDg4R4ShcBCgQos2mooak7I6m5mbQYvTgLeoogJps9cYqQMolADyrHSxUHRbHOtyyfmiYjPkH2DLJHlk5FSZMyfXm"
         |                        },
         |                        "amount" : {
         |                            "value" : "gNijj5H1KO890UQxv44ZYDmYgoGHprkciA==",
         |                            "nonce" : "kyyE435ABMtBI8wiYGLpmMcrQ9wK1+02e+RrmN2Xod1Wqni9mjxBIJFXzPbLe72qPVKEmffpnLAmNHzKPgQNN9wvyoH/nlyBeKOg0QnBkZNv4xYTSZ4FsI5/C0gFZ6V0"
         |                        }
         |                    }
         |                }
         |            ]
         |        },
         |        {
         |            "countryOfConsumption" : {
         |                "code" : {
         |                    "value" : "jafhqzleWiFxbUMW6vDfkJ9P",
         |                    "nonce" : "i9w/Xs2rOwhIl0DZbmlsdZ4oCB9zuqLApYgsAxCupQ9AQVlwhCRS58HhvjXCe6f9YTL6253B9E43R5FvlAS9Z0Vc+Q9tCcjWL/be/0h7FgH668b8nWRsmfITXLDjcCGW"
         |                },
         |                "name" : {
         |                    "value" : "FhyxPxYU90Otdb0TWUMWIEdV0eIHqnPS",
         |                    "nonce" : "Lj+0vV+0FNc0GdEgFjOzdYkrwCb48lWLVk3obSLnwdo3vnfDDBZKHXF92BpuaQJjAz2L7dodhlQDvYHAVH0dNby13xyF5XqE7rC1Q4keaqGtUB5wcCkF7rQE9iBR0uvU"
         |                }
         |            },
         |            "amounts" : [
         |                {
         |                    "vatRate" : {
         |                        "rate" : {
         |                            "value" : "yX8Nchqc4Lqv8zaP37XPb4yF",
         |                            "nonce" : "Oazf+JghPZKn3YZ6k6Nu2ogcL2tLUyMs5EtwvK0QCs5ONJX+zFFOuyh/I6crx61oLewwcHB6g1PNjaEqCtySoFqwezoDVnxisYIbfKchukxP7hSiTeWdReeAtsHc9hCr"
         |                        },
         |                        "rateType" : {
         |                            "value" : "HDDap3VkBR96CXYkrPl5p+otOH4HRwpP",
         |                            "nonce" : "BCUDWU4RCKJNAGjCsIWhVGQ92hDazhlwShLlZCuMhQ/dpkbx7OviiZ/htQ1bYDJGkaSw5zPy8ghoWcIk0yM4MWO6LntJVaNyxY2pSaTbgm9SRGD9Dglf/7XkJ/ofQqTb"
         |                        }
         |                    },
         |                    "netValueOfSales" : {
         |                        "value" : "TW2G2DiCHcSP5Tkog0OlzBBpFErq4Q==",
         |                        "nonce" : "ZZBhxSRiXfRQG7YStrNBriDL/387a5iPoMT+8Lfc+Xdx20EwbXA2yNJ3DMsFUm6rMHScXTBkhQr0+NwPQEC2PysL9cRJ5nShUwwj4NYa1LRiOiPytkLB3T482qEJ5Ulq"
         |                    },
         |                    "vatOnSales" : {
         |                        "choice" : {
         |                            "value" : "gzblHP1K7VvQFenGV8PnHtvJ+HS5e8XF",
         |                            "nonce" : "wvZvKDasMAiMfwFb36B+ao/O9oFDhcYCxcmMUP3+bPde3pHTC62EqYCNHT6f8Z6Rn96laR0PwEA4sZg7y/SDeTWgNmax08b4mAP39g30Zhf1kaiE9xf6nRn9AhH97wbw"
         |                        },
         |                        "amount" : {
         |                            "value" : "CMzkTFtA9F/XfSbOnFjmEEOuF0BHEi3wUw==",
         |                            "nonce" : "tSXiAYqlByCJ3pwFfJDZiGn4AD64pD6v9W3hGljxr73+RTj9EQoPhTAwuBs5izDz85QaTb/Gqn7TwaC8m6VcMPuZO8wOThO81CqwdcV38RhnfSI1SX+QnRbQQ5bZXRgS"
         |                        }
         |                    }
         |                }
         |            ]
         |        }
         |    ],
         |    "salesFromEu" : [
         |        {
         |            "countryOfSale" : {
         |                "code" : {
         |                    "value" : "s3ClJ9ksr/xhKPf53XPxHglp",
         |                    "nonce" : "5VPhyZb6VDQ1SVUlzLi7hxSC32SLY422zZbM61LM/KkDCZ/P28tT9ifHr1htvYnmFK5qvIl2fiZc/abPFS+3G5lkkhgpA3VoDZLfKoMn/Q+tPDaOrARsudIjgMufBEQd"
         |                },
         |                "name" : {
         |                    "value" : "AWkWHFkh4e81iEqipcxVyIJD/Bk5Lz0=",
         |                    "nonce" : "9r/BuVX6H1sCBVUSx70mDhA4PYQar2/+LR22y4gsLHtqQXhPxYQfGTN8jUjWKMLBfERkpX0QjdKE/Hq0PF5aZFRayzQztyxlBsucdnweq7cO/wBwBDw4C7+3fYtgye5e"
         |                }
         |            },
         |            "sales" : [
         |                {
         |                    "countryOfConsumption" : {
         |                        "code" : {
         |                            "value" : "0OttWxm4yvxKsHZZN6r8oNlu",
         |                            "nonce" : "kTyvlDG6gpj7tUezxD6fPpmk1xBOt9ZGhPWllewt99BLvycq0Pkz8NV+LLCupz8ASPyD8BNOhdGX+LsP1+GTwq48buFZ0LHcxQe56qNRw3jq6zho7U7a6vLZuI2fE+d2"
         |                        },
         |                        "name" : {
         |                            "value" : "dMej8/YjWjjHduL/HKO4Hyw0YUrhTtUr",
         |                            "nonce" : "lHUs9TwEJY98Troq+b2wKgeUJ10z09i5fHKw+jd7Jd/S8pibfBCHkISf4SE4Znw1HYWVoq6FYR0WcGck7pftRtpEOjgypcpQhG8DH/NR/hhl22WxuP7SZsVpLu8v/Nxl"
         |                        }
         |                    },
         |                    "amounts" : [
         |                        {
         |                            "vatRate" : {
         |                                "rate" : {
         |                                    "value" : "lQvX4CvhspqKRi3/8j1iberF",
         |                                    "nonce" : "f70VGddRolOy46gF+s4cJgW1RtqUqO3diEVgiYIjk4b366vcYd+XS/HeVYJhH6+EpEX5U6Q/C++RFyLhiheFYKtPMup9AEMYhGTI9XFjb8cH/LgW6Pk0EX35ciNX3IJI"
         |                                },
         |                                "rateType" : {
         |                                    "value" : "EvGPP+CxbKe4/Jz6GGx3G1EXPfsklpZW",
         |                                    "nonce" : "DNO/xOU036toKSIYfBWm1+8XRMbuQreESuY54Ro53y2t2Wp8SRxN2RL8uIBdcDFNjmCta0zqsYCXsM8g+YqPL0PisLazhFQSebWueHILln7AQx2gfFFZ0ElT5yMEMuge"
         |                                }
         |                            },
         |                            "netValueOfSales" : {
         |                                "value" : "G4rl4lSz1jyfBqAUpMqCB0veKLhtiQ==",
         |                                "nonce" : "PzgQr/hU12DHhHCdm5/8JwRLoLTblzXugUIO7UMC4ozvrqqLNX1SmDZWFkqNw4MPB+H0gPG5/Zni+5IWV/AOZY1tadgZYovlvzv44+z+nuq9Y3Fc+Q0bgnu4OFUwKsAF"
         |                            },
         |                            "vatOnSales" : {
         |                                "choice" : {
         |                                    "value" : "EMjAbgHBwgKAp4H+fv5NBwgyuXEKaTGX",
         |                                    "nonce" : "caXdEUUS6EPffYPbHMbkgpdo5YVqBQHXSfWO3MKascrPhDXtg9/wnm6kXaez8ywVCpgSFexWAXFMUltCogkodAsxjFpw4bkHWqXTGVRuIsL53OA7uoxXA0uECcujWwp7"
         |                                },
         |                                "amount" : {
         |                                    "value" : "JHGBBxywudEzfWBdG39EGokKmcRadQ==",
         |                                    "nonce" : "bceXx55yAjZWLm9PVFA22WBaPQgqwwd8V+AHoEIx+FBXyO9KXF8vQf8OHNfWAEZAoq45SVGPe3E5jrnbzQm9BoQzbsERmiCbooCMZJaV6kOD4uULEElF7enm1bzk8UHn"
         |                                }
         |                            }
         |                        }
         |                    ]
         |                },
         |                {
         |                    "countryOfConsumption" : {
         |                        "code" : {
         |                            "value" : "io1fPXYtpJYFiCQmtoWoJueS",
         |                            "nonce" : "uBL4O57TqrlA4q4GzFWhT4ulRrxC5tSp88+OiXDTYLvHuPipkf6z49CSIoDcEsRbf5UOBgJLDOwv7kNLLCcqmFu1IIt/6MI20r4k74GglWeh/pLhLbWHNjy948AzKap6"
         |                        },
         |                        "name" : {
         |                            "value" : "JrU/dIZ2SqqI4mX6x6H3Lqdyl93D",
         |                            "nonce" : "UNowFZCkYKkgmUD240GbcX+ZPemx5MilvLN1gNS5upscR/pMqJ40J06/jPwB8KS9q7GuW1O3frSx7ACJemBrObnmrW/qTpyv8P6nQs4IBp08+/a/e7UDOlEGy4Lar19T"
         |                        }
         |                    },
         |                    "amounts" : [
         |                        {
         |                            "vatRate" : {
         |                                "rate" : {
         |                                    "value" : "29QXPk2L55qmz6H/EUqhFv9b",
         |                                    "nonce" : "fMAiTHqySCP96BwjIFiLpace/mqjtLHcWiqDiIspAFlEjvBdabrtEy3FhP5Tg4ClVqAzHUVz8K5uNmAyxP1cf0cNKfjptVtP78LBVq4cweli+XPFltWCaQEQLDYSwyLp"
         |                                },
         |                                "rateType" : {
         |                                    "value" : "t6AiY7ATgpuAha/rszFE8cfIKCGIyLLr",
         |                                    "nonce" : "YelCaA2VdKKmJzHb1FVmVl/QyUmdIKETCj5kpaf5MkKs7njOSz8QMrYR3M8w7Og/lwfw0CwQ6DLUV0LVMf8qssAhwks39Ya/YtybFJoRsiXqQ+CVMraS0aBoO02QuQ0H"
         |                                }
         |                            },
         |                            "netValueOfSales" : {
         |                                "value" : "QSqKEHCUiHtlXqmULw+nV00RaZty",
         |                                "nonce" : "Dto+TdSB1o6DZ98OFBSOMObFOCFh4BD3/ybmDLTSC6s+bRHwMmmZk5pwOf945MCFLSPEpDcwTDLBPsY/gkV8bwlV8zP5erObFBTELmKJkIRccmkJDnXKSsqOF1jZshLF"
         |                            },
         |                            "vatOnSales" : {
         |                                "choice" : {
         |                                    "value" : "KZYef8wWt3yqjA2KMPDo1btIZGJ0qQ6g",
         |                                    "nonce" : "P2YbHQRBLCvu5Jt7h5gBIyZxOGZbkoOHH9Hmw5RUvRKONvQLjBLj2Qb3aDi1FA0/l1dVIygfFdPuJYJqe9xlQgtetFkPxMKqyiDf4ryIcGOD6wSfQ+DG90Qip4NkubLq"
         |                                },
         |                                "amount" : {
         |                                    "value" : "q9Pm2041es1+XBsON4G/vgygVQVNXVM=",
         |                                    "nonce" : "dO7utSWL0JXjeFPgjh2unbalO4XIepY7njnLYvvkSspKl/MPVwQDAONeOjG0r32RyGgKXoj7rY0aJYAcoV2fFTgpHjb452Io2mzYYKjQ+Xd4tXlY6gtg2ZMOhdC3jo2u"
         |                                }
         |                            }
         |                        }
         |                    ]
         |                }
         |            ]
         |        },
         |        {
         |            "countryOfSale" : {
         |                "code" : {
         |                    "value" : "AnGQLMFNfhdFpCXPUknRlP0D",
         |                    "nonce" : "V241Z8pMbMyIOm/6b6PZN8Mz5k2KlDsasLzdMK9aC9ra9hCA+yiTisKihOqEe4FvmeQP+MdY04ts7X0d0H1pLhp+ByQ7vw4DfJ2VLcqXo4bGxwzpmRHgEmMFfVYE7lMy"
         |                },
         |                "name" : {
         |                    "value" : "UDVduutJJw33EnYl1npD0as3C+4+6iX6Nb0V74wW",
         |                    "nonce" : "vCX/m6rdiZiNbdKkUlG9Qz2rjeNXcMpL9zMbF+B7HLJbNPcWIh/rljiz4T2Apme5M7ZVJuP9gyICj81Gu0DU298TK57j6Ib22un6E7R6oZYS62jUwLhx88RGrkbUiioT"
         |                }
         |            },
         |            "sales" : [
         |                {
         |                    "countryOfConsumption" : {
         |                        "code" : {
         |                            "value" : "DFJgUiORl1a9jzTOjbkhRVUp",
         |                            "nonce" : "MbVBASegpG8iP7NvDQ1jIHu1Azy6IM+wEw8XI5X0uppogUrypadoVkZjdOJqK9Q29KJDGPUGVvEeo27jV6+nvUzrKnThqCcQsWIrW7S+yUMr+gxhaFfEy9FKVZBl9qXU"
         |                        },
         |                        "name" : {
         |                            "value" : "q1Br87ACZaZABu9hb4mx55jJkM41Yg==",
         |                            "nonce" : "VA7wNBkok96woi1MfA9ClWWDRORXBidrGPZf5pzaKWyjaBgGGI4cWRjvUkT10yN8sQ8fd0GI54Ltx3rV/YbAlqoK9up1wZjLGQS/NgA7W21Ilt4l+kf/zrkLR0Hj0gVL"
         |                        }
         |                    },
         |                    "amounts" : [
         |                        {
         |                            "vatRate" : {
         |                                "rate" : {
         |                                    "value" : "+f/g6UdGTfVBaHgYSG2sW51k",
         |                                    "nonce" : "pBlqtZKSuNgXxnOcpxXG4SzYqjIe2pPljXQZwq7oMeWC+WuRXERt8hZO9ai03QnkUQrMsAB4X8VnLWlAW4FYKMltghNL5oE2jROPmzH17vsEin/0E+oAM9KbMz/KLIoU"
         |                                },
         |                                "rateType" : {
         |                                    "value" : "NgBtMPp1bEHNZG97rctjOC65TSshVGYg",
         |                                    "nonce" : "rKN1RPsFl+izXaYkPVe7lBswNNgKu1J6wlct7Pl7OBwp1FvBEYbN/3/B+VvzxckDwt6bSnc6zUBfICc/OVcGaYDB3fftmtrR9SSDSBaBPg06aWk0n/tIU1/weNWwjX5F"
         |                                }
         |                            },
         |                            "netValueOfSales" : {
         |                                "value" : "b1qGZNeA0dbmskef5jFo/LW4c2M=",
         |                                "nonce" : "hDL+0RK+nGVVWJmyOio8O7ySlo51UYeZoyWVISZN5QdgTtIaQy2C01ClVQNUq6SHG+ZA5SZgEeMhnlf3eNJU92PfsKaFzMrjVQBlMs0OA4twVRfp9FifsEPp+suBpX6B"
         |                            },
         |                            "vatOnSales" : {
         |                                "choice" : {
         |                                    "value" : "lgwcJ6Yj2Ku2X3yoRdyxki1UqiKOTcq6",
         |                                    "nonce" : "XVCBzMjQvotCH004KiszBwtTSynoDyndvucNAUmKfjXAW5GoNR2b6F19qfgaBmYwOmmOS5zIo9BdPUr6MvrPzoWC2qedjLp1i06FUTFBckSHMBzEUEzEe0TxLxXEg72v"
         |                                },
         |                                "amount" : {
         |                                    "value" : "6BJPyZKtPSt5U4ZP2Lk3SEU+g6QAQw==",
         |                                    "nonce" : "3XOBvy9sb3tQm243J85+00Hd0n6e48AzyAxUqC2EjTDqCN7RFR3X2Sv9VQMIAWpExiUdW+/u8ck1hh6SvManZwMMEZwsT1WvFHX4CQwxp8Gi+3uJkxeOeMpXD+kDpUWy"
         |                                }
         |                            }
         |                        }
         |                    ]
         |                },
         |                {
         |                    "countryOfConsumption" : {
         |                        "code" : {
         |                            "value" : "S9fD5h9p+LYezZdaKIp3TCss",
         |                            "nonce" : "jTD8XKwcX8fmU2B6buL6yHa7uVOKevHHMoT7Rmb8oMsGq9bI9CpjAApCEt6Pa9wRYubsDISe8SwwlWCLAanEuG8qHQf21BOqzQ6NqMXdifuiQg6LyngTphD3MboCQ5RG"
         |                        },
         |                        "name" : {
         |                            "value" : "ePhYaIPYTV17e5k37apZs4NNio3w",
         |                            "nonce" : "RmbOIgJ+/Y7GbWTv/rwsKyDIS49mfg75PZSN9kk/TQV3W70Kl2eTXa/iVgI3fV1kEhhmvAGMLiTr2nlf07SYtfA3cU1qV4cdjaVQW1/inkFJDcDZ/4au4RHfXbCCcTgD"
         |                        }
         |                    },
         |                    "amounts" : [
         |                        {
         |                            "vatRate" : {
         |                                "rate" : {
         |                                    "value" : "D/fDa6wKTP8AM2UjaBtnnjZF",
         |                                    "nonce" : "uDWlpKR+NXYV7H80xk41jDtC3LsrG2GotXBNvZow7XT0O4eoWTYQ0XtaCO/ZZhHtgsvmRXAXDnUl7QSgQl8AcG9lZdZeCTGCWdBoBIcMkHUwpQCCh7/RzFc83JZu7nM+"
         |                                },
         |                                "rateType" : {
         |                                    "value" : "uCjopARZXTfbsdQpHgirinVcazeyFNGU",
         |                                    "nonce" : "CIox/CT3h+9rWPItnsPZ2Va8A0e3n0r2uONShhB+yozyeI99xQmvxITwmnLP9XnaBYtdljPxRbKquAsOmBPIZOAfTaPO4KrCEyHyZQb1Q6iee+g2i22CtrEqjh1W+uZP"
         |                                }
         |                            },
         |                            "netValueOfSales" : {
         |                                "value" : "GuOmXn4Dcm2N6/ZeAz/IvmB8rRW7TA==",
         |                                "nonce" : "/5v4bDG9dsX4w8GAq+/UPaWz+RNPcoCl2dmr5MUf/cf3SoVXOxBwoAW2hb5X15TDM9Ys3A6Rw5ySnqDU5usnotJbBjPcLUgsYcNBhrZxm2m8QY4i6o7vhgqRSB2MGzFB"
         |                            },
         |                            "vatOnSales" : {
         |                                "choice" : {
         |                                    "value" : "YZFyb6lbNIw1r7Qv4gmEOTBqqoBpTVQs",
         |                                    "nonce" : "yXPh9b8wwNjP6DZHyx2pYmhAFE43LqSfFwl3H7KHSyJLSwnjeIw7ltDe4VykeGN3P6/otm2ry+5nOfGyThEzHFk0V5TT9wKYy79sLXmbAtghats2MuZkC3FPt6k6s0/p"
         |                                },
         |                                "amount" : {
         |                                    "value" : "je/H2q9oxEsUzbgPGx26HYHnCgVItMSX",
         |                                    "nonce" : "Ra74k+waB8G5pVp9mSRCbdnJ+ZszhkinY9JoE+cm7up0u8sAMDa8jiJC4qou1XzAvcSmDJkD/zhhcM/LgPQ8jqZGeXUO7H3Kz6CDsm4b+Z58Fd49CyXj/kV9DMOuT3Y7"
         |                                }
         |                            }
         |                        }
         |                    ]
         |                }
         |            ]
         |        }
         |    ],
         |    "submissionReceived" : "2021-11-03T14:05:29.565Z",
         |    "lastUpdated" : "2021-11-03T14:05:29.565Z"
         |}""".stripMargin,
      s"""
          {
            "_id" : ObjectId("6182b7a156e55d310ac69a09"),
            "vrn" : "100000004",
            "period" : {
                "year" : 2021,
                "quarter" : "Q3"
            },
            "reference" : "XI/XI100000004/Q3.2021",
            "paymentReference" : "NI100000004Q321",
            "salesFromNi" : [
                {
                    "countryOfConsumption" : {
                        "code" : {
                            "value" : "fY1TJRNnukHnVEQCOUuwcqyp",
                            "nonce" : "1AcxLbklU1HatFozYkqG5xGnZt8h627cSMHCmtmxqe6qQuD05+1lK1sf4mNR8pLF0zd8by9k76RZv2iuo2YFhWcioLnHZCyfl6T4/frkHHoC2+gGXI1Z7gjg7gGwltVy"
                        },
                        "name" : {
                            "value" : "DgBt6YQAflgyBX6LXRSFBpmdE+vEljg=",
                            "nonce" : "sAfBvd8c8CPrnEjQukjYEDFRUECdCJysTNc15C+AUIT1WlrfBvrZ7XPVcP+vLisK4JBD/uTF7P6DPLDy8+zW7K6QCrRafJBJc0wDpzJ00U1XNK1/lGwCWolSx9H64I4X"
                        }
                    },
                    "amounts" : [
                        {
                            "vatRate" : {
                                "rate" : {
                                    "value" : "Ml7ky+rzNRI3+2832TEiUVo+",
                                    "nonce" : "2b4J06/ZY37IcLGFqoSIroRa6jJdYwR7zhN5qquHwZCyurmlu0nT6sQHzBpb9JqSrzJMsxYtvHCTFOguVB0vgLi9cv8W6I3cIFZQgNHKM2gTsQjS4L1CMZ3JArA7eBt6"
                                },
                                "rateType" : {
                                    "value" : "cL4PyfvQsnSTwOnjBIs51ASMO1ryd+oK",
                                    "nonce" : "GJFhHqsLluDLGORvRD4mPdIpn559v8vtoGIAvnO5/x2wNya5f5bNQJMqX53e6UAfxIv8oQIPYG0M+o3Ty9FYpHj6TFulKihbLM0FgGZbR/+IlvojKaAUmK06C62AGlcq"
                                }
                            },
                            "netValueOfSales" : {
                                "value" : "LBiSdHOH8YSskMinhzRQh5Xe3YJU4g==",
                                "nonce" : "tZiHBSYEosq+4FoNTo4pTL/mV0+5ZikOtHUSW/dRZaZ4LvVfieGRvjUppsVVSTozotUIO4v+yrqL+MsbEix2bzsWevQ/rR3NbEqkKZlYNfKT0UBn+4XKaL9WY11pWuv/"
                            },
                            "vatOnSales" : {
                                "choice" : {
                                    "value" : "iMsy32qNrF1jZaFGEaUR893TiDFbChO/",
                                    "nonce" : "Rhiz9i1uw+5YvfxwZmhCr9J9hakRkSiBy50PavXlTYXag8jAoXJvHPoTaTh1sYemHpHb4ZGtauggOL8zMq/TNg90/enIRuAkiDHBMRSRG/GQm0hO8HHRq7Va04JJjzjc"
                                },
                                "amount" : {
                                    "value" : "GX82EPxyxtsDK1vXZT5EEaoDKdTAeH3p",
                                    "nonce" : "XKLY2WzVjeUh4X7H7aNRL+E3JH9DuC6KaJYJ8RrlSJxLDGlEHD3v06zqc3cgxN1K9qWyvo9NucRNDqu0jwkShalnhGk3URywf11Sw2EGAY0AlY92qbq71jCghgSZx8Tb"
                                }
                            }
                        }
                    ]
                }
            ],
            "salesFromEu" : [
                {
                    "countryOfSale" : {
                        "code" : {
                            "value" : "iftNNo/2OlqzYWmJrzKHLoJJ",
                            "nonce" : "I/PVHXhgBer94bwEcOG9rXmkxos4vB04qg4G/9l7YmDDDtBbascMLC1lV+ucWkDFukU3mGNPWTdDZd3H7XTvGU1ggqFZj1NKPfp+Fe9K2u7JTe11H5QkTpSB8EZMCv1b"
                        },
                        "name" : {
                            "value" : "IbtBAW5QYBYp/Xquwj2Pq7e61R7E+Fo=",
                            "nonce" : "U0oQ7F7lre8MNkE4+CeexCxcuSB7qMbg6EP8bNGFV2LEOoU77WFHaTWwpFT5/3XHAgGMkNaF/2zdki/lnA6D/OO9uuE5UcYvznqAOobsBkRgEbiLw+3xR40cyEz5Rs7p"
                        }
                    },
                    "sales" : [
                        {
                            "countryOfConsumption" : {
                                "code" : {
                                    "value" : "7mnCQLtRLekzTTRDhiCsfHKY",
                                    "nonce" : "LTgAlMdEU4uRjv/Er3yBKj8COv4418EHljSiRrj94XEjafu2oJYJhhS+9gR0PW4Njf9kxw5yItX67EXxVSeNnM95zHow+89fiSKSEBUnvIe6ehAT1mtWuk7Kw4KuKK4T"
                                },
                                "name" : {
                                    "value" : "+z8ZzMda7FXpkfjhgvbXTHntnYBY0w==",
                                    "nonce" : "VUVfEuDEwHpmAzKmzxrzkruip5aggYg4qFscC3VIdDZhW+Nw/t/b7VMYp3C8szIjUhm0BBslt+cdbWeFXuNGeFB1cD3hu04tUkK3ci4UOxKWcFLzca9iNtk1C0tcBz43"
                                }
                            },
                            "amounts" : [
                                {
                                    "vatRate" : {
                                        "rate" : {
                                            "value" : "Wad2oIUoSyNTF7C00HD6qM2j",
                                            "nonce" : "+CUIZ2aPqF3Bj+zG4crovvRVN/tFF6NHdvGc1BODGbX2Ph097C4W7KffEH2jiLuXjbGaNgH5yf/8heb1XXSElDzLQP9cE0TXerMvz/qaWuRgUwS7EP+yXNbJDnLx20FB"
                                        },
                                        "rateType" : {
                                            "value" : "aae0ahkDoGTMCVjpLXmeJgA0TAXtRvea",
                                            "nonce" : "2KLpwGZsVMkIt6jHjPuvmjO6+v//LCnc73tu14+n49zJP0NVLSZ+FtTFXx1R1hjmtFOFYQmluUzuDA+RI70ealTSFTsK6l7mN2W1ZQrglFdfCa7mJF3sYQknmtKpvtnh"
                                        }
                                    },
                                    "netValueOfSales" : {
                                        "value" : "0GJMvbusLHspnJwwN843YrrDWtvQ",
                                        "nonce" : "Iwx2XQqtQXFa6UJNhgBYoRQookSvjVgiLA4L1p0W66kFb2yKsyjI703CbhWw9TLIlUwa4y7mD1E0g6TyqaDwGForLfn6uyr/0m4BstGNvAWw1NvUj680FD1cwvQLLbYm"
                                    },
                                    "vatOnSales" : {
                                        "choice" : {
                                            "value" : "Auhw6Cfasd2NzYy9s0wIC59Via7VAOO4",
                                            "nonce" : "bY3deMhmihFMjHMRYLilE8aZ98VMAItfiALuw+CVXqaSuITlqXvqnvuL3tiRbG0QznF/2lvbHF2CTc9ZOwTqA0gqNB7gCEDAAPoT9dAIuKHCJWpi4tuNrai0m3Hnnic7"
                                        },
                                        "amount" : {
                                            "value" : "5Cfbv55D2EEHQ149g9qABi3oe2fhPbEM",
                                            "nonce" : "EZamr8WfbnxCDyRdhT3WRhX5v8mGIltYsPWDIz9Yq55m4NjLNaVpR7eJboL34MG38Qn3LZLOl5pDfTQXkjvrRcYOha0vEqiwfEODJgxho6n6jMg9UzBhaliBZcZYyQVQ"
                                        }
                                    }
                                }
                            ]
                        }
                    ]
                }
            ],
            "submissionReceived" : "2021-11-03T16:24:01.552Z",
            "lastUpdated" : "2021-11-03T16:24:01.552Z"
        }""".stripMargin,
      s"""
          {
        "_id" : ObjectId("6182b82456e55d310ac69a0a"),
        "vrn" : "100000004",
        "period" : {
            "year" : 2021,
            "quarter" : "Q4"
        },
        "reference" : "XI/XI100000004/Q4.2021",
        "paymentReference" : "NI100000004Q421",
        "salesFromNi" : [
            {
                "countryOfConsumption" : {
                    "code" : {
                        "value" : "fKMZV5w+qHhedv67EpTBHyBx",
                        "nonce" : "7zwVlbqMX2/P/2QR0MSUld3AjfXihRBkxUGE9l4c2ev/wd5iDEcrJ3kJogX3/m1pLS1YFumPZHS8XrfCEZbgblx7Wp5EPLCzaGMs0KJWQMYKtX/sd7tR5CVVcfkiMgZo"
                    },
                    "name" : {
                        "value" : "DqnkIJmCpIknOneAhbOiRgiZc6EosTY=",
                        "nonce" : "dBMwn7ot3cIxym55fWUcRo6DvriTYPnQPFbwcImr1bx3hMPgOEvbeCemSeGvx/EY9ryntL+PYkteFFZyH7F6NImF4kCAFNvSjKP+AZDIHUyO4Hu1QEtzm1TZSnd88mUM"
                    }
                },
                "amounts" : [
                    {
                        "vatRate" : {
                            "rate" : {
                                "value" : "CfjFD0/G5XxITRoUDRRCtOVn",
                                "nonce" : "CcKNF6sK1qScNrVibgzxc4PWEujXABl2tHbzPdbE3FWESjAi3AyBOwZZFau/4T3WnXn5FwBMZ5iha+HYxSDtqcgZAsIXX6lFsZUXN1WT2jYoiEcJrZvwZBgvFfVdqz3W"
                            },
                            "rateType" : {
                                "value" : "eAxZRL0uaihoMA3bTKSP5OZl4xs9Q/sn",
                                "nonce" : "xMvY1Wm3Iz0eIQ25nZTC4yVLukQQWT1mLZMYUX3JeTT+noGBRhHU8vsfq/DUXx6tFOI/xzWUdxiFB09rZcrwZLFOZyiaoaKZXGr5VWXo58c2e/Tvnz999F1FSQsNVtq+"
                            }
                        },
                        "netValueOfSales" : {
                            "value" : "/vTPm59dYhSsuOPEYsxfDS/PYJ5J3w==",
                            "nonce" : "qaRqEhxifvUYnJKQQVKNYR+gTecOne1RKJLMA12O3B3eBYXEcUOYwchTjEofbAWEefQEmr9NFoWJVkBMba5vDP3BFH+auXgxoaFQMrdrKumS7ZwDuP1ZPWWaII2T5Q3r"
                        },
                        "vatOnSales" : {
                            "choice" : {
                                "value" : "Rom9MBpphbpiu3BLQuZA22Rt+7if5L7n",
                                "nonce" : "Ck8kiPuC4/szk7FlfQPZBsDKFN4rA8hSd6rnTDtna8liQgAknaWRVQbNcx9oPYdbAyCJxmSKFnTXaiQ87mAxB8M7+MJDhn1lk5PHb+1RhrlYVs4WjbXUWebSMAnXGYs5"
                            },
                            "amount" : {
                                "value" : "HH9Dgo+Iru+xeXKg/x1JT6eKv3knH3dP",
                                "nonce" : "6Cje/9bQ0MsGkIfODTPb94Q6BDiicINb7QAkaoVAXXwD4RwkZRxMglATV5GjLrh8XAeDgCXuzAnf31UxLDvMJYzOOISsrWOkDUIkvNx/xnFgUU7sl2LGP/MS4t634sc9"
                            }
                        }
                    }
                ]
            },
            {
                "countryOfConsumption" : {
                    "code" : {
                        "value" : "rtLqVWjs4cR1BAw569XD0Zfz",
                        "nonce" : "0MIsk5gDtFFBxDm2q71HVP4Eb3AduuumI8k49gb2NewYl5Le8XEQSm8bm4qDutOhEI28DGSnJCGyhDUhQkM7qg2DpLTT2rY650exMBBtxEpHCQMTZ+jMxl935CQaBeUS"
                    },
                    "name" : {
                        "value" : "ghVwPRo4+lsN94V+yy68p68lalFLqMTm",
                        "nonce" : "qkPhqNExHkQl8YPcWu/+hOxVL/j+wCLmfEoV96SQeHzx85yLtnG2mv0TT8J1SrGqCHS66YlcbJ0EcmYWweHFc5XtBIWd4kNTkH8Y+HDwrU8AyPb8tGOVkcuzWy2K8QOH"
                    }
                },
                "amounts" : [
                    {
                        "vatRate" : {
                            "rate" : {
                                "value" : "uoiyn/AhdP+2TKp9T0lCCS6U",
                                "nonce" : "iro6OaJNY+5zD6298onZ7Kabbexwu95n2RFCZHl2YGMYzz11ezzEbKgSJJorN85ez3ejdhmGpcRpOfZeVUTaUOtZ1/SDs8mxHM3GoJ209HgZXXHnoSxKOQzerfaFLE0y"
                            },
                            "rateType" : {
                                "value" : "HQvNJdtu5A1piQdwtGC3A/EneoHEDx1/",
                                "nonce" : "c65J/nv4AJm+yGWDrvZb9rN95MCOQmP1cFvvweJZPIXHUaauf/15V7v1XUY2N6kKbHlOcaai3ItdZzBvQfmhkkJFqkmc/71OJOj1qT3EUGPEMokc9989jHPtW9EIzVv+"
                            }
                        },
                        "netValueOfSales" : {
                            "value" : "wJEOGH+0RzOCs95Z/QEvIrsqL/h+ac5O",
                            "nonce" : "gKCyj+Ea640RbBrHO10l1TiLbLiqkxg8sLir9+YpHYUs0h1DO0koCM0G3y413AE7NvGvecXqM21rGDGIhz/XPPSfdhYt7gdgRNO0AIxA8YoHALp7TQVGrBIurem6hTOE"
                        },
                        "vatOnSales" : {
                            "choice" : {
                                "value" : "T3/kE4QlqpPt42lbZMj+KUViR84D/R9I",
                                "nonce" : "qmCAS0na7xTQ75zX2J0QqiuG6+zwYUxonyz7BANhcf1uaeaMNEqFIRFtgUO9d2+JMyOeaU7wzXcoO2uIS9pEQC2zdEcrC8NF/hQUV0CyXOA6gasFIs9EQ8kWDl6QH4Iu"
                            },
                            "amount" : {
                                "value" : "BC5WCYz/ZzLWo014qzyQQOUJXT3nh8io07s=",
                                "nonce" : "I0LeWGzdnWUKTbLo7TXSWg17Jdm5OcQP35HLCOFl70XOOUPqtGywjgxT2CuqPxT8j5YsN6lTJIE9Y0CJXGpUAQZiqPwwrrH+6HgyAkR9Zwtw+9y7RLZIRRrbgP//MqPJ"
                            }
                        }
                    }
                ]
            }
        ],
        "salesFromEu" : [],
        "submissionReceived" : "2021-11-03T16:26:12.570Z",
        "lastUpdated" : "2021-11-03T16:26:12.570Z"
    }""".stripMargin,
      s"""
      {
    "_id" : ObjectId("62a856b8f77d8050d38aaae9"),
    "vrn" : "100000006",
    "period" : {
        "year" : 2021,
        "quarter" : "Q3"
    },
    "reference" : "XI/XI100000006/Q3.2021",
    "paymentReference" : "NI100000006Q321",
    "salesFromNi" : [
        {
            "countryOfConsumption" : {
                "code" : {
                    "value" : "U8vBS2A1A2DA2ILusDgbzKWh",
                    "nonce" : "LuSDk60X3XeqZF+nSziYATCBPKZEzQKWgAUmMa3CvMNvEIMq8eXJ7U9OgSUgDkZvqwZTFY04vw4KpfYRQACqsVoyY/tsqnceLX5Uj7tERvMi1BgKXHNzhG2Jcbrh3tED"
                },
                "name" : {
                    "value" : "vHqhbaKa/q3siAdN7KTQReuTw+Oa6J4=",
                    "nonce" : "2/Ta8sIVrr9zgcpHIuFVjfl/ZHVSM7bd/GXlXOBbtbfJ7EMdT589BnBlrGt81OVrQ7ZN1GFZLrkiXVFw6ab1wjxeGiZ1cJyngwyhi1PcEQBoKenzZ0OuZWUppYuRQcsg"
                }
            },
            "amounts" : [
                {
                    "vatRate" : {
                        "rate" : {
                            "value" : "u+QpqWIj80Bajtsv4no/iV/+",
                            "nonce" : "U+esWykLSns057Q/OBtdPAXBF1zRWmujBerO4XNKQrBRIJF+z1pCdViuK/LeDGywKQX8lBTgRnf+jkOHW/I92lNO1cteWgXWTK2iAkscQpfHeUOHgMxVQM4bRY0zUcZ4"
                        },
                        "rateType" : {
                            "value" : "t24vNovx2YRP3xQ2KQ76LBbhZQ8SsVlX",
                            "nonce" : "xnl40YojvDzExNNDvZdTCTXHHZRRWh8KrgeShiF6MbpToLgGH+KgY2zYiN21PR4rC/5zwbt8gjDkOqAL00s0F7By4Od4UEAVsRZSW+vIlvTG+G87HbUHYW18PQkYEx0i"
                        }
                    },
                    "netValueOfSales" : {
                        "value" : "uwkuhPBABm4kCNrEgYJDpJjQ7sq3QgU=",
                        "nonce" : "uvGGhqFsPLRxvd261wg+jOKHipyQ7TrxpWxhm5gmAdjXvQih1+Y8Y/3CW4lalsoc/bCY/iPFAit+iFSBuZSEMawOTEZLPDuId6ZnYwYcbCgCt6jzwyiL4JcBs8ZA3G1W"
                    },
                    "vatOnSales" : {
                        "choice" : {
                            "value" : "KbA4ww/rSLbjMx4s4AkAXcCOrNk4XcsY",
                            "nonce" : "XRGI7NHgP5fCB2J7Re4v2IKBTeEIRyVwIObWnIi2Ge06qcjxP0tftAuFLYabcD2vLN+TM4mDGj6CxPkxoOW27pAUUN9IpnpuGmmRH61+3ZLky3ARIuRWNI9BmkRKwQyp"
                        },
                        "amount" : {
                            "value" : "V/emLuzaeBbQkGbt+D3qjDXAuEChvhul",
                            "nonce" : "cNkz0M7KjRd5vT+GHlNeIBrg2ylFsPYwA6auR5PC8TCFE7zGux4RYWgkxopYTSiWEJqxoUUG2GTBErExPnfez+JY/GnjHQjlDK0BR9qvqs1l7RZ5/4T/N6n7nR12+SZb"
                        }
                    }
                }
            ]
        }
    ],
    "salesFromEu" : [],
    "submissionReceived" : "2022-06-14T09:36:55.913Z",
    "lastUpdated" : "2022-06-14T09:36:55.913Z"
}""".stripMargin,
      s"""
      {
    "_id" : ObjectId("62a856d8f77d8050d38aaaea"),
    "vrn" : "100000006",
    "period" : {
        "year" : 2021,
        "quarter" : "Q4"
    },
    "reference" : "XI/XI100000006/Q4.2021",
    "paymentReference" : "NI100000006Q421",
    "salesFromNi" : [],
    "salesFromEu" : [
        {
            "countryOfSale" : {
                "code" : {
                    "value" : "mGhd7C5brcpOjDcYt/4h18/B",
                    "nonce" : "30dUxfiPWOWXk8cMBMmJAqrmmZuHPvLxmbwYee64RqYWd5YswaRkUrXr9g0I0b90iTn/uoWolN4pWqvH6I/HG9WpbusPxaSYWxQ++luv1q2N0HDuwJfM+ednqul5FArC"
                },
                "name" : {
                    "value" : "nES1Y0E/LIQvyfYo4KwrealOMw96mZIa",
                    "nonce" : "Ks+nPW8V+KGPP3rgi5UlL3huK6bvT50ysXynZGjVdpiUHMrDpjr/9wd57KY4rpNSOEj9dybZO37IF2p91OMSdrx9dphOFP4mBsphQYu/RMlrf2WmDQDvUwXrD9DK0evx"
                }
            },
            "sales" : [
                {
                    "countryOfConsumption" : {
                        "code" : {
                            "value" : "eHIzaRBMNOhxptJA5HXgWCnp",
                            "nonce" : "yu6/fsQw+ddNgBa4ca8ZqSV7ItNR6Vntal/cH8S/l9tXIyuVfPhycakaV3IbWdWF89mzh/A4gljqj6YR0YHz8z4JRMeXcYWoHlp080G4pFRU7RfgC02pwOriqmbD1j6j"
                        },
                        "name" : {
                            "value" : "CVskd0/rf7kw/Nbl2ADNaGauiF2MnzBicuRepZqj",
                            "nonce" : "5VhhKA1lnO9/CI2A3Bs2I0JbPCZdnqimJ9pwVrJOAz9iRjtR+NFIfd/yJy1W/MvSLLjmSK0yba1FhykAmJw0Iv6eMfpGFCR6piFPyWrc9ABFRWsncZZbI8Q66lAIrtCm"
                        }
                    },
                    "amounts" : [
                        {
                            "vatRate" : {
                                "rate" : {
                                    "value" : "NFHHZIYw9MvzTu0Peme25GVh",
                                    "nonce" : "BOghZUz4isTYLZFQ2c79IGLlq6zQM2+eVbx3KyNNFNm/Aw9OZ/HX8elq5+xAk3qYjyJz9skQCnDps6hEgfOOnWSwR8xUqPCcdWG88zIZ0ppadiYd/spYZy6ZvheDj2I2"
                                },
                                "rateType" : {
                                    "value" : "BQRLfG/b12PjxX8XZR4XoaZMeetxp2C4",
                                    "nonce" : "4mqlPBUu+sNkOFodDM8BnavpydZ6o31QEXd0x4iIPWPTtCj/w0VXUYUrNlpApq2QVspN2sc3eSitDnx/Aso2+ASm+0APrxUdYxu962bu3hSdFj9Q5zFjYKD0yEujpflX"
                                }
                            },
                            "netValueOfSales" : {
                                "value" : "EzlN8kgM2tlRBaJLBYebmsrIxIqb",
                                "nonce" : "OfYqjffo4sIFgRVIsyzv712Kv0CZl5Lhcw16BcxIoJqYpcQJBxOX8fdjmzsN5akaxKTnRTusdjVnhqBFFylpkiaxMolzaaTsqx7uxdIym1K0zgJfoMKnD2N9KQZ0hlZu"
                            },
                            "vatOnSales" : {
                                "choice" : {
                                    "value" : "qnu8kV9b51g3h1qw6UWBXwGvAnMaf1Gt",
                                    "nonce" : "cW9LHpkeHhX1+ZTxOf9/YuZCZ3QGtFJWlnpd+68bKALtfMI8nVCGYgx1sCvRTCZPzSel59Kx1JS7vukfh1R7n2m/w8lVV7c22kjhRxXmFQnqKHwF+FrK3BtSNQhJqGMS"
                                },
                                "amount" : {
                                    "value" : "e8VzXlLjzJ7+eSG0eIp5jCtFFfK3xEFt",
                                    "nonce" : "qUSw0RrM9AG6UTP/8MBPCZzUd1MpXp8GY2SQ/vpJbFAmOU4sk7zv6YUSX7GFwq+2z+Eb8kFD8As7SfLPv46Sml479Nl5aI5hUg84edx7x9j3r6iNnbABBGiNF+MJDOCb"
                                }
                            }
                        }
                    ]
                }
            ]
        }
    ],
    "submissionReceived" : "2022-06-14T09:37:28.169Z",
    "lastUpdated" : "2022-06-14T09:37:28.169Z"
}""".stripMargin,
      s"""
      {
    "_id" : ObjectId("62a8571bf77d8050d38aaaec"),
    "vrn" : "100000006",
    "period" : {
        "year" : 2022,
        "quarter" : "Q1"
    },
    "reference" : "XI/XI100000006/Q1.2022",
    "paymentReference" : "NI100000006Q122",
    "salesFromNi" : [],
    "salesFromEu" : [
        {
            "countryOfSale" : {
                "code" : {
                    "value" : "lr5oPMlPpB8tJgicihRQPjIm",
                    "nonce" : "ohsSBottKbgX2ghjTSB+osi68XG8OTDNPbUeakbPLNO5dzOYIMEOaXZZQF7Q3hUkaH6Ho/PcDlGOwAgi1qwWX5nNp+sh530lqCQdOySOusOX/jK3OflzfXaW+Sky7BiI"
                },
                "name" : {
                    "value" : "oloA6Nk1V6JiPUhpXpG8ExwXOHJJTAI=",
                    "nonce" : "l5TnsRfmnNUG9mXZ9Z9UdSPy4x63uv+ip29HlGyv8pC4l11NNO1pxxJ/BrxtHvqL9dAaV2FbTqd+uvZ4ww+mMqbeOOQYVcgJMPScFA5y+kxJz/CSMOfN4ZWFrMtCAPio"
                }
            },
            "sales" : [
                {
                    "countryOfConsumption" : {
                        "code" : {
                            "value" : "EB1k+L1D+kJax7eAYUgj6BNl",
                            "nonce" : "NptjEcOZw++K5o5UmBcy2rdUtuWAKWmUawNJn6Job683/i3KS7CL9mh1xBRsQmPHeJzOoOyLJNWBee967DlS54ZwzknycVWlk1kFnYNeDbVvWp8iypfuqeUNKqyCm1t7"
                        },
                        "name" : {
                            "value" : "2kI/XRpTTssdlzoe8kc0ZzGCj7B16Q==",
                            "nonce" : "YgTHvNuDYIK8iVwm+r65qIG5o88bPvMuV7EmiOE7A7EcnauK6rSljkmZAm5jHLPmneN0PhuJQU0MJC5gh/fUHhYjtbnXI5befhuvaWb/D39dwMdoS2kWaG9IcpUDH97K"
                        }
                    },
                    "amounts" : [
                        {
                            "vatRate" : {
                                "rate" : {
                                    "value" : "qDvMK7U9xgAcDJnbKyykP0HG",
                                    "nonce" : "cYixqmBeWUgHJNpemMtDEmMG/pCo9xUU50tbmE2EOWSIKcCB8WNDvdGw5er/ZBOZ/HyQs/Nuu7hnixo2h22mSzkwoMoa0ciB1EyiwYLjKoJVfm5JAaqvE2rbe3Q2QGKv"
                                },
                                "rateType" : {
                                    "value" : "U0yggkfWETSq3a9m6WQG2gKQOSfeVuw=",
                                    "nonce" : "O7BKy7oyTIUpO+DDk82rP27Y6Gz8GRsMV7ikSbB09LwMwjaZ8ZSnogGHjRL13W2oOtAfbpvkbCfHVMk2uKz9VMzmPskgT+jSywpfYDPqlJYiyYGHC4XB308sLqd7W6xQ"
                                }
                            },
                            "netValueOfSales" : {
                                "value" : "8OcoUEiiLfnmsPNfCq73uYfPr4C0",
                                "nonce" : "UH3xUJdslMsOL0hJQOaT1dXPpHvZf/Z1CE5ZhFlm6dZMTiHxOpiekCkcSgML+vG4BrsTg1ZIPAGFu6mEvc2EIuGb2fncxw7QpMwNNbXakLb8Iv9bYFBmuu0pCWJHWYEB"
                            },
                            "vatOnSales" : {
                                "choice" : {
                                    "value" : "NufeM8hZfaTRMWyrzI/x50Q5+IgSYkKe",
                                    "nonce" : "L+P6QCPXzEP6EhpHt4CbtmIr402+ib4jM7U6rWZmXQxL4G/gKUKeLROkgZ1ex3mrGPM7obnJeyW349REJNCWCFpkAzBoLZhIV8ASYi6tENNleqhHIPqTo2qodPorxZwV"
                                },
                                "amount" : {
                                    "value" : "Rtfuwyo375G/PQlbNSlfasooeypKchc=",
                                    "nonce" : "Wztp08ftCAkHNb90gXjGXM80ItxMCKbiMCMIEi9aKhgVDs3xIstONsBUATJpKFKgruWDodf/6aoEh+Pe7Y45h9gCT6P7sfsPrOGGYewlgu4pZsnsMpJvHd3Ilj8cmW7F"
                                }
                            }
                        }
                    ]
                }
            ]
        }
    ],
    "submissionReceived" : "2022-06-14T09:38:35.662Z",
    "lastUpdated" : "2022-06-14T09:38:35.662Z"
}""".stripMargin
    )
}

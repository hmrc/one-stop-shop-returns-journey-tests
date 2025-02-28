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
         |{
         |    "_id" : ObjectId("62a8610ef77d8050d38aaaee"),
         |    "vrn" : "444444444",
         |    "period" : {
         |        "year" : 2021,
         |        "quarter" : "Q3"
         |    },
         |    "reference" : "XI/XI444444444/Q3.2021",
         |    "paymentReference" : "NI444444444Q321",
         |    "salesFromNi" : [
         |        {
         |            "countryOfConsumption" : {
         |                "code" : {
         |                    "value" : "GgNV7zGT8oka/KQl0ElvGvFY",
         |                    "nonce" : "pSg1jL6t7ZV9cINgHHZ6Jwvzh+VFKB24vLnDlS8RqX6u9hkQ/y3YUd0mXrikrvtc84bCy6zW77t45EoBJQd2u0k+i90QWaEJT3Xn7R+OjPtd5lH9ruJwffn2w3Y9wbDP"
         |                },
         |                "name" : {
         |                    "value" : "hiPg5acmk3B3NTqVZ6o3jwvWRUjuZmc=",
         |                    "nonce" : "bH9wAymEvKYJTpJ3GluPvLyRlXRayjTbJEiy+iBwbcqpOyAg5/8NKOThnKGSnHGFH6BEziUMER7XBDM3gTNgRkuuvptldgvnnMrRYnekMSLo3uMhGYv10gbKRGX025xC"
         |                }
         |            },
         |            "amounts" : [
         |                {
         |                    "vatRate" : {
         |                        "rate" : {
         |                            "value" : "J9TzHZZrDgrWzGtjNOLsWij6",
         |                            "nonce" : "xyc6Xzyr/iMCxK6me/C960WfO55NgCHnLJRa5zggKGeIrD5dzKQUGcSlXSJuZfcXp9jYtZvdOIkuplz3O95QzPO5YDn7h8yNMkqnd+hhcYE76oHAGYpMVFRFj+G//Zb0"
         |                        },
         |                        "rateType" : {
         |                            "value" : "dG/KvBOrCdXJjCta72umz3PNVVt0PlgQ",
         |                            "nonce" : "2mgQyOzwIems8QE4Ed5zK9uLQTu4NYM8CQGvZNi9Q6XNr6C9zdmpYP+MJgqbq9B67SvB964ibLy6bIP44zgG8jhx0yzGzV+teQmXhGU9vJypBImXjttUs7a7KwSFsrSK"
         |                        }
         |                    },
         |                    "netValueOfSales" : {
         |                        "value" : "vAFntTnCeycNXbjctVke3Hf/HoE1",
         |                        "nonce" : "iiiR8fpd9CTdkbph8XJp+Zrf/YKlpe23H7bWrJF0L6lRhXgHSG62MWmN91pS6/X27OyJApWLKOqOgX0GbEJlnWhhPsvIebbuAcCWr6lLUertisxORp+dsBitvV07vodX"
         |                    },
         |                    "vatOnSales" : {
         |                        "choice" : {
         |                            "value" : "+DT8E5B7JD14pWlBjah88Jx1tLJfoOA+",
         |                            "nonce" : "JrKeCYQPXyzRlTEt364qTjmp9LIeSVaTaXWHNonzTBuUrqJIVQz2leg+F5KTLOjipbO65paCNy6piMCym1moLg1+e8NwSVCXSwQf+PZlf58jRMZr64JAdPWDWn34nl9I"
         |                        },
         |                        "amount" : {
         |                            "value" : "i7L8crJwcBE6sljDUK+RjsYyol8=",
         |                            "nonce" : "1tVHYXm4JpV0LQzf0+8PCx12q1Y9EgWydnM0H6a+e5RTdT6K0dTGTZeZA3Z4yS3QbKli3AIqq3RrdoAvCQrQSO6e4w1qeGoVBWxiuk2KGPOHS2EbHVHrdl6i0Cx2ewri"
         |                        }
         |                    }
         |                }
         |            ]
         |        }
         |    ],
         |    "salesFromEu" : [],
         |    "submissionReceived" : "2022-06-14T10:21:02.644Z",
         |    "lastUpdated" : "2022-06-14T10:21:02.644Z"
         |}
      """.stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("62a86137f77d8050d38aaaef"),
         |    "vrn" : "444444444",
         |    "period" : {
         |        "year" : 2021,
         |        "quarter" : "Q4"
         |    },
         |    "reference" : "XI/XI444444444/Q4.2021",
         |    "paymentReference" : "NI444444444Q421",
         |    "salesFromNi" : [],
         |    "salesFromEu" : [
         |        {
         |            "countryOfSale" : {
         |                "code" : {
         |                    "value" : "dehlGDzqpH/+Bb0QczvdWTeN",
         |                    "nonce" : "E6OqGM2sNQrxU68lRXWJL66jYK9udUP+LzD7Q/VFB/iUCORnF77kxWrh9LlxlWUZcRcQ95NBYLAiH/F6nq72twCZv9tZ2INKgTRw9NUsrCiFJ1IjpRJO2F7gpA8l5M/p"
         |                },
         |                "name" : {
         |                    "value" : "Tdt2F/wC47wICSj1jBAhIQ8WGllqpVc=",
         |                    "nonce" : "hJuGwv2QiacK2H277HNi7+Bjp+9g9+8PBfJXmxQGuLRCHC2D+no5hCIeVVeaSToJPVzG2oClz33+2044l1CEfk/jSLjhS2so4+ncElUIJYChcR64h82UV6AJ7ZIfeNj1"
         |                }
         |            },
         |            "sales" : [
         |                {
         |                    "countryOfConsumption" : {
         |                        "code" : {
         |                            "value" : "164e2HNA8Ykh1sKBTw5j/PA/",
         |                            "nonce" : "+YVCenzFNXHKxBOgqqC/cpENpv5em+4hgFMlpvqcSZUnEIM5Gtb8LURwnV9WdnrzDp1RQgAjbGU5A4njm/y7ssAO9xw1qMZYIHgIQQpTN3XMEKfXTCJF/8SREZs0TE52"
         |                        },
         |                        "name" : {
         |                            "value" : "RVgIr7rTdb05x49oKJUE6uRPAJZKUNTFNS13BmFORDqCyA==",
         |                            "nonce" : "aM0H3xW1aVJCjEDnS3gmkmPJ2QcpxS39i0bImxHi/3UdJXv6YMheCnzjfCYTPxKGrVz7IISC1lwQbgCjcLGPc2yM5POit2SWuV/0bgxD96fazFhDm/UXnev4YJ7w+I1N"
         |                        }
         |                    },
         |                    "amounts" : [
         |                        {
         |                            "vatRate" : {
         |                                "rate" : {
         |                                    "value" : "mT2LKRi0qEnidFCYEMFTI6d5",
         |                                    "nonce" : "4yGpxDqLmPe8LNjWGtQ0QZIbIs4w3Ph5G5sOhu7vcruyByp+uM0MttmF+DFX/eIfVOfDmPDqzYP89JEoEwiJIr4pznsDGVc7/Ec0dePghD5zf9oqVwgyaq77vwNBEUeD"
         |                                },
         |                                "rateType" : {
         |                                    "value" : "3mXqpjVIuc+1WuENHaiH/fTwSsXP4NXS",
         |                                    "nonce" : "oNbd+x52r0ozatBDN5533Vx3/Re7Pq01nufBlSYbPHPhOKw1iN81FhL//uAjHOKLcHefMqdd7iNMQ0Jix8OPJyz1NKRYXUXJ8TYQ/E2TW2KtsUjZEZGs7gr73ZpSPcSD"
         |                                }
         |                            },
         |                            "netValueOfSales" : {
         |                                "value" : "cL1bL1NndN5t7BYRGiBhvq4sfHg=",
         |                                "nonce" : "2tEl0i5mcadVFm2Bq6ePw+y1koXPaPyoMQbvQtZ0h4aFMG33gSH6Wqg1268R3mq9nFbHrsExABz+/r7TXJ3OfaWHEiHPG5FDjKrNpkmqULrGBs2sYjpbSUogpIbxgryy"
         |                            },
         |                            "vatOnSales" : {
         |                                "choice" : {
         |                                    "value" : "ROY9LKHAg7dsEM0iOx4LzfInnxaPMwYv",
         |                                    "nonce" : "ols7Z/VCYfML+ynjRPIOChN6Ok+Xwom0+GIkkDiuosdOcurLnQCo0Sg470UAYKrmyeGnqO/uA22diG66DM8/Hkt9tX3QaiohYVPUpc0iol1wf4d5i3TnbUj8rux9+wwh"
         |                                },
         |                                "amount" : {
         |                                    "value" : "8vg6ECM7qi8cmk/QYSsOq5azqYv0Gg==",
         |                                    "nonce" : "I/Goat7BZP8boC8FJixe+KWXF1TCzhZz/K1b5PapiJidND/xGUaPWT4/ClBZLswzUKP2gDc1Z3udFoqfRsTbkQTJrd6U0IzpYZqVwCgcnwZyEQj9X6N6VmTDXsbOhAt8"
         |                                }
         |                            }
         |                        }
         |                    ]
         |                }
         |            ]
         |        }
         |    ],
         |    "submissionReceived" : "2022-06-14T10:21:43.687Z",
         |    "lastUpdated" : "2022-06-14T10:21:43.687Z"
         |}
""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("65df516ed475f5033591497f"),
         |    "vrn" : "777777771",
         |    "period" : {
         |        "year" : 2022,
         |        "quarter" : "Q1"
         |    },
         |    "reference" : "XI/XI777777771/Q1.2022",
         |    "paymentReference" : "NI777777771Q122",
         |    "startDate" : "2022-01-01",
         |    "endDate" : "2022-03-31",
         |    "salesFromNi" : [
         |        {
         |            "countryOfConsumption" : {
         |                "code" : {
         |                    "value" : "5sgYsqt+JlVYTyFEYgq3dmO3",
         |                    "nonce" : "KTNuYBZkYHUKT51rMk72p0CzTgugaDbwOGx+TlHIdsGn4zB7iAsX0jcEM+rOkc7x+ohKQhBHBoQ0Rp+zKZ3cdtZFCz8AjcBOSN1laEfC/wsYtTe6ktVgv5znWJoBL2DR"
         |                },
         |                "name" : {
         |                    "value" : "yIbHL3V9YRJysFsjikaMLtX7D9SpSho=",
         |                    "nonce" : "rDwDo4v46j2+/6rJw9loGnc3j3SIfH1tclRS1t88z4lxdCrnUqUbz9aHMq7Id6asCjW8LA+Tof4pqdXQaYMMa3ORQ5/X99nkAnmZ286S2JQ+oI36ZE+UmqRJE8RPBROE"
         |                }
         |            },
         |            "amounts" : [
         |                {
         |                    "vatRate" : {
         |                        "rate" : {
         |                            "value" : "Lzg/LQ/7xr8/74KcMIbusqc0",
         |                            "nonce" : "NbVyHqp0ep1Xb/TH5noDkaw0xNp150GIob1lJ8/MCX3y4TCqRODfYKjWDuUjYmGx5VgcKaf6TYUOvqeK//I0lEIFImYrVEzJ+tND18CXWigNl+1Cw2AxLJck0sAJHC6p"
         |                        },
         |                        "rateType" : {
         |                            "value" : "JW5TX8Mv05pn33JRZnpt0beBRXov9Bx6",
         |                            "nonce" : "6ebvqB/g+GRz1Qce/ZolJxGDLOLk2Dto+EgbtoE71Lx1nfGXHik9d0eya11Oy7N17Rqltj3q7EAVy+GkVbKzOolFpOmDzqlz+9ntxMt08UlWE/O8m3dDxuGgtJipc8Jv"
         |                        }
         |                    },
         |                    "netValueOfSales" : {
         |                        "value" : "vrnYqLPv4nbXwa3U7b4pBM0DrmY=",
         |                        "nonce" : "dbxzw1Yv6ObU69epfTjcr+7raLQ33PA/PLdpltkDAbVePkHR1DZc3LJjq0+KeZBK9GO5LK3Lqdg5K5HArma0VvQXQpp0JDX08o2hP40K1ptE5s+/Af0GSfRRe+B0YZLx"
         |                    },
         |                    "vatOnSales" : {
         |                        "choice" : {
         |                            "value" : "9chOUl6zNFiaJYtSOpVk7FSAiulxPHlo",
         |                            "nonce" : "dJk9LhrcWzi/Qf4sNBqFmxngEwQC8pjIzNMSsLqyxXTXQnaMzdOlbUEm5tn7CIKwFfCqdOE23OxboyNcD5/wvtcchs/NsL6fUH/9qsFfca5RwJFG8QWXmHkScgj5hkYb"
         |                        },
         |                        "amount" : {
         |                            "value" : "jEhjYfUAZPtvv3bI+lnUH9JpIw==",
         |                            "nonce" : "X8OfVfgzDitIzyiPu9Ml/G0ADDsS8tWKc1td/2uEqrl53CNaTZwKpdboe++B/Poowmu6pXN+EwzWegZ5tFyPOZhU6J4S3O1euL+Fo/0fkzQfa1iK1rDt8RWQmLl19qbR"
         |                        }
         |                    }
         |                }
         |            ]
         |        }
         |    ],
         |    "salesFromEu" : [],
         |    "submissionReceived" : "2024-02-28T15:29:49.786024Z",
         |    "lastUpdated" : "2024-02-28T15:29:49.786025Z"
         |}
         |""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("663b92463ff4011296437213"),
         |    "vrn" : "600000017",
         |    "period" : {
         |        "year" : 2022,
         |        "quarter" : "Q1"
         |    },
         |    "reference" : "XI/XI600000017/Q1.2022",
         |    "paymentReference" : "NI600000017Q122",
         |    "startDate" : "2022-01-01",
         |    "endDate" : "2022-03-31",
         |    "salesFromNi" : [],
         |    "salesFromEu" : [],
         |    "submissionReceived" : "2024-05-08T14:55:02.349921Z",
         |    "lastUpdated" : "2024-05-08T14:55:02.349921Z"
         |}
         |""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("664b1393c247ad7d5113dd27"),
         |    "vrn" : "600000019",
         |    "period" : {
         |        "year" : 2024,
         |        "quarter" : "Q1"
         |    },
         |    "reference" : "XI/XI600000019/Q1.2024",
         |    "paymentReference" : "NI600000019Q124",
         |    "startDate" : "2024-01-01",
         |    "endDate" : "2024-03-31",
         |    "salesFromNi" : [],
         |    "salesFromEu" : [],
         |    "submissionReceived" : "2024-05-20T09:10:43.575816Z",
         |    "lastUpdated" : "2024-05-20T09:10:43.575816Z"
         |}
         |""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("664b2ccbc247ad7d5113dd28"),
         |    "vrn" : "600000021",
         |    "period" : {
         |        "year" : 2022,
         |        "quarter" : "Q1"
         |    },
         |    "reference" : "XI/XI600000021/Q1.2022",
         |    "paymentReference" : "NI600000021Q122",
         |    "startDate" : "2022-01-01",
         |    "endDate" : "2022-03-31",
         |    "salesFromNi" : [],
         |    "salesFromEu" : [],
         |    "submissionReceived" : "2024-05-20T10:58:19.440482Z",
         |    "lastUpdated" : "2024-05-20T10:58:19.440482Z"
         |}
         |""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("664b2cd6c247ad7d5113dd29"),
         |    "vrn" : "600000021",
         |    "period" : {
         |        "year" : 2022,
         |        "quarter" : "Q2"
         |    },
         |    "reference" : "XI/XI600000021/Q2.2022",
         |    "paymentReference" : "NI600000021Q222",
         |    "startDate" : "2022-04-01",
         |    "endDate" : "2022-06-30",
         |    "salesFromNi" : [],
         |    "salesFromEu" : [],
         |    "submissionReceived" : "2024-05-20T10:58:30.301295Z",
         |    "lastUpdated" : "2024-05-20T10:58:30.301295Z"
         |}
         |""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("664b3258c247ad7d5113dd2b"),
         |    "vrn" : "100000026",
         |    "period" : {
         |        "year" : 2024,
         |        "quarter" : "Q1"
         |    },
         |    "reference" : "XI/XI100000026/Q1.2024",
         |    "paymentReference" : "NI100000026Q124",
         |    "startDate" : "2024-01-01",
         |    "endDate" : "2024-03-31",
         |    "salesFromNi" : [],
         |    "salesFromEu" : [],
         |    "submissionReceived" : "2024-05-20T11:22:00.789076Z",
         |    "lastUpdated" : "2024-05-20T11:22:00.789076Z"
         |}
         |""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("668d4672f8ba07271a9969ff"),
         |    "vrn" : "600000003",
         |    "period" : {
         |        "year" : 2024,
         |        "quarter" : "Q1"
         |    },
         |    "reference" : "XI/XI600000003/Q1.2024",
         |    "paymentReference" : "NI600000003Q124",
         |    "startDate" : "2024-01-01",
         |    "endDate" : "2024-03-31",
         |    "salesFromNi" : [],
         |    "salesFromEu" : [],
         |    "submissionReceived" : "2024-07-09T14:17:22.201312Z",
         |    "lastUpdated" : "2024-07-09T14:17:22.201312Z"
         |}
         |""".stripMargin,
      s"""
         |{
         |    "_id" : ObjectId("668d49abf8ba07271a996a00"),
         |    "vrn" : "600000005",
         |    "period" : {
         |        "year" : 2024,
         |        "quarter" : "Q1"
         |    },
         |    "reference" : "XI/XI600000005/Q1.2024",
         |    "paymentReference" : "NI600000005Q124",
         |    "startDate" : "2024-01-01",
         |    "endDate" : "2024-03-31",
         |    "salesFromNi" : [],
         |    "salesFromEu" : [],
         |    "submissionReceived" : "2024-07-09T14:31:07.280207Z",
         |    "lastUpdated" : "2024-07-09T14:31:07.280207Z"
         |}
         |""".stripMargin,
      """
        |{
        |    "_id" : ObjectId("67a9d27067c0b05666027645"),
        |    "reference" : "XI/XI600151515/Q2.2023",
        |    "salesFromNi" : [],
        |    "lastUpdated" : "2025-02-10T10:18:24.748135Z",
        |    "paymentReference" : "NI600151515Q223",
        |    "vrn" : "600151515",
        |    "period" : {
        |        "year" : 2023,
        |        "quarter" : "Q2"
        |    },
        |    "endDate" : "2023-06-30",
        |    "salesFromEu" : [],
        |    "submissionReceived" : "2025-02-10T10:18:24.748135Z",
        |    "startDate" : "2023-04-01"
        |}
        |""".stripMargin,
      """
        |{
        |    "_id" : ObjectId("67a9d28467c0b05666027646"),
        |    "reference" : "XI/XI600151515/Q3.2023",
        |    "salesFromNi" : [
        |        {
        |            "countryOfConsumption" : {
        |                "code" : {
        |                    "value" : "THJTSL0qeiAIJ6eTdvLKhusk",
        |                    "nonce" : "mFOSfE/HUxOg3paWnlUMBL/sY0LyOZsw0xUL+2Gr0TeXlnIje/fj90M/EmAyGkxbWlcEC+ZV8iWDo7Tc5Zkn4YaJ+NZiKZq/mmOeBgN5dN5O5rCzUqd0BJKhmDwrF0Ce"
        |                },
        |                "name" : {
        |                    "value" : "i/Z9NjxihEtxewwACPRkKnMlxh60Xvo=",
        |                    "nonce" : "/O3VxR2jVYS/OojLtDwGTLjMvbawOdSMtqxXrsGS4foLAR+hSMKlBemsMARhBCz1KxheQurk0RzTJ0ebnvbNBl2LKisDYZgugL/Ak3uvsNHlRG6CeOdhPXkAZOnK8HfC"
        |                }
        |            },
        |            "amounts" : [
        |                {
        |                    "vatRate" : {
        |                        "rate" : {
        |                            "value" : "w5/6rkJBfXXvcu4qmnhjDFXI",
        |                            "nonce" : "bgho12SkBz+N8fZZUXUFAUrZ49r3L4GuYjWgb8aB7ZCJU49JXP9On2B6/KtmpNZivLr0fwk7MDZHqOOhQ+5GpVD2R5ZDmQVTQZ8O2UpR/emFCNP6Oew8GuZnrAHLJUhc"
        |                        },
        |                        "rateType" : {
        |                            "value" : "3+PRRZYFiw7Wc21FWlS/JXh9bOFEDZHZ",
        |                            "nonce" : "oX5ayXRGgjsZRlRjZoNrznLWaDgEYTxEobG6l/Cqh5ZIte/79/kAO6OWLwBtn6hceUDOakNugnxX90nvZyEpasJjVKHa6qP63+to8sLBK9+mibYZ+tLGkxJ7C02AtXzP"
        |                        }
        |                    },
        |                    "netValueOfSales" : {
        |                        "value" : "PpbowF4VbWBETpbGGVTzBsoDCw==",
        |                        "nonce" : "IHltq/Dhv3QclQh5CIUTOC1G0dy2Z1lhK53+WOglwj4BPBW/JeFyHzUfxxb5C1hPCunDEzSuWTG9q7UxR2dIO+AkUDzXoKJ0mUqH8GALVRg4q2kndymdsNzB325WGLIx"
        |                    },
        |                    "vatOnSales" : {
        |                        "choice" : {
        |                            "value" : "nf8q4pygHCctxIQ8t6AxgWsf7FNnFDF3",
        |                            "nonce" : "IvSVyOggRBDKBOW+WzxtrVRMlFGarIiUasQcOBi1bLaNXsHKWfs3fPkx/6gwjYNPDJ9zivz+NP+IK/yH8H3WWJQbCfi91Y2aIFd1hRHeFEHqeGpCuMeJCPp6oDeEIx1/"
        |                        },
        |                        "amount" : {
        |                            "value" : "KMf1GUtKJPRW3Ed5nF1/DCIP2A==",
        |                            "nonce" : "H3nAHETosyiKWe6+bo48yXCHxrAr+xg4l/T4JAMXWInfdzH2VWArf+wN0dc7f/TP0BoWJQk5DiqdMTA7fxoNGMkbxjYU35zb/WrB2PAQ3jJFXqoBsD0hqB+kMqxhDxa+"
        |                        }
        |                    }
        |                }
        |            ]
        |        }
        |    ],
        |    "lastUpdated" : "2025-02-10T10:18:44.710899Z",
        |    "paymentReference" : "NI600151515Q323",
        |    "vrn" : "600151515",
        |    "period" : {
        |        "year" : 2023,
        |        "quarter" : "Q3"
        |    },
        |    "endDate" : "2023-09-08",
        |    "salesFromEu" : [],
        |    "submissionReceived" : "2025-02-10T10:18:44.710898Z",
        |    "startDate" : "2023-07-01"
        |}
        |""".stripMargin,
      """
        |{
        |    "_id" : ObjectId("67a9e24c67c0b0566602764a"),
        |    "reference" : "XI/XI100000004/Q1.2022",
        |    "salesFromNi" : [
        |        {
        |            "countryOfConsumption" : {
        |                "code" : {
        |                    "value" : "m7g3sabKBgkxZrQkS/p/9eC9",
        |                    "nonce" : "5TX80k7FAtzoKo1Ot3exVNXt9OsQIReofxkOim8yFrlgcYACR6ogAl9EJb5iIWUQHiALu/IiBn5Rn5U9N5BxfZZNtKvKu4P60/P/nbQCJLMQwhszEw6noEsLToKKc4Pw"
        |                },
        |                "name" : {
        |                    "value" : "bKrcEuS1H/DI15MnKLPjMn3GfMJcXpY=",
        |                    "nonce" : "meQgjjEC7pEno460no+JgjHE7NSeF85K6RMmCVvc1q0N9wgiTFfWYDVZph00Rl8YSIeixhOqxdcOHIWsGhYtfZIa++KW6QPgA5H2TDIxF0aZ5y+US94WezxfnRFPQjO7"
        |                }
        |            },
        |            "amounts" : [
        |                {
        |                    "vatRate" : {
        |                        "rate" : {
        |                            "value" : "znyGcNoBbzyPJs5G36u/wws=",
        |                            "nonce" : "35TFo9tg1xpfahxiOUmAZ1t7aKY2Qb3FoamwVa7wZbV5pknme3DvC+3oR6xMZixrio0v6ix7OHIa1gCuip1XGAk9HSBlaUWb2mD63e8RQCQJgiaS+K3KmN+cPXsibk4v"
        |                        },
        |                        "rateType" : {
        |                            "value" : "IMxRozEs3H+p+ddK0eDF0uenwmEOTAs=",
        |                            "nonce" : "SNabns3rY/haxaE0rx6WgBJ4+gxQVcaLXM6d6+8Mw0RkKGIbUP+1NlxVxVhtIfSOOsWU7nYu6mDbGAIZCS5TQCUzhe09CHEiNSLcgmgGNjBtgZwFCq2VxDqm8SCYB5/h"
        |                        }
        |                    },
        |                    "netValueOfSales" : {
        |                        "value" : "AciDFO5JQwWZEPPlQI7r89Qg9Q==",
        |                        "nonce" : "1g/C/QZhTkvCHeTPQWikcrIA8/fl7Lx/cbNDUxp8tLo33bln9K9rLBIVc6nmAbDV7mYvfvZRe3KHhlz/pWAlQBpVG4LmhnWdWHuvHK1hu/Md9mEHMXRjcEJBceVCz4A9"
        |                    },
        |                    "vatOnSales" : {
        |                        "choice" : {
        |                            "value" : "sKyUjGB0oSlGfWtWDAPEqVtfm7OU8QO5",
        |                            "nonce" : "Y/r+L9DMvR3ZUfw7SwsfMVSC2iTYrZ1tCDZJeID0XuzCIwr1nLzzYtdwAGJjVB4O11bR68Y20eNvs1UHJ83qw55slIzGyOSGKAja8fzAxZUEKPcllkF4VgXW3fAcz6VT"
        |                        },
        |                        "amount" : {
        |                            "value" : "TA5ctw8xZgmjwhY1OpipjsjW",
        |                            "nonce" : "3r0G58RQbLUOjJSTNJV36Jh1znKbvHC2ahCXJIlKqJ8sIyO7AOiUKWtirKNn04Q5YFoH2kGDJ19g3Z5HtuSzElUozAgElNs4IwfDpz2SR2UjpsQ1yy93qhOMRVeoGlig"
        |                        }
        |                    }
        |                }
        |            ]
        |        }
        |    ],
        |    "lastUpdated" : "2025-02-10T11:26:04.351013Z",
        |    "paymentReference" : "NI100000004Q122",
        |    "vrn" : "100000004",
        |    "period" : {
        |        "year" : 2022,
        |        "quarter" : "Q1"
        |    },
        |    "endDate" : "2022-03-31",
        |    "salesFromEu" : [],
        |    "submissionReceived" : "2025-02-10T11:26:04.351013Z",
        |    "startDate" : "2022-01-01"
        |}
        |""".stripMargin,
      """
        |{
        |    "_id" : ObjectId("67a9e44f67c0b0566602764f"),
        |    "reference" : "XI/XI600001212/Q1.2022",
        |    "salesFromNi" : [],
        |    "lastUpdated" : "2025-02-10T11:34:39.053468Z",
        |    "paymentReference" : "NI600001212Q122",
        |    "vrn" : "600001212",
        |    "period" : {
        |        "year" : 2022,
        |        "quarter" : "Q1"
        |    },
        |    "endDate" : "2022-03-31",
        |    "salesFromEu" : [],
        |    "submissionReceived" : "2025-02-10T11:34:39.053468Z",
        |    "startDate" : "2022-01-01"
        |}
        |""".stripMargin,
      """
        |{
        |    "_id" : ObjectId("67a9e51c67c0b05666027650"),
        |    "reference" : "XI/XI100000077/Q2.2023",
        |    "salesFromNi" : [],
        |    "lastUpdated" : "2025-02-10T11:38:04.374535Z",
        |    "paymentReference" : "NI100000077Q223",
        |    "vrn" : "100000077",
        |    "period" : {
        |        "year" : 2023,
        |        "quarter" : "Q2"
        |    },
        |    "endDate" : "2023-06-30",
        |    "salesFromEu" : [
        |        {
        |            "countryOfSale" : {
        |                "code" : {
        |                    "value" : "I83+NbMmRuEyHsS7uL3dVOfT",
        |                    "nonce" : "daeOGaUXfuE3iCCdYZDS0zbgfKRyWpVPbc+EZZ4bLPlYijoT7l432f5drLGiE7sk1lF2zwLbGKwPqJP8mDBBx281jdbIbAOl3Ih+iG81RfO6J5NJ3JBc7SgP3bIIbDRB"
        |                },
        |                "name" : {
        |                    "value" : "jA3CMw7YbmF3pVezj5JZ/X1FyLmzoZRs",
        |                    "nonce" : "23APP/Za8Cvg7YzF6jixfwRchSFyFNJGG0lP5W/lMwjKY2jm3lZ4ZnL2kjsISeB7QLWF1g8jj1uZ+QCnIZ/+F7pxrZThShanffmDzOmZbWBXcKRUTvXTwRgtwsNuePp0"
        |                }
        |            },
        |            "sales" : [
        |                {
        |                    "countryOfConsumption" : {
        |                        "code" : {
        |                            "value" : "D8LhvZ3dyd6hnoaN+RWLeSHP",
        |                            "nonce" : "5Vb7GgmCZR6rQHfD+sU2dJfwO8vrP3rap+4SFuTjhUetC1g4vPtUVJYflJjWiLYUpcmJORX98RVl5E8QNIqKQHv5Q4rMP8tleH8O1ZOKsQ6BWrEiEyS8/BxChdYbJADy"
        |                        },
        |                        "name" : {
        |                            "value" : "6Ld62Mf4r0yzP41oBF+LICzm0EyhsQs=",
        |                            "nonce" : "8QojdH9xK/O7CzF3a2XdvrCct3tBdvmeNjXot25yy2MtZ8EUc3Q1tvBbjjb6joAAL+Km/5PmR8ly2J7oD/NatjAAVWCX8X525GtgwEyo5H/TiOizIHtbEtXHrAVIvmXd"
        |                        }
        |                    },
        |                    "amounts" : [
        |                        {
        |                            "vatRate" : {
        |                                "rate" : {
        |                                    "value" : "H/j2Qg9kJNNvepalxvLh7OcF",
        |                                    "nonce" : "ThCy3TceZYWRnKvczhxbVDy5U67E1k5ge/7LsLFqAmVWYesFgo6Eva4PK1pDmu4S7437BvYs7t227kltCQyp/+M4REkscaS7sXkIDri2Yz4L+hpxYHAy9bz17ReLmWvm"
        |                                },
        |                                "rateType" : {
        |                                    "value" : "FRkwvqAYAygNg/7yFBp1gxi2pmla7WND",
        |                                    "nonce" : "/DAi8Xe8dHH7E2AcJf9/534kx1ecIQHUifFIJigq+scRKzJ3lALfpvm6rl7gNGa3q4SeJHQucxHZ5X9H8tbneLHSzTICbs93IqAUjyBRJWT63f+9isk7xass8Pi0leu0"
        |                                }
        |                            },
        |                            "netValueOfSales" : {
        |                                "value" : "ZSTkd9n8ImgQbPw5xwmQh2S2588=",
        |                                "nonce" : "ib2TN34e6ydRTEf2FKWsGIaQPr/77BJSVgHQACuNGZRluhrZ0QjqujDOHozjNjqwxP+9J2LnAM69Y2tUDhURBTd2Zyyt+HC9DynlOyUkaJBqyGY2WlFT2RYFRrq0ppoL"
        |                            },
        |                            "vatOnSales" : {
        |                                "choice" : {
        |                                    "value" : "rY5zIaImTc5Y3TxZhCJD9GNdyzzQ5X3Z",
        |                                    "nonce" : "DrVsY8IAkKP/oRAJ1ivbLiK+qIpoz617Ku5OB/hxRE9IWUx06uoNsyfunz5+5QdAn5agPgXJV0gxc0QVRJtXEb+FtDBLvZOBfu7ecXAEJClGkHPyoPWZ1jKxVO+7S+Mz"
        |                                },
        |                                "amount" : {
        |                                    "value" : "s4prLYgCIaF6BjIgm/qfM6N6Erk=",
        |                                    "nonce" : "390baA9ywyOj8yOzS+2pxpR6jISaRJXOdVFoWCQR3QlY5W+yscEb1AObxyU4SGCj/4GXTi5jNMaOLtkd5VVSAh+isC36+IXWEr3NlXyDNWyovu+mgTVqjEqbgriaorz6"
        |                                }
        |                            }
        |                        }
        |                    ]
        |                }
        |            ]
        |        }
        |    ],
        |    "submissionReceived" : "2025-02-10T11:38:04.374535Z",
        |    "startDate" : "2023-06-09"
        |}
        |""".stripMargin,
      """
        |{
        |    "_id" : ObjectId("67a9e8d267c0b05666027653"),
        |    "reference" : "XI/XI600001515/Q2.2023",
        |    "salesFromNi" : [],
        |    "lastUpdated" : "2025-02-10T11:53:54.310829Z",
        |    "paymentReference" : "NI600001515Q223",
        |    "vrn" : "600001515",
        |    "period" : {
        |        "year" : 2023,
        |        "quarter" : "Q2"
        |    },
        |    "endDate" : "2023-06-30",
        |    "salesFromEu" : [],
        |    "submissionReceived" : "2025-02-10T11:53:54.310828Z",
        |    "startDate" : "2023-04-01"
        |}
        |""".stripMargin
    )
}

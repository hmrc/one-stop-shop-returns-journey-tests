@Integration

#  This feature is to be used for integration testing of sending existing returns to Core for Release 5.3
#  It is not to be included in the main journey tests, hence the separate tagging

#  The VRNs will need to be added to the scenarios for each run, once they have been decided
#  The VRNs will also need to be added to the registration database, via the test-only endpoint
#  This can be accessed in Postman locally or via the curl microservice job for QA

#  This is to be ran with script run_integration_QA.sh and is intended to run on QA but can be tested locally

Feature: Integration Test Feature for Sending Existing Returns to Core

  Scenario Outline: A user completes a small first return
    Given the user navigates to the auth page
    And the user signs in as an Organisation Admin with VAT enrolment <vrn> and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Spain on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user ticks the second checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    And the user enters first EU country total sales of 75000 for second selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

    Examples:
      | vrn       |
      | 555555205 |
      | 555555206 |
      | 555555207 |
      | 555555208 |
      | 555555209 |
      | 555555210 |
      | 555555211 |
      | 555555212 |
      | 555555213 |
      | 555555214 |
      | 555555225 |
      | 555555226 |
      | 555555227 |
      | 555555228 |
      | 555555229 |
      | 555555230 |
      | 555555231 |
      | 555555232 |
      | 555555233 |
      | 555555234 |
      | 555555251 |
      | 555555252 |
      | 555555253 |
      | 555555254 |
      | 555555255 |
      | 555555256 |
      | 555555257 |
      | 555555258 |
      | 555555259 |
      | 555555270 |
      | 555555271 |
      | 555555272 |
      | 555555273 |
      | 555555274 |
      | 555555275 |
      | 555555276 |
      | 555555277 |
      | 555555278 |
      | 555555279 |
      | 555555295 |
      | 555555296 |
      | 555555297 |
      | 555555298 |
      | 555555299 |


#     add vrns here


  Scenario Outline: A user completes a large first return
    Given the user navigates to the auth page
    And the user signs in as an Organisation Admin with VAT enrolment <vrn> and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Spain on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user ticks the second checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user enters a different amount of VAT totalling 12345 for the first EU country and the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    And the user enters first EU country total sales of 800000 for second selected VAT rate on the eu-sales-from-northern-ireland page
    And the user enters a different amount of VAT totalling 147852 for the first EU country and the second selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers yes on the sales-from-eu page
    And the user selects Spain on the first eu-country-sold-from page
    And the user selects Bulgaria on the first eu-country-sold-to/1 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/1 page
    And the user ticks the second checkbox on the first eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 350000 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 71234 for the first EU country and the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters first EU country total sales of 900000 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 90099 for the first EU country and the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-eu-to-eu/1 page
    And the user selects Finland on the second eu-country-sold-to/1 page
    And the user ticks the first checkbox on the second eu-vat-rates-from-eu/1 page
    And the user ticks the second checkbox on the second eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 15200 for the second EU country and the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters second EU country total sales of 250000 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 20999 for the second EU country and the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Slovakia on the second eu-country-sold-from page
    And the user selects Poland on the first eu-country-sold-to/2 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/2 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/2 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/2 page
    Then the user is on the check-sales-from-eu/2/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/2 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Croatia on the third eu-country-sold-from page
    And the user selects Portugal on the first eu-country-sold-to/3 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/3 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/3 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/3 page
    Then the user is on the check-sales-from-eu/3/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/3 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Republic of Cyprus on the fourth eu-country-sold-from page
    And the user selects Netherlands on the first eu-country-sold-to/4 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/4 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/4 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/4 page
    Then the user is on the check-sales-from-eu/4/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/4 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Malta on the fifth eu-country-sold-from page
    And the user selects Romania on the first eu-country-sold-to/5 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/5 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/5 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/5 page
    Then the user is on the check-sales-from-eu/5/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/5 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

    Examples:
      | vrn       |
      | 555555215 |
      | 555555216 |
      | 555555217 |
      | 555555218 |
      | 555555219 |
      | 555555220 |
      | 555555221 |
      | 555555222 |
      | 555555223 |
      | 555555224 |
      | 555555235 |
      | 555555236 |
      | 555555237 |
      | 555555238 |
      | 555555239 |
      | 555555245 |
      | 555555246 |
      | 555555247 |
      | 555555248 |
      | 555555249 |
      | 555555250 |
      | 555555260 |
      | 555555261 |
      | 555555262 |
      | 555555263 |
      | 555555264 |
      | 555555265 |
      | 555555266 |
      | 555555267 |
      | 555555268 |
      | 555555269 |
      | 555555280 |
      | 555555281 |
      | 555555282 |
      | 555555283 |
      | 555555284 |
      | 555555285 |
      | 555555286 |
      | 555555287 |
      | 555555288 |
      | 555555289 |

#     add vrns here

  Scenario Outline: A user completes a nil first return
    Given the user navigates to the auth page
    And the user signs in as an Organisation Admin with VAT enrolment <vrn> and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

    Examples:
      | vrn       |
      | 555555215 |
      | 555555216 |
      | 555555217 |
      | 555555218 |
      | 555555219 |
      | 555555220 |
      | 555555221 |
      | 555555222 |
      | 555555223 |
      | 555555224 |
      | 555555235 |
      | 555555236 |
      | 555555237 |
      | 555555238 |
      | 555555239 |
      | 555555245 |
      | 555555246 |
      | 555555247 |
      | 555555248 |
      | 555555249 |
      | 555555250 |
      | 555555260 |
      | 555555261 |
      | 555555262 |
      | 555555263 |
      | 555555264 |
      | 555555265 |
      | 555555266 |
      | 555555267 |
      | 555555268 |
      | 555555269 |
      | 555555280 |
      | 555555281 |
      | 555555282 |
      | 555555283 |
      | 555555284 |
      | 555555285 |
      | 555555286 |
      | 555555287 |
      | 555555288 |
      | 555555289 |


#     add vrns here


#  This scenario can be ran for a VRN that has been through the small return or the large return scenario
  Scenario Outline: A user completes a nil second return with corrections for the previous period
    Given the user navigates to the auth page
    And the user signs in as an Organisation Admin with VAT enrolment <vrn> and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Spain for the first period on the correction-country page
    And the user adds the first declared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers yes on the vat-correction-list/1 page
    And the user selects the second country as Austria for the first period on the correction-country page
    And the user answers yes on the add-new-country/1/2 page
    And the user adds the second undeclared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/2 page
    And the user is on the vat-payable-check/1/2 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user submits their return

    Examples:
      | vrn       |
      | 555555215 |
      | 555555216 |
      | 555555217 |
      | 555555218 |
      | 555555219 |
      | 555555220 |
      | 555555221 |
      | 555555222 |
      | 555555223 |
      | 555555224 |
      | 555555235 |
      | 555555236 |
      | 555555237 |
      | 555555238 |
      | 555555239 |
      | 555555245 |
      | 555555246 |
      | 555555247 |
      | 555555248 |
      | 555555249 |
      | 555555250 |
      | 555555260 |
      | 555555261 |
      | 555555262 |
      | 555555263 |
      | 555555264 |
      | 555555265 |
      | 555555266 |
      | 555555267 |
      | 555555268 |
      | 555555269 |
      | 555555280 |
      | 555555281 |
      | 555555282 |
      | 555555283 |
      | 555555284 |
      | 555555285 |
      | 555555286 |
      | 555555287 |
      | 555555288 |
      | 555555289 |


#     add vrns here

  Scenario Outline: A user completes a large second return with corrections
    Given the user navigates to the auth page
    And the user signs in as an Organisation Admin with VAT enrolment <vrn> and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Spain on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user ticks the second checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user enters a different amount of VAT totalling 12345 for the first EU country and the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    And the user enters first EU country total sales of 800000 for second selected VAT rate on the eu-sales-from-northern-ireland page
    And the user enters a different amount of VAT totalling 147852 for the first EU country and the second selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers yes on the sales-from-eu page
    And the user selects Spain on the first eu-country-sold-from page
    And the user selects Bulgaria on the first eu-country-sold-to/1 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/1 page
    And the user ticks the second checkbox on the first eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 350000 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 71234 for the first EU country and the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters first EU country total sales of 900000 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 90099 for the first EU country and the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-eu-to-eu/1 page
    And the user selects Finland on the second eu-country-sold-to/1 page
    And the user ticks the first checkbox on the second eu-vat-rates-from-eu/1 page
    And the user ticks the second checkbox on the second eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 15200 for the second EU country and the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters second EU country total sales of 250000 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 20999 for the second EU country and the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Slovakia on the second eu-country-sold-from page
    And the user selects Poland on the first eu-country-sold-to/2 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/2 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/2 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/2 page
    Then the user is on the check-sales-from-eu/2/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/2 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Croatia on the third eu-country-sold-from page
    And the user selects Portugal on the first eu-country-sold-to/3 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/3 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/3 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/3 page
    Then the user is on the check-sales-from-eu/3/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/3 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Republic of Cyprus on the fourth eu-country-sold-from page
    And the user selects Netherlands on the first eu-country-sold-to/4 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/4 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/4 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/4 page
    Then the user is on the check-sales-from-eu/4/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/4 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Malta on the fifth eu-country-sold-from page
    And the user selects Romania on the first eu-country-sold-to/5 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/5 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/5 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/5 page
    Then the user is on the check-sales-from-eu/5/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/5 page
    And the user answers no on the add-sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Spain for the first period on the correction-country page
    And the user adds the first declared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers yes on the vat-correction-list/1 page
    And the user selects the second country as Austria for the first period on the correction-country page
    And the user answers yes on the add-new-country/1/2 page
    And the user adds the second undeclared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/2 page
    And the user is on the vat-payable-check/1/2 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user submits their return

    Examples:
      | vrn       |
      | 555555205 |
      | 555555206 |
      | 555555207 |
      | 555555208 |
      | 555555209 |
      | 555555210 |
      | 555555211 |
      | 555555212 |
      | 555555213 |
      | 555555214 |
      | 555555225 |
      | 555555226 |
      | 555555227 |
      | 555555228 |
      | 555555229 |
      | 555555230 |
      | 555555231 |
      | 555555232 |
      | 555555233 |
      | 555555234 |
      | 555555251 |
      | 555555252 |
      | 555555253 |
      | 555555254 |
      | 555555255 |
      | 555555256 |
      | 555555257 |
      | 555555258 |
      | 555555259 |
      | 555555270 |
      | 555555271 |
      | 555555272 |
      | 555555273 |
      | 555555274 |
      | 555555275 |
      | 555555276 |
      | 555555277 |
      | 555555278 |
      | 555555279 |
      | 555555295 |
      | 555555296 |
      | 555555297 |
      | 555555298 |
      | 555555299 |

#     add vrns here

  Scenario Outline: A user completes a small second return with no corrections
    Given the user navigates to the auth page
    And the user signs in as an Organisation Admin with VAT enrolment <vrn> and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Spain on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user ticks the second checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    And the user enters first EU country total sales of 75000 for second selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers no on the correct-previous-return page
    Then the user is on the check-your-answers page
    Then the user submits their return

    Examples:
      | vrn       |
      | 555555215 |
      | 555555216 |
      | 555555217 |
      | 555555218 |
      | 555555219 |
      | 555555220 |
      | 555555221 |
      | 555555222 |
      | 555555223 |
      | 555555224 |
      | 555555235 |
      | 555555236 |
      | 555555237 |
      | 555555238 |
      | 555555239 |
      | 555555245 |
      | 555555246 |
      | 555555247 |
      | 555555248 |
      | 555555249 |
      | 555555250 |
      | 555555260 |
      | 555555261 |
      | 555555262 |
      | 555555263 |
      | 555555264 |
      | 555555265 |
      | 555555266 |
      | 555555267 |
      | 555555268 |
      | 555555269 |
      | 555555280 |
      | 555555281 |
      | 555555282 |
      | 555555283 |
      | 555555284 |
      | 555555285 |
      | 555555286 |
      | 555555287 |
      | 555555288 |
      | 555555289 |


#     add vrns here


@Returns

Feature: Check Your Answers Feature

  Scenario: A user follows a basic journey and amends NI answers using Check Your Answers functionality
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user is on the check-your-answers page
    Then the user selects the change link for check-sales-from-northern-ireland
    And the user answers yes on the check-sales-from-northern-ireland page
    And the user selects Denmark on the first check-eu-country-from-northern-ireland page
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the check-eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the check-vat-on-sales-from-northern-ireland page
    Then the user clicks continue on the first change-check-sales-from-northern-ireland page
    And the user answers no on the check-add-sales-from-northern-ireland page
    Then the user is on the check-your-answers page
    Then the user clicks change for NI sales excluding VAT
    And the user answers yes on the check-add-sales-from-northern-ireland page
    And the user selects Poland on the second check-eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the second check-eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters second EU country total sales of 500000 for first selected VAT rate on the check-eu-sales-from-northern-ireland page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the check-vat-on-sales-from-northern-ireland page
    Then the user clicks continue on the second change-check-sales-from-northern-ireland page
    And the user answers no on the check-add-sales-from-northern-ireland page
    Then the user is on the check-your-answers page
    Then the user clicks change for NI VAT charged
    And the user answers no on the check-add-sales-from-northern-ireland page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user follows a basic journey and amends EU answers using Check Your Answers functionality
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user is on the check-your-answers page
    Then the user selects the change link for check-sales-from-eu
    And the user answers yes on the check-sales-from-eu page
    And the user selects Lithuania on the first check-eu-country-sold-from page
    And the user selects Slovakia on the first check-eu-country-sold-to/1 page
    And the user ticks the first checkbox on the first check-eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 123456 for first selected VAT rate on the check-eu-sales-from-eu/1 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the check-vat-on-sales-from-eu/1 page
    Then the user clicks continue on the first change-check-sales-from-eu/1 page
    And the user answers yes on the check-add-sales-from-eu-to-eu/1 page
    And the user selects Estonia on the second check-eu-country-sold-to/1 page
    And the user ticks the first checkbox on the second check-eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 45625 for first selected VAT rate on the check-eu-sales-from-eu/1 page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the check-vat-on-sales-from-eu/1 page
    Then the user clicks continue on the second change-check-sales-from-eu/1 page
    And the user answers no on the check-add-sales-from-eu-to-eu/1 page
    And the user answers yes on the check-add-sales-from-eu page
    And the user selects Austria on the second check-eu-country-sold-from page
    And the user selects Sweden on the first check-eu-country-sold-to/2 page
    And the user ticks the first checkbox on the first check-eu-vat-rates-from-eu/2 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 123456 for first selected VAT rate on the check-eu-sales-from-eu/2 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the check-vat-on-sales-from-eu/2 page
    And the user clicks the continue button
    And the user answers no on the check-add-sales-from-eu-to-eu/2 page
    And the user answers no on the check-add-sales-from-eu page
    Then the user is on the check-your-answers page
    And the user clicks change for EU sales excluding VAT
    Then the user is on the check-add-sales-from-eu page
    And the user answers no on the check-add-sales-from-eu page
    Then the user is on the check-your-answers page
    And the user clicks change for EU VAT charged
    Then the user is on the check-add-sales-from-eu page
    And the user answers no on the check-add-sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user provides answers then amends to remove info using Check Your Answer functionality
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
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
    And the user answers yes on the add-sales-from-northern-ireland page
    And the user selects France on the second eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the second eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters second EU country total sales of 500000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user is on the check-your-answers page
    Then the user selects the change link for check-sales-from-northern-ireland
    And the user answers no on the check-sales-from-northern-ireland page
    And the user is on the check-your-answers page
    Then the NI answers have been removed from the check-your-answers page
    Then the user submits their return

  Scenario: A user uses the Check Your Answers functionality to change between calculated VAT and amended VAT amounts
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
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
    And the user enters first EU country total sales of 123456 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters first EU country total sales of 900000 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 90099 for the first EU country and the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user clicks change for NI sales excluding VAT
    Then the user selects the change link for change-check-sales-from-northern-ireland\/1
    Then the user selects the change link for check-vat-on-sales-from-northern-ireland\/1\/1
    And the user enters a different amount of VAT totalling 12345 for the first EU country and the first selected VAT rate on the check-vat-on-sales-from-northern-ireland page
    Then the user clicks continue on the first change-check-sales-from-northern-ireland page
    And the user answers no on the check-add-sales-from-northern-ireland page
    Then the user is on the check-your-answers page
    Then the user clicks change for EU sales excluding VAT
    Then the user selects the change link for check-add-sales-from-eu-to-eu\/1
    Then the user selects the change link for change-check-sales-from-eu\/1\/1
    Then the user selects the change link for check-vat-on-sales-from-eu\/1\/1\/1
    And the user enters a different amount of VAT totalling 15200 for the first EU country and the first selected VAT rate on the check-vat-on-sales-from-eu/1 page
    Then the user clicks the continue button
    And the user answers no on the check-add-sales-from-eu-to-eu/1 page
    And the user answers no on the check-add-sales-from-eu page
    And the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user says no to adding a correction then changes to yes and adds a correction
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the 2021-Q4 start page
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers no on the correctPreviousReturn page
    And the user is on the check-your-answers page
    Then the user clicks change for Corrections
    And the user answers yes on the changeCorrectPreviousReturn page
    And the user answers yes on the changeCorrectionReturnSinglePeriod/1 page
    And the user selects the first country as Austria for the first period on the changeCorrectionCountry page
    And the user answers yes on the changeUndeclaredCountryCorrection/1/1 page
    And the user adds the first correction amount as 2000 for the first period on the changeCountryVatCorrection page
    And the user answers yes on the changeVatPayableForCountry/1/1 page
    And the user is on the changeCheckVatPayableAmount/1/1?completeJourney=true page
    And the user continues from the checkVatPayableAmount page
    And the user answers no on the changeVatCorrectionsList/1 page
    And the user is on the changeVatPeriodCorrectionsList page
    And the user clicks the continue button
    Then the user is on the check-your-answers page

  Scenario: A user says yes to adding a correction then changes to no
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the 2021-Q4 start page
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correctPreviousReturn page
    And the user answers yes on the correctionReturnSinglePeriod/1 page
    And the user selects the first country as Romania for the first period on the correctionCountry page
    And the user answers yes on the undeclaredCountryCorrection/1/1 page
    And the user adds the first correction amount as 8500 for the first period on the countryVatCorrection page
    And the user answers yes on the vatPayableForCountry/1/1 page
    And the user is on the checkVatPayableAmount/1/1 page
    And the user continues from the checkVatPayableAmount page
    And the user answers no on the vatCorrectionsList/1 page
    And the user is on the vatPeriodCorrectionsList page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user clicks change for Corrections
    And the user answers no on the changeCorrectPreviousReturn page
    Then the user is on the check-your-answers page

  Scenario: A user says yes to adding a correction to a single period then uses change option to add another country
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the 2021-Q4 start page
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correctPreviousReturn page
    And the user answers yes on the correctionReturnSinglePeriod/1 page
    And the user selects the first country as Romania for the first period on the correctionCountry page
    And the user answers yes on the undeclaredCountryCorrection/1/1 page
    And the user adds the first correction amount as 8500 for the first period on the countryVatCorrection page
    And the user answers yes on the vatPayableForCountry/1/1 page
    And the user is on the checkVatPayableAmount/1/1 page
    And the user continues from the checkVatPayableAmount page
    And the user answers no on the vatCorrectionsList/1 page
    And the user is on the vatPeriodCorrectionsList page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user clicks change for Periods with corrections
    Then the user is on the changeVatPeriodCorrectionsList page
    And the user selects the change link for changeVatCorrectionsList\/1
    And the user answers yes on the changeVatCorrectionsList/1 page
    And the user selects the second country as Spain for the first period on the changeCorrectionCountry page
    And the user adds the second correction amount as 1234 for the first period on the changeCountryVatCorrection page
    And the user answers yes on the changeVatPayableForCountry/1/2 page
    And the user is on the changeCheckVatPayableAmount/1/2?completeJourney=true page
    And the user continues from the checkVatPayableAmount page
    And the user answers no on the changeVatCorrectionsList/1 page
    Then the user clicks the continue button
    And the user is on the check-your-answers page



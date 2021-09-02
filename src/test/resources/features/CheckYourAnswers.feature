@Returns

Feature: Check Your Answers Feature

  Scenario: A user follows a basic journey and amends NI answers using Check Your Answers functionality
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user navigates to the start page
    And the user answers yes on the startReturn page
    And the user answers no on the soldGoodsFromNi page
    And the user answers no on the soldGoodsFromEu page
    And the user is on the check-your-answers page
    Then the user selects the change link for changeSoldGoodsFromNi
    And the user answers yes on the changeSoldGoodsFromNi page
    And the user selects Denmark on the first changeCountryOfConsumptionFromNi page
    And the user ticks the first checkbox on the first changeVatRatesFromNi page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 and vat of 5000 for first selected VAT rate on the changeSalesAtVatRateFromNi page
    Then the user clicks continue on the first change-check-sales-from-ni page
    And the user answers no on the check-add-sales-from-ni page
    Then the user is on the check-your-answers page
    Then the user clicks change for NI sales excluding VAT
    And the user answers yes on the check-add-sales-from-ni page
    And the user selects Poland on the second changeCountryOfConsumptionFromNi page
    And the user ticks the first checkbox on the second changeVatRatesFromNi page
    And the user clicks the continue button
    And the user enters second EU country total sales of 10000 and vat of 500 for first selected VAT rate on the changeSalesAtVatRateFromNi page
    Then the user clicks continue on the second change-check-sales-from-ni page
    And the user answers no on the check-add-sales-from-ni page
    Then the user is on the check-your-answers page
    Then the user clicks change for NI VAT charged
    And the user answers no on the check-add-sales-from-ni page
    Then the user is on the check-your-answers page

  Scenario: A user follows a basic journey and amends EU answers using Check Your Answers functionality
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user navigates to the start page
    And the user answers yes on the startReturn page
    And the user answers no on the soldGoodsFromNi page
    And the user answers no on the soldGoodsFromEu page
    And the user is on the check-your-answers page
    Then the user selects the change link for changeSoldGoodsFromEu
    And the user answers yes on the changeSoldGoodsFromEu page
    And the user selects Lithuania on the first changeCountryOfSaleFromEu page
    And the user selects Slovakia on the first changeCountryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the first changeVatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 and vat of 5000 for first selected VAT rate on the changeSalesAtVatRateFromEu/1 page
    Then the user clicks continue on the first change-check-sales-to-eu/1 page
    And the user answers yes on the check-add-sales-to-eu/1 page
    And the user selects Estonia on the second changeCountryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the second changeVatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 70000 and vat of 6000 for first selected VAT rate on the changeSalesAtVatRateFromEu/1 page
    Then the user clicks continue on the second change-check-sales-to-eu/1 page
    And the user answers no on the check-add-sales-to-eu/1 page
    And the user answers yes on the check-add-sales-from-eu page
    And the user selects Austria on the second changeCountryOfSaleFromEu page
    And the user selects Sweden on the first changeCountryOfConsumptionFromEu/2 page
    And the user ticks the first checkbox on the first changeVatRatesFromEu/2 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 6000 and vat of 440 for first selected VAT rate on the changeSalesAtVatRateFromEu/2 page
    And the user clicks the continue button
    And the user answers no on the check-add-sales-to-eu/2 page
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

  Scenario: A user provides answers then amends to remove info using Check Your Answer functionality
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user navigates to the start page
    And the user answers yes on the startReturn page
    And the user answers yes on the soldGoodsFromNi page
    And the user selects Spain on the first countryOfConsumptionFromNi page
    And the user ticks the first checkbox on the first vatRatesFromNi page
    And the user ticks the second checkbox on the first vatRatesFromNi page
    And the user clicks the continue button
    And the user enters first EU country total sales of 500 and vat of 50 for first selected VAT rate on the salesAtVatRateFromNi page
    And the user enters first EU country total sales of 250 and vat of 75 for second selected VAT rate on the salesAtVatRateFromNi page
    Then the user is on the check-sales-from-ni/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-ni page
    And the user selects France on the second countryOfConsumptionFromNi page
    And the user ticks the first checkbox on the second vatRatesFromNi page
    And the user clicks the continue button
    And the user enters second EU country total sales of 1350 and vat of 300 for first selected VAT rate on the salesAtVatRateFromNi page
    Then the user is on the check-sales-from-ni/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-ni page
    And the user answers no on the soldGoodsFromEu page
    And the user is on the check-your-answers page
    Then the user selects the change link for changeSoldGoodsFromNi
    And the user answers no on the changeSoldGoodsFromNi page
    And the user is on the check-your-answers page
    Then the NI answers have been removed from the check-your-answers page

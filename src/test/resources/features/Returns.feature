@Returns

Feature: Returns Feature

  Scenario: A user completes a returns journey when only selling goods from NI
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
    Then the user is on the check-your-answers page

  Scenario: A user completes a returns journey when only selling goods from the EU
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user navigates to the start page
    And the user answers yes on the startReturn page
    And the user answers no on the soldGoodsFromNi page
    And the user answers yes on the soldGoodsFromEu page
    And the user selects Spain on the first countryOfSaleFromEu page
    And the user selects Bulgaria on the first countryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the first vatRatesFromEu/1 page
    And the user ticks the second checkbox on the first vatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 350 and vat of 75 for first selected VAT rate on the salesAtVatRateFromEu/1 page
    And the user enters first EU country total sales of 550 and vat of 95 for second selected VAT rate on the salesAtVatRateFromEu/1 page
    Then the user is on the check-sales-to-eu/1/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-to-eu/1 page
    And the user selects Finland on the second countryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the second vatRatesFromEu/1 page
    And the user ticks the second checkbox on the second vatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 350 and vat of 75 for first selected VAT rate on the salesAtVatRateFromEu/1 page
    And the user enters second EU country total sales of 550 and vat of 95 for second selected VAT rate on the salesAtVatRateFromEu/1 page
    Then the user is on the check-sales-to-eu/1/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page

  Scenario: A user completes a full returns journey for NI and EU
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
    And the user answers yes on the soldGoodsFromEu page
    And the user selects Spain on the first countryOfSaleFromEu page
    And the user selects Bulgaria on the first countryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the first vatRatesFromEu/1 page
    And the user ticks the second checkbox on the first vatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 350 and vat of 75 for first selected VAT rate on the salesAtVatRateFromEu/1 page
    And the user enters first EU country total sales of 550 and vat of 95 for second selected VAT rate on the salesAtVatRateFromEu/1 page
    Then the user is on the check-sales-to-eu/1/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-to-eu/1 page
    And the user selects Finland on the second countryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the second vatRatesFromEu/1 page
    And the user ticks the second checkbox on the second vatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 350 and vat of 75 for first selected VAT rate on the salesAtVatRateFromEu/1 page
    And the user enters second EU country total sales of 550 and vat of 95 for second selected VAT rate on the salesAtVatRateFromEu/1 page
    Then the user is on the check-sales-to-eu/1/2 page
    And the user clicks the continue button



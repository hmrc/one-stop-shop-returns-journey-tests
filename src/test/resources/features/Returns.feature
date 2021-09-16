@Returns

Feature: Returns Feature

  Scenario: A user completes a returns journey when only selling goods from NI
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the startReturn page
    And the user answers yes on the soldGoodsFromNi page
    And the user selects Spain on the first countryOfConsumptionFromNi page
    And the user ticks the first checkbox on the first vatRatesFromNi page
    And the user ticks the second checkbox on the first vatRatesFromNi page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the netValueOfSalesFromNi page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vatOnSalesFromNi page
    And the user enters first EU country total sales of 75000 for second selected VAT rate on the netValueOfSalesFromNi page
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the vatOnSalesFromNi page
    Then the user is on the check-sales-from-ni/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-ni page
    And the user selects France on the second countryOfConsumptionFromNi page
    And the user ticks the first checkbox on the second vatRatesFromNi page
    And the user clicks the continue button
    And the user enters second EU country total sales of 500000 for first selected VAT rate on the netValueOfSalesFromNi page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the vatOnSalesFromNi page
    Then the user is on the check-sales-from-ni/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-ni page
    And the user answers no on the soldGoodsFromEu page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user completes a returns journey when only selling goods from the EU
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the startReturn page
    And the user answers no on the soldGoodsFromNi page
    And the user answers yes on the soldGoodsFromEu page
    And the user selects Spain on the first countryOfSaleFromEu page
    And the user selects Bulgaria on the first countryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the first vatRatesFromEu/1 page
    And the user ticks the second checkbox on the first vatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 123456 for first selected VAT rate on the netValueOfSalesFromEu/1 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vatOnSalesFromEu/1 page
    And the user enters first EU country total sales of 987654 for second selected VAT rate on the netValueOfSalesFromEu/1 page
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the vatOnSalesFromEu/1 page
    Then the user is on the check-sales-to-eu/1/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-to-eu/1 page
    And the user selects Finland on the second countryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the second vatRatesFromEu/1 page
    And the user ticks the second checkbox on the second vatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 45625 for first selected VAT rate on the netValueOfSalesFromEu/1 page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the vatOnSalesFromEu/1 page
    And the user enters second EU country total sales of 87452 for second selected VAT rate on the netValueOfSalesFromEu/1 page
    And the user confirms the vat for the second EU country as the suggested amount for the second selected VAT rate on the vatOnSalesFromEu/1 page
    Then the user is on the check-sales-to-eu/1/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return
@ZAP
  Scenario: A user completes a full returns journey for NI and EU
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the startReturn page
    And the user answers yes on the soldGoodsFromNi page
    And the user selects Spain on the first countryOfConsumptionFromNi page
    And the user ticks the first checkbox on the first vatRatesFromNi page
    And the user ticks the second checkbox on the first vatRatesFromNi page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the netValueOfSalesFromNi page
    And the user enters a different amount of VAT totalling 12345 for the first EU country and the first selected VAT rate on the vatOnSalesFromNi page
    And the user enters first EU country total sales of 800000 for second selected VAT rate on the netValueOfSalesFromNi page
    And the user enters a different amount of VAT totalling 147852 for the first EU country and the second selected VAT rate on the vatOnSalesFromNi page
    Then the user is on the check-sales-from-ni/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-ni page
    And the user selects France on the second countryOfConsumptionFromNi page
    And the user ticks the first checkbox on the second vatRatesFromNi page
    And the user clicks the continue button
    And the user enters second EU country total sales of 50000 for first selected VAT rate on the netValueOfSalesFromNi page
    And the user enters a different amount of VAT totalling 12345 for the second EU country and the first selected VAT rate on the vatOnSalesFromNi page
    Then the user is on the check-sales-from-ni/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-ni page
    And the user answers yes on the soldGoodsFromEu page
    And the user selects Spain on the first countryOfSaleFromEu page
    And the user selects Bulgaria on the first countryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the first vatRatesFromEu/1 page
    And the user ticks the second checkbox on the first vatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 350000 for first selected VAT rate on the netValueOfSalesFromEu/1 page
    And the user enters a different amount of VAT totalling 71234 for the first EU country and the first selected VAT rate on the vatOnSalesFromEu/1 page
    And the user enters first EU country total sales of 900000 for second selected VAT rate on the netValueOfSalesFromEu/1 page
    And the user enters a different amount of VAT totalling 90099 for the first EU country and the second selected VAT rate on the vatOnSalesFromEu/1 page
    Then the user is on the check-sales-to-eu/1/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-to-eu/1 page
    And the user selects Finland on the second countryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the second vatRatesFromEu/1 page
    And the user ticks the second checkbox on the second vatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 100000 for first selected VAT rate on the netValueOfSalesFromEu/1 page
    And the user enters a different amount of VAT totalling 15200 for the second EU country and the first selected VAT rate on the vatOnSalesFromEu/1 page
    And the user enters second EU country total sales of 250000 for second selected VAT rate on the netValueOfSalesFromEu/1 page
    And the user enters a different amount of VAT totalling 20999 for the second EU country and the second selected VAT rate on the vatOnSalesFromEu/1 page
    Then the user is on the check-sales-to-eu/1/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return



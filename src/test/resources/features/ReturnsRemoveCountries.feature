@Returns

Feature: Remove Countries Feature

  Scenario: A user accesses the Returns service when selling goods and removes countries
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
    And the user selects the remove link for deleteSalesFromNi\/1
    And the user answers yes on the deleteSalesFromNi/1 page
    And the user answers no on the add-sales-from-ni page
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
    And the user selects the remove link for deleteSalesToEu\/1
    And the user answers yes on the deleteSalesToEu/1/1 page
    And the user answers no on the add-sales-to-eu/1 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Germany on the second countryOfSaleFromEu page
    And the user selects France on the first countryOfConsumptionFromEu/2 page
    And the user ticks the first checkbox on the first vatRatesFromEu/2 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 123456 for first selected VAT rate on the netValueOfSalesFromEu/2 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vatOnSalesFromEu/2 page
    Then the user is on the check-sales-to-eu/2/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-to-eu/2 page
    And the user selects the remove link for deleteSalesFromEu\/2
    And the user answers yes on the deleteSalesFromEu/2 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page



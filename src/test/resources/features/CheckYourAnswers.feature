@Returns

Feature: Check Your Answers Feature

  Scenario: A user follows a basic journey and amends NI answers using Check Your Answers functionality
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the startReturn page
    And the user answers no on the soldGoodsFromNi page
    And the user answers no on the soldGoodsFromEu page
    And the user is on the check-your-answers page
    Then the user selects the change link for changeSoldGoodsFromNi
    And the user answers yes on the changeSoldGoodsFromNi page
    And the user selects Denmark on the first changeCountryOfConsumptionFromNi page
    And the user ticks the first checkbox on the first changeVatRatesFromNi page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the changeNetValueOfSalesFromNi page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the changeVatOnSalesFromNi page
    Then the user clicks continue on the first change-check-sales-from-ni page
    And the user answers no on the check-add-sales-from-ni page
    Then the user is on the check-your-answers page
    Then the user clicks change for NI sales excluding VAT
    And the user answers yes on the check-add-sales-from-ni page
    And the user selects Poland on the second changeCountryOfConsumptionFromNi page
    And the user ticks the first checkbox on the second changeVatRatesFromNi page
    And the user clicks the continue button
    And the user enters second EU country total sales of 500000 for first selected VAT rate on the changeNetValueOfSalesFromNi page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the changeVatOnSalesFromNi page
    Then the user clicks continue on the second change-check-sales-from-ni page
    And the user answers no on the check-add-sales-from-ni page
    Then the user is on the check-your-answers page
    Then the user clicks change for NI VAT charged
    And the user answers no on the check-add-sales-from-ni page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user follows a basic journey and amends EU answers using Check Your Answers functionality
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
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
    And the user enters first EU country total sales of 123456 for first selected VAT rate on the changeNetValueOfSalesFromEu/1 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the changeVatOnSalesFromEu/1 page
    Then the user clicks continue on the first change-check-sales-to-eu/1 page
    And the user answers yes on the check-add-sales-to-eu/1 page
    And the user selects Estonia on the second changeCountryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the second changeVatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 45625 for first selected VAT rate on the changeNetValueOfSalesFromEu/1 page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the changeVatOnSalesFromEu/1 page
    Then the user clicks continue on the second change-check-sales-to-eu/1 page
    And the user answers no on the check-add-sales-to-eu/1 page
    And the user answers yes on the check-add-sales-from-eu page
    And the user selects Austria on the second changeCountryOfSaleFromEu page
    And the user selects Sweden on the first changeCountryOfConsumptionFromEu/2 page
    And the user ticks the first checkbox on the first changeVatRatesFromEu/2 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 123456 for first selected VAT rate on the changeNetValueOfSalesFromEu/2 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the changeVatOnSalesFromEu/2 page
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
    Then the user submits their return

  Scenario: A user provides answers then amends to remove info using Check Your Answer functionality
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
    And the user is on the check-your-answers page
    Then the user selects the change link for changeSoldGoodsFromNi
    And the user answers no on the changeSoldGoodsFromNi page
    And the user is on the check-your-answers page
    Then the NI answers have been removed from the check-your-answers page
    Then the user submits their return

  Scenario: A user uses the Check Your Answers functionality to change between calculated VAT and amended VAT amounts
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
    And the user enters first EU country total sales of 800000 for second selected VAT rate on the netValueOfSalesFromNi page
    And the user enters a different amount of VAT totalling 147852 for the first EU country and the second selected VAT rate on the vatOnSalesFromNi page
    Then the user is on the check-sales-from-ni/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-ni page
    And the user answers yes on the soldGoodsFromEu page
    And the user selects Spain on the first countryOfSaleFromEu page
    And the user selects Bulgaria on the first countryOfConsumptionFromEu/1 page
    And the user ticks the first checkbox on the first vatRatesFromEu/1 page
    And the user ticks the second checkbox on the first vatRatesFromEu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 123456 for first selected VAT rate on the netValueOfSalesFromEu/1 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vatOnSalesFromEu/1 page
    And the user enters first EU country total sales of 900000 for second selected VAT rate on the netValueOfSalesFromEu/1 page
    And the user enters a different amount of VAT totalling 90099 for the first EU country and the second selected VAT rate on the vatOnSalesFromEu/1 page
    Then the user is on the check-sales-to-eu/1/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user clicks change for NI sales excluding VAT
    Then the user selects the change link for change-check-sales-from-ni\/1
    Then the user selects the change link for changeVatOnSalesFromNi\/1\/1
    And the user enters a different amount of VAT totalling 12345 for the first EU country and the first selected VAT rate on the changeVatOnSalesFromNi page
    Then the user clicks the continue button
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the changeVatOnSalesFromNi page
    Then the user clicks continue on the first change-check-sales-from-ni page
    And the user answers no on the check-add-sales-from-ni page
    Then the user is on the check-your-answers page
    Then the user clicks change for EU sales excluding VAT
    Then the user selects the change link for check-add-sales-to-eu\/1
    Then the user selects the change link for change-check-sales-to-eu\/1\/1
    Then the user selects the change link for changeVatOnSalesFromEu\/1\/1\/1
    And the user enters a different amount of VAT totalling 15200 for the first EU country and the first selected VAT rate on the changeVatOnSalesFromEu/1 page
    Then the user clicks the continue button
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the changeVatOnSalesFromEu/1 page
    Then the user clicks the continue button
    And the user answers no on the check-add-sales-to-eu/1 page
    And the user answers no on the check-add-sales-from-eu page
    And the user is on the check-your-answers page
    Then the user submits their return


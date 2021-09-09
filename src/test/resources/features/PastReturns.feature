@Returns

Feature: Past Returns Feature

  Scenario: A user views one of their past returns
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
    Then the user submits their return
    Then the user clicks on the Back to your account link
    Then the user is directed back to the index page
    Then the user clicks on the View past returns link
    Then the user is on the past-returns page
    Then the user clicks on the 1 July to 30 September 2021 link
    And the user is on the return/2021-Q3 page

  Scenario: A user has no past returns to view
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the View past returns link
    Then the user is on the past-returns page
    And the user sees the no returns message

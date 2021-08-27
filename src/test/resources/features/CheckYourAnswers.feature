@Returns

Feature: Check Your Answers Feature

  Scenario: A user follows a basic journey and amends answers using Check Your Answer functionality
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
#   VEOSS-378 - CYA looping needs fixing here as it's supposed to go to check-add-sales-from-ni
    Then the user is on the check-your-answers page
    Then the user clicks change for NI sales excluding VAT
    And the user answers yes on the check-add-sales-from-ni page
    And the user selects Poland on the second changeCountryOfConsumptionFromNi page
    And the user ticks the first checkbox on the second changeVatRatesFromNi page
    And the user clicks the continue button
    And the user enters second EU country total sales of 10000 and vat of 500 for first selected VAT rate on the changeSalesAtVatRateFromNi page
    Then the user clicks continue on the second change-check-sales-from-ni page
#   VEOSS-378 - CYA looping needs fixing here as it's supposed to go to check-add-sales-from-ni
    Then the user is on the check-your-answers page
    Then the user clicks change for NI VAT charged
    And the user answers no on the check-add-sales-from-ni page
#    VEOSS-378 - Bug - should be going to CYA but goes to /changeSoldGoodsFromEu
#    Then the user is on the check-your-answers page

  Scenario: A user provides answers then amends to remove info using Check Your Answer functionality

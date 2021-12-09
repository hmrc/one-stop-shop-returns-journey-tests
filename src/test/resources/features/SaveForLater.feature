@Returns

Feature: Save For Later Feature

  Scenario: A user can save their progress and return to the last page they were on
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
    And the user clicks the Save and come back later button
    Then the user clicks on the continue to complete your return link
    And the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers yes on the sales-from-eu page
    And the user selects Spain on the first eu-country-sold-from page
    And the user selects Bulgaria on the first eu-country-sold-to/1 page
    And the user is on the eu-vat-rates-from-eu/1/1 page
    And the user clicks the Save and come back later button
    Then the user clicks on the continue to complete your return link
    And the user is on the eu-vat-rates-from-eu/1/1 page
    And the user clicks the Save and come back later button
    And the user clicks on the return to your account link
    Then the user is on the your-account page



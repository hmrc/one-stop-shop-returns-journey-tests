@Returns

Feature: Remove Countries Feature

  Scenario: A user accesses the Returns service when selling goods and removes countries
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
    And the user selects the remove link for remove-sales-from-northern-ireland\/1
    And the user answers yes on the remove-sales-from-northern-ireland/1 page
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers yes on the sales-from-eu page
    And the user selects Spain on the first eu-country-sold-from page
    And the user selects Bulgaria on the first eu-country-sold-to/1 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/1 page
    And the user ticks the second checkbox on the first eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 123456 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters first EU country total sales of 987654 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-eu-to-eu/1 page
    And the user selects Finland on the second eu-country-sold-to/1 page
    And the user ticks the first checkbox on the second eu-vat-rates-from-eu/1 page
    And the user ticks the second checkbox on the second eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 45625 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters second EU country total sales of 87452 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user confirms the vat for the second EU country as the suggested amount for the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/2 page
    And the user clicks the continue button
    And the user selects the remove link for remove-sales-from-eu-to-eu\/1
    And the user answers yes on the remove-sales-from-eu-to-eu/1/1 page
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Germany on the second eu-country-sold-from page
    And the user selects France on the first eu-country-sold-to/2 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/2 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 123456 for first selected VAT rate on the eu-sales-from-eu/2 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/2 page
    Then the user is on the check-sales-from-eu/2/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/2 page
    And the user selects the remove link for remove-sales-from-eu\/2
    And the user answers yes on the remove-sales-from-eu/2 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page



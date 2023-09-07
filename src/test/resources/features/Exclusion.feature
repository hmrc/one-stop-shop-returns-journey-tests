@Returns @Accessibility

Feature: Exclusion feature

  Scenario: A user completes their penultimate return when excluded by HMRC with reason 2
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000011 and strong credentials
    Then the user is directed back to the index page
    Then the user sees the hmrc exclusion message
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
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user completes their final return when excluded by HMRC with reason 2
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000011 and strong credentials
    Then the user is directed back to the index page
    Then the user sees the hmrc exclusion message
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return
    And the user clicks on the Back to your account button
    Then the user sees the hmrc exclusion message
    Then the user sees the final return message on the dashboard
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Slovenia on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 2635 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers yes on the sales-from-eu page
    And the user selects Poland on the first eu-country-sold-from page
    And the user selects Bulgaria on the first eu-country-sold-to/1 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 58741 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Bulgaria for the first period on the correction-country page
    And the user answers yes on the add-new-country/1/1 page
    And the user adds the first undeclared correction amount as 4123 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user sees the exclusion submission message
    Then the user submits their return
    And the user clicks on the Back to your account button
    Then the user sees the HMRC exclusion messages on dashboard after final return

  Scenario: A user can complete one of their remaining returns with trader exclusion reason 1
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000013 and strong credentials
    Then the user is directed back to the index page
    Then the user sees the trader exclusion message
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
    Then the user is on the check-your-answers page
    Then the user submits their return
    And the user clicks on the Back to your account button

  Scenario: A user who is excluded for trader reason 3 is unable to submit any more returns
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000012 and strong credentials
    Then the user sees the trader exclusion messages on dashboard after final return



@Returns

Feature: Returns Feature

  Scenario: A user completes a returns journey when only selling goods from NI
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
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user completes a returns journey when only selling goods from the EU
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
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
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user completes a full returns journey for NI and EU
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
    And the user enters a different amount of VAT totalling 12345 for the first EU country and the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    And the user enters first EU country total sales of 800000 for second selected VAT rate on the eu-sales-from-northern-ireland page
    And the user enters a different amount of VAT totalling 147852 for the first EU country and the second selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-northern-ireland page
    And the user selects France on the second eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the second eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters second EU country total sales of 50000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user enters a different amount of VAT totalling 12345 for the second EU country and the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers yes on the sales-from-eu page
    And the user selects Spain on the first eu-country-sold-from page
    And the user selects Bulgaria on the first eu-country-sold-to/1 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/1 page
    And the user ticks the second checkbox on the first eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 350000 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 71234 for the first EU country and the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters first EU country total sales of 900000 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 90099 for the first EU country and the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-eu-to-eu/1 page
    And the user selects Finland on the second eu-country-sold-to/1 page
    And the user ticks the first checkbox on the second eu-vat-rates-from-eu/1 page
    And the user ticks the second checkbox on the second eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 15200 for the second EU country and the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters second EU country total sales of 250000 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 20999 for the second EU country and the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user can submit a nil return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user completes a full returns journey after registering with Send Goods data
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000006 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Poland on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 48565 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers yes on the sales-from-eu page
    And the user selects Slovakia on the first eu-country-sold-from page
    And the user selects Czech Republic on the first eu-country-sold-to/1 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 350000 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 71234 for the first EU country and the first selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user without an organisation name can log in and submit a return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 783478423 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Spain on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user enters a different amount of VAT totalling 12345 for the first EU country and the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers yes on the sales-from-eu page
    And the user selects Spain on the first eu-country-sold-from page
    And the user selects Bulgaria on the first eu-country-sold-to/1 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/1 page
    And the user ticks the second checkbox on the first eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 350000 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 71234 for the first EU country and the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters first EU country total sales of 900000 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 90099 for the first EU country and the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: An assistant user can access the returns service
    Given the user accesses the service
    And the assistant signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page

  Scenario: A user can access their next available return via the secure messages link
    Given the user accesses the service
    And the assistant signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    When the user accesses the start return link via secure messages
    Then the user is on the 2021-Q3/start page


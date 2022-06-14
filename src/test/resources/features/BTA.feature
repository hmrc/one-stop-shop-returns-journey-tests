@Returns

Feature: BTA Feature

  Scenario: A user enters the Your Account page via BTA, submits a nil return and has the correct link back to BTA
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the your-account-from-bta link
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return
    Then the user clicks on the Back to your account link
    And the user is on the business-account page

  Scenario: A user enters the Start Your Return page via BTA, submits a nil return and has the correct link back to BTA
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the start-your-return-from-bta/2021-Q3 link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return
    Then the user clicks on the Back to your account link
    And the user is on the business-account page

  Scenario: A user enters the Continue Your Return page via BTA, submits a small return and has the correct link back to BTA
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Spain on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user clicks the Save and come back later button
    And the user clicks on the sign out and come back later link
    Then the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the continue-return-from-bta/2021-Q3 link
    Then the user is on the return-continue page
    And the user selects the Continue my return option
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return
    Then the user clicks on the Back to your account link
    And the user is on the business-account page

  Scenario: A user enters the Submitted Returns page via BTA and the breadcrumb link takes them back to BTA
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the returns-history-from-bta link
    Then the user is on the past-returns page
    And the user clicks on the your-account breadcrumb
    And the user is on the business-account page

  Scenario: A user with one outstanding payment clicks the BTA payment link and is directed to the payments service
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000004 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the payments-from-bta link
    And the user has been directed to the payments service

  Scenario: A user with multiple outstanding payments clicks the BTA payment link and is directed to the payment choice page
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000006 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the payments-from-bta link
    And the user is on the outstanding-payments page

  Scenario: A Welsh user enters the Your Account page via BTA and sees the Welsh transition page before "Your Account"
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the your-account-from-bta?lang=cy link
    And the user is directed to the Welsh transition page
    Then the user clicks the continue button
    And the user is on the your-account page

  Scenario: A Welsh user enters the Start Your Return page via BTA and sees the Welsh transition page before they start their return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the start-your-return-from-bta/2021-Q3?lang=cy link
    And the user is directed to the Welsh transition page
    Then the user clicks the continue button
    And the user is on the start page

  Scenario: A Welsh user enters the Continue Your Return page via BTA and sees the Welsh transition page before they continue their return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Spain on the first eu-country-from-northern-ireland page
    And the user clicks the Save and come back later button
    And the user clicks on the sign out and come back later link
    Then the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the continue-return-from-bta/2021-Q3?lang=cy link
    And the user is directed to the Welsh transition page
    Then the user clicks the continue button
    Then the user is on the return-continue page

  Scenario: A Welsh user enters the Submitted Returns page via BTA and sees the Welsh transition page before the Past Returns page
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the returns-history-from-bta?lang=cy link
    And the user is directed to the Welsh transition page
    Then the user clicks the continue button
    Then the user is on the past-returns page

  Scenario: A user enters the Your Account page via BTA with the en specific parameter and is directed straight to "Your Account"
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the your-account-from-bta?lang=en link
    And the user is on the your-account page

  Scenario: A Welsh user with multiple outstanding payments clicks the BTA payment link and and sees the Welsh transition page before the payment choice page
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 444444444 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the payments-from-bta?lang=cy link
    And the user is directed to the Welsh transition page
    Then the user clicks the continue button
    And the user is on the outstanding-payments page



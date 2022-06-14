@Returns

Feature: Payments Feature

Scenario: A user has one outstanding payment and is taken straight to the payment service from My Account
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000004 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Make a payment link
    And the user has been directed to the payments service

  Scenario: A user has multiple outstanding payments and is taken to the payment choice page from My Account
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 444444444 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Make a payment link
    And the user is on the outstanding-payments page
    Then the user selects the second return period
    And the user has been directed to the payments service





@Returns

Feature: Past Returns Feature

  Scenario: A user views one of their past returns
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the View past returns link
    Then the user is on the past-returns page
    Then the user clicks on the 1 July to 30 September 2021 link
    And the user is on the past-returns/2021-Q3 page

  Scenario: A user has no past returns to view
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the View past returns link
    Then the user is on the past-returns page
    And the user sees the no returns message

  Scenario: A user tries to start a duplicate return for the same period
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the 2021-Q3 start page
    And the user is on the past-returns/2021-Q3 page

  Scenario: A user should be able to navigate using the breadcrumbs
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the View past returns link
    Then the user is on the past-returns page
    Then the user clicks on the 1 July to 30 September 2021 link
    And the user is on the past-returns/2021-Q3 page
    And the user clicks on the submitted-returns breadcrumb
    And the user is on the past-returns page
    And the user clicks on the your-account breadcrumb
    And the user is on the your-account page

  Scenario: A user is not able view a submitted return for a period over 6 years ago
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 166666666 and strong credentials
    Then the user is directed back to the index page
    When the user manually navigates to their Q1 2018 return
    Then the user is on the no-longer-able-to-view-return page
    When the user manually navigates to their Q3 2018 return
    Then the user is on the no-longer-able-to-view-return page

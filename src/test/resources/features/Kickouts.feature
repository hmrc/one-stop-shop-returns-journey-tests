@Returns

Feature: Kickouts Feature

  Scenario: A user has not registered for the One Shop Stop scheme
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 111111111 and strong credentials
    Then the user is on the cannot-use-not-registered page

  Scenario: A user selects no to starting return for sales period where there are no other sales periods available
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers no on the start page
    Then the user is on the no-other-periods-available page
    Then the user clicks on the Back to your account button
    Then the user is directed back to the index page

  Scenario: A user cannot start a return later than the most overdue return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    And the user is directed back to the index page
    Then the user manually navigates to the 2021-Q4 start page
    And the user is on the cannot-start-return page
    Then the user clicks on the Back to your account button
    Then the user is directed back to the index page


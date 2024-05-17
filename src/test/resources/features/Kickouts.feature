@Returns @Accessibility

Feature: Kickouts Feature

  Scenario: A user has not registered for the One Shop Stop scheme
    Given the user accesses the service
    And the user signs in as an Organisation Admin with Hmrc Mdt enrolment 121212121 and strong credentials
    Then the user is on the cannot-use-not-registered page

  Scenario: A user has not registered for the One Shop Stop scheme
    Given the user accesses the service
    And the user signs in as an Organisation Admin with Hmrc Oss VAT enrolment 121212121 and strong credentials
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

  Scenario: A user cannot complete a return for the current period by manually browsing to the URL
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000005 and strong credentials
    Then the user is directed back to the index page
    And the user sees the next available return due message
    Then the user manually navigates to the start page for the current period
    And the user is on the no-other-periods-available page

  Scenario: An excluded user is unable to complete a second return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000012 and strong credentials
    And the user navigates to the start your return page
    Then the user is on the excluded-cannot-use-service page

  Scenario: An user who has changed VAT group from No to Yes is unable to start a return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 777777771 and strong credentials
    And the user navigates to the start your return page
    Then the user is on the delete-all-fixed-establishment page

  Scenario: An user who has changed VAT group from No to Yes is unable to start a return via BTA
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 777777771 and strong credentials
    And the user manually navigates to the start-your-return-from-bta/2022-Q2 link
    Then the user is on the delete-all-fixed-establishment page

  Scenario: An user who has changed VAT group from No to Yes is unable to access a previously submitted return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 777777771 and strong credentials
    And the user navigates to a previously submitted return
    Then the user is on the delete-all-fixed-establishment page

  Scenario: An user who has changed VAT group from No to Yes is unable to access past returns history
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 777777771 and strong credentials
    And the user navigates to past returns history
    Then the user is on the delete-all-fixed-establishment page

  Scenario: An user who has changed VAT group from No to Yes is unable to access past returns history via BTA
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 777777771 and strong credentials
    And the user manually navigates to the returns-history-from-bta link
    Then the user is on the delete-all-fixed-establishment page



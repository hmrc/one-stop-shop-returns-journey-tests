@Returns

Feature: Change Your Registration Feature

  Scenario: A user can navigate from Your Account to Change Your Registration in the registration service
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    When the user clicks on the Change your registration link
    Then the user clicks the submit button
    And the user is on the successful-amend page




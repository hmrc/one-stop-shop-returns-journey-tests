@Returns

Feature: Kickouts Feature

  Scenario: A user has not registered for the One Shop Stop scheme
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 111111111 and strong credentials
    Then the user is on the notRegistered page

  Scenario: A user selects no to starting return for sales period where there are no other sales periods available
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user navigates to the start page
    And the user answers no on the startReturn page
    Then the user is directed back to the index page
#    TODO: Awaiting code in frontend
#    Then the user is on the noOtherReturnPeriods page

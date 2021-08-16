

Feature: Kickouts Feature

  Scenario: A user selects no to starting return for sales period where there are no other sales periods available
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user navigates to the start page
    And the user answers no on the startReturn page
    Then the user is directed back to the index page
#    TODO: Awaiting code in frontend
#    Then the user is on the noOtherReturnPeriods page

  Scenario: A user has made taxable sales from a country not mentioned in the registration
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user navigates to the start page
    And the user answers yes on the startReturn page
    And the user answers yes on the soldGoodsFromUnregisteredCountry page
    Then the user is on the contactHmrc page




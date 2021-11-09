@Returns

Feature: Corrections Feature

  Scenario: A user adds corrections for their previous return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the 2021-Q4 start page
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correctPreviousReturn page
    And the user answers yes on the correctionReturnSinglePeriod/1 page
    And the user selects the first country as Croatia for the first period on the correctionCountry page
    And the user adds the first correction amount as 1000 for the first period on the countryVatCorrection page
    And the user answers yes on the vatCorrectionsList/1 page
    And the user selects the second country as France for the first period on the correctionCountry page
    And the user adds the second correction amount as -1000 for the first period on the countryVatCorrection page
    And the user answers no on the vatCorrectionsList/1 page
    And the user is on the vatPeriodCorrectionsList page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
#   Submission not set up yet

  Scenario: A user adds a correction for a country that was not on their previous return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the 2021-Q4 start page
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correctPreviousReturn page
    And the user answers yes on the correctionReturnSinglePeriod/1 page
    And the user selects the first country as Bulgaria for the first period on the correctionCountry page
    And the user answers yes on the undeclaredCountryCorrection/1/1 page
    And the user adds the first correction amount as 5000 for the first period on the countryVatCorrection page
    And the user answers no on the vatCorrectionsList/1 page
    And the user is on the vatPeriodCorrectionsList page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
#   Submission not set up yet

  Scenario: A user says no to adding a correction to their return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the 2021-Q4 start page
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers no on the correctPreviousReturn page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user is offered a single period to correct and chooses No
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the 2021-Q4 start page
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correctPreviousReturn page
    And the user answers no on the correctionReturnSinglePeriod/1 page
    Then the user is on the noOtherCorrectionPeriodsAvailable page
    And the user clicks on the continue link
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user with no previous return is unable to add a correction
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user changes and removes data on their correction
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the 2021-Q4 start page
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correctPreviousReturn page
    And the user answers yes on the correctionReturnSinglePeriod/1 page
    And the user selects the first country as Croatia for the first period on the correctionCountry page
    And the user adds the first correction amount as 1000 for the first period on the countryVatCorrection page
    And the user answers yes on the vatCorrectionsList/1 page
    And the user selects the second country as France for the first period on the correctionCountry page
    And the user adds the second correction amount as -1000 for the first period on the countryVatCorrection page
    And the user is on the vatCorrectionsList/1 page
#    Will need urls updating for check loop mode in VEOSS-554
    And the user clicks change for the first country
    And the user changes the answer to 4500
#    Remove loops not set up until VEOSS-554
#    And the user is on the vatCorrectionsList/1 page
#    And the user selects the remove link for removeCountryCorrection/1/2
#    And the user answers yes on the removeCountryCorrection/1/2 page
    And the user answers no on the vatCorrectionsList/1 page
    And the user is on the vatPeriodCorrectionsList page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
#   Submission not set up yet

#  Added user and data for this in advance but won't be able to continue with this scenario until the date
#  has reached 1st January as it won't show /correctionReturnPeriod page until then
#  Scenario: A user adds corrections for multiple previous returns
#    Given the user accesses the service
#    And the user signs in as an Organisation Admin with VAT enrolment 100000004 and strong credentials
#    Then the user is directed back to the index page
#    Then the user manually navigates to the 2022-Q1 start page
#    And the user answers yes on the start page
#    And the user answers no on the sales-from-northern-ireland page
#    And the user answers no on the sales-from-eu page
#    And the user answers yes on the correctPreviousReturn page

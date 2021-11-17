@Returns

Feature: Corrections Feature
@ZAP
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
    And the user answers yes on the vatPayableForCountry/1/1 page
    And the user is on the checkVatPayableAmount/1/1 page
    And the user continues from the checkVatPayableAmount page
    And the user answers yes on the vatCorrectionsList/1 page
    And the user selects the second country as France for the first period on the correctionCountry page
    And the user adds the second correction amount as -1000 for the first period on the countryVatCorrection page
    And the user answers yes on the vatPayableForCountry/1/2 page
    And the user is on the checkVatPayableAmount/1/2 page
    And the user continues from the checkVatPayableAmount page
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
    And the user answers yes on the vatPayableForCountry/1/1 page
    And the user is on the checkVatPayableAmount/1/1 page
    And the user continues from the checkVatPayableAmount page
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
    And the user clicks the continue button
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

  Scenario: A user changes data on their correction in progress and via checkVatPayableAmount
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
    And the user adds the first correction amount as 2000 for the first period on the countryVatCorrection page
    And the user answers no on the vatPayableForCountry/1/1 page
    Then the user changes the answer to 3000
    And the user answers yes on the vatPayableForCountry/1/1 page
    And the user is on the checkVatPayableAmount/1/1 page
    Then the user selects the change link for first-changeCountryVatCorrection\/1\/1\?completeJourney\=false
    Then the user changes the answer to 1500
    And the user answers yes on the first-changeVatPayableForCountry/1/1?completeJourney=false page
    And the user is on the changeCheckVatPayableAmount/1/1?completeJourney=false page
    And the user continues from the checkVatPayableAmount page
    And the user answers no on the vatCorrectionsList/1 page
    And the user is on the vatPeriodCorrectionsList page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
  #   Submission not set up yet

  Scenario: A user changes and removes data on their correction in vatCorrectionsList
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
    And the user answers yes on the vatPayableForCountry/1/1 page
    And the user is on the checkVatPayableAmount/1/1 page
    And the user continues from the checkVatPayableAmount page
    And the user answers yes on the vatCorrectionsList/1 page
    And the user selects the second country as France for the first period on the correctionCountry page
    And the user adds the second correction amount as -1000 for the first period on the countryVatCorrection page
    And the user answers yes on the vatPayableForCountry/1/2 page
    And the user is on the checkVatPayableAmount/1/2 page
    And the user continues from the checkVatPayableAmount page
    And the user is on the vatCorrectionsList/1 page
    And the user selects the change link for changeCheckVatPayableAmount\/1\/1\?completeJourney\=false
    And the user selects the change link for first-changeCountryVatCorrection\/1\/1\?completeJourney\=false
    And the user changes the answer to 4500
    And the user answers yes on the first-changeVatPayableForCountry/1/1?completeJourney=false page
    And the user is on the changeCheckVatPayableAmount/1/1?completeJourney=false page
    And the user continues from the checkVatPayableAmount page
    And the user is on the vatCorrectionsList/1 page
    And the user selects the remove link for removeCountryCorrection\/1\/2
    And the user answers yes on the removeCountryCorrection/1/2 page
    And the user answers no on the vatCorrectionsList/1 page
    And the user is on the vatPeriodCorrectionsList page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
#   Submission not set up yet

  Scenario: A user changes and removes data on their correction in vatPeriodCorrectionsList
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
    And the user answers yes on the vatPayableForCountry/1/1 page
    And the user is on the checkVatPayableAmount/1/1 page
    And the user continues from the checkVatPayableAmount page
    And the user answers yes on the vatCorrectionsList/1 page
    And the user selects the second country as France for the first period on the correctionCountry page
    And the user adds the second correction amount as -1000 for the first period on the countryVatCorrection page
    And the user answers yes on the vatPayableForCountry/1/2 page
    And the user is on the checkVatPayableAmount/1/2 page
    And the user continues from the checkVatPayableAmount page
    And the user answers no on the vatCorrectionsList/1 page
    And the user is on the vatPeriodCorrectionsList page
    Then the user selects the change link for vatCorrectionsList\/1
#    Should this be check mode?
    And the user is on the vatCorrectionsList/1 page
    And the user answers no on the vatCorrectionsList/1 page
    Then the user selects the remove link for removePeriodCorrection\/1
    And the user answers yes on the removePeriodCorrection/1 page
    Then the user is on the correctPreviousReturn page
    And the user answers yes on the correctPreviousReturn page
    Then the user is on the correctionReturnSinglePeriod/1 page
@wip
  Scenario: A user submits a full return with corrections
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user manually navigates to the 2021-Q4 start page
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
    And the user clicks the continue button
    And the user enters first EU country total sales of 350000 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 71234 for the first EU country and the first selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    And the user answers yes on the correctPreviousReturn page
    And the user answers yes on the correctionReturnSinglePeriod/1 page
    And the user selects the first country as Croatia for the first period on the correctionCountry page
    And the user adds the first correction amount as 1000 for the first period on the countryVatCorrection page
    And the user answers yes on the vatPayableForCountry/1/1 page
    And the user is on the checkVatPayableAmount/1/1 page
    And the user continues from the checkVatPayableAmount page
    And the user answers yes on the vatCorrectionsList/1 page
    And the user selects the second country as France for the first period on the correctionCountry page
    And the user adds the second correction amount as -1000 for the first period on the countryVatCorrection page
    And the user answers yes on the vatPayableForCountry/1/2 page
    And the user is on the checkVatPayableAmount/1/2 page
    And the user continues from the checkVatPayableAmount page
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


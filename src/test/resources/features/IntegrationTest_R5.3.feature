@Integration

#  This feature is to be used for integration testing of sending existing returns to Core for Release 5.3
#  It is not to be included in the main journey tests, hence the separate tagging
#  The VRNs will need to be added for each run, once they have been decided
#  The VRNs will also need to be amended in the steps behind the registration scenario

Feature: Integration Test Feature for Sending Existing Returns to Core

  Scenario: All users have previously registered for the One Stop Shop service
    Given the user has previously registered for the One Stop Shop service

  Scenario Outline: A user completes a small return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment <vrn> and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Spain on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user ticks the second checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    And the user enters first EU country total sales of 75000 for second selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

    Examples:
      | vrn       |
      | 100000002 |
#     add vrns here


  Scenario Outline: A user completes a large return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment <vrn> and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Spain on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user ticks the second checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 50000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user enters a different amount of VAT totalling 12345 for the first EU country and the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    And the user enters first EU country total sales of 800000 for second selected VAT rate on the eu-sales-from-northern-ireland page
    And the user enters a different amount of VAT totalling 147852 for the first EU country and the second selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers yes on the sales-from-eu page
    And the user selects Spain on the first eu-country-sold-from page
    And the user selects Bulgaria on the first eu-country-sold-to/1 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/1 page
    And the user ticks the second checkbox on the first eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 350000 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 71234 for the first EU country and the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters first EU country total sales of 900000 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 90099 for the first EU country and the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-eu-to-eu/1 page
    And the user selects Finland on the second eu-country-sold-to/1 page
    And the user ticks the first checkbox on the second eu-vat-rates-from-eu/1 page
    And the user ticks the second checkbox on the second eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters second EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 15200 for the second EU country and the first selected VAT rate on the vat-on-sales-from-eu/1 page
    And the user enters second EU country total sales of 250000 for second selected VAT rate on the eu-sales-from-eu/1 page
    And the user enters a different amount of VAT totalling 20999 for the second EU country and the second selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Slovakia on the second eu-country-sold-from page
    And the user selects Poland on the first eu-country-sold-to/2 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/2 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/2 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/2 page
    Then the user is on the check-sales-from-eu/2/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/2 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Croatia on the third eu-country-sold-from page
    And the user selects Portugal on the first eu-country-sold-to/3 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/3 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/3 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/3 page
    Then the user is on the check-sales-from-eu/3/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/3 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Republic of Cyprus on the fourth eu-country-sold-from page
    And the user selects Netherlands on the first eu-country-sold-to/4 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/4 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/4 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/4 page
    Then the user is on the check-sales-from-eu/4/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/4 page
    And the user answers yes on the add-sales-from-eu page
    And the user selects Malta on the fifth eu-country-sold-from page
    And the user selects Romania on the first eu-country-sold-to/5 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/5 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 100000 for first selected VAT rate on the eu-sales-from-eu/5 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/5 page
    Then the user is on the check-sales-from-eu/5/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/5 page
    And the user answers no on the add-sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return

    Examples:
      | vrn       |
      | 100000003 |
#     add vrns here


#  This scenario can be ran for a VRN that has been through the small return or the large return scenario
  Scenario Outline: A user completes a nil second return with corrections for the previous period
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment <vrn> and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Spain for the first period on the correction-country page
    And the user adds the first declared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers yes on the vat-correction-list/1 page
    And the user selects the second country as Austria for the first period on the correction-country page
    And the user answers yes on the add-new-country/1/2 page
    And the user adds the second undeclared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/2 page
    And the user is on the vat-payable-check/1/2 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user submits their return

    Examples:
      | vrn       |
      | 100000002 |
#     add vrns here


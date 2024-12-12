@Returns

Feature: Corrections Feature

  Scenario: A user adds corrections for their previous return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Croatia for the first period on the correction-country page
    And the user adds the first declared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers yes on the vat-correction-list/1 page
    And the user selects the second country as France for the first period on the correction-country page
    And the user adds the second declared correction amount as -1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/2 page
    And the user is on the vat-payable-check/1/2 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user adds a correction for a country that was not on their previous return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Bulgaria for the first period on the correction-country page
    And the user answers yes on the add-new-country/1/1 page
    And the user adds the first undeclared correction amount as 5000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user says no to adding a correction to their return
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers no on the correct-previous-return page
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user is offered a single period to correct and chooses No
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers no on the correction-return-single-period/1 page
    Then the user is on the no-correction-periods-available page
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

  Scenario: A user changes data on their correction in progress and via vat-payable-check
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Croatia for the first period on the correction-country page
    And the user adds the first declared correction amount as 2000 for the first period on the country-vat-correction-amount page
    And the user answers no on the vat-payable-confirm/1/1 page
    Then the user changes the answer to 3000
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    Then the user selects the change link for first-change-country-vat-correction-amount\/1\/1
    Then the user changes the answer to 1500
    And the user answers yes on the first-change-vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user changes and removes data on their correction in vat-correction-list
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Croatia for the first period on the correction-country page
    And the user adds the first declared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers yes on the vat-correction-list/1 page
    And the user selects the second country as France for the first period on the correction-country page
    And the user adds the second declared correction amount as -1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/2 page
    And the user is on the vat-payable-check/1/2 page
    And the user continues from the vat-payable-check page
    And the user is on the vat-correction-list/1 page
    And the user selects the change link for second-change-vat-payable-check\/1\/1
    And the user selects the change link for second-change-country-vat-correction-amount\/1\/1
    And the user changes the answer to 4500
    And the user answers yes on the second-change-vat-payable-confirm/1/1 page
    And the user is on the second-change-vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user is on the vat-correction-list/1 page
    And the user selects the remove link for remove-country-correction\/1\/2
    And the user answers yes on the remove-country-correction/1/2 page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user changes and removes data on their correction in vat-correction-periods
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Croatia for the first period on the correction-country page
    And the user adds the first declared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers yes on the vat-correction-list/1 page
    And the user selects the second country as France for the first period on the correction-country page
    And the user adds the second declared correction amount as -1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/2 page
    And the user is on the vat-payable-check/1/2 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    Then the user selects the change link for third-change-vat-correction-list\/1
    And the user is on the third-change-vat-correction-list/1 page
    And the user answers no on the third-change-vat-correction-list/1 page
    Then the user selects the remove link for remove-period-correction\/1
    And the user answers yes on the remove-period-correction/1 page
    Then the user is on the correct-previous-return page
    And the user answers yes on the correct-previous-return page
    Then the user is on the correction-return-single-period/1 page

  Scenario: A user can submit a return with only minus corrections for a previously declared country
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Croatia for the first period on the correction-country page
    And the user adds the first declared correction amount as -5000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user submits a full return with corrections
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000003 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
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
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Croatia for the first period on the correction-country page
    And the user adds the first declared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers yes on the vat-correction-list/1 page
    And the user selects the second country as France for the first period on the correction-country page
    And the user adds the second declared correction amount as -1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/2 page
    And the user is on the vat-payable-check/1/2 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user adds corrections for multiple previous returns
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000004 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    Then the user is on the correction-return-period/1 page
    And the user selects the first return period
    And the user selects the first country as Croatia for the first period on the correction-country page
    And the user answers yes on the add-new-country/1/1 page
    And the user adds the first undeclared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    Then the user answers yes on the vat-correction-periods-add page
    And the user answers yes on the correction-return-single-period/2 page
    And the user selects the first country as Denmark for the second period on the correction-country page
    And the user answers yes on the add-new-country/2/1 page
    And the user adds the first undeclared correction amount as 5000 for the second period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/2/1 page
    And the user is on the vat-payable-check/2/1 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/2 page
    Then the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user submits their return






@Returns

Feature: Transferring MSID feature

  Scenario: A user who has transferred from another member state has a partial first return and a second full return period available
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000007 and strong credentials
    Then the user is directed back to the index page
    Then the user clicks on the Start your return link
    And the user transferring from another MSID is offered a partial return for the correct period
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects France on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user ticks the second checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 1234.56 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    And the user enters first EU country total sales of 7894 for second selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-northern-ireland page
    And the user selects Germany on the second eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the second eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters second EU country total sales of 1111 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    And the user transferring from another MSID is submitting a partial return for the correct period
    Then the user submits their return
    When the user clicks on the Back to your account link
    Then the user clicks on the View past returns link
    Then the user is on the past-returns page
    Then the user clicks on the 9 June to 30 June 2023 link
    And the user is on the past-returns/2023-Q2 page
    And the user transferring from another MSID has the correct partial dates in the past return
    And the user clicks on the your-account breadcrumb
    And the user is on the your-account page
    Then the user clicks on the Start your return link
    And the user transferring from another MSID is offered a full return for the correct period
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Portugal on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user ticks the second checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 1000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    And the user enters first EU country total sales of 2000 for second selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-northern-ireland page
    And the user selects Spain on the second eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the second eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters second EU country total sales of 321.25 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Croatia for the first period on the correction-country page
    And the user answers yes on the add-new-country/1/1 page
    And the user adds the first undeclared correction amount as 1000 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    Then the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user submits their return

  Scenario: A user who is transferring to another member state has a full first return and a final partial return period available
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000015 and strong credentials
    When the user is directed back to the index page
    Then they are presented with the correct banner for trader with an exclusion date in the past with a return due
    And the user clicks on the Start your return link
    Then the user transferring to another MSID is offered a full return for the correct period
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Slovenia on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user ticks the second checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 654.21 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    And the user enters first EU country total sales of 987 for second selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-northern-ireland page
    And the user selects Slovakia on the second eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the second eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters second EU country total sales of 1020 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    And the user transferring to another MSID is submitting a full return for the correct period
    Then the user submits their return
    When the user clicks on the Back to your account link
    Then the user is presented with the corrections warning regarding their final return
    Then the user clicks on the Start your return link
    And the user transferring to another MSID is offered a partial return for the correct period
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Portugal on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user ticks the second checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 1234.56 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    And the user enters first EU country total sales of 111 for second selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the second selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers yes on the add-sales-from-northern-ireland page
    And the user selects Spain on the second eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the second eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters second EU country total sales of 98741 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Croatia for the first period on the correction-country page
    And the user answers yes on the add-new-country/1/1 page
    And the user adds the first undeclared correction amount as 1234.21 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    Then the user clicks the continue button
    Then the user is on the check-your-answers page
    And the user transferring to another MSID is submitting a partial return for the correct period
    Then the user submits their return
    When the user clicks on the Back to your account link
    Then the user clicks on the View past returns link
    Then the user is on the past-returns page
    Then the user clicks on the 1 July to 8 September 2023 link
    And the user is on the past-returns/2023-Q3 page
    And the user transferring to another MSID has the correct partial dates in the past return




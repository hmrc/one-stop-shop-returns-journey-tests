@Returns

Feature: Exclusion feature

  Scenario: A user completes their final two returns when excluded by HMRC with reason 2
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000011 and strong credentials
    Then the user is directed back to the index page
    Then they are presented with the correct banner for trader removed from service and has outstanding returns
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return
    And the user clicks on the Back to your account button
    Then they are presented with the correct banner for trader removed from service and has outstanding returns
    Then the user sees the final return message on the dashboard
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers yes on the sales-from-northern-ireland page
    And the user selects Slovenia on the first eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the first eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters first EU country total sales of 2635 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers yes on the sales-from-eu page
    And the user selects Poland on the first eu-country-sold-from page
    And the user selects Bulgaria on the first eu-country-sold-to/1 page
    And the user ticks the first checkbox on the first eu-vat-rates-from-eu/1 page
    And the user clicks the continue button
    And the user enters first EU country total sales of 58741 for first selected VAT rate on the eu-sales-from-eu/1 page
    And the user confirms the vat for the first EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-eu/1 page
    Then the user is on the check-sales-from-eu/1/1 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-eu-to-eu/1 page
    And the user answers no on the add-sales-from-eu page
    And the user answers yes on the correct-previous-return page
    And the user answers yes on the correction-return-single-period/1 page
    And the user selects the first country as Bulgaria for the first period on the correction-country page
    And the user answers yes on the add-new-country/1/1 page
    And the user adds the first undeclared correction amount as 4123 for the first period on the country-vat-correction-amount page
    And the user answers yes on the vat-payable-confirm/1/1 page
    And the user is on the vat-payable-check/1/1 page
    And the user continues from the vat-payable-check page
    And the user answers no on the vat-correction-list/1 page
    And the user is on the vat-correction-periods page
    And the user clicks the continue button
    Then the user is on the check-your-answers page
    Then the user sees the exclusion submission message
    Then the user submits their return
    And the user clicks on the Back to your account button
    Then they are presented with the correct banner for trader removed from service and has no outstanding returns
    Then the user manually navigates to the 2022-Q3 start page
    And the user is on the excluded-cannot-use-service page

  Scenario: A user can complete one of their remaining returns with trader exclusion reason 1
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000013 and strong credentials
    Then the user is directed back to the index page
    Then they are presented with the correct banner for trader with an exclusion date in the past with a return due
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
    And the user answers yes on the add-sales-from-northern-ireland page
    And the user selects France on the second eu-country-from-northern-ireland page
    And the user ticks the first checkbox on the second eu-vat-rates-from-northern-ireland page
    And the user clicks the continue button
    And the user enters second EU country total sales of 500000 for first selected VAT rate on the eu-sales-from-northern-ireland page
    And the user confirms the vat for the second EU country as the suggested amount for the first selected VAT rate on the vat-on-sales-from-northern-ireland page
    Then the user is on the check-sales-from-northern-ireland/2 page
    And the user clicks the continue button
    And the user answers no on the add-sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user submits their return
    And the user clicks on the Back to your account button

  Scenario: A user completes their final return when excluded by HMRC with reason 4 - quarantined
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000014 and strong credentials
    Then the user is directed back to the index page
    Then they are presented with the correct banner for a quarantined trader with outstanding returns
    Then the user clicks on the Start your return link
    And the user answers yes on the start page
    And the user answers no on the sales-from-northern-ireland page
    And the user answers no on the sales-from-eu page
    Then the user is on the check-your-answers page
    Then the user sees the exclusion submission message
    Then the user submits their return
    And the user clicks on the Back to your account button
    Then they are presented with the correct banner for a quarantined trader with no outstanding returns
    Then the user manually navigates to the 2022-Q3 start page
    And the user is on the excluded-cannot-use-service page

  Scenario: A non-excluded user selects Leave this service from the dashboard
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    Then the user is directed back to the index page
    When the user clicks on the Leave this service link
    Then the user has been redirected to the exclusions service

  Scenario: An excluded user cannot access the exclusions journey
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000013 and strong credentials
    Then the user is directed back to the index page
    And the link to Leave this service is not displayed on the dashboard

  Scenario: A user who is excluded in the future sees the correct dashboard messages when they have outstanding returns
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 600000018 and strong credentials
    And the user is directed back to the index page
    Then they are presented with the correct banner for trader with an exclusion date in the future with outstanding returns
    And the link to Rejoin this service is not displayed on the dashboard
    When the user clicks on the Start your return link
    Then the user is on the 2024-Q1/start page

  Scenario: A user who has left the service and has no outstanding actions
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 600000019 and strong credentials
    And the user is directed back to the index page
    Then they are presented with the correct banner for trader with an exclusion date in the past and no outstanding actions
    And they are shown the correct returns message for no outstanding returns
    And the returns tile shows final return is completed
    When the user clicks on the Rejoin this service link
    Then the user has been redirected to the rejoin journey

  Scenario: A user who has left the service and has outstanding returns
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 600000020 and strong credentials
    And the user is directed back to the index page
    Then they are presented with the correct banner for trader with an exclusion date in the past with a return due
    And they are shown the correct returns message for outstanding returns
    When the user clicks on the Start your return link
    Then the user is on the 2024-Q1/start page

  Scenario: A user who has been removed from the service and has outstanding returns
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 600000011 and strong credentials
    And the user is directed back to the index page
    Then they are presented with the correct banner for trader removed from service and has outstanding returns
    And they are shown the correct returns message for outstanding returns
    And the link to Rejoin this service is not displayed on the dashboard
    When the user clicks on the Start your return link
    Then the user is on the 2022-Q1/start page

  Scenario: A user who has been removed from the service and has no outstanding returns
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 600000021 and strong credentials
    And the user is directed back to the index page
    Then they are presented with the correct banner for trader removed from service and has no outstanding returns
    And they are shown the correct returns message for no outstanding returns
    And the returns tile shows final return is completed
    And the user clicks on the Rejoin this service link
    Then the user has been redirected to the rejoin journey

  Scenario: A user who has been excluded and has outstanding returns
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 100000025 and strong credentials
    And the user is directed back to the index page
    Then they are presented with the correct banner for a quarantined trader with outstanding returns
    And they are shown the correct returns message for outstanding returns
    And the link to Rejoin this service is not displayed on the dashboard
    When the user clicks on the Start your return link
    Then the user is on the 2024-Q1/start page

  Scenario: A user who has been excluded and has no outstanding returns
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 100000026 and strong credentials
    And the user is directed back to the index page
    Then they are presented with the correct banner for a quarantined trader with no outstanding returns
    And they are shown the correct returns message for no outstanding returns
    And the returns tile shows final return is completed
    And the link to Rejoin this service is not displayed on the dashboard

  Scenario: A user who is excluded can cancel their request to leave within the correct timescales
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 100000027 and strong credentials
    And the user is directed back to the index page
    And the user clicks on the Cancel your request to leave link
    Then the user has been redirected to the exclusions service

  Scenario: A user who is excluded cannot cancel their request to leave outside of the correct timescales
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 600000017 and strong credentials
    And the user is directed back to the index page
    And the link to Cancel your request to leave this service is not displayed on the dashboard

  Scenario: A user who is excluded by HMRC cannot reverse exclusion - ceased trade
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 100000030 and strong credentials
    And the user is directed back to the index page
    And the link to Cancel your request to leave this service is not displayed on the dashboard

  Scenario: A user who is excluded by HMRC cannot reverse exclusion - no longer meets conditions
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 100000031 and strong credentials
    And the user is directed back to the index page
    And the link to Cancel your request to leave this service is not displayed on the dashboard

  Scenario: A user who is not excluded does not have the option to enter the reversal or rejoin journeys on the dashboard
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 100000002 and strong credentials
    And the user is directed back to the index page
    And the link to Cancel your request to leave this service is not displayed on the dashboard
    And the link to Rejoin this service is not displayed on the dashboard

  Scenario: A user who has reversed their exclusion can leave the service again
    Given the user accesses the service
    When the user signs in as an Organisation Admin with VAT enrolment 100000029 and strong credentials
    And the user is directed back to the index page
    And the user clicks on the Leave this service link
    Then the user has been redirected to the exclusions service


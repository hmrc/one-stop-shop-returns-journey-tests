@Returns

Feature: Expired VRN Rejoin feature

  Scenario: A trader who has left the service with outstanding returns and now has an expired VRN
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000002 and strong credentials
    Then the user is directed back to the index page
    Then they are presented with the correct banner for expired VRN trader who has left the service and has outstanding returns
    And the link to Rejoin this service is not displayed on the dashboard

  Scenario: A trader who has left the service with no outstanding returns and now has an expired VRN
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000003 and strong credentials
    Then the user is directed back to the index page
    Then they are presented with the correct banner for expired VRN trader who has left the service and has no outstanding returns
    And the link to Rejoin this service is not displayed on the dashboard

  Scenario: A trader who has been removed from the service with outstanding returns and now has an expired VRN
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000004 and strong credentials
    Then the user is directed back to the index page
    Then they are presented with the correct banner for expired VRN trader removed from service and has outstanding returns
    And the link to Rejoin this service is not displayed on the dashboard

  Scenario: A trader who has been removed from the service with no outstanding returns and now has an expired VRN
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000005 and strong credentials
    Then the user is directed back to the index page
    Then they are presented with the correct banner for expired VRN trader removed from service and has no outstanding returns
    And the link to Rejoin this service is not displayed on the dashboard

  Scenario: A trader who has left the service with outstanding returns older than 3 years and now has an expired VRN
    Given the user accesses the service
    And the user signs in as an Organisation Admin with VAT enrolment 600000006 and strong credentials
    Then the user is directed back to the index page
    Then they are presented with the correct banner for expired VRN trader who has left the service and has outstanding returns
    And a dashboard message is displayed for a return outstanding for more than 3 years
    And the link to Rejoin this service is not displayed on the dashboard

    Notes:
    Will also need to manually check payment for 600000007 after submitting the return
    Add kickout page test to registration


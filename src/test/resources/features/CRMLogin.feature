Feature: Authorization in CRM Admin Panel

  Scenario: Logging in with valid credentials
    Given the user is on the CRM Admin Panel login page
    When the user enters valid email "denis.m@gbl-factory.com" and password "123456789"
    And the user clicks the Login button
    Then the user should be successfully logged in and see the dashboard
s
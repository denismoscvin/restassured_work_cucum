Feature: Application Login

  Scenario: Home Page default login
    Given User is in NetBanking Landing page
    When User login into application with login "jin" and password "1234"
    Then Home page is populated
    And Cards are displayed

  Scenario: Home Page default login
    Given User is in NetBanking Landing page
    When User login into application with login "john" and password "4321"
    Then Home page is populated
    And Cards are displayed

#  Scenario: Successful Login
#    Given the user is on the login page
#    When the user enters valid credentials (username and password)
#    And clicks the login button
#    Then the user should be redirected to the dashboard page
#    And a welcome message should be displayed
#
#  Scenario: Unsuccessful Login (Negative Testing)
#    Given the user is on the login page
#    When the user enters invalid credentials (incorrect username or password)
#    And clicks the login button
#    Then an error message should be displayed
#    And the user should remain on the login page
Feature: Application Login

  Scenario: Home Page default login "jin"
    Given User is in NetBanking Landing page
    When User login into application with login "jin" and password "1234"
    Then Home page is populated
    And Cards are displayed

  Scenario: Home Page default login "john"
    Given User is in NetBanking Landing page
    When User login into application with login "john" and password "4321"
    Then Home page is populated
    And Cards are displayed

#Feature: Login Functionality
#
#  Scenario: Login with invalid username
#    Given the user is on the login page
#    When the user enters an invalid username
#    And enters a valid password
#    And clicks the "Login" button
#    Then the user should see an error message
#
#  Scenario: Login with invalid password
#    Given the user is on the login page
#    When the user enters a valid username
#    And enters an invalid password
#    And clicks the "Login" button
#    Then the user should see an error message
#
#  Scenario: Login with both invalid username and password
#    Given the user is on the login page
#    When the user enters an invalid username
#    And enters an invalid password
#    And clicks the "Login" button
#    Then the user should see an error message
#
#  Scenario: Login with empty fields
#    Given the user is on the login page
#    When the user leaves both username and password fields empty
#    And clicks the "Login" button
#    Then the user should see an error message


Feature: Logout
  Actor: User
  Description: The User's logout process out of the system

  Scenario: User can logout
    Given that the user "Dima" is logged in
    When user wants to log out
    Then the user logs out
    And user is redirected to the login portal


Feature: Login
  The user wants to access his personal account

  Background:
    Given table
      | Dima     | D        |
      | Roa     | R        |
      | Aya     | A        |



  Scenario: owner logged in successfully
    Given  the owner "Dima" is not logged in
    And  The owner has entered the data correctly  "Dima" , "D"
    Then the owner is logged in


  Scenario: owner cannot login
    Given the owner "Dima" is not logged in
    And username is "Dima" and password is "wrongpassword"
    Then the owner login fails



  Scenario: tenant logged in successfully
    Given  the tenant "Roa" is not logged in
    And  The tenant has entered the data correctly  "Roa" , "R"
    Then the tenant is logged in


  Scenario: tenant cannot login
    Given the tenant "Roa" is not logged in
    And username is "Roa" and password is "wrongpassword"
    Then the tenant login fails



  Scenario: Admin logged in successfully
    Given  the Admin "Aya" is not logged in
    And  The Admin has entered the data correctly  "Aya" , "A"
    Then the Admin is logged in


  Scenario: Admin cannot login
    Given the Admin "Aya" is not logged in
    And username is "Aya" and password is "wrongpassword"
    Then the Admin login fails


  Scenario: login info do not match
    Given  no user is not logged in
    When user tries to log in
    And the username is "nonexistent" and the password is "wrongpassword"
    Then login fails
    And the user is redirected to sign up


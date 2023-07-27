Feature: Sign up
  Actor: User

  Scenario: The owner wants to sign up
    Given  the user chose type owner
    And they do not have an account in the system
    Then the sign up succeeds
    And the user is redirected to the login

Scenario: The sign up is unsuccessful for owner
Given that the user is  not logged in
And they have an account in the system
Then the sign up fails
And the user is prompted to try again


  Scenario: The admin wants to sign up
    Given  the user chose type admin
    And they do not have an account in the system
    Then the sign up succeeds
    And the user is redirected to the login

Scenario: The sign up is unsuccessful for admin
Given that the user is  not logged in
And they have an account in the system
Then the sign up fails
And the user is prompted to try again



  Scenario: The tenant wants to sign up
    Given  the user chose type tenant
    And they do not have an account in the system
    Then the sign up succeeds
    And the user is redirected to the login

Scenario: The sign up is unsuccessful for tenant
Given that the user is  not logged in
And they have an account in the system
Then the sign up fails
And the user is prompted to try again


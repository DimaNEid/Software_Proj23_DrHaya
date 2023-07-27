Feature: Viewing User's Personal Data
  Actor: User
  Description: User could see his personal information

  Scenario: The User view's his personal data successfully
    Given that the user "ayaayman" is logged in
    Then the user could see his personal data (successfully)


  Scenario: The User view's his personal data (fails)
    Given that the user "ayaayman" is not logged in
    Then the user could'nt see his personal data (fails)
    And the user is prompted to try again
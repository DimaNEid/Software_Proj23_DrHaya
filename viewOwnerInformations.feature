Feature:  Viewing The name of the residence owner and his contact information
  Actor: User
  Description:  The user could view the name of the residence owner and his contact information

  Scenario: The User view's  the name of the residence owner and his contact information (successfully)
    Given that the user "ayaayman" is logged in
    Then the user could see  The name of the residence owner and his contact information

  Scenario: The User view's  the name of the residence owner and his contact information (fails)
    Given that the user "ayaayman" is not logged in
    Then the user could'nt see  the name of the residence owner and his contact information
    And the user is prompted to try again


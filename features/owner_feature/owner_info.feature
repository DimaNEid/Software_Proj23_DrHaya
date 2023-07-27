Feature: Adding Owner Information
  Description : A certain owner wants to add his contact information
  Actor : Owner

  Scenario: Owner Information Added Successfully
    Given : The owner "Dima" is logged in
    When  : The owner selects add contact information
    Then  : The owner adds the info
    And : The info are added
Feature: addResidence

  Scenario: Adding Residence
    Given The owner wants to add Resident
    When  The residenceId "52" is new
    Then  The residence is add

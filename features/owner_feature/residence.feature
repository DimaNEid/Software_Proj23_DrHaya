Feature: Residence
  Description: Add Residence by the owner
  Actor: owner

  Scenario: Adding Residence Successfully
    Given : The owner "Dima" is logged in
    When : The owner wants to add a Residence with residence "id"
    Then : The Residence is added to Residence table

  Scenario: Adding Residence UnSuccessfully
    Given : The owner "Dima" is logged in
    When : The owner wants to add a Residence with owner "id"
    Then : The Residence is already exist

    Scenario: view residences
      Given : The owner "Dima" is logged in
      And : The owner selected view residences
      Then : all residences should be shown


  Scenario: view houses
    Given : The owner"Dima" selected one residence
    Then : all houses should be shown


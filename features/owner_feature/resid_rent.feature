Feature: Add Residence Monthly Rent
  Description:add a monthly rent for a house in a certain residence
  Actors: owner

  Scenario: Adding the monthly rent for houses in a Residence
    Given : that the owner "Dima" is logged in
    When : the owner selects a residence
    Then : the owner adds its monthly rent


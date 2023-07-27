Feature: Dashboard
  Description : The Owner wants to see al the details about each Residence including the houses
  Actor : Owner

Feature: Dashboard owner control panel

  Scenario: View housing details
    Given the housing appears in the control panel
    When the owner selects a housing
    Then the number of tenants is displayed
    And the number of floors is displayed
    And the owner can select a specific floor

  Scenario: View apartment details
    Given the owner has selected a specific floor
    When the owner selects an apartment
    Then the names of tenants and means of communication are displayed
    And the number of bathrooms and bedrooms are displayed
    And the presence of a balcony is indicated
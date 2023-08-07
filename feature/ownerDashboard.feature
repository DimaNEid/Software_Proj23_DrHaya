Feature: ownerDashboard

  Scenario: The Owner wants to see the details
    Given The owner is has chosen from the panel
    When  The owner enters available residence Id "51" and floor Id "2"
    And   The house Id "510" exists
    Then  house details are shown
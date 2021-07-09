Feature: Login Functionally

  Scenario: Login with validate username and password
    Given Navigate to Basqar
    And   Enter username and password
    Then  Success message should be displayed

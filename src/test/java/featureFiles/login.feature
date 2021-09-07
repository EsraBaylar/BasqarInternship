

Feature: Login

  Scenario: Login with valid username and password

    Given Navigate to basqar
    And Enter username and password and click login button
    Then User should login successfully
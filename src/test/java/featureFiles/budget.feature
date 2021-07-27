Feature: Budget Funktionality

  Background:login steps
    Given Navigate to Basqar
    And Enter valid username and password
    Then  Success message should be displayed


  Scenario: Create a Budget
    And Navigate to budget page
    When Create a budget
    Then User should see success message

  Scenario: edit Budget
    When Navigate to budget page
    Then click Edit
    Then User should see success message

  Scenario: delete Budget
    When Navigate to budget page
    Then click Delete button and confirm deleting
    Then User should see success message
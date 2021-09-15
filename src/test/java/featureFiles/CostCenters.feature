Feature: Budget Cost Centers Funktionality

  Background:login steps
    Given Navigate to Basqar
    And Enter valid username and password
    Then  Success message should be displayed

  Scenario: Add a CostCenter
    And Click on the Budget
    And Click on the Setup
    And Click on the Costcenters
    And Click on the add button
    And Fill the required fields
    |test123|
    |tst12|
    |test123,|

    When Click on the save button
    Then User should see success message

  Scenario: Delete a CostCenter
    And Click on the Budget
    And Click on the Setup
    And Click on the Costcenters
    And Click on the Delete button
    When User clicks on the delete button
    Then User should see success message
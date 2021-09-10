Feature: create new salary constants

  Background:
    Given Navigate to Basqar
    Then   Enter valid username and password
    Then  Success message should be displayed


  Scenario Outline: create new constants
    When click Human Resources then Setup then Salary Constants
    Then click Add Button and fill the form "<name>", "<key>", "<value>"  and Save
    Then Success message should be displayed
    Examples:
      | name  | key  | value |
      | old  |  key1 | 3200  |

  Scenario Outline: edit constants
    When click Human Resources then Setup then Salary Constants
    Then click Edit Button and fill the form fields "<name>", "<key>", "<value>"  and Save
    Then Success message should be displayed
    Examples:
      | name | key  | value |
      | new  | key2 | 3200  |


  Scenario: delete salary constants
    When click Human Resources then Setup then Salary Constants
    Then click Delete button and confirm deleting
    Then Success message should be displayed
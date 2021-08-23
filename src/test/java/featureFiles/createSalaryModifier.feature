Feature: Creating new Salary modifier

  Background:
    Given Navigate to Basqar
    Then   Enter valid username and password
    Then  Success message should be displayed

  Scenario Outline: create new modifier
    When click Human Resources then Setup then Salary Modifiers
    Then click Add Button and fill the form fields "<Description>", "<Variable>", "<Priority>", "<Amount>"  and Save
    Then Success message should be displayed
    Examples:
      | Description     | Variable      | Priority | Amount |
      | old description | Euro | 1        | 3200   |

  Scenario Outline: edit salary modifier
    When click Human Resources then Setup then Salary Modifiers
    Then click Edit and fill fields "<Description1>", "<Variable1>", "<Priority1>", "<Amount1>"
    Then Success message should be displayed
    Examples:
      | Description1    | Variable1 | Priority1 | Amount1 |
      | new description | Dollar    | 2         | 2300    |


  Scenario: delete salary modifier
    When click Human Resources then Setup then Salary Modifiers
    Then click Delete button and confirm deleting
    Then Success message should be displayed






Feature: Creating new Salary modifier

  Background:login steps
    Given navigate to website
    When enter valid login and password
    Then Accept cookies
    And verify login

  Scenario: create new modifier
    When click Human Resources then Setup then Salary Modifiers
    Then click Add Button and fill the form fields and Save
    Then Success message should be displayed

  Scenario: edit salary modifier
    When click Human Resources then Setup then Salary Modifiers
    Then click Edit
    Then Success message should be displayed


#      Scenario: delete salary modifier
#        When click Human Resources then Setup then Salary Modifiers
##        And enter search keyword and click search button
#        Then click Delete button and confirm deleting
#        Then Success message should be displayed





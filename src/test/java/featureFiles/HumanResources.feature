Feature: PositionSalary

  Background:
#    Given Navigate to basqar
#    When Enter Password and Username and click button
#    Then  User muss login successfully


  Scenario: Navigate to Human Resources
    When Click to Human Resources and Setup and Position Salary
    And Add Position Salary
    And Delete to Position Salary

    When Click to Positions
    And Add position and Name and ShortName
    And Save and Delete to Positions
    And  Then Success message should be displayed


Feature: Login Education


  Background:
    Given Navigate to Basqar
    Then   Enter valid username and password
    Then  Success message should be displayed

  Scenario Outline: Education and Setup and Subjects

    When Click on education
    And  Click on Setup
    And Click on Subjects
    And Click on addSubjects
    When Add a Subjects  name as "<SubjectsName>" Subjects code"<SubjectCode>"
    And Click on Subjects category
    And Click on InformationTechnology
    And Click on Save Button
    Then User should see success message

    Examples:
      | SubjectsName | SubjectCode |
      | TestSubject  | ts          |

  Scenario Outline: Subject Delete
    When Click on education
    And  Click on Setup
    And Click on Subjects
    And delete inputName "<SubjectsName>"
    And click search button
    And click  on delete buttons
    Then User should see success message
    Examples:
      | SubjectsName |
      | TestSubject  |

Feature: Login MySubjectCat

  Background:
    Given Navigate to Basqar
    Then   Enter valid username and password
    Then  Success message should be displayed

  Scenario Outline: Creation New Subject Category
    When Click on education
    And  Click on Setup
    And Click on SubjectCategory
    And Click on addSubjectCategory
    When User a Subject Categories name as "<SubjectCategoryName>" Subject Categories code"<SubjectCategoriesCode>"
    And Click on Save Button
    Then User should see success message

    Examples:
      | SubjectCategoryName | SubjectCategoriesCode |
      | MySubjectCat        | cat                   |

  Scenario Outline: Creation New Subject Under MySubjectCat
    When Click on education
    And  Click on Setup
    And Click on Subjects
    And Click on addSubjects
    When Add a Subjects  name as "<SubjectsName>" Subjects code"<SubjectCode>"
    And Click on Subjects category
    And Click on MySubjectCat
    And Click on Save Button
    Then User should see success message
    Examples:
      | SubjectsName | SubjectCode |
      | sbjtCt       | 9876        |

  Scenario Outline: Try to delete MySubjectCat
    When Click on education
    And Click on Setup
    And Click on SubjectCategory
    And deletion actions "<SubjectCategoryName1>"
    Then User should see error message
    Examples:
      | SubjectCategoryName1 |
      | MySubjectCat         |

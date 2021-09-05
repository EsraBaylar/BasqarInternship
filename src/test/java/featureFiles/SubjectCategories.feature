Feature: SubjectCategories

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: create new SubjectCategorie

    When click on Education/Education/SubjectCategories
    And Add new SubjectCategorie
    And  Create a new SubjectCategorie name as "<nameInput>" code as "<codeInput>"
    And Delete a SubjectCategorie name as "<nameInput>"


    Examples:
      | nameInput | codeInput |
      |    temiz     |  kod |
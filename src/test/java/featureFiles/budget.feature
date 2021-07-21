         Feature: Budget Funktionality



             Scenario: Create a Budget
             Given Navigate to Basqar
             And   Enter username and password
             Then  Success message should be displayed
             And Navigate to budget page
             When Create a budget
             Then Success message should be displayed

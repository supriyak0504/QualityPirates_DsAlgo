Feature: Login

  Scenario Outline: Login with different credentials

    Given User clicks on sign in option
    When The user enters the sheetName "<SheetName>" and rowNumber <RowNumber>
    When User click LogIn Button
    Then The signed in homepage appears

    Examples:
      | SheetName       |  RowNumber  |
      |LogIn_Credentials|0|
      |LogIn_Credentials|1|
      |LogIn_Credentials|2|
      |LogIn_Credentials|3|
      |LogIn_Credentials|4|
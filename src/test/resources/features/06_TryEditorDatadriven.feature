
Feature: Try Editor

 Scenario Outline:Try Editor with data-driven

    Given User should able to access try editor link "https://dsportalapp.herokuapp.com/tryEditor"
    When User enter valid "<Code>"in try editor box
    And   user click on Run button
   Then  User should able to see the output
    Examples:
      | Code |
      |print \"hello\"|
      |InvalidCode |

  Scenario: Back to HomePage
    Given The user is on Try Editor Page
    When User Click to go back
    When User click Numphy Ninja link
    When User click GetStarted link
    Then User should be redirected to Home Page page

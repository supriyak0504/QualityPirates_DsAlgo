
Feature: Stack

  Scenario: User is on Ds portal main page
    Given User is on home/Stack page
    When User clicks on Get Started button under Stack section
    Then User is redirected on Stack page

  Scenario: Operations in Stack
    When User click on Operations in Stack link under Topics Covered section
    Then User is redirected on Stack/Operations in Stack
    And User scrolls down on Operations in Stack page
    And User clicks on Try here button
    Then the text editor opens and user gives python code
    And User clicks on Run Button
    Then The output is displayed


  Scenario: Implementation
    Given User is on Stack/Operations in Stack page
    When User clicks on Implementation link under Topics Covered section
    Then User is redirected on Stack/Implementation page
    And User clicks on Try here button
    Then the text editor opens and user gives python code
    And User clicks on Run Button
    Then The output is displayed


  Scenario: Applications
    Given User is on Stack page
    When User clicks on Applications link under Topics Covered section
    Then User is redirected to Stack/Stack-Applications
    And User clicks on Try here button
    Then the text editor opens and user gives python code
    And User clicks on Run Button
    Then The output is displayed


  Scenario: Practice Questions
    Given User is on Stack page
    Then User clicks on Operations in Stacks link
    When User clicks on Practice Questions link under Stack section
    Then User is redirected on Practice Questions page
    And User goes back on Stack Page





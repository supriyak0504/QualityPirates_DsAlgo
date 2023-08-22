
Feature: Graph

  Scenario: User is on Ds portal main page
    Given User is on home/Graph page
    When User click on Get Started button under Graph
    And User is redirected on Graph page
    Then User clicks on Graph link under Topics Covered section

  Scenario: Graph Page
    Given User is on Graph Page under Graph section
    When User scrolls down on the Graph Page
    And User clicks on Try here button
    Then the text editor opens and user gives python code
    And User clicks on Run Button
    Then The output is displayed


  Scenario: Graph Representations
    Given User is on Graph Page
    When User clicks on Graph Representations link on Graph Page
    And Scrolls down on the page
    And User clicks on Try here button
    Then the text editor opens and user gives python code
    And User clicks on Run Button
    Then The output is displayed


  Scenario: Practice Questions
    Given User is on Graph Page page
    When User clicks on Practice Questions link
    And User is redirected on "Practice Questions" page
    Then User goes back on Graph Page

    Scenario: Graph Representations link
      Given User is on Graph Page
      When User clicks on Graph Representation link under Topics covered
      And Scrolls down on the page
      And User clicks on Try here button
      Then the text editor opens and user gives python code
      And User clicks on Run Button
      Then The output is displayed


  Scenario: Back to HomePage
    Given The user is on "Graph" page
    When User click Numphy Ninja link
    When User click GetStarted link
    Then User should be redirected to Home Page page



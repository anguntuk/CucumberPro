Feature: Login

  Scenario: Success
    Given User enters username
    When User enters password
    And Click on login button
    Then Home page is displayed

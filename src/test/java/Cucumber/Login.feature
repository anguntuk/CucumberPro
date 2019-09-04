Feature: Login

  Scenario: Success
    Given User in home page
    When User enters credentials
      | username | password |
      | krish    | ahdar    |
      | ram      | atis     |
    And Click on login button
    Then Home page is displayed

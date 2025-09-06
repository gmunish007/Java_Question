Feature: Testing login functionality

  Scenario: Testing login page
    Given User is on login page
    When User enter valid "username" and "password"
    Then user navigates to dashboard after loin
    And User ends the test
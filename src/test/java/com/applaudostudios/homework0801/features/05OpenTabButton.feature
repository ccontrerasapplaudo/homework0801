@openTabButton
Feature: Test of the new tab button
  Scenario: After click on the button, a new tab must be open on the same browser window
    When user click the new tab button a new tab must be open
    Then the parent tab must be selected
    And the number of tabs open will be displayed on console
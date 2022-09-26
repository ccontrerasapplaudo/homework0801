@clickRadioButton
Feature: Test of click on radio button
  Scenario: User should be able to click on the radio buttons
    Given the user navigates to a webpage
    When the user select one of the multiple radio buttons
    Then the selected button and his ID is showed on IntelliJ console
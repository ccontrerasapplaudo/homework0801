@suggestionClassInput
Feature: Test of Suggestion class input field
  Scenario: User should be receive suggestions from the suggestions input
    Given User locate the input on the webpage
    When the user writes El Sal on the input and click on the suggested word
    Then the input value is printed on Intellij's Console
package com.applaudostudios.homework0801.stepdefinitions;

import com.applaudostudios.homework0801.Base;
import com.applaudostudios.homework0801.automationPracticePage.AutomationPracticePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class suggestionClassInputStep {

    Base base;
    private AutomationPracticePage automationPracticePage;

    public suggestionClassInputStep(Base base) {
        this.base = base;
        this.automationPracticePage = new AutomationPracticePage(base.getDriver());
    }

    @Given("User locate the input on the webpage")
    public void user_locate_the_input_on_the_webpage() throws InterruptedException {
        automationPracticePage.getSuggestionClassInput().obtainInputPlaceholder();
        base.waitTime();
    }
    @When("the user writes El Sal on the input and click on the suggested word")
    public void the_user_writes_el_sal_on_the_input_and_click_on_the_suggested_word() throws InterruptedException {
        automationPracticePage.getSuggestionClassInput().sendSuggestion();
        base.waitTime();
        automationPracticePage.getSuggestionClassInput().clickSuggestion();
        base.waitTime();
    }

    @Then("the input value is printed on Intellij's Console")
    public void the_input_value_is_printed_on_intellij_s_console() throws InterruptedException {
        automationPracticePage.getSuggestionClassInput().printExpectedResult();
        base.waitTime();
    }
}

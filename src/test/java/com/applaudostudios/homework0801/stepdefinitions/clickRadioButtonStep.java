package com.applaudostudios.homework0801.stepdefinitions;

import com.applaudostudios.homework0801.Base;
import com.applaudostudios.homework0801.automationPracticePage.AutomationPracticePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class clickRadioButtonStep {

    Base base;
    private AutomationPracticePage automationPracticePage;

    public clickRadioButtonStep(Base base) {
        this.base = base;
        this.automationPracticePage = new AutomationPracticePage(base.getDriver());
    }

    @Given("the user navigates to a webpage")
    public void the_user_navigates_to_a_webpage() throws InterruptedException {
        automationPracticePage.goTo();
        base.waitTime();
    }
    @When("the user select one of the multiple radio buttons")
    public void the_user_select_one_of_the_multiple_radio_buttons() throws InterruptedException {
        automationPracticePage.getRadioButton().clickRadioByRandomResult(3);
        base.waitTime();
    }
    @Then("the selected button and his ID is showed on IntelliJ console")
    public void the_selected_button_and_his_id_is_showed_on_intelli_j_console() throws InterruptedException {
        automationPracticePage.getRadioButton().getRadioButtonsText(3);
        base.waitTime();
    }

}

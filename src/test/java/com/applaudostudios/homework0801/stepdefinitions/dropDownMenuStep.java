package com.applaudostudios.homework0801.stepdefinitions;

import com.applaudostudios.homework0801.Base;
import com.applaudostudios.homework0801.automationPracticePage.AutomationPracticePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dropDownMenuStep {

    Base base;
    private AutomationPracticePage automationPracticePage;

    public dropDownMenuStep(Base base) {
        this.base = base;
        this.automationPracticePage = new AutomationPracticePage(base.getDriver());
    }

    @When("the user click on the dropdown menu and select option two")
    public void theUserClickOnTheDropdownMenuAndSelectOptionTwo() throws InterruptedException {
        automationPracticePage.getDropdownMenu().selectElement();
        base.waitTime();
    }

    @Then("the selection results are printed on IntelliJ's console")
    public void theSelectionResultsArePrintedOnIntelliJSConsole() throws InterruptedException {
        automationPracticePage.getDropdownMenu().selectElementUsingWebElement();
        base.waitTime();
    }
}

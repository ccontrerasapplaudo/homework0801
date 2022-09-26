package com.applaudostudios.homework0801.stepdefinitions;

import com.applaudostudios.homework0801.Base;
import com.applaudostudios.homework0801.automationPracticePage.AutomationPracticePage;
import io.cucumber.java.en.When;

public class buttonsToTestStep {

    Base base;
    private AutomationPracticePage automationPracticePage;

    public buttonsToTestStep(Base base) {
        this.base = base;
        this.automationPracticePage = new AutomationPracticePage(base.getDriver());
    }

    @When("the user clicks a navigation button, it will be redirected to the correspondent webpage")
    public void theUserClicksANavigationButtonItWillBeRedirectedToTheCorrespondentWebpage() throws InterruptedException {
        automationPracticePage.getButtonsToTest().setButtonsToTestClick();
        base.waitTime();
    }
}

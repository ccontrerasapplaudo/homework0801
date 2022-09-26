package com.applaudostudios.homework0801.stepdefinitions;

import com.applaudostudios.homework0801.Base;
import com.applaudostudios.homework0801.automationPracticePage.AutomationPracticePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class openTabButtonStep {

    Base base;
    private AutomationPracticePage automationPracticePage;

    public openTabButtonStep(Base base) {
        this.base = base;
        this.automationPracticePage = new AutomationPracticePage(base.getDriver());
    }

    @When("user click the new tab button a new tab must be open")
    public void userClickTheNewTabButtonANewTabMustBeOpen() throws InterruptedException {
        automationPracticePage.getOpenTabButton().openNewTab();
        base.waitTime();
    }

    @Then("the parent tab must be selected")
    public void theParentTabMustBeSelected() throws InterruptedException {
        automationPracticePage.getOpenTabButton().returnParentTab();
        base.waitTime();
    }

    @And("the number of tabs open will be displayed on console")
    public void theNumberOfTabsOpenWillBeDisplayedOnConsole() throws InterruptedException {
        automationPracticePage.getOpenTabButton().numberOfTabs();
        base.waitTime();
    }
}

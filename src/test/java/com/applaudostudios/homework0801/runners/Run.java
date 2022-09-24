package com.applaudostudios.homework0801.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/com/applaudostudios/homework0801/features"},
        glue = {"com.applaudostudios.homework0801.stepdefinitions"}
)
public class Run extends AbstractTestNGCucumberTests {
}
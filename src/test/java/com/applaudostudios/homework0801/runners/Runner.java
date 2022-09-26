package com.applaudostudios.homework0801.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/com/applaudostudios/homework0801/features"},
        glue = {"com.applaudostudios.homework0801.stepdefinitions","com.applaudostudios.homework0801.hook"},
        plugin = {"pretty", "html:target/cucumber"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
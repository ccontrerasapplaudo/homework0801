package com.applaudostudios.homework0801;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public class Base {
    private static WebDriver driver;

    public void setUp(){
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
            driver = WebDriverManager.firefoxdriver().create();
            driver.manage().window().maximize();
    }

    public void quitDriver(){
        if(Objects.nonNull(driver)){
            driver.quit();
        }
    }

    public void waitTime() throws InterruptedException {
        synchronized (driver){
            driver.wait(1500);
        }
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}

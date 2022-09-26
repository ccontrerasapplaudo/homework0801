package com.applaudostudios.homework0801.hook;

import com.applaudostudios.homework0801.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    Base base;

    public Hooks(Base base){
        this.base = base;
    }

    @Before("@clickRadioButton")
    public void beforeMethod(){
        base.setUp();
    }

    @After("@openTabButton")
    public void AfterMethod(){
        base.quitDriver();
    }
}

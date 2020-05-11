package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNg {

    @BeforeSuite
    public void launchBrowsera() {
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void launchBrowsers() {
        System.out.println("AfterSuite");
    }

    @BeforeClass
    public void lauhBrowsera() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void lauhBrowra() {
        System.out.println("AfterClass");
    }


    @BeforeTest
    public void launchBrowser() {
        System.out.println("BeforeTest");
    }

    @BeforeMethod
    public void verifyHomepageTitle() {
        System.out.println("BeforeMethod");
    }


    @Test(priority = 0)
    public void register(){
        System.out.println("priority 0");
    }

    @Test(priority = 1)
    public void support() {
        System.out.println("priority 1");
    }

    @AfterMethod
    public void goBackToHomepage ( ) {
        System.out.println("AfterMehod");
    }

    @AfterTest
    public void terminateBrowser(){
        System.out.println("AfterTest");
    }

    @Test(groups = { "bonding" })
    public void tc02VerifyLaunchPage() {
         System.out.println("bonding");
    }

    @Test
    public void c_method(){
        System.out.println("I'm in method C");
    }
    @Test(groups = { "bonding" })
    public void b_method(){
        System.out.println("I'm in method B");
    }

}

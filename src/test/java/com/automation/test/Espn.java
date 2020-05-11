package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Espn {

    WebDriver driver;

    @Test
    public void clickOnMothView() {
        try{
            driver.findElement(By.xpath("//span[text()='Live scores']")).click();
            Thread.sleep(5000);


            // Xpath of Live scores
            WebElement livescores = driver.findElement(By.xpath("//span[text()='Live scores']"));

            //Create object 'action' of an Actions class
            Actions action = new Actions(driver);

            //Mouseover on an element
            action.moveToElement(livescores).perform();
            Thread.sleep(5000);
            // Xpath of Month View
            driver.findElement(By.xpath("//span[text()='Month view']")).click();

            Thread.sleep(5000);


        }catch(Exception e){e.printStackTrace();}

    }

    @BeforeTest
    public void beforeTest() {
        try{
            System.setProperty("webdriver.gecko.driver","C:\\\\driver\\\\firefox\\geckodriver.exe");
            driver = new FirefoxDriver();
            System.out.print("Start dtiver");

            driver.get("http://www.espncricinfo.com/");
            Thread.sleep(5000);

            driver.manage().window().maximize();

        }catch (Exception e){e.printStackTrace();}
    }

    @AfterTest
    public void afterTest() {

        driver.quit();
        System.out.print("Closing dtiver");
    }



}

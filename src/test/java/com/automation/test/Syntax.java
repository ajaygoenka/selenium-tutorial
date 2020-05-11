package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Syntax {

    WebDriver driver;

    @Test
    public void test1() {

     // Type any text
        driver.findElement(By.xpath("xpath")).sendKeys("value");

     // Clear the Text Box
        driver.findElement(By.xpath("xpath")).clear();

        //Submit the Button
        driver.findElement(By.xpath("xpath")).submit();


        //Click the Button
        driver.findElement(By.xpath("xpath")).click();

        //Quit the Browser
        driver.quit();

        //Close the Browser
        driver.close();

        //Is Element Present
        driver.findElement(By.xpath("xpath"));

        //Radio button
        driver.findElement(By.xpath("xpath")).click();

       //Check Box
        driver.findElement(By.xpath("xpath")).click();


        // Check Box or Radio Button is slected or Not
        WebElement option1 =  driver.findElement(By.xpath("xpath"));

        if (option1.isSelected()) {
            System.out.println("Checkbox is Toggled On");
        } else {
            System.out.println("Checkbox is Toggled Off");
        }


        // Action on Link Text
        driver.findElement(By.linkText(""));

        //Action on Partial Link
        driver.findElement(By.partialLinkText(""));


        //findbyElements
        driver.findElements(By.partialLinkText("All-new Echo Plus"));


        //Dropdown
        Select quantity = new Select(driver.findElement(By.id("quantity")));
        quantity.selectByVisibleText("1");
        quantity.selectByValue("2");
        quantity.selectByIndex(3);
        quantity.isMultiple();
        quantity.deselectAll();
        quantity.deselectByIndex(1);
        quantity.deselectByValue("2");
        quantity.deselectByVisibleText("Ajay");


        //Action Class
        Actions builder = new Actions(driver);

        Action mouseover = builder.moveToElement(driver.findElement(By.xpath(""))).build();
        mouseover.perform();

//        OR

        builder.moveToElement(driver.findElement(By.xpath(""))).build().perform();


      //Alert Pop-up
        driver.switchTo().alert().dismiss();

        driver.switchTo().alert().accept();

        driver.switchTo().alert().getText();

        driver.switchTo().alert().sendKeys("Text");

     //Table
        String innerText = driver.findElement(
                By.xpath("//table[@id='customerdetails']/tbody/tr[3]/td[3]")).getText();


       //DesiredCapabilities
        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(InternetExplorerDriver.
                INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

        //it is used to initialize the IE driver
        WebDriver driver = new FirefoxDriver();






    }

    @BeforeTest
    public void beforeTest() {
        try{
        System.setProperty("webdriver.chrome.driver","C:\\\\driver\\\\chrome\\chromedriver.exe");
//        driver = new FirefoxDriver();
         driver =  new ChromeDriver();
        System.out.print("Start dtiver");

        driver.get("http://www.amazon.com/");
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

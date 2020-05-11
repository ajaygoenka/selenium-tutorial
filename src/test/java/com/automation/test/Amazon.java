package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {

    WebDriver driver;


    @Test
    public void test1() {
        try{

            //Verify Amazon.com
            System.out.println("Title of browser : "+driver.getTitle());


            /************Login to Amazon.com************/

            //-Mouse over on Account list
            WebElement alist = driver.findElement(By.xpath("//text()[contains(.,'Account & Lists')]/ancestor::span[1]"));

            //Create object 'action' of an Actions class
            Actions action = new Actions(driver);

            //Mouseover on an element
            action.moveToElement(alist).perform();
            Thread.sleep(5000);



            //Click on Sign in Button
            driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();
            Thread.sleep(5000);

            //Verify the Page
            System.out.println("Title of browser : "+driver.getTitle());

            //Enter Username
            driver.findElement(By.xpath("//input[@type='email'][@name='email']")).sendKeys("amazon username");
            Thread.sleep(5000);

            //Enter Password
            driver.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("amazon password");
            Thread.sleep(5000);

          // driver.findElement(By.cssSelector("a.nav-action-button:nth-child(1) > span:nth-child(1)"));

            //Click on Sign in button
            driver.findElement(By.xpath("//input[@type='submit'][@id='signInSubmit']")).click();
            Thread.sleep(5000);

            //Verify the Page
            System.out.println("Title of browser : "+driver.getTitle());


            //Search an items
            driver.findElement(By.xpath("//input[@type='text'][@name='field-keywords']")).sendKeys("echoplus");
            Thread.sleep(5000);


            //Click on search button
            driver.findElement(By.xpath("//input[@type='submit'][@value='Go']")).click();
            Thread.sleep(5000);

            //Click on link
            driver.findElement(By.linkText("All-new Echo Plus (2nd Gen) Bundle with Philips Hue Bulb - Charcoal")).click();
            Thread.sleep(5000);


            //Add to Cart
            driver.findElement(By.xpath("//input[@type='submit'][@name='submit.add-to-cart']")).click();
            Thread.sleep(5000);

            //CLick on Cart
            driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();

            Thread.sleep(5000);


            //Click on Proceed to checkout
            driver.findElement(By.xpath("//input[@type='submit'][@name='proceedToCheckout']")).click();
            Thread.sleep(5000);

        }catch(Exception e){e.printStackTrace();}

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
        //driver.findElement(By.id("ap_email"));

        }catch (Exception e){e.printStackTrace();}
    }

    @AfterTest
    public void afterTest() {

        driver.close();
        System.out.print("Closing driver");
    }


}

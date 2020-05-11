package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sears {

    WebDriver driver;

    @Test
    public void test1() {
        try{

            WebElement currentElement = driver.findElement(By.xpath("//div[text()='Account & Points']"));

            Actions actions = new Actions(driver);
            actions.moveToElement(currentElement).build().perform();


            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//button[text()='Member Sign In']"))));


            driver.findElement(By.xpath(".//button[text()='Member Sign In']")).click();

            WebElement frameElement = driver.findElement(By.xpath(".//div[@id='modalIframe']/iframe"));
            driver.switchTo().frame(frameElement);
            //System.out.println("sdsdssd"+browser.getPageSource());
            Thread.sleep(5000);

            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//input[@type='text'][@name='email'][@id='email'][@class='shcForm_Text shcEmail shcForm']"))));
            driver.findElement(By.xpath(".//input[@type='text'][@name='email'][@id='email'][@class='shcForm_Text shcEmail shcForm']")).sendKeys("srinimarva@gmail.com");
            Thread.sleep(5000);
            driver.findElement(By.xpath(".//div[@id='universalSignInBtns']/button/span")).click();
            Thread.sleep(5000);
            }catch(Exception e){e.printStackTrace();}

    }


    @BeforeTest
    public void beforeTest() {
        try{
            System.setProperty("webdriver.gecko.driver","C:\\\\driver\\\\firefox\\geckodriver.exe");
            driver = new FirefoxDriver();
            System.out.print("Start dtiver");

            driver.get("http://www.sears.com/en_us.html");
            Thread.sleep(5000);
            driver.manage().window().maximize();

        }catch (Exception e){e.printStackTrace();}
    }

    @AfterTest
    public void afterTest() {
        //driver.quit();
        System.out.print("Closing dtiver");
    }

}

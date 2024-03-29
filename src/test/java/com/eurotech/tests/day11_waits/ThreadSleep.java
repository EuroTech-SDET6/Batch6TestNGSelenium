package com.eurotech.tests.day11_waits;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleep {
    WebDriver driver;




    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }


    @Test
    public void testName() throws InterruptedException {

            driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

            driver.findElement(By.cssSelector("#start>button")).click();

            Thread.sleep(5000);

           WebElement textElement = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

           String expectedText ="Hello World!";

           Assert.assertEquals(textElement.getText(),expectedText);


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

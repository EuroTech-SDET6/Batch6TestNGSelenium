package com.eurotech.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAssertions {


    @Test
    public void test1() {
        System.out.println("verifying whether login is successful");
        String expectedTitle = "title";
        String actualTitle  = "title";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void test2(){
        String expectedText = "zEuro";
        String actualTitle  = "Eurotech";
//        Assert.assertTrue(actualTitle.startsWith(expectedText));
        Assert.assertTrue(actualTitle.startsWith(expectedText), "Title does not start with the expected text");
        System.out.println("test continues");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("setting up browser");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("closing the browser");
    }


}

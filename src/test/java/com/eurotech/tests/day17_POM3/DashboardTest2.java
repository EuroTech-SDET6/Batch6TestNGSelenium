package com.eurotech.tests.day17_POM3;

import com.eurotech.Pages.DashboardPage;
import com.eurotech.Pages.LoginPage;
import com.eurotech.tests.TestBase;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DashboardTest2 extends TestBase {


    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void verifyList() {

        /*
        Go to http://www.eurotech.study/
        Login with teacher credentials
        Verify log in successfully
        verify following menu
                      Edit Profile
                      Add Experience
                      Add Education
         */

        driver.get(ConfigurationReader.get("url"));
        loginPage.loginAsTeacher();
        String actualText = dashboardPage.welcomeMessage.getText();
        String expectedText = "Welcome Teacher";
        Assert.assertEquals(actualText,expectedText,"Verify that login in successfully");


        List<String> expectedList = new ArrayList<>();
        expectedList.add("Edit Profile");
        expectedList.add("Add Experience");
        expectedList.add("Add Education");

        List<String> actualList = new ArrayList<>();

//        for (WebElement list  : dashboardPage.dashboardList) {
//            actualList.add(list.getText());
//            System.out.println("list.getText() = " + list.getText());
//
//        }
//        System.out.println("expectedList = " + expectedList);
//        System.out.println("actualList = " + actualList);
//        Assert.assertEquals(actualList,expectedList);
//
//
//        ///2 way
//        List<WebElement> dashboardList = dashboardPage.dashboardList;
//        for (WebElement element : dashboardList) {
//            actualList.add(element.getText());
//        }

        //3 way
        Assert.assertEquals(BrowserUtils.getElementsText(dashboardPage.dashboardList),expectedList);




    }
}

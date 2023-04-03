package com.eurotech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{


    @FindBy(css = "#dashboard-p1")
    public WebElement welcomeMessage;


    @FindBy(css = ".nav__menu-item")
    public List<WebElement> menuList;



}

package com.eurotech.Pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{


    @FindBy(css = "#dashboard-p1")
    public WebElement welcomeMessage;


    @FindBy(css = ".nav__menu-item")
    public List<WebElement> menuList;


    @FindBy(linkText = "All Posts")
    public WebElement allPosts;

    @FindBy(linkText = "Developers")
    public WebElement developers;

    @FindBy(linkText = "My Account")
    public WebElement myAccount;


    public void navigateMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();
    }

    public void navigateSubMenu(String menuName){
        Driver.get().findElement(By.xpath("//span[text()='"+menuName+"']")).click();
    }

}

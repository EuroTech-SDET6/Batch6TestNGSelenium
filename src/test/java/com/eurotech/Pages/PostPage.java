package com.eurotech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class PostPage extends BasePage{


    @FindBy(css = "#post-form-btn")
    public WebElement submitBtn;


}

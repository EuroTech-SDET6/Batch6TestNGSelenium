package com.eurotech.Pages;

import com.eurotech.tests.day14_PropertiesSingleton.LoginTest;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "rcc-confirm-button")
    public WebElement iUnderstandButton;

    @FindBy(name = "email")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(id = "loginpage-form-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//div[text()='Invalid Credentials!']")
    public WebElement warningMessage;





    public void login(String username, String password){
        iUnderstandButton.click();
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void loginAsTeacher(){
        String username = ConfigurationReader.get("userTeacher");
        String password = ConfigurationReader.get("userPassword");
        login(username, password);
    }

    public void loginAsStudent(){
        String username = ConfigurationReader.get("usernameStudent");
        String password = ConfigurationReader.get("passwordStudent");
        login(username, password);
    }


}

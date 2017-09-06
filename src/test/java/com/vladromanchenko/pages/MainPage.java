package com.vladromanchenko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "loginDialogButton")
    public WebElement loginDialogButton;


    @FindBy(id = "joinEnvygramBtn")
    public WebElement joinEnvygramButton;

    @FindBy(css = "a[data-fulltext]")
    public WebElement joinWithEmailButton;

    @FindBy(id = "UserLogin_email")
    public WebElement userLoginEmail;

    @FindBy(id = "UserLogin_password")
    public WebElement userLoginPassword;

    @FindBy(id = "signIn")
    public WebElement userLoginSignIn;

}

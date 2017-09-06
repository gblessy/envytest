package com.vladromanchenko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "UserRegister_username")
    public WebElement userName;

    @FindBy(id = "UserRegister_email")
    public WebElement email;


    @FindBy(id = "UserRegister_password")
    public WebElement password;

    @FindBy(css = "button[name='submit']")
    public WebElement registerSubmitButton;
}

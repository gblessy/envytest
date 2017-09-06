package com.vladromanchenko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".username.pull-left")
    public WebElement userProfileLink;

    @FindBy(css = ".badge.createPost")
    public WebElement createPostDropdown;

    @FindBy(css = "a[href*='createPost']")
    public WebElement createPostButton;

}

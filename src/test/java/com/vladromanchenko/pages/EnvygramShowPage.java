package com.vladromanchenko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnvygramShowPage {

    public EnvygramShowPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#content span.text")
    public WebElement envygramHeader;


}

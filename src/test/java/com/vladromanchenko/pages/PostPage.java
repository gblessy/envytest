package com.vladromanchenko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostPage {

    public PostPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='PostCreate[header]']")
    public WebElement postCreateHeader;


    @FindBy(css = ".uploadButton.fromWebsite>a")
    public WebElement uploadFromWebsiteOption;

    @FindBy(className = "mediaDropdown")
    public WebElement mediaDropdown;

    @FindBy(css = "div.uploadFromWebsiteFormContainer #PostCreate_source")
    public WebElement uploadSource;

    @FindBy(css = "#PostCreate #PostCreate_sourceType_em_")
    public WebElement uploadSourceTypeError;

    @FindBy(css = "#PostCreate #PostCreate_source_em_")
    public WebElement uploadSourceError;

    @FindBy(css = "#uploadFromWebsiteDialog a.saveButton")
    public WebElement uploadFromWebSaveButton;

    @FindBy(css = "#PostCreate span.labelText")
    public WebElement fileSelectedButton;


    @FindBy(css = "#PostCreate select#PostCreate_adType")
    public WebElement adTypeSelect;

    @FindBy(css = "#PostCreate #PostCreate_description")
    public WebElement postDescription;

    @FindBy(css = "#PostCreate #PostCreate_description_em_")
    public WebElement postDescriptionError;

    @FindBy(css ="#createNewPostDialog a#createNewPost")
    public WebElement createEnvygram;

}

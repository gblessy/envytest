package com.vladromanchenko.steps;

import com.vladromanchenko.pages.EnvygramShowPage;
import com.vladromanchenko.pages.HomePage;
import com.vladromanchenko.pages.PostPage;
import com.vladromanchenko.testconfigs.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static com.vladromanchenko.helpers.CustomConditions.visible;

public class PostSteps extends BaseTest{

    HomePage homePage = new HomePage(driver);
    PostPage postPage = new PostPage(driver);
    EnvygramShowPage envygramShowPage = new EnvygramShowPage(driver);
    String envygramHeader = "Test Post to see how you would react";
    String linkToPicture = "https://i.ytimg.com/vi/zXqPc_XxEd8/maxresdefault.jpg";
    String adTypeOption = "Default";
    String postDescription = "Test Post";

    public void createPost() {
        wait.until(visible(homePage.createPostDropdown)).click();
        wait.until(visible(homePage.createPostButton)).click();
        wait.until(visible(postPage.postCreateHeader)).sendKeys(envygramHeader);
        wait.until(visible(postPage.mediaDropdown)).click();
        wait.until(visible(postPage.uploadFromWebsiteOption)).click();
        wait.until(visible(postPage.uploadSource)).sendKeys(linkToPicture);
        wait.until(visible(postPage.uploadFromWebSaveButton)).click();
        wait.until(ExpectedConditions.textToBePresentInElement(postPage.fileSelectedButton, "File selected"));
        wait.until(ExpectedConditions.invisibilityOf(postPage.uploadSourceError));
        wait.until(ExpectedConditions.invisibilityOf(postPage.uploadSourceTypeError));
        wait.until(visible(postPage.adTypeSelect));
        Select adTypeSelect = new Select(postPage.adTypeSelect);
        adTypeSelect.selectByVisibleText(adTypeOption);
        wait.until(visible(postPage.postDescription)).sendKeys(postDescription);
        wait.until(ExpectedConditions.invisibilityOf(postPage.postDescriptionError));
        wait.until(visible(postPage.createEnvygram)).click();
        wait.until(visible(envygramShowPage.envygramHeader));
    }

    public void assertPostCreated() {
        Assert.assertEquals(envygramHeader.toUpperCase(), envygramShowPage.envygramHeader.getText());
    }

}

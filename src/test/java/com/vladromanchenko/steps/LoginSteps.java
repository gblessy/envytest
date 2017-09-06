package com.vladromanchenko.steps;

import com.vladromanchenko.pages.HomePage;
import com.vladromanchenko.pages.MainPage;
import com.vladromanchenko.pages.RegisterPage;
import com.vladromanchenko.testconfigs.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.vladromanchenko.helpers.CustomConditions.visible;

public class LoginSteps extends BaseTest{

    MainPage mainPage = new MainPage(driver);
    RegisterPage registerPage = new RegisterPage(driver);
    HomePage homePage = new HomePage(driver);

    String userName = "testUser";
    String email = userName + "@mailforspam.com";
    String password = "qwerty";

    public void open() {
        driver.get("http://68.169.52.12/EnvyGram/html/");
    }

    public void showLoginPage() {
        wait.until(visible(mainPage.loginDialogButton)).click();
    }

    public void createUser() {
        wait.until(visible(mainPage.joinEnvygramButton)).click();
        wait.until(visible(mainPage.joinWithEmailButton)).click();
        wait.until(visible(registerPage.userName)).sendKeys(userName);
        wait.until(visible(registerPage.email)).sendKeys(email );
        wait.until(visible(registerPage.password)).sendKeys(password);
        wait.until(visible(registerPage.registerSubmitButton)).click();
    }

    public void loginWithEmail(String email, String password) {
        wait.until(visible(mainPage.loginDialogButton)).click();
        wait.until(visible(mainPage.userLoginEmail)).sendKeys(email);
        wait.until(visible(mainPage.userLoginPassword)).sendKeys(password);
        wait.until(visible(mainPage.userLoginSignIn)).click();
    }

    public void assertUserLoggedIn(String userName) {
        wait.until(visible(homePage.userProfileLink));
        wait.until(ExpectedConditions.textToBePresentInElement(homePage.userProfileLink, userName.toUpperCase()));
    }

    public void loginAsRegisteredUser() {
        loginWithEmail(email, password);
    }
}

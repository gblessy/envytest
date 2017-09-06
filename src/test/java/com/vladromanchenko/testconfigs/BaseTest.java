package com.vladromanchenko.testconfigs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public static void driverSetUp()
    {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
    }
    @Before
    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void driverTearDown()
    {
        driver.quit();
    }
}
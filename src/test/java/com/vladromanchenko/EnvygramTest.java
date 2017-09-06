package com.vladromanchenko;


import com.vladromanchenko.steps.LoginSteps;
import com.vladromanchenko.steps.PostSteps;
import com.vladromanchenko.testconfigs.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

public class EnvygramTest extends BaseTest {
    static LoginSteps login;
    static PostSteps post;

    @BeforeClass
    public static void init() {
        login = new LoginSteps();
        post = new PostSteps();
    }

    @Test
    public void loginTest() {
        login.open();
        login.loginWithEmail("testUser@mailforspam.com", "qwerty");
        login.assertUserLoggedIn("Vlad");
    }

    @Test
    public void addNewPostTest() {
        login.open();
        login.loginAsRegisteredUser();
        post.createPost();
        post.assertPostCreated();
    }
}
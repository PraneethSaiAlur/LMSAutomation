package com.lms.tests;

import com.lms.base.BaseTest;
import com.lms.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin123");
    }
}

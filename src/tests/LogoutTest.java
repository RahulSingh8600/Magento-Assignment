package tests;

import pages.*;
import utils.BaseTest;

public class LogoutTest extends BaseTest {
    public static void main(String[] args) {
        LogoutTest test = new LogoutTest();
        test.setUp();

        HomePage home = new HomePage(test.driver);
        home.clickSignIn();

        LoginPage login = new LoginPage(test.driver);
        login.login("testuser987@example.com", "Password123!");

        home.clickSignOut();

        test.tearDown();
    }
}


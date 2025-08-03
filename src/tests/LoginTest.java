package tests;

import pages.*;
import utils.BaseTest;

public class LoginTest extends BaseTest {
    public static void main(String[] args) {
        LoginTest test = new LoginTest();
        test.setUp();

        HomePage home = new HomePage(test.driver);
        home.clickSignIn();

        LoginPage login = new LoginPage(test.driver);
        login.login("testuser987@example.com", "Password123!");

        test.tearDown();
    }
}


package tests;

import pages.*;
import utils.BaseTest;

public class ChangePasswordTest extends BaseTest {
    public static void main(String[] args) {
        ChangePasswordTest test = new ChangePasswordTest();
        test.setUp();

        HomePage home = new HomePage(test.driver);
        home.clickSignIn();

        LoginPage login = new LoginPage(test.driver);
        login.login("testuser987@example.com", "Password123!");

        ChangePasswordPage change = new ChangePasswordPage(test.driver);
        change.changePassword("Password123!", "NewPass456!");

        test.tearDown();
    }
}


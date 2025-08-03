package tests;

import pages.*;
import utils.BaseTest;

public class SignUpTest extends BaseTest {
    public static void main(String[] args) {
        SignUpTest test = new SignUpTest();
        test.setUp();

        HomePage home = new HomePage(test.driver);
        home.clickCreateAccount();

        SignUpPage signUp = new SignUpPage(test.driver);
        signUp.register("Test", "User", "testuser987@example.com", "Password123!");

        test.tearDown();
    }
}


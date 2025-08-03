package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        driver.findElement(By.linkText("Sign In")).click();
    }

    public void clickCreateAccount() {
        driver.findElement(By.linkText("Create an Account")).click();
    }

    public void clickSignOut() {
    	driver.findElement(By.className("customer-welcome")).click();
        driver.findElement(By.linkText("Sign Out")).click();
    }
}


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPage {
    WebDriver driver;

    public ChangePasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void changePassword(String currentPass, String newPass) {
    	driver.findElement(By.className("customer-name")).click(); 
    	driver.findElement(By.linkText("My Account")).click();
    	driver.findElement(By.linkText("Change Password")).click();
        driver.findElement(By.id("current-password")).sendKeys(currentPass);
        driver.findElement(By.id("password")).sendKeys(newPass);
        driver.findElement(By.id("password-confirmation")).sendKeys(newPass);
        driver.findElement(By.cssSelector("button[title='Save']")).click();
    }
}


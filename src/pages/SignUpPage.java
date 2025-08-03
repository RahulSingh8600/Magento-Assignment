package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void register(String first, String last, String email, String pass) {
        driver.findElement(By.id("firstname")).sendKeys(first);
        driver.findElement(By.id("lastname")).sendKeys(last);
        driver.findElement(By.id("email_address")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("password-confirmation")).sendKeys(pass);
        driver.findElement(By.cssSelector("button[title='Create an Account']")).click();
    }
}

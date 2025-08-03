package utils;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class BaseTest  {
    protected WebDriver driver;

    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.get("https://magento.softwaretestingboard.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    

    public void tearDown() {
        DriverFactory.quitDriver();
    }
}


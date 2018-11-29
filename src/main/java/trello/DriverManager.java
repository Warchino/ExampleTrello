package trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static DriverManager ourInstance = new DriverManager();

    public static DriverManager getInstance() {
        return ourInstance;
    }

    private WebDriver driver;

    private DriverManager() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }
}

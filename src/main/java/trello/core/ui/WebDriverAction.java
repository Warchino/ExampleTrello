package trello.core.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverAction {

    private WebDriver driver;
    private WebDriverWait wait;

    public WebDriverAction(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element))
                .click();
    }

    public void sendKey(WebElement element, String key) {
        wait.until(ExpectedConditions.visibilityOf(element))
                .sendKeys(key);
    }
}

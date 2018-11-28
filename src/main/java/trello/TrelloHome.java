package trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHome {

    /**
     * All WebElements are identified by @FindBy annotation
     */
    WebDriver driver;
    @FindBy(linkText = "Log In")
    WebElement linkInit;


    public TrelloHome(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clicklinkInit() {
        linkInit.click();
    }
}

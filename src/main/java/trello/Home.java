package trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends AbstractPage {

    /**
     * All WebElements are identified by @FindBy annotation
     */
    @FindBy(linkText = "Log In")
    WebElement linkInit;

    public Home() {
        driver.get("https://trello.com/logged-out");
    }


    public Login clickInitLink() {
        linkInit.click();
        return new Login();
    }
}

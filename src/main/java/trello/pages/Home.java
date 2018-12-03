package trello.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import trello.core.ui.AbstractPage;

public class Home extends AbstractPage {

    /**
     * All WebElements are identified by @FindBy annotation
     */
    @FindBy(linkText = "Log In")
    WebElement linkInit;

    public Home() {
        driver.get("https://trello.com/");
    }


    public Login clickInitLink() {
        linkInit.click();
        return new Login();
    }

    public void closeDriver() {
        driver.close();
    }
}

package trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected WebDriver driver;

    public AbstractPage() {
        driver = DriverManager.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

}

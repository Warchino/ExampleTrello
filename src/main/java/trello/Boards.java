package trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Boards extends AbstractPage {

    //    @FindBy(xpath = "//a[contains(@class,'board-tile mod-add')]")
    @FindBy(xpath = "//*[contains(@class,'quiet-button js-add-board')]")
    WebElement linkCreateNewTablero;


    @FindBy(className = "header-btn-text")
    WebElement btnTableros;

    public BoardCreation clickAddBoard() {
        DriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(btnTableros));
        btnTableros.click();
        DriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(linkCreateNewTablero));
        linkCreateNewTablero.click();
        return new BoardCreation();
    }
}

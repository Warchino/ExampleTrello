package trello.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import trello.core.ui.AbstractPage;

public class Boards extends AbstractPage {

    //    @FindBy(xpath = "//a[contains(@class,'board-tile mod-add')]")
    @FindBy(xpath = "//*[contains(@class,'quiet-button js-add-board')]")
    WebElement linkCreateNewTablero;


    @FindBy(className = "header-btn-text")
    WebElement btnTableros;

    public BoardCreation clickAddBoard() {
        action.click(btnTableros);
        action.click(linkCreateNewTablero);
        return new BoardCreation();
    }
}

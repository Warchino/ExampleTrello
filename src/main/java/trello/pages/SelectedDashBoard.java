package trello.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import trello.core.ui.AbstractPage;

public class SelectedDashBoard extends AbstractPage {
    @FindBy(xpath = "//*[contains(@class,'icon-sm icon-add')]")
    WebElement addListSpan;

    @FindBy(xpath = "//*[contains(@class,'list-name-input')]")
    WebElement listName;

    @FindBy(xpath = "//*[contains(@class,'primary mod-list-add-button js-save-edit')]")
    WebElement addListButton;

    @FindBy(xpath = "//a[contains(@class,'board-header-btn board-header-btn-name js-rename-board')]")
    WebElement name;

    public void addList(String nameList) {
        action.click(addListSpan);
        action.sendKey(listName, nameList);
        action.click(addListButton);
    }

    public String getName() {
        wait.until(ExpectedConditions.visibilityOf(name));
        return name.getText();
    }
}

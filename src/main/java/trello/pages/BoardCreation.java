package trello.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import trello.core.ui.AbstractPage;

public class BoardCreation extends AbstractPage {
//    xpath=    //*[contains(@href,'guru99.com')]
//    Xpath=    //input[@type='text']
//    Xpath=    //label[@id='message23']
//    Xpath=    //input[@value='RESET']
//    Xpath=    //*[@class='barone']
//    Xpath=    //a[@href='http://demo.guru99.com/']
//    Xpath=    //img[@src='//cdn.guru99.com/images/home/java.png']


    @FindBy(className = "subtle-input")
    WebElement subjectname;

    @FindBy(css = ".create-board-form button.primary")
    WebElement btnCreateTablero;

    public SelectedDashBoard createNewBoard(String strsubjectname) {
        wait.until(ExpectedConditions.visibilityOf(subjectname))
                .sendKeys(strsubjectname);
        action.click(btnCreateTablero);
        return new SelectedDashBoard();
    }
}

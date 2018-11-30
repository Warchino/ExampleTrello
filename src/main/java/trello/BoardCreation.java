package trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @FindBy(className = "create-board-form")
    WebElement btnCreateTablero;

    public void createNewBoard(String strsubjectname) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(subjectname));
        subjectname.sendKeys(strsubjectname);
        btnCreateTablero.submit();
    }
}

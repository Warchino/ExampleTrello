package trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Boards extends AbstractPage {
    //*[contains(@href,'guru99.com')]
//    Xpath=//input[@type='text']
//    Xpath=	//label[@id='message23']
//    Xpath=	//input[@value='RESET']
//    Xpath=//*[@class='barone']
//    Xpath=//a[@href='http://demo.guru99.com/']
//    Xpath= //img[@src='//cdn.guru99.com/images/home/java.png']
    @FindBy(xpath = "//a[contains(@class,'board-tile mod-add')]")
    WebElement linkCreateNewTablero;


    @FindBy(className = "header-btn-text")
    WebElement btnTableros;

    @FindBy(className = "subtle-input")
    WebElement subjectname;

    @FindBy(className = "create-board-form")
    WebElement btnCreateTablero;


    public void clickLinkCreateNewTablero() {
        linkCreateNewTablero.click();
    }

    public void clickbtnTableros() {
        btnTableros.click();
    }

    public void clickbtnCreateTablero() {
        btnCreateTablero.submit();
    }


    public void setSubjectName(String strsubjectname) {
        subjectname.sendKeys(strsubjectname);

    }
}

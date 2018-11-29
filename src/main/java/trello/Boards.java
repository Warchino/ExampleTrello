package trello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Boards extends AbstractPage {

    @FindBy(linkText = "Crear un tablero nuevo...")
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

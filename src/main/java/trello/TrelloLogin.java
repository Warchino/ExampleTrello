package trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TrelloLogin {

    /**
     * All WebElements are identified by @FindBy annotation
     */
    WebDriver driver;

    @FindBy(name="user")
    WebElement userName;

    @FindBy(name="password")
    WebElement password;

    @FindBy(id="login")
    WebElement btnLogin;


    public TrelloLogin(WebDriver driver){
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }
    //Set user name in textbox
    public void setUserName(String strUserName){
        userName.sendKeys(strUserName);

    }

    //Set password in password textbox
    public void setPassword(String strPassword){
        password.sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
        btnLogin.click();
    }


    /**
     * This POM method will be exposed in test case to login in the application
     * @param strUserName
     * @param strPasword
     * @return
     */
    public void loginToTrello(String strUserName,String strPasword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();
    }
}


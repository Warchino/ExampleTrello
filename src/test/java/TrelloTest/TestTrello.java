package TrelloTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import trello.TrelloHome;
import trello.TrelloLogin;
import trello.TrelloPage;
import trello.User;

import java.util.concurrent.TimeUnit;


public class TestTrello {

    WebDriver driver;
    TrelloHome trelloHome;
    TrelloLogin trelloLogin;

    TrelloPage trelloPage;

    @BeforeTest
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://trello.com/logged-out");

    }

    /**
     * This test go to https://trello.com/logged-out
     * Verify login page title as guru99 bank
     * Login to application
     * Verify the home page using Dashboard message
     */
    @Test
    public void test_Home_Page_Appear_Correct() throws InterruptedException {
        User user = new User();
        trelloHome = new TrelloHome(driver);
        trelloHome.clicklinkInit();
        trelloLogin = new TrelloLogin(driver);
        trelloLogin.loginToTrello(user.getUsr(), user.getPwd());
        trelloPage = new TrelloPage(driver);
        trelloPage.clickbtnTableros();
        trelloPage.clickLinkCreateNewTablero();
        trelloPage.setSubjectName("new tablero");
        trelloPage.clickbtnCreateTablero();
    }
}

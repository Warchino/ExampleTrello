package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import trello.TrelloHome;
import trello.TrelloLogin;
import trello.TrelloPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class dashboardStepDef {

    WebDriver driver;
    TrelloHome trelloHome;
    TrelloLogin trelloLogin;
    private TrelloPage trelloPage;

    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://trello.com/");
    }

    @Given("Web page Trello")
    public void trello() {
        setup();
        trelloHome = new TrelloHome(driver);
    }

    @When("I go to the webpage")
    public void goWebPage() {
        trelloHome.clicklinkInit();
    }

    @When("I Log in to")
    public void logIn(/*String user*/) {
        trelloLogin = new TrelloLogin(driver);
        trelloLogin.loginToTrello("geremygustavo", "ATpanda41605#");
        //json file extract the key
    }

    @When("Go to dashboard")
    public void goDashBoard() {
        trelloPage = new TrelloPage(driver);
        trelloPage.clickbtnTableros();
        trelloPage.clickLinkCreateNewTablero();
    }

    @When("Put a name to dashboard")
    public void setNameDashboard() throws InterruptedException {
        trelloPage.setSubjectName("new tablero");
    }

    @When("Create New dashboard")
    public void createDashboard() {
        trelloPage.clickbtnCreateTablero();
    }

    @Then("The dashboard was created")
    public void correctHomePage() throws InterruptedException {
//        Thread.sleep(3000);
        driver.close();
    }


}

package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import trello.Boards;
import trello.Home;
import trello.Login;

public class dashboardStepDef {

    Home home;
    Login login;
    private Boards boards;

    @Given("I am on the Home page Trello")
    public void onTrello() {
        home = new Home();
    }

    @When("I Log in")
    public void logIn() {
//        home.clicklinkInit();
    }

    @When("I create a dashboard with a title")
    public void createDashboard(/*String user*/) {
//        login = new Login(driver);
//        login.loginToTrello("geremygustavo", "ATpanda41605#");
        //json file extract the key
    }

    @Then("I should see the dashboard")
    public void seeDashboard() {
    }
}

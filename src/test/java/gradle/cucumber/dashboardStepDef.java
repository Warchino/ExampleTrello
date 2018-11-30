package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import trello.*;

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
        login = home.clickInitLink();
        User user = new User("1");
        boards = login.loginAs(user.getUsr(), user.getPwd());
    }

    @When("I create a dashboard with a title")
    public void createDashboard(/*String user*/) {
        BoardCreation newBoard = boards.clickAddBoard();
        newBoard.createNewBoard("Test POM");
    }

    @Then("I should see the dashboard")
    public void seeDashboard() {
        home.closeDriver();
    }
}

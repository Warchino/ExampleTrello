package TrelloTest;

import Trello.Boards;
import Trello.Home;
import Trello.Login;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestTrelloModified {

    @BeforeTest
    public void setup() {
    }

    /**
     * This test go to https://trello.com/logged-out
     * Verify login page title as guru99 bank
     * Login to application
     * Verify the home page using Dashboard message
     */
    @Test
    public void test_Home_Page_Appear_Correct() {
        Home home = new Home();
        Login login = home.clickInitLink();
        Boards boards = login.loginAs("geremygustavo", "ATpanda41605#");
        boards.clickbtnTableros();
        boards.clickLinkCreateNewTablero();
        boards.setSubjectName("new tablero test");
        boards.clickbtnCreateTablero();
    }

}

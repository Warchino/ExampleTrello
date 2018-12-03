package TrelloTest;

import org.testng.annotations.Test;
import trello.pages.Boards;
import trello.pages.Home;
import trello.pages.Login;
import trello.core.User;


public class TestTrelloModified {
    /**
     * This test go to https://trello.com/logged-out
     * Verify login page title as guru99 bank
     * Login to application
     * Verify the home page using Dashboard message
     */
    @Test
    public void test_Home_Page_Appear_Correct() {
        User user = new User(1);
        Home home = new Home();
        Login login = home.clickInitLink();
        Boards boards = login.loginAs(user.getUsr(), user.getPwd());
//        boards.clickbtnTableros();
//        boards.clickLinkCreateNewTablero();
//        boards.clickAddBoard("new tablero test");
//        boards.clickbtnCreateTablero();
        home.closeDriver();
    }
}

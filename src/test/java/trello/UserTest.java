package trello;

import org.testng.annotations.Test;
import trello.core.User;

public class UserTest {

    @Test
    public void usertest(){
        User user = new User(2);
        System.out.println(user.getUsr());
        System.out.println(user.getPwd());
    }

}
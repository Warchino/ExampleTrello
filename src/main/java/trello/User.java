package trello;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class User {

    private String usr;
    private String pwd;

    public User() {
        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("/home/rocku/acc.json"));
            usr = (String) jsonObject.get("user");
            pwd = (String) jsonObject.get("pass");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public String getUsr() {
        return usr;
    }

    public String getPwd() {
        return pwd;
    }
}

package lt.kaunascoding.web.model.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Conferences {

    public String name;
    public String surname;
    public String position;
    public String conf_name;

    public Conferences(ResultSet eilute) {
        try {
            name = eilute.getString("name");
            surname = eilute.getString("surname");
            position = eilute.getString("position");
            conf_name = eilute.getString("conf_name");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

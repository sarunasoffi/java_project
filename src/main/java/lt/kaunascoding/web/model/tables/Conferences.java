package lt.kaunascoding.web.model.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Conferences {

    public String name;
    public String surname;
    public String position;

    public Conferences(ResultSet eilute) {
        try {
            name = eilute.getString("name");
            surname = eilute.getString("surname");
            position = eilute.getString("position");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

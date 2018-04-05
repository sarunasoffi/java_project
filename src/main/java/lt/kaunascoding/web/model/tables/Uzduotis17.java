package lt.kaunascoding.web.model.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Uzduotis17 {

    public int id;
    public String name;
    public String surname;
    public String phone;
    public String email;

    public Uzduotis17(ResultSet eilute) {
        try {
            id = eilute.getInt("id");
            name = eilute.getString("name");
            surname = eilute.getString("surname");
            phone = eilute.getString("phone");
            email = eilute.getString("email");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

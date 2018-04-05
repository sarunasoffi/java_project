package lt.kaunascoding.web.model.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Uzduotis19 {

    public int id;
    public int student_id;
    public String country;
    public String city;
    public String street;
    public String post_code;

    public Uzduotis19(ResultSet eilute) {
        try {
            id = eilute.getInt("id");
            student_id = eilute.getInt("student_id");
            country = eilute.getString("country");
            city = eilute.getString("city");
            street = eilute.getString("street");
            post_code = eilute.getString("post_code");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

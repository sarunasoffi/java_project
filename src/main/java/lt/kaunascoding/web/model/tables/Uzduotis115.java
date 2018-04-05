package lt.kaunascoding.web.model.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Uzduotis115 {


    public int id;
    public String name;
    public String surname;
    public String phone;
    public String email;
    public int mark_id;
    public int student_id;
    public String title;
    public int mark;
    public String time_stamp;

    public Uzduotis115(ResultSet eilute) {
        try {
            id = eilute.getInt("id");
            name = eilute.getString("name");
            surname = eilute.getString("surname");
            phone = eilute.getString("phone");
            email = eilute.getString("email");
            mark_id = eilute.getInt("mark_id");
            student_id = eilute.getInt("student_id");
            title = eilute.getString("title");
            mark = eilute.getInt("mark");
            time_stamp = eilute.getString("time_stamp");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

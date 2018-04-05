package lt.kaunascoding.web.model.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Uzduotis112 {

    public int id;
    public int student_id;
    public String title;
    public int mark;
    public String time_stamp;

    public Uzduotis112(ResultSet eilute) {
        try {
            id = eilute.getInt("id");
            student_id = eilute.getInt("student_id");
            title = eilute.getString("title");
            mark = eilute.getInt("mark");
            time_stamp = eilute.getString("time_stamp");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

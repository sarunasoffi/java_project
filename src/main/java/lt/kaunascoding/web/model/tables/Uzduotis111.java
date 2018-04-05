package lt.kaunascoding.web.model.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Uzduotis111 {

    public int id;
    public int student_id;
    public String title;
    public int mark;
    public String time_stamp;
    public int count;

    public Uzduotis111(ResultSet eilute) {
        try {
            id = eilute.getInt("id");
            student_id = eilute.getInt("student_id");
            title = eilute.getString("title");
            mark = eilute.getInt("mark");
            time_stamp = eilute.getString("time_stamp");
            count = eilute.getInt("count");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

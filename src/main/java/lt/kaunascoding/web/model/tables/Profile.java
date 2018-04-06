package lt.kaunascoding.web.model.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Profile {

    public int id;
    public String user_name;
    public String name;
    public String surname;
    public String branch;
    public String position;
    public String hire_date;
    public String terminate_date;
    public String salary;
    public String password;


    public Profile(ResultSet eilute) {
        try {
            id = eilute.getInt("id");
            user_name = eilute.getString("user_name");
            name = eilute.getString("name");
            surname = eilute.getString("surname");
            branch = eilute.getString("branch");
            position = eilute.getString("position");
            hire_date = eilute.getString("hire_date");
            terminate_date = eilute.getString("terminate_date");
            salary = eilute.getString("salary");
            password = eilute.getString("password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

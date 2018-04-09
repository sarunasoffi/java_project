package lt.kaunascoding.web.model;

import lt.kaunascoding.web.model.tables.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Duombaze {

    private Connection _con;
    private Statement _st;

    public Duombaze() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            _con = DriverManager.getConnection("jdbc:mysql://192.168.100.100:3306/employee_web_app", "root", "root");
            _st = _con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<EmployeeList> getAllUsers() {
        List<EmployeeList> result = new ArrayList<EmployeeList>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT * FROM `users`");
            while (set.next()) {
                result.add(new EmployeeList(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Profile> getAllProfileInfo() {
        List<Profile> result = new ArrayList<Profile>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT * FROM `users` where `user_name` LIKE 'admin'");
            while (set.next()) {
                result.add(new Profile(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Conferences> getAllConferencesUsers() {
        List<Conferences> result = new ArrayList<Conferences>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT `name`, `surname`, `position` FROM `users`");
            while (set.next()) {
                result.add(new Conferences(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void insertEmployee(String inputUserName, String inputName, String inputSurname, String inputBranch, String inputPosition,
                               String inputHireDate, String inputTerminateDate, String inputSalary, String inputPassword) {
        try {
            PreparedStatement st = _con.prepareStatement("INSERT INTO `employee_web_app`.`users` " +
                    "(`id`, `user_name`, `name`, `surname`, `branch`, `position`, `hire_date`, `terminate_date`, `salary`, `password`)" +
                    " VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            st.setString(1, inputUserName);
            st.setString(2, inputName);
            st.setString(3, inputSurname);
            st.setString(4, inputBranch);
            st.setString(5, inputPosition);
            st.setString(6, inputHireDate);
            st.setString(7, inputTerminateDate);
            st.setString(8, inputSalary);
            st.setString(9, inputPassword);
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

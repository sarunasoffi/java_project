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
            _con = DriverManager.getConnection("jdbc:mysql://192.168.100.100:3306/KCS", "root", "root");
            _st = _con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Student> getAllStudents() {
        List<Student> result = new ArrayList<Student>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT * FROM `students`");
            while (set.next()) {
                result.add(new Student(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<StudentAddress> getAllStudentAddress() {
        List<StudentAddress> result = new ArrayList<StudentAddress>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT * FROM `student_address`");
            while (set.next()) {
                result.add(new StudentAddress(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<StudentMarks> getAllStudentMarks() {
        List<StudentMarks> result = new ArrayList<StudentMarks>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT * FROM `student_marks`");
            while (set.next()) {
                result.add(new StudentMarks(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Uzduotis16> getAllUzduotis16() {
        List<Uzduotis16> result = new ArrayList<Uzduotis16>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT * FROM `students` ORDER BY `name` ASC");
            while (set.next()) {
                result.add(new Uzduotis16(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Uzduotis17> getAllUzduotis17() {
        List<Uzduotis17> result = new ArrayList<Uzduotis17>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT * FROM `students` WHERE `name` LIKE '%as' AND `surname` LIKE '%as' ORDER BY `surname` DESC");
            while (set.next()) {
                result.add(new Uzduotis17(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Uzduotis18> getAllUzduotis18() {
        List<Uzduotis18> result = new ArrayList<Uzduotis18>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT * FROM `student_address` WHERE `city` LIKE 'Kaunas'");
            while (set.next()) {
                result.add(new Uzduotis18(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Uzduotis19> getAllUzduotis19() {
        List<Uzduotis19> result = new ArrayList<Uzduotis19>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT * FROM `student_address` WHERE `post_code` IS NOT NULL");
            while (set.next()) {
                result.add(new Uzduotis19(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Uzduotis110> getAllUzduotis110() {
        List<Uzduotis110> result = new ArrayList<Uzduotis110>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT * FROM `student_marks` ORDER BY `mark` DESC");
            while (set.next()) {
                result.add(new Uzduotis110(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int getAllUzduotis111() {
        int count = 0;
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT count(*) FROM `student_marks` WHERE `mark` = 10");
            set.next();
            count = set.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Uzduotis112> getAllUzduotis112() {
        List<Uzduotis112> result = new ArrayList<Uzduotis112>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT * FROM `student_marks` WHERE `mark` > 6");
            while (set.next()) {
                result.add(new Uzduotis112(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Uzduotis113> getAllUzduotis113() {
        List<Uzduotis113> result = new ArrayList<Uzduotis113>();
        try {
            _st = _con.createStatement();
            _st.executeUpdate("UPDATE `student_address` SET `street` = 'Ar veikia mano kodas pr.' WHERE `city` IN ('Kaunas', 'Vilnius')");
            ResultSet set = _st.executeQuery("SELECT * FROM `student_address`");
            while (set.next()) {
                result.add(new Uzduotis113(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Uzduotis114> getAllUzduotis114() {
        List<Uzduotis114> result = new ArrayList<Uzduotis114>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT  `a`.`id` ,  `a`.`name` ,  `a`.`surname` ,  `a`.`phone` ,  `a`.`email`, `b`.`id` AS `address_id`, " +
                    "`b`.`student_id`, `b`.`country`, `b`.`city`, `b`.`street`, `b`.`post_code` " +
                    "FROM  `students` AS `a` " +
                    "LEFT JOIN  `student_address` AS `b` ON  `a`.`id` =  `b`.`student_id` " +
                    "ORDER BY  `a`.`name` ");
            while (set.next()) {
                result.add(new Uzduotis114(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Uzduotis115> getAllUzduotis115() {
        List<Uzduotis115> result = new ArrayList<Uzduotis115>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT  `a`.`id` ,  `a`.`name` ,  `a`.`surname` ,  `a`.`phone` ,  `a`.`email`, `b`.`id` AS `mark_id`, " +
                    "`b`.`student_id`, `b`.`title`, `b`.`mark`, `b`.`time_stamp` " +
                    "FROM  `students` AS `a` " +
                    "LEFT JOIN  `student_marks` AS `b` ON  `a`.`id` =  `b`.`student_id` " +
                    "ORDER BY `b`.`mark` DESC ");
            while (set.next()) {
                result.add(new Uzduotis115(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Uzduotis116> getAllUzduotis116() {
        List<Uzduotis116> result = new ArrayList<Uzduotis116>();
        try {
            _st = _con.createStatement();
            ResultSet set = _st.executeQuery("SELECT  `a`.`id` ,  `a`.`name` ,  `a`.`surname` ,  `a`.`phone` ,  `a`.`email`, `b`.`id` AS `address_id`, `b`.`student_id`, `b`.`country`, `b`.`city`, `b`.`street`, `b`.`post_code`, `c`.`id` AS `mark_id`, `c`.`student_id` AS `student_mark_id`, `c`.`title`, `c`.`mark`, `c`.`time_stamp` " +
                    "FROM  `students` AS `a` " +
                    "INNER JOIN  `student_address` AS `b` ON  `a`.`id` =  `b`.`student_id` " +
                    "INNER JOIN `student_marks` AS `c` ON `a`.`id` = `c`.`id` " +
                    " WHERE `b`.`city` LIKE 'Torontas' AND `a`.`surname` LIKE '%as'");
            while (set.next()) {
                result.add(new Uzduotis116(set));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}

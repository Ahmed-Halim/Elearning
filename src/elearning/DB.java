package elearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {

    private final String userName = "root";
    private final String password = "";
    private final String dbName = "elearning";

    private Connection con;

    public DB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, userName, password);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.err.println("DATABASE CONNECTION ERROR: " + e.toString());
        }
    }

    public Object login(String userName, String password) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs;
            
            //search in students
            rs = stmt.executeQuery("SELECT * FROM studnet WHERE userName = '"+userName+"' AND password='"+password+"';");
            if (rs.first()) {
                Student User = new Student();
                User.setId(rs.getInt("id"));
                User.setFullName(rs.getString("fullName"));
                User.setEmail(rs.getString("email"));
                User.setPhone(rs.getString("phone"));
                User.setDateOfBirth(rs.getString("DateOfBirth"));
                User.setAddress(rs.getString("address"));
                User.setPassword(rs.getString("userName"));
                User.setPassword(rs.getString("password"));
                User.setStatus(rs.getBoolean("status"));
                User.setProgress(rs.getString("progress"));
                User.setAcademicYearName(rs.getString("academicYearName"));
                return User;
            }
            
            
            //search in teachers
            rs = stmt.executeQuery("SELECT * FROM teacher WHERE userName = '"+userName+"' AND password='"+password+"';");
            if (rs.first()) {
                Teacher User = new Teacher();
                User.setId(rs.getInt("id"));
                User.setFullName(rs.getString("fullName"));
                User.setEmail(rs.getString("email"));
                User.setPhone(rs.getString("phone"));
                User.setDateOfBirth(rs.getString("DateOfBirth"));
                User.setAddress(rs.getString("address"));
                User.setPassword(rs.getString("userName"));
                User.setPassword(rs.getString("password"));
                User.setStatus(rs.getBoolean("status"));
                User.setSalary(rs.getFloat("salary"));
                User.setBio(rs.getString("bio"));
                User.setDateOfEmployement(rs.getString("DateOfEmployement"));
                return User;
            }
            
            
            //search in parents
            rs = stmt.executeQuery("SELECT * FROM parent WHERE userName = '"+userName+"' AND password='"+password+"';");
            if (rs.first()) {
                Parent User = new Parent();
                User.setId(rs.getInt("id"));
                User.setFullName(rs.getString("fullName"));
                User.setEmail(rs.getString("email"));
                User.setPhone(rs.getString("phone"));
                User.setDateOfBirth(rs.getString("DateOfBirth"));
                User.setAddress(rs.getString("address"));
                User.setPassword(rs.getString("userName"));
                User.setPassword(rs.getString("password"));
                User.setStatus(rs.getBoolean("status"));
                User.setProfession(rs.getString("profession"));
                return User;
            }
            
            
            //search in admins
            rs = stmt.executeQuery("SELECT * FROM admin WHERE userName = '"+userName+"' AND password='"+password+"';");
            if (rs.first()) {
                Admin User = new Admin();
                User.setFullName(rs.getString("fullName"));
                User.setEmail(rs.getString("email"));
                User.setPhone(rs.getString("phone"));
                User.setDateOfBirth(rs.getString("DateOfBirth"));
                User.setAddress(rs.getString("address"));
                User.setPassword(rs.getString("userName"));
                User.setPassword(rs.getString("password"));
                User.setSalary(rs.getFloat("salary"));
                return User;
            }
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        
        
        return null;
    }
    
    public ArrayList <Grade> getGrades(int student_id) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM grade WHERE student_id = "+student_id+";");
            ArrayList <Grade> gradeList = new ArrayList<>();
            while (rs.next()) {
                Grade g = new Grade(rs.getInt("grade_id"), rs.getInt("student_id"), rs.getString("course_name"), rs.getString("grade").charAt(0));
                gradeList.add(g);
            }
            return gradeList;
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return null;
    }
    
    //----------------- Student ------------------//
    
    public ArrayList <Course> getStudentCourses(int student_id) {
        ArrayList <Course> courses = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT course.code AS code, course.name AS name, course.specification AS specification,  course.level AS level FROM course JOIN academic_year_courses ON academic_year_courses.course_code = course.code JOIN student ON academic_year_courses.academic_year_name = student.academicYearName WHERE student.id = "+student_id+";");
            while (rs.next()) {
                Course c = new Course();
                c.setCode(rs.getString("code"));
                c.setName(rs.getString("name"));
                c.setSpecification(rs.getString("specification"));
                c.setLevel(rs.getString("level").charAt(0));
                courses.add(c);
            }
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return courses;
    }
    
    
    public ArrayList <Material> getCourseMaterial(int course_id) {
        ArrayList <Material> materials = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM material WHERE course_id = "+course_id+";");
            while (rs.next()) {
                Material m = new Material();
                m.setId(rs.getInt("id"));
                m.setName(rs.getString("name"));
                m.setSubject(rs.getString("subject"));
                materials.add(m);
            }
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return materials;
    }
    
    
    public ArrayList<Quiz> getQuizList(int course_id) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM quiz WHERE course_id = "+course_id+";");
            ArrayList<Quiz> quizList = new ArrayList<>();
            while (rs.next()) {
                Quiz quiz = new Quiz();
                quiz.setQuizId(rs.getInt("quizId"));
                quiz.setName(rs.getString("name"));
                quizList.add(quiz);
            }
            return quizList;
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return null;
    }
    
    
    public Quiz getQuiz(int quiz_id) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM quiz WHERE quizId = "+quiz_id+";");
            Quiz quiz = new Quiz();
            if (rs.first()) {
                quiz.setQuizId(rs.getInt("quizId"));
                quiz.setName(rs.getString("name"));
                
                Statement stmt2 = con.createStatement();
                ResultSet rs2 = stmt2.executeQuery("SELECT * FROM quiz_question_answer WHERE quizId = "+quiz_id+";");
                while(rs2.next()) {
                    quiz.addQuestion(rs2.getString("question"));
                    quiz.addAnswer(rs2.getString("answer"));
                }
                return quiz;
            }
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return null;
    }
    
    public void InsertQuizMark(int student_id, int quiz_id, float mark) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into quiz_student_mark values('"+student_id+"','"+quiz_id+"','"+mark+"')");
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
    }
    
    
    public Schedule getSchedule(String academic_year_name) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM schedule WHERE academic_year_name = '"+academic_year_name+"';");
            HashMap<String, String> courseTime = new HashMap<>();
            while (rs.next()) {
                courseTime.put(rs.getString("course_code"), rs.getString("time"));
            }
            Schedule schedule = new Schedule(academic_year_name, courseTime);
            //System.err.println(schedule);

            return schedule;
        } catch (SQLException e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return null;
    }
    
    
}


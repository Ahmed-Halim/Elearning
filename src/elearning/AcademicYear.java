package elearning;

import java.util.ArrayList;

public class AcademicYear {
    String name;
    ArrayList <Course> courseList;
    ArrayList <Student> studentList;
    Schedule schedule;

    public AcademicYear(String name, ArrayList<Course> courseList, ArrayList<Student> studentList, Schedule schedule) {
        this.name = name;
        this.courseList = courseList;
        this.studentList = studentList;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "AcademicYear{" + "name=" + name + ", courseList=" + courseList + ", studentList=" + studentList + ", schedule=" + schedule + '}';
    }
    
    void addCourse(Course c) {
        courseList.add(c);
    }
    
    boolean removeCourseByCode(String code) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCode().equals(code)) {
                courseList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    void addStudent(Student s) {
        studentList.add(s);
    }
    
    boolean removeStudentById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
}

package elearning;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    String code;
    String name;
    String specification;
    char level;
    HashMap <Integer, Float> grades;
    Teacher courseTeacher;
    Material courseMaterial;
    ArrayList <Quiz> quizList;

    public Course(String code, String name, String specification, char level, HashMap<Integer, Float> grades, Teacher courseTeacher, Material courseMaterial, ArrayList<Quiz> quizList) {
        this.code = code;
        this.name = name;
        this.specification = specification;
        this.level = level;
        this.grades = grades;
        this.courseTeacher = courseTeacher;
        this.courseMaterial = courseMaterial;
        this.quizList = quizList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        this.level = level;
    }

    public HashMap<Integer, Float> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<Integer, Float> grades) {
        this.grades = grades;
    }

    public Teacher getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public Material getCourseMaterial() {
        return courseMaterial;
    }

    public void setCourseMaterial(Material courseMaterial) {
        this.courseMaterial = courseMaterial;
    }

    public ArrayList<Quiz> getQuizList() {
        return quizList;
    }

    public void setQuizList(ArrayList<Quiz> quizList) {
        this.quizList = quizList;
    }

    @Override
    public String toString() {
        return "Course{" + "code=" + code + ", name=" + name + ", specification=" + specification + ", level=" + level + ", grades=" + grades + ", courseTeacher=" + courseTeacher + ", courseMaterial=" + courseMaterial + ", quizList=" + quizList + '}';
    }
    
    
           
}

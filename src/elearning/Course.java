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
    ArrayList <Material> courseMaterial;
    ArrayList <Assignment> assignments;
    ArrayList <Quiz> quizList;

    public Course(String code, String name, String specification, char level, HashMap<Integer, Float> grades, Teacher courseTeacher, ArrayList<Material> courseMaterial, ArrayList<Assignment> assignment, ArrayList<Quiz> quizList) {
        this.code = code;
        this.name = name;
        this.specification = specification;
        this.level = level;
        this.grades = grades;
        this.courseTeacher = courseTeacher;
        this.courseMaterial = courseMaterial;
        this.assignments = assignment;
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

    public ArrayList<Material> getCourseMaterial() {
        return courseMaterial;
    }

    public void setCourseMaterial(ArrayList<Material> courseMaterial) {
        this.courseMaterial = courseMaterial;
    }

    public ArrayList<Assignment> getAssignment() {
        return assignments;
    }

    public void setAssignment(ArrayList<Assignment> assignment) {
        this.assignments = assignment;
    }

    public ArrayList<Quiz> getQuizList() {
        return quizList;
    }

    public void setQuizList(ArrayList<Quiz> quizList) {
        this.quizList = quizList;
    }

    @Override
    public String toString() {
        return "Course{" + "code=" + code + ", name=" + name + ", specification=" + specification + ", level=" + level + ", grades=" + grades + ", courseTeacher=" + courseTeacher + ", courseMaterial=" + courseMaterial + ", assignments=" + assignments + ", quizList=" + quizList + '}';
    }
 
    
    
    void addQuiz(Quiz q) {
        quizList.add(q);
    }
     
    boolean removeQuizById(int id) {
        for (int i = 0; i < quizList.size(); i++) {
            if (quizList.get(i).getQuizId() == id) {
                quizList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    void addMaterial(Material m) {
        courseMaterial.add(m);
    }
    
    boolean removeMaterialById(int id) {
        for (int i = 0; i < courseMaterial.size(); i++) {
            if (courseMaterial.get(i).getId() == id) {
                courseMaterial.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    void addAssignment(Assignment a) {
        assignments.add(a);
    }
    
    boolean removeAssignmentById(int id) {
        for (int i = 0; i < assignments.size(); i++) {
            if (assignments.get(i).getId() == id) {
                assignments.remove(i);
                return true;
            }
        }
        return false;
    }
     
    
           
}

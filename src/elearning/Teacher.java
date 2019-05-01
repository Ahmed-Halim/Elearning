package elearning;

import elearning.*;
import java.util.ArrayList;
import java.util.Objects;

public class Teacher extends AuthorizedUser {
    float salary;
    String bio;
    String DateOfEmployement;

    public Teacher() {
        super();
    }
    
    public Teacher(float salary, String bio, String DateOfEmployement, int id, String userName, String password, boolean status, String fullName, String email, String phone, String DateOfBirth, String address) {
        super(id, userName, password, status, fullName, email, phone, DateOfBirth, address);
        this.salary = salary;
        this.bio = bio;
        this.DateOfEmployement = DateOfEmployement;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getDateOfEmployement() {
        return DateOfEmployement;
    }

    public void setDateOfEmployement(String DateOfEmployement) {
        this.DateOfEmployement = DateOfEmployement;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teacher other = (Teacher) obj;
        if (Float.floatToIntBits(this.salary) != Float.floatToIntBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.bio, other.bio)) {
            return false;
        }
        if (!Objects.equals(this.DateOfEmployement, other.DateOfEmployement)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Teacher{" + "salary=" + salary + ", bio=" + bio + ", DateOfEmployement=" + DateOfEmployement + '}';
    }
    
    void CreateQuiz(String courseCode, ArrayList <String> questions, ArrayList <String> answers) {
        Quiz newQuiz = new Quiz("Quiz1" , questions, answers);
        //insert newQuiz to course with courseCode in database
    }
    
    
}

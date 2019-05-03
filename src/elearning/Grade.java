package elearning;

public class Grade {
    int grade_id;
    int student_id;
    String course_name;
    char grade;

    public Grade(int grade_id, int student_id, String course_name, char grade) {
        this.grade_id = grade_id;
        this.student_id = student_id;
        this.course_name = course_name;
        this.grade = grade;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" + "grade_id=" + grade_id + ", student_id=" + student_id + ", course_name=" + course_name + ", grade=" + grade + '}';
    }

    
    
}

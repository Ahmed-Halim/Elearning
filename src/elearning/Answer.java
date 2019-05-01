package elearning;

import java.util.ArrayList;

public class Answer {
    String studentId;
    ArrayList <String> answers;
    float mark;

    public Answer(String studentId, ArrayList<String> answers, float mark) {
        this.studentId = studentId;
        this.answers = answers;
        this.mark = mark;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Answer{" + "studentId=" + studentId + ", answers=" + answers + ", mark=" + mark + '}';
    }

    
}

package elearning;

import java.util.ArrayList;

public class Assignment {
    int id;
    String name;
    String subject;
    int courseId;
    ArrayList <Submission> submissions;

    public Assignment(int id, String name, String subject, int courseId, ArrayList<Submission> submissions) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.courseId = courseId;
        this.submissions = submissions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ArrayList<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<Submission> submissions) {
        this.submissions = submissions;
    }

    @Override
    public String toString() {
        return "Assignment{" + "id=" + id + ", name=" + name + ", subject=" + subject + ", courseId=" + courseId + ", submissions=" + submissions + '}';
    }
    
    
    
}

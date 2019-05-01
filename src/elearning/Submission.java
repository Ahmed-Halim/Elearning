package elearning;

public class Submission {
    int id;
    String name;
    String subject;
    int studentId;

    public Submission(int id, String name, String subject, int studentId) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.studentId = studentId;
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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Submission{" + "id=" + id + ", name=" + name + ", subject=" + subject + ", studentId=" + studentId + '}';
    }
    
}

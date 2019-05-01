package elearning;

public class Feedback {
    int id;
    String studentName;
    String comment;
    int parentId;

    public Feedback(int id, String studentName, String comment, int parentId) {
        this.id = id;
        this.studentName = studentName;
        this.comment = comment;
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Feedback{" + "id=" + id + ", studentName=" + studentName + ", comment=" + comment + ", parentId=" + parentId + '}';
    }
    
    
}

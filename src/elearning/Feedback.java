package elearning;

public class Feedback {
    int id;
    String comment;
    int student_id;
    int parent_id;

    public Feedback(int id, String comment, int student_id, int parent_id) {
        this.id = id;
        this.comment = comment;
        this.student_id = student_id;
        this.parent_id = parent_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    @Override
    public String toString() {
        return "Feedback{" + "id=" + id + ", comment=" + comment + ", student_id=" + student_id + ", parent_id=" + parent_id + '}';
    }
    
    
}

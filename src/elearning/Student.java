package elearning;

import java.util.Objects;

public class Student extends AuthorizedUser {
    Parent parent;
    String progress;
    String academicYearName;

    public Student() {
        super();
    }
    
    public Student(Parent parent, String progress, String academicYearName, int id, String userName, String password, boolean status, String fullName, String email, String phone, String DateOfBirth, String address) {
        super(id, userName, password, status, fullName, email, phone, DateOfBirth, address);
        this.parent = parent;
        this.progress = progress;
        this.academicYearName = academicYearName;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getAcademicYearName() {
        return academicYearName;
    }

    public void setAcademicYearName(String academicYearName) {
        this.academicYearName = academicYearName;
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.progress, other.progress)) {
            return false;
        }
        if (!Objects.equals(this.academicYearName, other.academicYearName)) {
            return false;
        }
        if (!Objects.equals(this.parent, other.parent)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "parent=" + parent + ", progress=" + progress + ", academicYearName=" + academicYearName + '}';
    }
    
    
}

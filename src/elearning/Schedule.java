package elearning;

import java.util.HashMap;

public class Schedule {
    String academic_year_name;
    HashMap <String, String> courseTime;

    public Schedule() {
        
    }

    public Schedule(String academic_year_name, HashMap<String, String> courseTime) {
        this.academic_year_name = academic_year_name;
        this.courseTime = courseTime;
    }
    
    
    public String getAcademic_year_name() {
        return academic_year_name;
    }

    public void setAcademic_year_name(String academic_year_name) {
        this.academic_year_name = academic_year_name;
    }
    
    
    public HashMap<String, String> getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(HashMap<String, String> courseTime) {
        this.courseTime = courseTime;
    }

    @Override
    public String toString() {
        return "Schedule{" + "academic_year_name=" + academic_year_name + ", courseTime=" + courseTime + '}';
    }

    
    
}

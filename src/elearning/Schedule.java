package elearning;

import java.util.HashMap;

public class Schedule {
    int id;
    HashMap <Course, DateTime> courseTime;

    public Schedule(int id, HashMap<Course, DateTime> courseTime) {
        this.id = id;
        this.courseTime = courseTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Course, DateTime> getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(HashMap<Course, DateTime> courseTime) {
        this.courseTime = courseTime;
    }

    @Override
    public String toString() {
        return "Schedule{" + "id=" + id + ", courseTime=" + courseTime + '}';
    }
    
}

package elearning;

import java.util.ArrayList;

public class Notification {
    int id;
    String name;
    String subject;

    public Notification(int id, String name, String subject, ArrayList<Observer> observerList) {
        this.id = id;
        this.name = name;
        this.subject = subject;
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

    @Override
    public String toString() {
        return "Notification{" + "id=" + id + ", name=" + name + ", subject=" + subject + '}';
    }
    
}

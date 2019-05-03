package testing;

import elearning.*;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SystemTest {
    
    static DB db = new DB();
    
    @Test
    public void testStudentParentProfession() {
        Parent p = new Parent("doctor", new ArrayList(), 1, "Mohamed", "123456", true, "Mohamed Musfata", "mohamed@gmail.com", "01012345678", "12/2/1975", "13 elhorya st.");
        Student s = new Student(p, "progress", "year1", 2, "Ahmed", "123456", true, "Ahmed Mohamed Musfata", "ahmed@gmail.com", "01012345678", "23/5/1995", "13 elhorya st.");
        String result = s.getParent().getProfession();
        assertEquals(result, "doctor");
    }
 
    @Test
    public void testNumberCoursesOfStudent() {
        ArrayList <Course> courses = new ArrayList<>();
        courses = db.getStudentCourses(1);
        int result = courses.size();
        assertEquals(result, 3);
    }

    
    @Test
    public void testMaterialsOfCourse() {
        ArrayList <Material> materials = new ArrayList<>();
        materials = db.getCourseMaterial(1);
        int result = materials.size();
        assertEquals(result, 2);
        assertEquals(materials.get(0).getName(), "lecture1");
        assertEquals(materials.get(1).getName(), "lecture2");
    }
    
    @Test
    public void testSchedule() {
        Schedule s = db.getSchedule("grade1");
        assertNotNull(s);
    }
    
    @Test
    public void testQuiz() {
        Quiz quiz1 = db.getQuiz(1);
        String firstQuestionQuiz1 = quiz1.getQuestions().get(0);
        assertEquals(firstQuestionQuiz1, "5 in decimal = 101 in binary ?");
        
        Quiz quiz2 = db.getQuiz(2);
        String secondQuestionQuiz2 = quiz2.getQuestions().get(1);
        assertEquals(secondQuestionQuiz2, "in c++ to print something we use System.out.println() ?");
        
    }
    
    @Test
    public void testCourseQuiz() {
        ArrayList <Quiz> quizList = db.getQuizList(1);
        int quizListSize = quizList.size();
        assertEquals(quizListSize, 2);
    }
    
    
    
    

}


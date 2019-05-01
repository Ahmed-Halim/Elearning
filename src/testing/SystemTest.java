package testing;

import elearning.*;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class SystemTest {

    @Test
    public void testStudentParentProfession() {
        Parent p = new Parent("doctor", new ArrayList(), 1, "Mohamed", "123456", true, "Mohamed Musfata", "mohamed@gmail.com", "01012345678", "12/2/1975", "13 elhorya st.");
        Student s = new Student(p, "progress", "year1", 2, "Ahmed", "123456", true, "Ahmed Mohamed Musfata", "ahmed@gmail.com", "01012345678", "23/5/1995", "13 elhorya st.");
        String result = s.getParent().getProfession();
        assertEquals(result, "doctor");
    }
 

}

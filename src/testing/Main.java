package testing;

import java.util.List;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SystemTest.class);

        List<Failure> failures = result.getFailures();

        for (int i = 0; i < failures.size(); i++) {
            System.out.println(failures.get(i).toString());
        }

        System.out.println(result.wasSuccessful() ? "Testing done successfully" : "Testing faild");
    }
}

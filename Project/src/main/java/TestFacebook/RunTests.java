package TestFacebook;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Created by Anna on 21.01.2016.
 */
public class RunTests {
    public static void main(String[] args) {

        JUnitCore junit = new JUnitCore();
        Result result = junit.run(TestLogin.class, TestSignUp.class);
        result.wasSuccessful();
    }

}

package TestRunner;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


public class TestRunner {
    
    public static void main(String[] args) {

        JUnitCore junit = new JUnitCore();
        Result result = junit.run();//TestLogin.class, TestSignUp.class);
        result.wasSuccessful();
    }   
}

package TestRunner;

import RozetkaPagesTest.HomePage.Basket.DeleteFromBasket;
import RozetkaPagesTest.HomePage.Basket.addToBasket;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
import org.junit.Assert;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;



public class TestRunnerTests {
    
    public static void main(String[] args) {

     JUnitCore junit = new JUnitCore();
        Result result = junit.run(addToBasket.class,
                                DeleteFromBasket.class);//TestLogin.class, TestSignUp.class);
      }   
}

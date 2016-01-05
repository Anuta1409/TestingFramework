package testCase1;

import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Anna on 28.12.2015.
 */
public class TestFirst {

    @Test
    public void loginTestPositive(){
        System.out.println("JUnit login positive test");
    }

    public static boolean login(){
        return true;
    }

    @BeforeClass
    public static void loginTestPositiveBefore(){
        System.out.println("******************Beginning*******************");
        try {
            Assume.assumeTrue(login());
        }catch (Exception e){
          System.out.println("Error");
        }
    }

    @Test
    public void loginTestNegative(){
        System.out.println("JUnit login negative test");
    }

}

package testCase1;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * Created by Anna on 28.12.2015.
 */
public class AssemptionAnderstanding {

    @Rule
    public ErrorCollector errCollector = new ErrorCollector();

    @Test
    public void AssumeTest(){
    int actual = 10;
    int expected = 12;
        System.out.println("A");
        try {
            Assert.assertEquals(actual, expected);
        }catch(Throwable t){
            System.out.println("Error");
            errCollector.addError(t);
        }
        System.out.println("B");
//________________________________________________
        try {
            Assert.assertEquals("A","B");
        }catch(Throwable t){
            System.out.println("Error");
            errCollector.addError(t);
        }
        System.out.println("B");
    }
}

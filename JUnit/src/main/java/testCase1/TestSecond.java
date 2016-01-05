package testCase1;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Anna on 28.12.2015.
 */
public class TestSecond {

    @Test
    public void loginTestPositive(){
        System.out.println("JUnit login positive test");
    }

    @Ignore//doesn't work!!!
    @Test
    public void loginTestNegative(){
        System.out.println("JUnit login negative test");
    }

   // @BeforeClass - тест выполняется самый первый - have to be static
   // @AfterClass - тест выполняется самый последний - have to be static
   // @Before - тест выполняется перед предыдущим
   // @After - тест выполняется после предыдущего


}

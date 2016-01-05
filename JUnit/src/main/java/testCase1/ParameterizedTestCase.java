package testCase1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

/**
 * Created by Anna on 28.12.2015.
 */

@RunWith(Parameterized.class)
public class ParameterizedTestCase {

    private String firstUserName;
    private String secondUserName;
    private int password;


    public ParameterizedTestCase(String firstUserName, String secondUserName, int password) {
        this.firstUserName = firstUserName;
        this.secondUserName = secondUserName;
        this.password = password;
    }

//    @Parameterized.Parameters
//    public static Collection<Object[]> getData(){
//
//    }
}


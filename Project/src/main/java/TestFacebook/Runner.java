package TestFacebook;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Anna on 21.01.2016.
 */

    @RunWith(Suite.class)
    @Suite.SuiteClasses({TestLogin.class, TestSignUp.class})
    public class Runner {
}

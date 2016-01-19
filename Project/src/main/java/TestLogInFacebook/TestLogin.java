package TestLogInFacebook;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Anna on 19.01.2016.
 */
public class TestLogin {
    @Test
    public void PositiveLoginTest(){
        HomePage home = new HomePage();
        ProfilePage profilePage= home.login(String email, String password);
        Assert.assertEquals(profilePage.getCurrentUrl(),requirementResult);

    }


}

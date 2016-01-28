package TestFacebook;

import FaceBookPages.FacebookHomePage;
import FaceBookPages.ProfilePage;
import FaceBookPages.WelcomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anna on 28.01.2016.
 */
public class TestPublication {
    WebDriver driver;

    @Test
    public void testPublication() throws InterruptedException {
        String requirementURL = "https://www.facebook.com/profile.php?id=100011211244010";
        FacebookHomePage home = new FacebookHomePage("https://www.facebook.com/");
        WelcomePage eventPage = home.loginSuccess("anna.chumak1409@gmail.com", "any140991");
        ProfilePage profilePage = eventPage.GoToProfile();
//        try {
//            Assert.assertEquals(profilePage.getChronicsUrl(), requirementURL);
//            profilePage.PostStatus("Lorem");
//        }catch (Exception e){
//            e.toString();
//        }
        profilePage.PostStatus("lorem");
    }
}

package TestFacebook;

import FaceBookPages.ConfermMailPage;
import FaceBookPages.FacebookHomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Anna on 21.01.2016.
 */
public class TestSignUp {


    @Test
    public void NegativeTestSignUp(){
        String actualValue = "Выберите более надежный пароль. Он должен быть длиннее 6 символов, не повторяться и быть трудно угадываемым для других.";
        FacebookHomePage homePage = new FacebookHomePage("https://www.facebook.com/");
        ConfermMailPage page = homePage.signUp("Anna", "Chumak", "anna.chumak1409@gmail.com", "12345678","14","Сен","1991");
        Assert.assertEquals(actualValue,page.infMessage());

    }



    @Test
    public void PositiveTestSignUp(){
        String actualValue = "Anna";
        FacebookHomePage homePage = new FacebookHomePage("https://www.facebook.com/");
        ConfermMailPage page = homePage.signUp("Anna", "Chumak", "anna.chumak1409+1@gmail.com", "any140991","14","Сен","1991");
        Assert.assertEquals(actualValue,page.alreadyRegister());

    }
}

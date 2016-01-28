package TestFacebook;

import FaceBookPages.ErrorLoginPage;
import FaceBookPages.FacebookHomePage;
import FaceBookPages.WelcomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anna on 19.01.2016.
 */
public class TestLogin {
    WebDriver driver;
//Login Test
    @Test
    public void PositiveLoginTest(){
        String requirementResult = "Anna";
        FacebookHomePage home = new FacebookHomePage("https://www.facebook.com/");
        WelcomePage eventPage = home.loginSuccess("anna.chumak1409@gmail.com", "any140991");
        Assert.assertEquals(eventPage.getUserName(),requirementResult);
    }

//    @Test
//    public void NegativeLoginTestPassword(){
//        String requirementResult = "Вы ввели неверный пароль. Забыли пароль?";
//        FacebookHomePage home = new FacebookHomePage("https://www.facebook.com/");
//        ErrorLoginPage errorLoginPagePage = home.loginError("gulic14@mail.ru", "anna150991");
//        Assert.assertEquals(errorLoginPagePage.errorPassword(), requirementResult);
//    }
//
//
//    @Test
//    public void NegativeLoginTestLogin(){
//        String requirementResult = "Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту. Зарегистрируйте аккаунт.";
//        FacebookHomePage home = new FacebookHomePage("https://www.facebook.com/");
//        ErrorLoginPage errorLoginPagePage = home.loginError("k;j;j;j;@mail.ru", "anna150991");
//        Assert.assertEquals(errorLoginPagePage.errorEmail(), requirementResult);
//    }
}

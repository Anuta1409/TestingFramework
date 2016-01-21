package TestFacebook;

import FaceBookPages.ErrorLoginPage;
import FaceBookPages.FacebookHomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anna on 19.01.2016.
 */
public class TestLogin {
    WebDriver driver;
//Login Test
//    @Test
//    public void PositiveLoginTest(){
//        String requirementResult = "https://www.facebook.com/anya.chumak.7";
//        FacebookHomePage home = new FacebookHomePage("https://www.facebook.com/");
//        UsersEventPage eventPage = home.login("gulic14@mail.ru", "anna140991");
//        Assert.assertEquals(eventPage.getUsersLink(),requirementResult);
//    }

    @Test
    public void NegativeLoginTestPassword(){
        String requirementResult = "Вы ввели неверный пароль. Забыли пароль?";
        FacebookHomePage home = new FacebookHomePage("https://www.facebook.com/");
        ErrorLoginPage errorLoginPagePage = home.login("gulic14@mail.ru", "anna150991");
        Assert.assertEquals(errorLoginPagePage.errorPassword(), requirementResult);
    }


    @Test
    public void NegativeLoginTestLogin(){
        String requirementResult = "Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту. Зарегистрируйте аккаунт.";
        FacebookHomePage home = new FacebookHomePage("https://www.facebook.com/");
        ErrorLoginPage errorLoginPagePage = home.login("k;j;j;j;@mail.ru", "anna150991");
        Assert.assertEquals(errorLoginPagePage.errorEmail(), requirementResult);
    }
}

package RozetkaPagesTest.HomePage.SignUp;

import RosetkaPages.HomePage;
import RosetkaPages.SignUp;
import RozetkaPagesTest.HomePage.WebDriverSettings;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.By;


public class SignUpTest {
   
    WebDriver driver = WebDriverSettings.startWebDriver("firefox");
    
    @Before
    public void StartTest(){
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage("http://rozetka.com.ua/");
    }
    
    
    
    @Test
    public void PositiveSignUpTest(){
        HomePage homePage = new HomePage(driver);
        SignUp signUp = homePage.goToSignUp();
        signUp.addSignUdData("User", "chumaktest14091991@gmail.com", "12345678");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        String actualResult = driver.findElement(By.xpath(".//*[@id='personal_information']/header/h1")).getText();
        String expectedResult = "Личные данные";
        Assert.assertEquals(actualResult, expectedResult);
    } 
    
    @After
    public void CloseBrowser(){
        try {
            Thread.sleep(8000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SignUpTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver.quit();
    }
    
    
    
    
    
    
    
    
}

package RozetkaPagesTest.HomePage.SignUp;

import RosetkaPages.HomePage;
import RosetkaPages.SignUp;
import RozetkaPagesTest.HomePage.WebDriverSettings;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NegativeSignUpTest {
    
    WebDriver driver = WebDriverSettings.startWebDriver("firefox");
     
    @Before
    public void StartTest(){
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage("http://rozetka.com.ua/");
    }
    
    
    @Test
    public void NegativeSignUpTest(){
        HomePage homePage = new HomePage(driver);
        SignUp signUp = homePage.goToSignUp();
        signUp.addSignUdData("User", "chumaktest14091991@gmail.com", "12345678");
        
        try {
            Thread.sleep(8000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NegativeSignUpTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String actualResult = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div[1]/div/b")).getText();
        String expectedResult = "chumaktest14091991@gmail.com";
        Assert.assertEquals(actualResult, expectedResult);
    }
    
    @After
    public void CloseBrowser(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SignUpTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver.quit();
    }
    
}

package RozetkaPagesTest.HomePage.Login;

import RosetkaPages.HomePage;
import OwnLogger.Log;
import OwnLogger.Logger;
import WebDriverStart.WebDriverSettings;
import com.so.log.elements.TestCases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PositiveLoginTest {
    WebDriver driver = WebDriverSettings.startWebDriver("firefox");
    
    
    @Before
    public void StartTest(){
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage("http://rozetka.com.ua/");
    }
    
   @After
    public void CloseBrowser(){
        try {
            driver.quit();
            Logger.writeLog("test1.txt");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(PositiveLoginTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
    
     @Test
     public void PositiveLoginTest(){
        Logger.createTestCase(1, 1, "Positive Login Test");
        HomePage homePage = new HomePage(driver);
        Logger.addSteps(1, 1, "Set parameters login and password");
        Logger.addParameter(1,1,"login", "chumaktest14091991@gmail.com");
        Logger.addParameter(2,1,"password", "12345678");
        homePage.loginGoToProfile("chumaktest14091991@gmail.com", "12345678");
        Logger.addSteps(2, 1, "Close popup for connecting with social link");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        homePage.closePopup();
        Logger.addSteps(3, 1, "Compare actual result with expected");
        String ActualResult = driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).getText();
        String Expected = "User";
        System.out.println(Logger.createJSON().toString());
        if(Expected.equals(ActualResult)){
            //Logger.addSuccessMessage;           
        } else {
           //Logger.addFailMessage; 
        }
        
        
    }
    
            
            
    
}

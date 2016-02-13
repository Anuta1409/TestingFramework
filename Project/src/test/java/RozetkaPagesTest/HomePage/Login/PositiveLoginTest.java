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
    Logger log = new Logger();
    Log writeLog = new Log();
    
    @Before
    public void StartTest(){
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage("http://rozetka.com.ua/");
    }
    
   @After
    public void CloseBrowser(){
        try {
            driver.quit();
            writeLog.writeLog("test.txt");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(PositiveLoginTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
    //
    @Test
    public void PositiveLoginTest(){
        Logger.createTestCase(1, 1, "Positive Login Test");
        HomePage homePage = new HomePage(driver);
        Logger.addSteps(1, 1, "Set parameters login and password");
        //new params () p.add("username", user)
        //step2.addParams
        homePage.loginGoToProfile("chumaktest14091991@gmail.com", "12345678");
        
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        homePage.closePopup();
        String ActualResult = driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).getText();
        String Expected = "User";
        Assert.assertEquals(Expected, ActualResult);
        
        
    }
    
            
            
    
}

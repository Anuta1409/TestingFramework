
package RozetkaPagesTest.HomePage.Login;

import RosetkaPages.HomePage;
import WebDriverStart.WebDriverSettings;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            Thread.sleep(8000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PositiveLoginTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver.quit();
    } 
    
    @Test
    public void PositiveLoginTest(){
        HomePage homePage = new HomePage(driver);
        homePage.loginGoToProfile("chumaktest14091991@gmail.com", "12345678");
        
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        homePage.closePopup();
        String ActualResult = driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).getText();
        String Expected = "User";
       Assert.assertEquals(Expected, ActualResult);
        
        
    }
    
            
            
    
}

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
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;


public class NegativeLoginTest {

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
    public void NegativeLoginTest(){
        HomePage homePage = new HomePage(driver);
        homePage.loginGoToProfile("chumak14091991@gmail.com", "12345678");
        
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        
         
        try {
       
        //Switch to the Popup Browser Window
        driver.switchTo().window("email_hint");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        }
        
        String ActualResult = driver.findElement(By.xpath("*//div[2]/div/div[1]/div[1]/div[3]//form/div[1]/div[2]/div[2]/div/p/b")).getText();
        String Expected = "chumak14091991@gmail.com";
       Assert.assertEquals(Expected, ActualResult);
        
        
    }
}


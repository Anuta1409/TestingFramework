package RozetkaPagesTest.HomePage.Basket;

import RosetkaPages.BasketPopup;
import RosetkaPages.HomePage;
import RozetkaPagesTest.HomePage.Login.PositiveLoginTest;
import WebDriverStart.WebDriverSettings;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class addToBasket{
    
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
    public void addToBacketPage(){
        HomePage homePage = new HomePage(driver);
        BasketPopup basket = homePage.addToBasket("chumaktest14091991@gmail.com", "12345678","iPhone");
        
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='cart-popup']/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/a")).getText().contains("iPhone"));
    }
    
    
    
}

package RozetkaPagesTest.HomePage.Basket;

import RosetkaPages.BasketPopup;
import RosetkaPages.HomePage;
import RosetkaPages.ProfilePage;
import RozetkaPagesTest.HomePage.Login.PositiveLoginTest;
import RozetkaPagesTest.HomePage.WebDriverSettings;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DeleteFromBasket {
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
        ProfilePage profile = homePage.loginGoToProfile("chumaktest14091991@gmail.com", "12345678");
        homePage.closePopup();
        
        try {
            Thread.sleep(7000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DeleteFromBasket.class.getName()).log(Level.SEVERE, null, ex);
        }
        profile.goToProfile();
        
        BasketPopup basket = profile.goToBacketPage();
        basket.GoToPopup();
        basket.deleteGoods();
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='drop-block']/h2")).getText().contains("Корзина пуста"));
    }
    
}

package RozetkaPagesTest.HomePage.Search;

import RosetkaPages.HomePage;
import RozetkaPagesTest.HomePage.Login.PositiveLoginTest;
import WebDriverStart.WebDriverSettings;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchGeneralInput {

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
    public void searchGeneralField(){
        HomePage homePage = new HomePage(driver);
        homePage.searchField("iPhone");
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='block_with_goods']/div[1]/div[3]/div[1]/div/div[1]/div/div[4]/a")).getText().contains("iPhone"));
    }
       
}

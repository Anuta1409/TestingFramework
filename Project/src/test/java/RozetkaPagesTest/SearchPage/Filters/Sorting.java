package RozetkaPagesTest.SearchPage.Filters;

import RosetkaPages.HomePage;
import RosetkaPages.SearchPage;
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


public class Sorting {
    WebDriver driver = WebDriverSettings.startWebDriver("firefox");
     
    @Before
    public void StartTest(){
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage("http://rozetka.com.ua/");
        homePage.searchField("iPhone");
             
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
    public void HighToLowSort(){
       SearchPage searchPage = new SearchPage(driver);
       searchPage.setSortHightToLow();
       Assert.assertTrue(driver.getCurrentUrl().contains("sort=expensive"));//findElement(By.xpath(".//*[@id='title_page']/div/div/div[3]/ul/li[2]/a")).getText().contains("8999"));
    }
    
    
    
}

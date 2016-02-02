
package RozetkaPagesTest.HomePage.addToWishList;

import RosetkaPages.HomePage;
import RosetkaPages.SearchPage;
import RozetkaPagesTest.HomePage.Login.PositiveLoginTest;
import WebDriverSettings.StartBrowser;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToWishListAsRegisterUser {
    
    
    WebDriver driver = StartBrowser.startWebDriver("firefox");
    
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
    public void addToWishListTest(){
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = homePage.searchField("iPhone");
        searchPage.addToWhishList("TestWishList", "chumaktest14091991@gmail.com", "12345678");
        String ActualResult = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/h2")).getText();
        String ExpectedResult = "Товар добавлен в список желаний";
        Assert.assertEquals(ExpectedResult, ActualResult);
    }
    
}

package WebElementsTest;

import PageObjectPattern.HTMLElements;
import RozetkaPagesTest.HomePage.Login.PositiveLoginTest;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class IsElementPresentTest {
    
    WebDriver driver = WebDriverSettings.StartBrowser.startWebDriver("chrome");
    
    @Before
     public void setUrlTestPositive(){
        HTMLElements.setUrl(driver, "http://rozetka.com.ua/");
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
    public void getHTMLElementTestPositive(){
        //boolean test = HTMLElements.isElementPresent(driver, "byXpath", ".//*[@id='header_user_menu_parent']/a");
        Assert.assertTrue(HTMLElements.isElementPresent(driver, "byXpath", ".//*[@id='header_user_menu_parent']/a"));
    }      
}

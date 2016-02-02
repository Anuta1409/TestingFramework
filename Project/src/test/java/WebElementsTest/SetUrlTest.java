package WebElementsTest;

import PageObjectPattern.HTMLElements;
import RozetkaPagesTest.HomePage.Login.PositiveLoginTest;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class SetUrlTest {
    
    WebDriver driver = WebDriverSettings.StartBrowser.startWebDriver("chrome");
   
    
    @Test
    public void setUrlTestPositive(){
        HTMLElements.setUrl(driver, "http://rozetka.com.ua/");
    }
    
    @Test
    public void setUrlTestNegative(){
        HTMLElements.setUrl(driver, "www.rozetka.com.ua");
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
    
    
}

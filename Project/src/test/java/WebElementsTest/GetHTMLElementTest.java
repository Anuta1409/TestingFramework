package WebElementsTest;

import PageObjectPattern.HTMLElements;
import RozetkaPagesTest.HomePage.Login.PositiveLoginTest;
import WebDriverStart.WebDriverSettings;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class GetHTMLElementTest {
    
     WebDriver driver = WebDriverSettings.startWebDriver("chrome");
    
    @Before
     public void setUrlTestPositive(){
        HTMLElements.setUrl(driver, "http://rozetka.com.ua/");
    }
     
    @Test
    public void getHTMLElementTestPositive(){
        HTMLElements.getHTMLElement(driver, "byXpath", ".//*[@id='header_user_menu_parent']/a");
    }
    
    public void getHTMLElementTestNegative(){
        HTMLElements.getHTMLElement(driver, "byXpath", ".//*[@id='headermenu_parent']/a");
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

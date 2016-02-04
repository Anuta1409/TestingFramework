package WebElementsTest;

import PageObjectPattern.HTMLElements;
import RozetkaPagesTest.HomePage.Login.PositiveLoginTest;
import com.google.common.collect.HashMultiset;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class ClickOnTheElementTest {
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
    public void ClickOnElementTestPositive(){
        HTMLElements.clickOnElement(driver, "byXpath", ".//*[@id='header_user_menu_parent']/a");
    }
    
    @Test
    public void ClickOnElementTestNegative(){
        HTMLElements.clickOnElement(driver, "byXpath", ".//*[@id='header_menu_parent']/a");
    }
    
    
}

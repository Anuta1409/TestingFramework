package WebElementsTest;

import PageObjectPattern.GoToOtherWindow;
import PageObjectPattern.HTMLElements;
import RozetkaPagesTest.HomePage.Login.PositiveLoginTest;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

public class CheckBoxAndRadioButtonTest {
    
    WebDriver driver = WebDriverSettings.StartBrowser.startWebDriver("chrome");
            
    @Before
    public void setUrlTestPositive(){
        HTMLElements.setUrl(driver, "http://rozetka.com.ua/");
        HTMLElements.clickOnElement(driver, "byXpath", ".//*[@id='header_user_menu_parent']/a");
         try {
            Thread.sleep(8000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CheckBoxAndRadioButtonTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        GoToOtherWindow.goToOtherWindow(driver, "¬ход в интернет-магазин");
            
    }
        
    @Test
    public void checkBoxRadioButton(){
        driver.findElement(By.xpath("*//div[2]/div/div[1]/div[1]/div[3]//form/div[1]/div[2]/input")).sendKeys("rttr");
        HTMLElements.RadioAndCheckBoxButtonClick(driver, "name", "remember");
    }
     
//    @After
//    public void CloseBrowser(){
//        try {
//            Thread.sleep(8000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(PositiveLoginTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        driver.quit();
//    }
//    
    
    
}

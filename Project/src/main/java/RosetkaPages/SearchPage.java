package RosetkaPages;

import PageObjectPattern.GoToOtherWindow;
import PageObjectPattern.HTMLElements;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public SearchPage setFilterPrise(String min, String max){
        HTMLElements.setTextfield(driver, "byXpath", ".//*[@id='price[min]']", min,true);  
        HTMLElements.setTextfield(driver, "byXpath",".//*[@id='price[max]']", max, true);    
        HTMLElements.clickOnElement(driver, "byXpath",".//*[@id='submitprice']");
        return new SearchPage(driver);
    }
    
    public SearchPage setSortHightToLow(){
       HTMLElements.clickOnElement(driver, "byXpath",".//*[@id='sort_view']/a");
       GoToOtherWindow.goToOtherWindow(driver, "drop_link");
       HTMLElements.clickOnElement(driver, "byXpath",".//*[@id='sort_view']/div/ul/li[2]/a");
        return new SearchPage(driver);
    }

    public void addToWhishList(String wishListName,String userEmail,String password) {
        HTMLElements.clickOnElement(driver, "byXpath",".//*[@id='wishlist-popup-6370162']/img");
        GoToOtherWindow.goToOtherWindow(driver, "Добавление в список желаний");
        HTMLElements.setTextfield(driver, "byXpath","*//div[1]//form/div/div[1]/input",wishListName,true);
        HTMLElements.setTextfield(driver, "byXpath", "*//div[1]//form/div/div[2]/div[1]/input", userEmail, false);
        HTMLElements.clickOnElement(driver, "byXpath", "*//div[1]//form/div/div[2]/div[1]/div[2]/span/button");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SearchPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        HTMLElements.setTextfield(driver, "byXpath", "*//div[1]//form/div/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/input",password,false);
        HTMLElements.clickOnElement(driver, "byXpath", ".//*[@id='signin']");
        GoToOtherWindow.goToOtherWindow(driver, "Добавление в список желаний"); 
        HTMLElements.clickOnElement(driver, "byXpath","*//div[1]//form/div/div[3]/span/button");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SearchPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}

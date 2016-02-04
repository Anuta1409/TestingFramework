package RosetkaPages;

import PageObjectPattern.HTMLElements;
import org.openqa.selenium.WebDriver;


public class ProfilePage {
    
    WebDriver  driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;   
    }
    
    public ProfilePage goToProfile(){
        HTMLElements.clickOnElement(driver, "byXpath", ".//*[@id='header_user_menu_parent']/a");
        return new ProfilePage(driver);
    }
    
     public BasketPopup goToBacketPage(){
        HTMLElements.clickOnElement(driver, "byXpath", "html/body/div[1]/div/div/div/nav/ul/li[4]/a/span");
        return new BasketPopup(driver);
     }
}

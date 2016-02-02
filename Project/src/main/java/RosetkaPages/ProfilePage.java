
package RosetkaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProfilePage {
    
    WebDriver  driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;   
    }
    
    public ProfilePage goToProfile(){
        driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).click();
        return new ProfilePage(driver);
    }
    
     public BasketPopup goToBacketPage(){
         driver.findElement(By.xpath("html/body/div[1]/div/div/div/nav/ul/li[4]/a/span")).click();
         return new BasketPopup(driver);
     }
}

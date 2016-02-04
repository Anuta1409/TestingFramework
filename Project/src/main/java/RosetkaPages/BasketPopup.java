package RosetkaPages;

import PageObjectPattern.GoToOtherWindow;
import PageObjectPattern.HTMLElements;
import org.openqa.selenium.WebDriver;


public class BasketPopup {
    WebDriver driver;

    BasketPopup(WebDriver driver) {
        this.driver = driver;   
    }
    
     public void GoToPopup(){
        GoToOtherWindow.goToOtherWindow(driver, "Корзина");  
    }
    
    public BasketPopup deleteGoods(){
        BasketPopup basketPopup = new BasketPopup(driver);
        basketPopup.GoToPopup();
        HTMLElements.clickOnElement(driver, "byXpath", ".//*[@id='cart-popup']/div/div[1]/div[2]/div/div[1]/a/img");
        GoToOtherWindow.goToOtherWindow(driver, "Переместить в список желаний");
        HTMLElements.clickOnElement(driver, "byXpath",".//*[@id='cart-popup']/div/div[1]/div[2]/div/div[1]/div/div/div[2]/a");
        basketPopup.GoToPopup();
        
        return new BasketPopup(driver);
    }
    
}

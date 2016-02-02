package RosetkaPages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;


public class BasketPopup {
    WebDriver driver;

    BasketPopup(WebDriver driver) {
        this.driver = driver;   
    }
    
     public void GoToPopup(){
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        try {
       //Switch to the Popup Browser Window
        driver.switchTo().window("Корзина");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        }
       
    }
    
    public BasketPopup deleteGoods(){
        BasketPopup basketPopup = new BasketPopup(driver);
        basketPopup.GoToPopup();
        driver.findElement(By.xpath(".//*[@id='cart-popup']/div/div[1]/div[2]/div/div[1]/a/img")).click();
        
        try {
       //Switch to the Popup Browser Window
        driver.switchTo().window("Переместить в список желаний");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath(".//*[@id='cart-popup']/div/div[1]/div[2]/div/div[1]/div/div/div[2]/a")).click();
        basketPopup.GoToPopup();
        
        return new BasketPopup(driver);
    }
    
}

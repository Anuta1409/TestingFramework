/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RosetkaPages;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Anna
 */
public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public SearchPage setFilterPrise(String min, String max){
        
        WebElement minPrice = driver.findElement(By.xpath(".//*[@id='price[min]']"));
        minPrice.clear();
        minPrice.sendKeys(min);    
        
        WebElement maxPrice = driver.findElement(By.xpath(".//*[@id='price[max]']"));
        maxPrice.clear();
        maxPrice.sendKeys(min);  
        
        driver.findElement(By.xpath(".//*[@id='submitprice']")).click();
        
        
        return new SearchPage(driver);
    }
    
    public SearchPage setSortHightToLow(){
        driver.findElement(By.xpath(".//*[@id='sort_view']/a")).click();
        try {
            //Switch to the Popup Browser Window
            driver.switchTo().window("drop_link");
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath(".//*[@id='sort_view']/div/ul/li[2]/a")).click();
        return new SearchPage(driver);
    }

    public void addToWhishList(String wishListName,String userEmail,String password) {
        driver.findElement(By.xpath(".//*[@id='wishlist-popup-6370162']/img")).click();
         try {
            //Switch to the Popup Browser Window
            driver.switchTo().window("Добавление в список желаний");
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        }
         
        WebElement element = driver.findElement(By.xpath("*//div[1]//form/div/div[1]/input"));
        element.clear();
        element.sendKeys(wishListName);                
        driver.findElement(By.xpath("*//div[1]//form/div/div[2]/div[1]/input")).sendKeys(userEmail);
        driver.findElement(By.xpath("*//div[1]//form/div/div[2]/div[1]/div[2]/span/button")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SearchPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver.findElement(By.xpath("*//div[1]//form/div/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/input")).sendKeys(password);
        driver.findElement(By.xpath(".//*[@id='signin']")).click();
         
        try {
            //Switch to the Popup Browser Window
            driver.switchTo().window("Добавление в список желаний");
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("*//div[1]//form/div/div[3]/span/button")).click();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SearchPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}

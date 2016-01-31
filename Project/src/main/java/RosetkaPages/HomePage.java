
package RosetkaPages;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
    WebDriver driver;
    
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    
    public HomePage openHomePage(String url){
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        return new HomePage(driver);
    }
    
    public SignUp goToSignUp(){
        driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).click();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        try {
            
        //Switch to the Popup Browser Window
        driver.switchTo().window("¬ход в интернет-магазин");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("*//div[2]/div/div[1]/div[1]/div[3]//form/div[2]/div[4]/a")).click(); 
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        return  new SignUp(driver);    
    }
    
    
    
    public ProfilePage loginGoToProfile(String email, String password){
        driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).click();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        try {
       
        //Switch to the Popup Browser Window
        driver.switchTo().window("¬ход в интернет-магазин");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("*//div[2]/div/div[1]/div[1]/div[3]//form/div[1]/div[2]/input")).sendKeys(email);
        driver.findElement(By.xpath("*//div[2]/div/div[1]/div[1]/div[3]//form/div[1]/div[3]/div[1]/div[1]/input")).sendKeys(password);
        
        WebElement checkBox = driver.findElement(By.xpath("*//div[2]/div/div[1]/div[1]/div[3]//form/div[1]/div[3]/div[1]/div[1]/label/span"));
        
        if (checkBox.isSelected()){
          driver.findElement(By.xpath("*//div[2]/div/div[1]/div[1]/div[3]//form/div[1]/div[3]/div[1]/div[2]/div/span/button")).click();  
        }else {
            checkBox.click();
            driver.findElement(By.xpath("*//div[2]/div/div[1]/div[1]/div[3]//form/div[1]/div[3]/div[1]/div[2]/div/span/button")).click();  
        }
        
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        
        return  new ProfilePage(driver);    
    }
    
    public ProfilePage closePopup(){
        try {
       
        //Switch to the Popup Browser Window
        driver.switchTo().window("—в€жите аккаунт с соцсет€ми");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//*[@id='social_popup']/div/div/a")).click();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
         
        try {
       
        //Switch to the Popup Browser Window
        driver.switchTo().window("»нтернет-магазин ROZETKAЩ: фототехника, видеотехника, аудиотехника, компьютеры и компьютерные комплектующие");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        }
           
        return  new ProfilePage(driver);    
    }
    
   public SearchPage searchField(String searchQuery){
       driver.findElement(By.xpath(".//*[@id='search']/form/div[1]/div[2]/input")).sendKeys(searchQuery);
       driver.findElement(By.xpath("*//div[2]/div/div[2]/div[3]/form/span/span")).click();
   
       try {
       
        //Switch to the Popup Browser Window
        driver.switchTo().window("»нтернет-магазин ROZETKAЩ: фототехника, видеотехника, аудиотехника, компьютеры и компьютерные комплектующие");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        } 
    
       return new SearchPage(driver);
   }
    
    
    
}
    

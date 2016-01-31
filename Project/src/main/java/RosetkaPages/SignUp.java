/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RosetkaPages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Anna
 */
public class SignUp {
    WebDriver driver;

    public SignUp(WebDriver driver) {
      this.driver = driver;
    }
    
    public ConfirmRegistrationPage addSignUdData(String name, String email, String password){
        
        driver.findElement(By.xpath(".//*[@id='signup_form']/div[1]/input")).sendKeys(name);
        driver.findElement(By.xpath(".//*[@id='signup_form']/div[2]/input")).sendKeys(email);
        driver.findElement(By.xpath(".//*[@id='signup_form']/div[3]/input")).sendKeys(password);
        driver.findElement(By.xpath(".//*[@id='signup_form']/div[4]/span/button")).click();
        
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        return new ConfirmRegistrationPage(driver);
    }
}

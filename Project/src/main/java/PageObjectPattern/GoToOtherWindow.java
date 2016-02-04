/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjectPattern;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Anna
 */
public class GoToOtherWindow {
    public static WebDriver driver;
    
    public static void goToOtherWindow(WebDriver driver, String windowName){
     try {
        //Switch to the Popup Browser Window
        driver.switchTo().window(windowName);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        }
    }
    
}

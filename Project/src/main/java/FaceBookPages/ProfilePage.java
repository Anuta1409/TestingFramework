package FaceBookPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anna on 21.01.2016.
 */
public class ProfilePage {
    private WebDriver driver;

    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }


    public String getChronicsUrl() {
        return  driver.getCurrentUrl();
    }

    public ProfilePage PostStatus(String statusName){
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/li/div/div/div/div/div/div[1]/div/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/li/div/div/div/div/div/div[2]/div/div[2]")).sendKeys(statusName);
        //driver.findElement(By.xpath(""))

        //driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/li/div/div/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div")).sendKeys(statusName);
        //driver.findElement(By.xpath(".//*[@id='js_o']/div[4]/div[2]/div/div[2]/div/button")).click();
          return new ProfilePage(driver);
    }

    public ProfilePage checkPostStatus(){
        return  new ProfilePage(driver);
    }

    public ProfilePage PostPhoto(){
        return new ProfilePage(driver);
    }

    public ProfilePage PostLifeEvent(){
        return new ProfilePage(driver);
    }



}

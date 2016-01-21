package FaceBookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anna on 20.01.2016.
 */
public class ErrorLoginPage {

    WebDriver driver;

    public ErrorLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public String errorPassword() {
        return  driver.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div/div[2]")).getText();
    }

    public String errorEmail() {
        return  driver.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div/div[2]")).getText();
    }
}


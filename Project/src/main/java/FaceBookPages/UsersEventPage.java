package FaceBookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anna on 20.01.2016.
 */
public class UsersEventPage {
    WebDriver driver;

    public UsersEventPage(WebDriver driver){
        this.driver = driver;
    }

    public String getUsersLink() {
        return  driver.findElement(By.xpath(".//*[@id='blueBarDOMInspector']//div[2]/ul/li[1]/div/a")).getAttribute("href");
    }


}

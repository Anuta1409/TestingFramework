package FaceBookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anna on 21.01.2016.
 */
public class ConfermMailPage {

        WebDriver driver;

        public ConfermMailPage(WebDriver driver){
            this.driver = driver;
        }

        public String infMessage() {
            //??????????????????????????????????????????????????????????????????????
            //WebDriverWait wait =  new WebDriverWait(driver,20);
            //https://selenium.googlecode.com/git/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html#visibilityOfElementLocated-org.openqa.selenium.By-
           // WebElement element = wait.until(ExpectedCondition.visibilityOfElementLocated(By.ByXPath()));
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return  driver.findElement(By.xpath(".//*[@id='reg_error_inner']")).getText();
        }


    public String alreadyRegister(){
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.xpath(".//*[@id='u_9_b']/li[1]/div/a/span")).getText();
    }

}

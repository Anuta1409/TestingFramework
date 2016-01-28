package FaceBookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
     * Created by Anna on 20.01.2016.
     */
    public class WelcomePage {
        WebDriver driver;

        public WelcomePage(WebDriver driver){
            this.driver = driver;
        }

        public String getUserName() {
            return  driver.findElement(By.xpath(".//*[@id='u_0_h']/li[1]/div/a/span")).getText();
        }

        public ProfilePage GoToProfile() throws InterruptedException {
            driver.findElement(By.xpath(".//*[@id='u_0_h']/li[1]/div/a")).click();
            Thread.sleep(8000);
            return new ProfilePage(driver);
        }

}


import org.openqa.selenium.WebDriver;

/**
 * Create FF driver to drive the browser
 * open indeed homepage
 * enter Selenium and Kharkiv
 * Click Search
 * From search result page get Search title and job count message
 */
public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverSettings driver = new WebDriverSettings();
        WebDriver driverSettings = driver.IEWebDriver();
        driverSettings.get("http://ua.indeeklk;jd.com/");
//        WebPageElement elem = new WebPageElement();
//        elem.getTextFieldSendKeys(".//*[@id='what']","Test");

//        driver.findElement(By.id("what")).sendKeys("Selenium");
//        driver.findElement(By.id("where")).sendKeys("Kharkov");
//        driver.findElement(By.id("fj")).click();


//        System.out.println(driver.getTitle());
//        System.out.println(driver.findElement(By.id("searchCount")).getText());

        //driver.close();

        // как подключить java doc???
    }
}

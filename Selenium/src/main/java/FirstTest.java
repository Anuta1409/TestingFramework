import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Create FF driver to drive the browser
 * open indeed homepage
 * enter Selenium and Kharkiv
 * Click Search
 * From search result page get Search title and job count message
 */
public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
       // WebDriver driver = new FirefoxDriver();
        //System.setProperty - should be done for FF, IE, EDGE
        //!!!IE - you should check Zoom - 100%+Security
        System.setProperty("webdriver.chrome.driver","D:\\Ukrainian_IT_School\\Work\\FinalWork\\libraries\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.ie.driver","D:\\Ukrainian_IT_School\\Work\\FinalWork\\libraries\\IEDriverServer.exe");
       //WebDriver driver = new InternetExplorerDriver();

        Thread.sleep(2000);
        driver.get("http://ua.indeed.com/");
        driver.findElement(By.id("what")).sendKeys("Selenium");
        driver.findElement(By.id("where")).sendKeys("Kharkov");
        driver.findElement(By.id("fj")).click();


//        System.out.println(driver.getTitle());
//        System.out.println(driver.findElement(By.id("searchCount")).getText());

        driver.close();

        // как подключить java doc???
    }
}

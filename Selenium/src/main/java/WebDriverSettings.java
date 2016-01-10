
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * File for default Selenium web-driver settings for different browsers:
 * -FF,
 * -Chrome,
 * -IE-11,
 * -Edge
 */
public class WebDriverSettings {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver FireFoxWebDriver(){
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public WebDriver ChromeWebDriwer(){
        System.setProperty("webdriver.chrome.driver","D:\\Ukrainian_IT_School\\FinalWork\\libraries\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public WebDriver IEWebDriver(){
        System.setProperty("webdriver.ie.driver","D:\\Ukrainian_IT_School\\FinalWork\\libraries\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }

    //Edge!!!!!!!!!!
}

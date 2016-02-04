
package WebDriverStart;


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

    enum browserChoose {chrome, firefox, IE}

    public static WebDriver driver;

    public static WebDriver startWebDriver(String browserName) {
        browserChoose access = browserChoose.valueOf(browserName);
        switch (access) {
            case chrome: {

                System.setProperty("webdriver.chrome.driver", "..\\Project\\resources\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                return driver;
            }
            case firefox: {
                WebDriver driver = new FirefoxDriver();
                driver.manage().window().maximize();
                return driver;
            }
            case IE: {
                System.setProperty("webdriver.ie.driver", "..\\Project\\resources\\IEDriverServer.exe");
                WebDriver driver = new InternetExplorerDriver();
                driver.manage().window().maximize();
                return driver;
            }
            default: {
                System.out.println("webElementAccess not found");
                driver = null;
            }
            return driver;
        }
    }
}


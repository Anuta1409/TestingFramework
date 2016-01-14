package PageObjectPattern;

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

    private WebDriver ChromeDriver;
    private WebDriver FFDriver;
    private WebDriver IEDriver;


    public WebDriver getFFDriver() {
        return FFDriver;
    }

    public void setFFDriver(WebDriver FFDriver) {
        this.FFDriver = FFDriver;
    }

    public WebDriver getIEDriver() {
        return IEDriver;
    }

    public void setIEDriver(WebDriver IEDriver) {
        this.IEDriver = IEDriver;
    }

    public WebDriver getChromeDriver() {
        return ChromeDriver;
    }
    public void setChromeDriver(WebDriver ChromeDriver) {
        this.ChromeDriver = ChromeDriver;
    }

    public WebDriver FireFoxWebDriver(){
        WebDriver FFdriver = new FirefoxDriver();
        return FFdriver;
    }

    public WebDriver ChromeWebDriwer(){
        System.setProperty("webdriver.chrome.driver","D:\\Ukrainian_IT_School\\FinalWork\\libraries\\chromedriver.exe");
        WebDriver ChromeDriver = new ChromeDriver();
        return ChromeDriver;
    }

    public WebDriver IEWebDriver(){
        System.setProperty("webdriver.ie.driver","D:\\Ukrainian_IT_School\\FinalWork\\libraries\\IEDriverServer.exe");
        WebDriver IEDriver = new InternetExplorerDriver();
        return IEDriver;
    }

    //Edge!!!!!!!!!!
}

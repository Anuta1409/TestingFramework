package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anna on 10.01.2016.
 */
public class HomeRosetkaPage {

    WebDriverSettings driver = new WebDriverSettings();
    WebDriver webDriver = driver.FireFoxWebDriver();

    public HomeRosetkaPage(WebDriver driver){
        this.webDriver = driver;
    }

    public ResultSearchPage search( String searchQueries) {
        webDriver.findElement(By.xpath(".//*[@id='search']/form/div[1]/div[2]/input")).sendKeys(searchQueries);
        webDriver.findElement(By.xpath(".//*[@id='search']/form/span/span")).click();
        return new ResultSearchPage(webDriver);
    }
}

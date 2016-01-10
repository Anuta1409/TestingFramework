package PageObjectPattern;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anna on 10.01.2016.
 */
public class ResultSearchPage {
    WebDriverSettings driver = new WebDriverSettings();
    WebDriver webDriver = driver.FireFoxWebDriver();

    public ResultSearchPage(WebDriver driver) {
        this.webDriver = webDriver;
    }

    public String getFirstLink() {
       return  webDriver.findElement(By.xpath(".//*[@id='head_banner_container']//header/h1")).getText();
    }
}

package PageObjectPattern;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anna on 10.01.2016.
 */
public class ResultSearchPage {


    private  WebDriver webDriver;

    public ResultSearchPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getFirstLink() {
       return  webDriver.findElement(By.xpath(".//*[@id='head_banner_container']//header/h1")).getText();
    }
}

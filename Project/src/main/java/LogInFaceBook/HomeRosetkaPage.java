package LogInFaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anna on 10.01.2016.
 */
public class HomeRosetkaPage {


    private  WebDriver webDriver;

    public HomeRosetkaPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public ResultSearchPage search( String searchQueries) {
        By by = By.xpath(".//*[@id='search']/form/div[1]/div[2]/input");
        webDriver.findElement(by).sendKeys(searchQueries);
        webDriver.findElement(By.xpath(".//*[@id='search']/form/span/span")).click();
        return new ResultSearchPage(webDriver);
    }
}

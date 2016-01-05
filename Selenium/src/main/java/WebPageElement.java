import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Anna on 05.01.2016.
 */
public class WebPageElement {

    WebDriver driver = new FirefoxDriver();
    @Rule
    public ErrorCollector errCollector = new ErrorCollector();

    private String pageURL;

    public String getPageURL(String s) {
        return pageURL;
    }

    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    @Test
    public void setURL(String pageURL) {
        try {
            driver.get(pageURL);
            //запись в логи
        } catch (Throwable t) {
            System.out.println("Not correct URL");
            errCollector.addError(t);
            //запись в логи
        }
    }

    @Test
    public 


}

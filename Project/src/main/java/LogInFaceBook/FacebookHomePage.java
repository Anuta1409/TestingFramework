package LogInFaceBook;

import WebDriverSettings.StartBrowser;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anna on 19.01.2016.
 */
public class FacebookHomePage {
    WebDriver driver = StartBrowser.startWebDriver("chrome");

    FacebookHomePage(WebDriver driver,String url) {
        this.driver = driver;
        driver.get(url);
    }

    pu
}

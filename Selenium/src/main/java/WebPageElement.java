
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.NoSuchElementException;

/**
 * Main web-page attributes and actions on them
 */
public class WebPageElement {
    WebDriverSettings driver = new WebDriverSettings();
    WebDriver driverSetting = driver.FireFoxWebDriver();

    @Rule
    ErrorCollector errorCollector = new ErrorCollector();

    private String pageURL;
    private String getElement;
    private Object isElementPresent;

    public String getGetElement() {
        return getElement;
    }

    public void setGetElement(String getElement) {
        this.getElement = getElement;
    }

    public String getPageURL(String s) {
        return pageURL;
    }

    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    @Before
    public void setURL(String pageURL) {
        try {
            driverSetting.getCurrentUrl();
            //запись в логи
        } catch (Exception e) {
            System.out.println("Not correct URL");
            errorCollector.addError(e);
            return;
            //запись в логи
        }
    }

    @Test
    //Check element
    private boolean isElementPresent(By by) {
        try {
            driverSetting.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void getTextFieldSendKeys(By by,String value) {
        WebPageElement webElementPosition = new WebPageElement();
        boolean elementPresentPosition = webElementPosition.isElementPresent(by);
        if (elementPresentPosition = true) {
            driverSetting.findElement(by).sendKeys(value);
        } else {
            System.out.println("Error");
        }
    }

    @Test
    public void textFieldCharactersNumber(String textField, int minCharactersCounter, int maxCharactersCounter) {
        if ((minCharactersCounter < textField.length()) || (textField.length() <= maxCharactersCounter)){}

    }
//setTextFieldValueNecessary
}

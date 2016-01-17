package PageObjectPattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anna on 16.01.2016.
 */
public class main {
    public static void main(String[] args) {
        WebDriverSettings driver = new WebDriverSettings();
        WebDriver webDriver = driver.ChromeWebDriwer();
        String value = "https://www.facebook.com";
        String reqValue = "https://www.faceboojhjkk.com/";
        webDriver.get(value);
        String linkTag = "/html/head/meta[@content = \"https://www.facebook.com/\"]";
       // Assert.assertEquals(value,linkTag);





        HTMLElements.isURLPresent(webDriver, value,reqValue,linkTag,"byXpath");
        //String ActualUrl =  HTMLElements.getHTMLElement(webDriver,"byXpath",linkTag).getAttribute("content");
        //System.out.println(ActualUrl);
    }
}

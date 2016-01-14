package PageObjectPattern;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Anna on 11.01.2016.
 */
public class WebElementsTest {

    WebDriverSettings driver = new WebDriverSettings();
    WebDriver webDriver = driver.ChromeWebDriwer();


    String by = HTMLElements.webElementAccess.byXpath.toString();
    String value = "http://bt.rozetka.com.ua/";
    String fieldValue = "tesValue";
   // boolean clear;
    @Test
    public void testSetTextField(){
        HTMLElements.setURL(webDriver, value);
        HTMLElements.setTextfield(webDriver, by, ".//*[@id='search']/form/div[1]/div[2]/input", fieldValue, true);

//        String t = webDriver.findElement(By.xpath(".//*[@id='search']/form/div[1]/div[2]/input")).getText();
//        Assert.assertEquals(t, fieldValue);

    }



}

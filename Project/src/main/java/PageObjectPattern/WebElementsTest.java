package PageObjectPattern;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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

    //Test data
    String URLValue = "https://www.facebook.com";
    String reqURLValue = "https://www.facebook.com";
    String xPath = ".//*[@id='email']'///";
    String linkTag = "/html/head/meta[@content = \"https://www.facebook.com/\"]";
    String fieldValue = "tesValue";
    String fieldValue2 = "tesValue2";

   // boolean clear;

//Test on isElement present by 2 params: webdriver+By by
//    @Test
//    public void testIsElementPresent(){
//        webDriver.get(URLValue);
//        HTMLElements.isElementPresent(webDriver, By.xpath(linkTag));
//    }
////
//    //Test on isElement present by 4 params: webdriver+choose(byXpath, ByID, ByClass)+element location
//    @Test
//    public void testIsElementPresent4Param(){
//        webDriver.get(URLValue);
//        HTMLElements.getHTMLElement(webDriver,"byXpath",linkTag);
//    }

//    @Test
//    public void testIsUrlPresent(){
//        HTMLElements.isURLPresent(webDriver, URLValue, reqURLValue,linkTag,"byXpath");
//    }

//    @Test
//    public void testSetUrl(){
//        HTMLElements.setURL(webDriver, URLValue, reqURLValue,linkTag,"byXpath");
//    }

    @Before
    public void openBrowser(){
        webDriver.get(URLValue);
    }
//    @Test
//    public  void testSetTextField() {
//        webDriver.get(URLValue);
//        HTMLElements.setTextfield(webDriver, "byXpath", ".//*[@id='u_0_1']", fieldValue, false);
//        HTMLElements.setTextfield(webDriver, "byXpath", ".//*[@id='u_0_1']", fieldValue2, true);
//        //String t = webDriver.findElement(By.xpath(".//*[@id='u_0_1']")).getText();//Как проверить установлено ли поле?
////        System.out.println(t);
//       Assert.assertNotEquals(fieldValue2, fieldValue);
//    }

    @Test
    public void testRadioButton() throws InterruptedException {
       // webDriver.get(URLValue);
        HTMLElements.RadioButtonClick(webDriver, "byXpath", ".//*[@id='u_0_d']",".//*[@id='u_0_e']");
        HTMLElements.getHTMLElement(webDriver, "byXpath", ".//*[@id='u_0_e']").isSelected();
    }
//    @Test
//    public void testRadioButton2() {
//        // webDriver.get(URLValue);
//        HTMLElements.RadioButtonClick(webDriver, "byXpath", ".//*[@id='u_0_d']");
//    }

//    @After
//    public  void  closeBrowser(){
//        webDriver.close();
//    }


}

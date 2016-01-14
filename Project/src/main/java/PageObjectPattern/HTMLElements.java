package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;
import org.openqa.selenium.WebElement;

/**
 * Web Page HTML Elements
 * 1) get URL
 * 2) getHTMLElement
 * 3) setTextfield
 *
 */
public class HTMLElements {

    enum webElementAccess{byXpath, byID, byClass};


    public static void setURL(WebDriver webDriver, String pageURL) {
            webDriver.get(pageURL);
    }

    public static WebElement getHTMLElement(WebDriver webDriver, String by, String value) {
        webElementAccess access = webElementAccess.valueOf(by);
        WebElement el;
        switch (access) {
            case byXpath: {
                el = webDriver.findElement(By.xpath(value));
            } break;
            case byID: {
                el =  webDriver.findElement(By.id(value));
            }break;
            case byClass: {
                el =  webDriver.findElement(By.className(value));
            }break;
            default:
                System.out.println("webElementAccess not found");
                el = null;
        }
        return el;
    }

    //Check element
    private static boolean isElementPresent(WebDriver webDriver, String by, String value) { //value - путь к элементу xpath,id,class
        try {
            WebElement e = getHTMLElement(webDriver,by,value);
            return (e != null);
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private static boolean isElementPresent(WebDriver webDriver,By by) {
        try {
            WebElement e = webDriver.findElement(by);
            return (e != null);
        } catch (NoSuchElementException e) {
            return false;
        }
    }
//    public static void getTextFieldSendKeys(WebDriver webDriver,By by,String value) {
//        try {
//            if (isElementPresent(webDriver, by)) {
//                webDriver.findElement(by).sendKeys(value);
//            }
//        }catch(NoSuchElementException e){
//            System.out.println(e.toString());
//        }
//    }

    public static void setTextfield(WebDriver webDriver,By by, String fieldValue, boolean clear) {
        WebElement element = webDriver.findElement(by);
        try {
            if (isElementPresent(webDriver, by)) {

                if (clear == true) {
                    element.clear();
                    element.sendKeys(fieldValue);
                } else {
                    element.sendKeys(fieldValue);
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.toString());
        }
    }

    public static void setTextfield(WebDriver webDriver,String by, String value,String fieldValue, boolean clear) {
        WebElement element = getHTMLElement(webDriver, by, value);
        try {
            if (isElementPresent(webDriver, by,value)) {

                if (clear == true) {
                    element.clear();
                    element.sendKeys(fieldValue);
                } else {
                    element.sendKeys(fieldValue);
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.toString());
        }
    }

//    public static void clearTextField(WebDriver webDriver,By by){
//        try {
//            if (isElementPresent(webDriver, by)) {
//                webDriver.findElement(by).clear();
//            }
//        }catch(NoSuchElementException e){
//            System.out.println(e.toString());
//        }
//    }

}

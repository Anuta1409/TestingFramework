package PageObjectPattern;

import org.junit.Assert;
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

    public static void isURLPresent(WebDriver webDriver, String pageURL, String RequirementPageURL, String linkTag, String  by) {
            webDriver.get(pageURL);
            String ActualUrl =  HTMLElements.getHTMLElement(webDriver,by,linkTag).getAttribute("content");
            Assert.assertEquals(ActualUrl,RequirementPageURL);
        //or better to use true/false???
//            if(ActualUrl.equals(RequirementPageURL)){
//                return true;
//            }else{
//                return false;
//            }

    }

//    public static void setURL(WebDriver webDriver, String pageURL, String RequirementPageURL) {
//       try {
//           if (isURLPresent(webDriver, pageURL, RequirementPageURL)) {
//               webDriver.get(pageURL);
//           }
//       }catch (NoSuchElementException e){
//           System.out.println(e.toString());
//       }
//    }



    public static WebElement getHTMLElement(WebDriver webDriver, String by, String value) {

        webElementAccess access = webElementAccess.valueOf(by);
        WebElement el;
        switch (access) {
            case byXpath: {
                    el = webDriver.findElement(By.xpath(value));
            } break;
            case byID: {
                el =  webDriver.findElement(By.id(value));;
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
    public static boolean isElementPresent(WebDriver webDriver, String by, String value) { //value - путь к элементу xpath,id,class
        try {
            WebElement e = getHTMLElement(webDriver,by,value);
            return (e != null);
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static boolean isElementPresent(WebDriver webDriver,By by) {
        try {
            WebElement e = webDriver.findElement(by);
            return (e != null);
        } catch (NoSuchElementException e) {
            return false;
        }
    }

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

    public static void RadioButtonClick(WebDriver webDriver, String by, String value, String value2){
        // проверка на одинаковые значения value???
           HTMLElements.getHTMLElement(webDriver, by, value).isEnabled();
           HTMLElements.getHTMLElement(webDriver, by, value).click();
           //HTMLElements.getHTMLElement(webDriver, by, value2);

          // HTMLElements.getHTMLElement(webDriver, by, value2).isSelected();
    }

    public static void CheckBoxClick(){}


    public static void selectFromDropDownList(){

    }

    public static void downloadPhoto(){
        
    }



}

package PageObjectPattern;

import WebDriverSettings.StartBrowser;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Web Page HTML Elements
 *
 */
public class HTMLElements {

    public static WebDriver driver;

    //Set Page URL RequirementPageURL 
    public static void setUrl(WebDriver driver, String pageUrl) {
        driver.get(pageUrl);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        String ActualResult = driver.getCurrentUrl();
        Assert.assertEquals(pageUrl, ActualResult);
    }

    //Access tothe webElements
    enum webElementAccess{byXpath, byID, byClass};
    public static WebElement getHTMLElement(String by, String value) {

        webElementAccess access = webElementAccess.valueOf(by);
        WebElement el;
        switch (access) {
            case byXpath: {
                    el = driver.findElement(By.xpath(value));
            } break;
            case byID: {
                el =  driver.findElement(By.id(value));
            }break;
            case byClass: {
                el =  driver.findElement(By.className(value));
            }break;
            default:
                System.out.println("webElementAccess not found");
                el = null;
        }
        return el;
    }

    //метод проверки на наличие необходимого элемента на странице
    public static boolean isElementPresent(String by, String value) { //value - xpath,id,class
        try {
            WebElement e = getHTMLElement(by,value);
            return (e != null);
        } catch (NoSuchElementException e) {
            return false;
        }
    }

//    public static boolean isElementPresent(WebDriver webDriver,By by) {
//        try {
//            WebElement e = webDriver.findElement(by);
//            return (e != null);
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }

    // установка элемента "текстовое поле" если он присутствует на странице
    public static void setTextfield(String by, String value, String fieldValue, boolean clear) {
        try {
            if (isElementPresent(by,value)) {
                WebElement element = HTMLElements.getHTMLElement(by, value);
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


//    // метод для установки радиокнопки, если она доступна+ необходимо реализовать проверку что радиокнопка установленна и одна единственная
//    public static void RadioButtonClick(WebDriver webDriver, String by, String value){
//        // radio button has unique value???
//           HTMLElements.getHTMLElement(by, value).isEnabled();
//           HTMLElements.getHTMLElement(by, value).click();
//    }
//
//
//    // метод для установки чекбокса, если он доступен+проверка, что чекбокс установлен (не знаю как реализовать множественный выбор)
//    public static void CheckBoxClick(WebDriver webDriver,String by, String value){
//        if ((HTMLElements.getHTMLElement(webDriver, by,value)).isEnabled()){
//             HTMLElements.getHTMLElement(webDriver, by, value).click();
//             Assert.assertTrue(HTMLElements.getHTMLElement(webDriver, by, value).isSelected());
////          Or this one???
////                if (HTMLElements.getHTMLElement(webDriver, by, value).isSelected()) {
////                    System.out.println("CheckBox is selected");
////            }else {
////                    System.out.println("CheckBox is not selected");
////            }
//        }
//    }
//
//
//    // выбор значения из дропдаун елемента+(не знаю как сделать множественный выбор если он возможен)
//    public  static void selectFromDropDownList(WebDriver webDriver, String by, String value,String dropDownValue){
//        Select droplist1 = new Select(HTMLElements.getHTMLElement(webDriver,by,value));
//        droplist1.selectByVisibleText(dropDownValue);
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    }

        
    }


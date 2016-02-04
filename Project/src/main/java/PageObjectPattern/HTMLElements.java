package PageObjectPattern;

import WebDriverSettings.StartBrowser;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
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
    enum webElementAccess{byXpath, byID, byClass, name};
    public static WebElement getHTMLElement(WebDriver driver, String by, String value) {

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
            case name: {
                    el = driver.findElement(By.name(value));
            } break;
            default:{
                System.out.println("webElementAccess not found");
                el = null;
            }
        }
        return el;
    }

    //method check is element present on the page
    public static boolean isElementPresent(WebDriver driver,String by, String value) { //value - xpath,id,class
        try {
            WebElement e = getHTMLElement(driver, by, value);
            return (e != null);
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    
    //Click on the necessary field if WebElement present
    public static void clickOnElement(WebDriver driver, String by, String value){
        try {
            if (isElementPresent(driver, by,value)) {
                WebElement element = HTMLElements.getHTMLElement(driver, by, value);
                element.click();
            } 
        }catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    
    // Set text field
    public static void setTextfield(WebDriver driver, String by, String value, String fieldValue, boolean clear) {
        try {
            if (isElementPresent(driver, by,value)) {
                WebElement element = HTMLElements.getHTMLElement(driver, by, value);
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


    // Set RadioButton if it is Enable
    public static void RadioAndCheckBoxButtonClick(WebDriver driver, String by, String value){
        // Store all the elements of same category in the list of WebLements
        try {
            if (isElementPresent(driver, by,value)) {
                WebElement radioButton =  HTMLElements.getHTMLElement(driver, by, value);
                boolean bValue = false;
                bValue = radioButton.isSelected();
                if(!bValue){
                    radioButton.click();
                    }
                }
            }catch (NoSuchElementException e) {
                 e.printStackTrace();
        }
    }

    // DropDown list
    public  static void selectFromDropDownList(WebDriver driver, String by, String value,String dropDownValue){
         try {
            if (isElementPresent(driver, by,value)) {
                Select droplist1 = new Select(HTMLElements.getHTMLElement(driver,by,value));
                droplist1.selectByVisibleText(dropDownValue);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
         }catch (NoSuchElementException e) {
             e.printStackTrace();
        }
    }
    
    
//     List  oRadioButton = driver.findElements(By.name("toolsqa"));
//     // Create a boolean variable which will hold the value (True/False)
//     boolean bValue = false;
//     // This statement will return True, in case of first Radio button is selected
//     bValue = oRadioButton.get(0).isSelected();
//    // This will check that if the bValue is True means if the first radio button is selected
//     if(bValue = true){
//        // This will select Second radio button, if the first radio button is selected by default
//        oRadioButton.get(1).click();    
//    }else{
//    // If the first radio button is not selected by default, the first will be selected
//        oRadioButton.get(0).click();
//     }

    
        
    }


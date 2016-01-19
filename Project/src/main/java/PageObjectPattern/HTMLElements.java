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

    enum webElementAccess{byXpath, byID, byClass};
    WebDriver webDriver = StartBrowser.startWebDriver("chrome");

//
//    public static void isURLPresent(WebDriver webDriver, String pageURL, String RequirementPageURL, String linkTag, String  by) {
//            webDriver.get(pageURL);
//            String ActualUrl =  HTMLElements.getHTMLElement(webDriver,by,linkTag).getAttribute("content");
//            Assert.assertEquals(ActualUrl,RequirementPageURL);
//        //or better to use true/false???
//            if(ActualUrl.equals(RequirementPageURL)){
//                return true;
//            }else{
//                return false;
//            }

 //   }


//��������� � ��������� ����������� ���� ��������: pageURL - ������������� ��� ��������, RequirementPageURL - ����������� ���, by - ������������ �������, linkTag - ���� � �������� ��������)
    public static void setURL(WebDriver webDriver, String pageURL, String RequirementPageURL,  String  by, String linkTag) {
        webDriver.get(pageURL);
        if (isElementPresent(webDriver, by, linkTag)==true) {
            String ActualUrl = HTMLElements.getHTMLElement(webDriver, by, linkTag).getAttribute("content");
            System.out.println(ActualUrl);
            Assert.assertEquals(ActualUrl, RequirementPageURL);
        }else if(isElementPresent(webDriver, by, linkTag)==false){
            String ActualUrl = webDriver.getCurrentUrl();
            Assert.assertEquals(ActualUrl,RequirementPageURL);
            System.out.println(ActualUrl);
        }else{
            return;
        }
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


// ������ � ��������� �������� �� ��������� ���������
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

    //����� �������� �� ������� ������������ �������� �� ��������
    public static boolean isElementPresent(WebDriver webDriver, String by, String value) { //value - xpath,id,class
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

    // ��������� �������� "��������� ����" ���� �� ������������ �� ��������
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


    // ����� ��� ��������� �����������, ���� ��� ��������+ ���������� ����������� �������� ��� ����������� ������������ � ���� ������������
    public static void RadioButtonClick(WebDriver webDriver, String by, String value){
        // radio button has unique value???
           HTMLElements.getHTMLElement(webDriver, by, value).isEnabled();
           HTMLElements.getHTMLElement(webDriver, by, value).click();
    }


    // ����� ��� ��������� ��������, ���� �� ��������+��������, ��� ������� ���������� (�� ���� ��� ����������� ������������� �����)
    public static void CheckBoxClick(WebDriver webDriver,String by, String value){
        if ((HTMLElements.getHTMLElement(webDriver, by,value)).isEnabled()){
             HTMLElements.getHTMLElement(webDriver, by, value).click();
             Assert.assertTrue(HTMLElements.getHTMLElement(webDriver, by, value).isSelected());
//          Or this one???
//                if (HTMLElements.getHTMLElement(webDriver, by, value).isSelected()) {
//                    System.out.println("CheckBox is selected");
//            }else {
//                    System.out.println("CheckBox is not selected");
//            }
        }
    }


    // ����� �������� �� �������� ��������+(�� ���� ��� ������� ������������� ����� ���� �� ��������)
    public  static void selectFromDropDownList(WebDriver webDriver, String by, String value,String dropDownValue){
        Select droplist1 = new Select(HTMLElements.getHTMLElement(webDriver,by,value));
        droplist1.selectByVisibleText(dropDownValue);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public  void downloadPhoto(){
        // �� � ��� ���� ������ ���!
        
    }



}

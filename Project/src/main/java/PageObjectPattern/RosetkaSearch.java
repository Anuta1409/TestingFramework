package PageObjectPattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 *  Testing Rosetka search function
 */
public class RosetkaSearch {

    WebDriverSettings driver = new WebDriverSettings();
    WebDriver webDriver = driver.ChromeWebDriwer();

    @Before
    public void setUp(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://bt.rozetka.com.ua/");
    }

    @After
    public void closeBrowser(){
        webDriver.close();
    }



    @Test
    public void testSearch(){
       HomeRosetkaPage homeRosetkaPage = new HomeRosetkaPage(webDriver);//PageObject - отображение домашней страницы
       ResultSearchPage resultSearchPage = homeRosetkaPage.search("Сковорода");//Новая страница с результатами запроса
       assertTrue(resultSearchPage.getFirstLink().contains("Сковорода"));

    }

}

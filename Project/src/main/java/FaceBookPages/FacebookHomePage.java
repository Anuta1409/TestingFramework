package FaceBookPages;

import WebDriverSettings.StartBrowser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Anna on 19.01.2016.
 */
public class FacebookHomePage {

    WebDriver driver = StartBrowser.startWebDriver("chrome");

    public FacebookHomePage(String url) {
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

//    public UsersEventPage login(String login, String password) {
//
//        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(login);
//        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
//        driver.findElement(By.xpath(".//*[@id='persist_box']")).click();
//        driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
//
//        return new UsersEventPage(driver);
//    }

    public ErrorLoginPage login(String login, String password) {

        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(login);
        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
        driver.findElement(By.xpath(".//*[@id='persist_box']")).click();
        driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();

        return new ErrorLoginPage(driver);
    }

    public ConfermMailPage signUp(String firstName, String lastName, String email, String password,String day, String month, String year) {
        driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys(firstName);
        driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys(lastName);
        driver.findElement(By.xpath(".//*[@id='u_0_5']")).sendKeys(email);
        driver.findElement(By.xpath(".//*[@id='u_0_8']")).sendKeys(email);
        driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys(password);

        Select droplistDay = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
        droplistDay.selectByVisibleText(day);

        Select droplistMonth = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
        droplistMonth.selectByVisibleText(month);

        Select droplistYear = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
        droplistYear.selectByVisibleText(year);

        driver.findElement(By.xpath(".//*[@id='u_0_g']/span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();


        return new ConfermMailPage(driver);



    }

}

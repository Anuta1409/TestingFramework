package RosetkaPages;

import PageObjectPattern.HTMLElements;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;


public class SignUp {
    WebDriver driver;

    public SignUp(WebDriver driver) {
      this.driver = driver;
    }
    
    public ConfirmRegistrationPage addSignUdData(String name, String email, String password){
        
        HTMLElements.setTextfield(driver, "byXpath", ".//*[@id='signup_form']/div[1]/input", email, false);
        HTMLElements.setTextfield(driver, "byXpath", ".//*[@id='signup_form']/div[1]/input",name,false);
        HTMLElements.setTextfield(driver, "byXpath", ".//*[@id='signup_form']/div[2]/input",email,false);
        HTMLElements.setTextfield(driver, "byXpath",".//*[@id='signup_form']/div[3]/input", password, false);
        HTMLElements.clickOnElement(driver, "byXpath", ".//*[@id='signup_form']/div[4]/span/button");
        
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        return new ConfirmRegistrationPage(driver);
    }
}

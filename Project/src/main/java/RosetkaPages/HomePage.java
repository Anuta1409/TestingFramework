package RosetkaPages;

import PageObjectPattern.GoToOtherWindow;
import PageObjectPattern.HTMLElements;
import org.openqa.selenium.WebDriver;



public class HomePage {
    WebDriver driver;
    
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    
    public HomePage openHomePage(String url){
        HTMLElements.setUrl(driver, url);
        return new HomePage(driver);
    }
    
    public SignUp goToSignUp(){
        HTMLElements.clickOnElement(driver, "byXpath", ".//*[@id='header_user_menu_parent']/a");
        GoToOtherWindow.goToOtherWindow(driver, "¬ход в интернет-магазин");
        HTMLElements.clickOnElement(driver,"byXpath","*//div[2]/div/div[1]/div[1]/div[3]//form/div[2]/div[4]/a");
        return  new SignUp(driver);    
    }
    
    
    
    public ProfilePage loginGoToProfile(String email, String password){
        HTMLElements.clickOnElement(driver, "byXpath",".//*[@id='header_user_menu_parent']/a");
        GoToOtherWindow.goToOtherWindow(driver, "¬ход в интернет-магазин");
        HTMLElements.setTextfield(driver, "byXpath", "*//div[2]/div/div[1]/div[1]/div[3]//form/div[1]/div[2]/input", email, false);
        HTMLElements.setTextfield(driver, "byXpath", "*//div[2]/div/div[1]/div[1]/div[3]//form/div[1]/div[3]/div[1]/div[1]/input", password, false);
        HTMLElements.RadioAndCheckBoxButtonClick(driver, "byXpath", "*//div[2]/div/div[1]/div[1]/div[3]//form/div[1]/div[3]/div[1]/div[1]/label/span");
        HTMLElements.clickOnElement(driver, "byXpath", "*//div[2]/div/div[1]/div[1]/div[3]//form/div[1]/div[3]/div[1]/div[2]/div/span/button");
        return  new ProfilePage(driver);    
    }
    
    public ProfilePage closePopup(){
        GoToOtherWindow.goToOtherWindow(driver, "—в€жите аккаунт с соцсет€ми");
        HTMLElements.clickOnElement(driver, "byXpath", ".//*[@id='social_popup']/div/div/a");
        GoToOtherWindow.goToOtherWindow(driver, "»нтернет-магазин ROZETKAЩ: фототехника, видеотехника, аудиотехника, компьютеры и компьютерные комплектующие");
        return  new ProfilePage(driver);    
    }
    
    public SearchPage searchField(String searchQuery){
       HTMLElements.setTextfield(driver, "byXpath", ".//*[@id='search']/form/div[1]/div[2]/input",searchQuery,false);
       HTMLElements.clickOnElement(driver, "byXpath","*//div[2]/div/div[2]/div[3]/form/span/span");
       GoToOtherWindow.goToOtherWindow(driver,"»нтернет-магазин ROZETKAЩ: фототехника, видеотехника, аудиотехника, компьютеры и компьютерные комплектующие");
       return new SearchPage(driver);
   }
   
   public BasketPopup addToBasket(String email, String password, String searchQuery){
       HomePage login = new HomePage(driver);
       login.loginGoToProfile(email, password);
       login.closePopup();
       login.searchField(searchQuery);
       HTMLElements.clickOnElement(driver, "byXpath",".//*[@id='block_with_goods']/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[6]/div/div/div/form/span/button");
       GoToOtherWindow.goToOtherWindow(driver," орзина");
       return new BasketPopup(driver);
       
   }
    
}
    

package pages;

import model.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOut {

    WebDriver driver;

    public SignOut(WebDriver driver){
        this.driver = driver;
    }

    public void clickButton(By btn){
        driver.findElement(btn).click();
    }

    public void logout(){
        clickButton(Locators.logoutButtonClick);
    }
}

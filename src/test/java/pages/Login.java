package pages;

import base.Base;
import model.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {

    public void clickButton(By btn){
        driver.findElement(btn).click();
    }

    public void sendText(By element , String value){
        driver.findElement(element).sendKeys(value);
    }

    WebDriver driver;

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void loggedIn(){
        sendText(Locators.enterLoginEmail,"testanything.data000080@gmail.com");
        sendText(Locators.enterLoginPassword,"demo1234");
        clickButton(Locators.loginButtonClick);
    }

}

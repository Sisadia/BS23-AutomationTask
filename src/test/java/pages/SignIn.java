package pages;

import model.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignIn {

    WebDriver driver;

    public SignIn(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton(By btn){
        driver.findElement(btn).click();
    }

    public void sendText(By element , String value){
        driver.findElement(element).sendKeys(value);
    }

    public void selectfield(By element, String value) {
        WebElement elements = driver.findElement(element);
        Select selectfield = new Select(elements);
        selectfield.selectByValue(value);
    }

    public void registrationFirstUser() throws InterruptedException {
        clickButton(Locators.signinClick);
        sendText(Locators.enterEmail,"testanything.data000080@gmail.com");
        clickButton(Locators.accountButtonClick);
        Thread.sleep(3000);
        clickButton(Locators.formTitle);
        sendText(Locators.firstName,"John");
        sendText(Locators.lastName,"Doe");
        sendText(Locators.enterPassword,"demo1234");
        selectfield(Locators.enterDays,"2");
        selectfield(Locators.enterMonth,"2");
        selectfield(Locators.enterYears,"1990");
        clickButton(Locators.signupNewsletter);
        sendText(Locators.enterFirstName,"John");
        sendText(Locators.enterLastName,"Doe");
        sendText(Locators.enterCompany,"Test Limited");
        sendText(Locators.enterAddress,"Dhaka 1213, Bangladesh");
        sendText(Locators.enterAddressSecond,"House 12");
        sendText(Locators.enterCity,"Dhaka");
        selectfield(Locators.enterState,"1");
        sendText(Locators.enterZip,"00001");
        selectfield(Locators.enterCountry,"21");
        sendText(Locators.enterPhone,"011234567");
        sendText(Locators.enterAssignAddress,"Assign an address");
        clickButton(Locators.registerButtonClick);

    }

    public void registrationSecondUser() throws InterruptedException {
        clickButton(Locators.signinClick);
        sendText(Locators.enterEmail,"testanything00090@gmail.com");
        clickButton(Locators.accountButtonClick);
        Thread.sleep(3000);
        clickButton(Locators.formTitle);
        sendText(Locators.firstName,"William");
        sendText(Locators.lastName,"John");
        sendText(Locators.enterPassword,"demo1234");
        selectfield(Locators.enterDays,"2");
        selectfield(Locators.enterMonth,"2");
        selectfield(Locators.enterYears,"1990");
        clickButton(Locators.signupNewsletter);
        sendText(Locators.enterFirstName,"John");
        sendText(Locators.enterLastName,"Doe");
        sendText(Locators.enterCompany,"Test Limited");
        sendText(Locators.enterAddress,"Dhaka 1213, Bangladesh");
        sendText(Locators.enterAddressSecond,"House 12");
        sendText(Locators.enterCity,"Dhaka");
        selectfield(Locators.enterState,"1");
        sendText(Locators.enterZip,"00001");
        selectfield(Locators.enterCountry,"21");
        sendText(Locators.enterPhone,"011234567");
        sendText(Locators.enterAssignAddress,"Assign an address");
        clickButton(Locators.registerButtonClick);

    }

}

package pages;

import model.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {
    WebDriver driver;

    public CheckOut(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton(By btn){
        driver.findElement(btn).click();
    }


    public void checkoutSummary() throws InterruptedException {
        clickButton(Locators.checkoutSummary);
        checkoutAddress();
        Thread.sleep(2000);
    }

    public void checkoutAddress() throws InterruptedException {
        clickButton(Locators.checkoutAddress);
        checkoutShipping();
        Thread.sleep(2000);
    }

    public void checkoutShipping() throws InterruptedException {
        clickButton(Locators.termsCheck);
        clickButton(Locators.checkoutShipping);
        checkPayment();
        Thread.sleep(2000);
    }

    public void checkPayment() throws InterruptedException {
        clickButton(Locators.payByCheckClick);
        confirmOrder();
        Thread.sleep(2000);
    }

    public void confirmOrder() throws InterruptedException{
        clickButton(Locators.confirmOrderClick);
        Thread.sleep(1000);
    }

}

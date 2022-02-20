package pages;

import model.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CasualDress {
    WebDriver driver;

    public void hover(By element) {
        WebElement select = driver.findElement(element);
        Actions actions = new Actions(driver);
        actions.clickAndHold(select).build().perform();
    }

    public void scrollDown(By element) {
        WebElement select = driver.findElement(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)",select);
    }

    public void clickButton(By btn){
        driver.findElement(btn).click();
    }

    public CasualDress(WebDriver driver){
        this.driver = driver;
    }

    public void addToCartDress() throws InterruptedException {
        hover(Locators.dressesSelect);
        clickButton(Locators.casualDressSelect);
        scrollDown(Locators.casualDressSelect);
        hover(Locators.dressImageClick);
        clickButton(Locators.addToCart);
        Thread.sleep(3000);
        clickButton(Locators.continueShopping);
    }
}

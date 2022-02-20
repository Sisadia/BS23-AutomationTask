package pages;

import model.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Tshirt {

        public void clickButton(By btn){
            driver.findElement(btn).click();
        }

        public void sendText(By element , String value){
            driver.findElement(element).sendKeys(value);
        }

        public void hover(By element) {
            WebElement select = driver.findElement(element);
            Actions actions = new Actions(driver);
            actions.clickAndHold(select).build().perform();
        }
        public void scrollUp(By element) {
            WebElement select = driver.findElement(element);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(800,0)",select);
        }

        WebDriver driver;

        public Tshirt(WebDriver driver){
            this.driver = driver;
        }

        public void addTshirt() throws InterruptedException {
            scrollUp(Locators.casualDressSelect);
            clickButton(Locators.tshirtSelect);
            clickButton(Locators.filterSelect);
            Thread.sleep(2000);
            hover(Locators.dressImageClick);
            clickButton(Locators.addToCart);
            Thread.sleep(2000);
            clickButton(Locators.proceedCheckout);
        }
}


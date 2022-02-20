package tests;

import base.Base;
import model.Timeout;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.*;


public class TC_AllTest {

    //object create
    Base base = new Base();
    WebDriver driver = base.setup();
    SignIn signIn = new SignIn(driver);
    SignOut signOut = new SignOut(driver);
    Login login = new Login(driver);
    CasualDress casualDress = new CasualDress(driver);
    Tshirt tshirt =new Tshirt(driver);
    CheckOut checkOut = new CheckOut(driver);
    Timeout time = new Timeout();

    //Create New Account
    @Test(priority = 0)
    public void newUserCreate() throws InterruptedException {
        signIn.registrationFirstUser();
        time.timeout();
        signOut.logout();
        time.timeout();

        signIn.registrationSecondUser();
        time.timeout();
        signOut.logout();
        time.timeout();
    }

    //Login with the new Account
    @Test(priority = 1)
    public void login(){
        login.loggedIn();
        time.timeout();
    }

    //CasualDress and Add to Cart
    @Test(priority = 2)
    public void dressAndCart() throws InterruptedException {
        casualDress.addToCartDress();
        time.timeout();
    }

    //Tshirt and Payment
    @Test (priority = 3)
    public void tshirtPayment() throws InterruptedException {
        tshirt.addTshirt();
        checkOut.checkoutSummary();
        time.timeout();

    }

    //Signout from Account
    @Test(priority = 4)
    public void loggedOut() {
        signOut.logout();
        time.timeout();

    }

}

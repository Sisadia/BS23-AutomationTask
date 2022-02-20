package model;

import org.openqa.selenium.By;

public class Locators {

    public static String homePageUrl = "http://automationpractice.com/index.php";
    public static String pageTitle = "My Store";

    //SignIn
    public static By signinClick = By.xpath("//a[contains(text(),'Sign in')]");
    public static By enterEmail = By.xpath("//input[@id='email_create']");
    public static By accountButtonClick = By.xpath("//button[@name='SubmitCreate']");
    public static By formTitle = By.xpath("//input[@id='id_gender1']");
    public static By firstName = By.xpath("//input[@id='customer_firstname']");
    public static By lastName = By.xpath("//input[@id='customer_lastname']");
    public static By enterPassword = By.xpath("//input[@id='passwd']") ;
    public static By enterDays = By.name("days");
    public static By enterMonth = By.name("months");
    public static By enterYears = By.name("years");
    public static By signupNewsletter = By.xpath("//input[@id='newsletter']");
    public static By enterFirstName = By.xpath("//input[@id='firstname']");
    public static By enterLastName = By.xpath("//input[@id='lastname']");
    public static By enterCompany = By.xpath("//input[@id='company']");
    public static By enterAddress = By.xpath("//input[@id='address1']");
    public static By enterAddressSecond = By.xpath("//input[@id='address2']");
    public static By enterCity = By.xpath("//input[@id='city']");
    public static By enterState = By.name("id_state");
    public static By enterZip = By.xpath("//input[@id='postcode']");
    public static By enterCountry = By.name("id_country");
    public static By enterPhone = By.xpath("//input[@id='phone_mobile']") ;
    public static By enterAssignAddress = By.xpath("//input[@id='alias']");
    public static By registerButtonClick = By.xpath("//button[@name='submitAccount']");

    //login
    public static By enterLoginEmail = By.xpath("//input[@id='email']");
    public static By enterLoginPassword = By.xpath("//input[@id='passwd']");
    public static By loginButtonClick = By.xpath("//button[@id='SubmitLogin']");

    //DressSelect
    public static By dressesSelect =  By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");
    public static By casualDressSelect =  By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
    public static By dressImageClick = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
    public static By addToCart = By.xpath("//span[contains(text(),'Add to cart')]");
    public static By continueShopping = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span");


    //TshirtSelect
    public static By tshirtSelect = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]");
    public static By filterSelect = By.xpath("//input[@id='layered_id_attribute_group_14']");
    public static By proceedCheckout = By.xpath("//span[normalize-space()='Proceed to checkout']");

    //Checkout
    public static By checkoutSummary =By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
    public static By checkoutAddress = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
    public static By checkoutShipping = By.xpath("//*[@id=\"form\"]/p/button/span");
    public static By termsCheck = By.xpath("//input[@id='cgv']");
    public static By payByCheckClick = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]");

    //Confirm order
    public static By confirmOrderClick = By.xpath("//span[contains(text(),'I confirm my order')]");

    //Logout
    public static By logoutButtonClick = By.xpath("//a[@class='logout']");





}

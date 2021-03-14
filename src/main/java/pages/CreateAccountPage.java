package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *Use this class to add and interact with the links and objects in the Account Creation page. Add methods for objects as required.
 */

public class CreateAccountPage {
    protected WebDriver driver;

    public CreateAccountPage(WebDriver driver) { this.driver = driver; }

    //create objects/methods for interacting with this page's elements
    private By pageSubHeading = By.xpath("//h3[@class='page-subheading'][1]");
    private By titleMr = By.cssSelector("input#id_gender1");
    private By titleMrs = By.cssSelector("input#id_gender2");
    private By firstName = By.id("customer_firstname");
    private By lastName = By.id("customer_lastname");
    private By companyName = By.id("company");
    private By email = By.id("email");
    private By password = By.id("passwd");
    private By days = By.id("days");
    private By months = By.id("months");
    private By years = By.id("years");
    private By newsletter = By.id("newsletter");
    private By specialOffers = By.id("optin");



    public void goToSignInPage() {
        driver.findElement(this.pageSubHeading).getText();
    }
    public void getTitleMr() {
        driver.findElement(this.titleMr).click();
    }
    public void getTitleMrs() {
        driver.findElement(this.titleMrs).click();
    }
    public void getFirstName(String firstName) {
        driver.findElement(this.firstName).sendKeys(firstName);
    }
    public void getLastName(String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
    }
    public void getCompanyName(String companyName) {
        driver.findElement(this.companyName).sendKeys(companyName);
    }
    //check if the registered email from the previous page is used
    public void getEmail() {
        driver.findElement(this.email).getText();
    }
    public void setPassword (String password){
        driver.findElement(this.password).sendKeys(password);
    }
    public void setDateOfBirthDay(String days, String months, String years){
        driver.findElement(this.days).click();
        driver.findElement(this.months).click();
        driver.findElement(this.years).click();
    }
    public void signUpNewsletter (){
        driver.findElement(this.newsletter).click();
    }
    public void signUpOffers (){
        driver.findElement(this.specialOffers).click();
    }

}


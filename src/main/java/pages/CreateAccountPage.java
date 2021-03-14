package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    private By firstName = By.name("customer_firstname");
    private By lastName = By.name("customer_lastname");
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
    public void clickTitleMr() {
        getTitleMr().click();
    }

    public WebElement getTitleMr() {
        return driver.findElement(this.titleMr);
    }

    public void clickTitleMrs() {
        getTitleMrs().click();
    }

    public WebElement getTitleMrs() {
        return driver.findElement(this.titleMrs);
    }

    public String getTitle(){
        if (getTitleMrs().isSelected())
            return "Mrs";
        if(getTitleMr().isSelected())
            return "Mr";
        return "";
    }

    public String setFirstName(String firstName) {
        driver.findElement(this.firstName).sendKeys(firstName);
        return firstName;
    }
    public String setLastName(String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
        return lastName;
    }
    public void getCompanyName(String companyName) {
        driver.findElement(this.companyName).sendKeys(companyName);
    }
    //check if the registered email from the previous page is used
    public void getEmail() {
        driver.findElement(this.email).getAttribute("value");

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


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
    private By titleGender = By.name("id_gender");
    private By firstName = By.id("customer_firstname");
    private By lastName = By.id("customer_lastname");
    private By companyName = By.id("company");
    private By email = By.id("email");
    private By password = By.id("passwd");
    private By dateOfBirthDay = By.id("days");
    private By dateOfBirthMonth = By.id("months");
    private By dateOfBirthYear = By.id("years");


    public void goToSignInPage() {
        driver.findElement(pageSubHeading).getText();
    }
    public void selectTitle() {
        driver.findElement(titleGender).click();
    }
    public void enterFirstName() {
        driver.findElement(firstName).click();
    }
    public void enterLastName() {
        driver.findElement(lastName).click();
    }
    public void enterCompanyName() {
        driver.findElement(companyName).click();
    }
    //check if the registered email from the previous page is used
    public void getEmail() {
        driver.findElement(email).getText();
    }
    public void setDateOfBirthDay(){
        driver.findElement(dateOfBirthDay).click();
    }
    public void setDateOfBirthMonth(){
        driver.findElement(dateOfBirthMonth).click();
    }
    public void setDateOfBirthYear(){
        driver.findElement(dateOfBirthYear).click();
    }

}


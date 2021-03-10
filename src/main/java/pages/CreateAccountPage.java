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
    private By email = By.id("email");
    private By password = By.id("passwd");



    public void goToSignInPage() {
        driver.findElement(pageSubHeading).getText();
    }
    public void selectTitle() {
        driver.findElement(titleGender).click();
    }

}


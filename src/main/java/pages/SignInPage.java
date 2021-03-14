package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

/**
 *Use this class to add and interact with the links in the sign in/registration page. Add methods for objects as required.
 */

public class SignInPage {
    protected WebDriver driver;
    public SignInPage(WebDriver driver) { this.driver = driver; }

    //create objects/methods for interacting with this page's elements
    private By newEmail = By.id("email_create");
    private By createAccountButton = By.name("SubmitCreate");
    private By signInEmail = By.id("email");
    private By userPassword = By.id("passwd");
    private By signInButton = By.name("SubmitLogin");


    public void createNewAccount (String newEmail) {
        driver.findElement(this.newEmail).sendKeys(newEmail);
        driver.findElement(this.createAccountButton).click();
    }
    public void signIn(String signInEmail, String userPassword){
        driver.findElement(this.signInEmail).sendKeys(signInEmail);
        driver.findElement(this.userPassword).sendKeys(userPassword);
        driver.findElement(this.signInButton).click();
    }
}


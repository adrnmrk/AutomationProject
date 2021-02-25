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
    private By createEmailBy = By.id("email_create");
    private By createAccountButton = By.name("SubmitCreate");
    private By signInEmail = By.id("email");
    private By userPassword = By.id("passwd");
    private By signInButton = By.name("SubmitLogin");


    public void createNewAccount (String createEmail) {
        driver.findElement(createEmailBy).sendKeys(createEmail);
        driver.findElement(createAccountButton).click();
    }
    public void signInValidUser (String userName, String password) {
        driver.findElement(signInEmail).sendKeys(userName);
        driver.findElement(userPassword).sendKeys(password);
        driver.findElement(signInButton).click();
        //do I need to return anything or add assertions after logging in? Add it in the testclass


    }

}


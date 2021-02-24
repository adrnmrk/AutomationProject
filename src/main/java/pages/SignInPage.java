package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

/**
 *Use this class to add and interact with the links in the sign in/registration page. Add methods for objects as required.
 */

public class SignInPage {
    protected WebDriver driver;

    public SignInPage(WebDriver driver) { this.driver = driver; }

    private By createEmailBy = By.id("email_create");
    private By createAccount = By.name("SubmitCreate");


    public SignInPage signIn (String createEmail){
        driver.findElement(createEmailBy).sendKeys(createEmail);
        driver.findElement(createAccount).click();
        return new SignInPage(driver);

    }


}

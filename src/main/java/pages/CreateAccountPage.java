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
    private By pageSubHeading = By.cssSelector("h3[class=‘page-subheading’]");

    public void goToSignInPage() {
        driver.findElement(signInButton).click();
    }

}
}

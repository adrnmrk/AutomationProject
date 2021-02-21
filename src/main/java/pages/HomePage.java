package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *Use this class to add and interact with the links in the home page. Add methods as required.
 */

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) { this.driver = driver;    }

    public SignInPage clickSignIn() {
        driver.findElement(By.linkText("Sign in")).click();
        return new SignInPage(driver);
    }


}

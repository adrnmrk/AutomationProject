package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
    private WebDriver driver;

    public CreateAccountPage(WebDriver driver) { this.driver = driver; }

    private By checkHeading = By.tagName("h1");

    public HomePage createAccount () {
        driver.findElement(checkHeading).getText();

        return new HomePage(driver);
    }
}

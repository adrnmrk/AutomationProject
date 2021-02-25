package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *Use this class to add and interact with the links in the home page. Add methods as required.
 */

public class HomePage {
    protected WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;   }

    //create objects/methods for interacting with this page's elements
    private By signIn = By.className("login");


    public HomePage homePage() {
        driver.findElement(signIn).click();
        return new HomePage(driver);
    }

}

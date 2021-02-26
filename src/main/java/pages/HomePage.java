package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *Use this class to add and interact with the links in the home page. Add methods as required.
 */

public class HomePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) { this.driver = driver; }

    //create objects/methods for interacting with this page's elements
    private By signInButton = By.className("login");
    private By returnToHome = By.xpath("//*[@id=\"header_logo\"]/a/img");
    private By searchBar = By.name("search_query");
    //check if viewShoppingCart is correct
    private By viewShoppingCart = By.cssSelector("div:contains('shopping_cart')");



    public void goToSignInPage() {
        driver.findElement(signInButton).click();
    }

}

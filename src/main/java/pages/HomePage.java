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
    private By contactButton = By.id("contact-link");
    private By returnToHome = By.xpath("//*[@id=\"header_logo\"]/a/img");
    private By searchBar = By.name("search_query");
    //check if viewShoppingCart is correct
    private By viewShoppingCart = By.cssSelector("div:contains('shopping_cart')");
    //3 hover links, with sub-links
    private By shopForWomen = By.partialLinkText("Women");
    private By shopDresses = By.partialLinkText("Dresses");
    private By shopTshirt = By.partialLinkText("T-shirts");

    private By popularProducts = By.className("homefeatured");
    private By bestSellers = By.className("blockbestsellers");


    public void goToSignInPage() {
        driver.findElement(signInButton).click();
    }
    public void goToContactPage() {
        driver.findElement(contactButton).click();
    }
    public void goToHomePage() { driver.findElement(returnToHome); }
    public void useSearch() { driver.findElement(searchBar); }


}

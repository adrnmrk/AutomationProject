
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HomePage.*;
import pages.SignInPage;
import pages.CreateAccountPage;


public class CreateAccountTest extends BaseTest{
    //instantiate objects/pages
    HomePage homePage = new HomePage(driver);
    SignInPage signIn = new SignInPage(driver);

    @Test
    public void testSignIn() {
        homePage.homePage();
        signIn.signIn("test@email.com");

        WebElement header = driver.findElement(By.tagName("h3"));
        Assert.assertEquals("CREATE AN ACCOUNT", header.getText());

         }

    //@Test
    //public void testEmailUsed() {
        //SignInPage signInPage = new SignInPage(driver);

      //  WebElement emailUsed = driver.findElement(By.xpath("//*[@id='email']"));
        //System.out.println(emailUsed);

 // }
}


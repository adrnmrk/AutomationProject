
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.HomePage.*;
import pages.SignInPage;
import pages.CreateAccountPage;


public class CreateAccountTest extends BaseTest{
//declare pages to be used in this test. If you want to perform tests on the other pages, add them here!
    HomePage homePage;
    SignInPage signIn;
//annotate to run the setUp method from the BaseTest. This is used to prep the webdriver
    @BeforeClass
    public void setUpTest (){
        //instantiate objects/pages
        homePage = new HomePage(driver);
        signIn = new SignInPage(driver);
     }

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


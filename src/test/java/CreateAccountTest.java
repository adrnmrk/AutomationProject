
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;


public class CreateAccountTest extends BaseTest{
//declare pages to be used in this test. If you want to perform tests on the other pages, add them here!
    HomePage homePage;
    SignInPage signIn;

    //annotate to run the setUp method from the BaseTest. This is used to prep the webdriver
    @BeforeClass
    public void setUpTest (){
        //instantiate objects/pages and test data to use
        homePage = new HomePage(driver);
        signIn = new SignInPage(driver);
        homePage.goToSignInPage();
        signIn.createNewAccount("test@email.com");
    }
    @Test
    public void testClickSignInButton() {
        String header = driver.findElement(By.className("page-subheading")).getText();
        Assert.assertEquals("CREATE AN ACCOUNT", header);
        System.out.println(header);
    }
    @Test
    public void testCheckEmailUsed() {
        String emailCreate = driver.findElement(By.name("email_create")).getAttribute("value");
        Assert.assertEquals("test@email.com", emailCreate);
        System.out.println(emailCreate);
    }


}


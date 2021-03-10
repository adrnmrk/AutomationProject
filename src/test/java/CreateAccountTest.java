
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
        signIn.createNewAccount("testValid@email.com");

    }
    @Test
    public void testClickSignInButton() {
        String checkHeader = driver.findElement(By.className("page-subheading")).getText();
        Assert.assertEquals("CREATE AN ACCOUNT", checkHeader);
        System.out.println(checkHeader);
    }
    //check if valid email address is accepted
    @Test
    public void testEmailSignup() {
        String emailCreate = driver.findElement(By.name("email_create")).getAttribute("value");
        Assert.assertEquals(emailCreate, "testValid@email.com");
        System.out.println(emailCreate);
    }



}


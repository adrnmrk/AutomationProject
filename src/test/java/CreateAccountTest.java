
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.SignInPage;


public class CreateAccountTest extends BaseTest{
//declare pages to be used in this test. If you want to perform tests on the other pages, add them here!
    HomePage homePage;
    SignInPage signIn;
    CreateAccountPage createAccount;

    //annotate to run the setUp method from the BaseTest. This is used to prep the webdriver
    @BeforeClass
    public void setUpTest (){
        //instantiate objects/pages and test data to use
        homePage = new HomePage(driver);
        signIn = new SignInPage(driver);
        createAccount = new CreateAccountPage(driver);
        homePage.goToSignInPage();
        signIn.createNewAccount("testValid@email.com");
        createAccount.getTitleMr();
        createAccount.getTitleMrs();
        createAccount.getFirstName("Ronaldo");
        createAccount.getLastName("Mcdonaldo");
        createAccount.getEmail();
        createAccount.setPassword("Password123");
        createAccount.setDateOfBirthDay("12", "12", "2000");
        createAccount.signUpNewsletter();
        createAccount.signUpOffers();

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
    @Test
    public void testRegistration(){
        String title = driver.findElement(By.cssSelector("input#id_gender2")).getText();
        Assert.assertEquals(title, "Mrs.");

        String checkFirstName = driver.findElement(By.id("customer_firstname")).getText();
        Assert.assertEquals(checkFirstName, "Ronaldo");

        System.out.println(title + checkFirstName);

    }



}


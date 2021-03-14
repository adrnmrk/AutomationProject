
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.SignInPage;

import java.util.concurrent.TimeUnit;


public class CreateAccountTest extends BaseTest{
//declare pages to be used in this test. If you want to perform tests on the other pages, add them here!
    HomePage homePage;
    SignInPage signIn;
    CreateAccountPage createAccount;


    //annotate to run the setUp method from the BaseTest. This is used to prep the webdriver
    @BeforeClass
    public void setUpTest (){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //instantiate objects/pages and test data to use
        homePage = new HomePage(driver);
        signIn = new SignInPage(driver);
        createAccount = new CreateAccountPage(driver);

        homePage.goToSignInPage();
        signIn.createNewAccount("testValid@email.com");
        createAccount.clickTitleMr();
        createAccount.clickTitleMrs();
        createAccount.setFirstName("Ronaldo");
        createAccount.setLastName("Mcdonaldo");
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
    public void testRegistration() {
        createAccount.getTitleMrs().click();
        boolean title = createAccount.getTitleMrs().isSelected();
        Assert.assertTrue(title);
        System.out.println(title);

        String firstName = createAccount.setFirstName("Ronaldo");
        Assert.assertEquals(firstName, "Ronaldo");
        System.out.println(firstName);

        String lastName = createAccount.setLastName("Mcdonaldo");
        Assert.assertEquals(lastName, "Mcdonaldo");
        System.out.println(lastName);

        createAccount.getEmail();


    }



}


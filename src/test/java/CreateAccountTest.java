
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
    public void testRegistrationHappyFlow() {
        createAccount.getTitleMrs().click();
        boolean title = createAccount.getTitleMrs().isSelected();

        Assert.assertNotNull(createAccount.getTitle());
        System.out.println(createAccount.getTitle());

        createAccount.setCustomerFirstname("Ronaldo");
        Assert.assertEquals(createAccount.getCustomerFirstname(),"Ronaldo");

        createAccount.setCustomerLastname("Mcdonaldo");
        Assert.assertEquals(createAccount.getCustomerLastname(), "Mcdonaldo");

        System.out.println(createAccount.getEmail());
        Assert.assertEquals(createAccount.getEmail(), "testValid@email.com");

        createAccount.setPassword("Password1");
        Assert.assertEquals(createAccount.getPassword(), "Password1");

    //setDateOfBirth selects array index. For example, month 2 = february etc. in the example below
        // days = 1, months = 2(feb), years = 20 (year 2000)
        createAccount.setDateOfBirth(1, 2, "2000");
        Assert.assertEquals(createAccount.getDayDateOfBirth().trim(), "1");
        Assert.assertEquals(createAccount.getMonthDateOfBirth().trim(),"February" );
        Assert.assertEquals(createAccount.getYearDateOfBirth().trim(),"2000" );


        createAccount.signUpOffers();
        Assert.assertTrue(createAccount.signUpOffers());

        createAccount.signUpNewsletter();
        Assert.assertTrue(createAccount.signUpNewsletter());

        createAccount.setFirstName("Ronaldo");
        Assert.assertEquals(createAccount.getFirstName(),"Ronaldo");

        createAccount.setLastName("Mcdonaldo");
        Assert.assertEquals(createAccount.getLastName(), "Mcdonaldo");

        createAccount.setCompanyName("ABC Private Limited");
        Assert.assertEquals(createAccount.getCompanyName(), "ABC Private Limited");

        createAccount.setAddress1("Address Street 1");
        Assert.assertEquals(createAccount.getAddress1(), "Address Street 1");

        createAccount.setAddress2("Address Avenue 2");
        Assert.assertEquals(createAccount.getAddress2(), "Address Avenue 2");

        createAccount.setCity("Singapore");
        Assert.assertEquals(createAccount.getCity(), "Singapore");
//fix this and check CreateAccountPage
        createAccount.setState(1);
        Assert.assertEquals(createAccount.getState(), "Alabama");
        System.out.println(createAccount.getState());
    }




}


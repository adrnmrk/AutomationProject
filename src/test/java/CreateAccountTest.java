
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.CreateAccountPage;
import pages.HomePage.*;


public class CreateAccountTest extends BaseTest {

    @Test
    public void testAccountRegistration() {
        SignInPage signInPage = homePage.clickSignIn();
        driver.findElement(By.id("email_create")).sendKeys("gswndmlo@sharklasers.com");
        driver.findElement(By.name("SubmitCreate")).click();

        Assert.assertEquals("Login - My Store", driver.getTitle());
    }



}



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * This BaseTest is used for launching and closing the driver for all tests
 */

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().maximize();


    }

    @AfterClass
    public void endTest(){ driver.quit(); }
}

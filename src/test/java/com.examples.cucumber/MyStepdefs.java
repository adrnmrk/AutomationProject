package com.examples.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    private WebDriver driver;

    @Given("I am in the login page of the Bank application")
    public void i_am_in_the_login_page_of_the_Bank_application() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Digest Authentication")).click();

    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {

        var username = "admin";
        var password = "admin";
        String URL = "https://" + username + ":" + password +"@"+ "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);
    }

    @Then("I should be taken to the Overview page")
    public void i_should_be_taken_to_the_Overview_page() {
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.quit();
    }

}

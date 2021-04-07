package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *Use this class to add and interact with the links and objects in the Account Creation page. Add methods for objects as required.
 */

public class CreateAccountPage {
    protected WebDriver driver;

    public CreateAccountPage(WebDriver driver) { this.driver = driver; }

    //create objects/methods for interacting with this page's elements. Getters and setters
    private By pageSubHeading = By.xpath("//h3[@class='page-subheading'][1]");
    private By titleMr = By.cssSelector("input#id_gender1");
    private By titleMrs = By.cssSelector("input#id_gender2");
    private By customerFirstname = By.name("customer_firstname");
    private By customerLastname = By.name("customer_lastname");
    private By companyName = By.id("company");
    private By email = By.id("email");
    private By password = By.id("passwd");
    private By days = By.id("days");
    private By months = By.id("months");
    private By years = By.id("years");
    private By newsletter = By.id("newsletter");
    private By specialOffers = By.id("optin");
    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By address1 = By.id("address1");
    private By address2 = By.id("address2");
    private By city = By.id("city");
    private By state = By.id("id_state");
    private By postcode = By.id("postcode");
    private By country = By.id("id_country");
    private By otherInfo = By.id("other");
    private By homePhone = By.id("phone");
    private By mobilePhone = By.id("phone_mobile");
    private By addressAlias = By.id("alias");

    public WebElement getTitleMr() {
        return driver.findElement(this.titleMr);
    }

    public WebElement getTitleMrs() {
        return driver.findElement(this.titleMrs);
    }

    public String getTitle(){
        if (getTitleMrs().isSelected())
            return "Mrs";
        if(getTitleMr().isSelected())
            return "Mr";
        return "";
    }
    public void setCustomerFirstname(String customerFirstname) {
        driver.findElement(this.customerFirstname).sendKeys(customerFirstname);
    }
    public String getCustomerFirstname(){
        String firstName = driver.findElement(this.customerFirstname).getAttribute("value");
        return firstName;
    }
    public void setCustomerLastname(String customerLastname) {
        driver.findElement(this.customerLastname).sendKeys(customerLastname);
    }
    public String getCustomerLastname(){
        String lastName = driver.findElement(this.customerLastname).getAttribute("value");
        return lastName;
    }
    public void setCompanyName(String companyName){
        driver.findElement(this.companyName).sendKeys(companyName);
    }
    public String getCompanyName() {
        String companyName = driver.findElement(this.companyName).getAttribute("value");
        return companyName;
    }
    //check if the registered email from the previous page is used
    public String getEmail() {
        String email = driver.findElement(this.email).getAttribute("value");
        return email;
    }
    public void setPassword (String password){
        driver.findElement(this.password).sendKeys(password);
    }
    public String getPassword(){
        String password = driver.findElement(this.password).getAttribute("value");
        return password;
    }
    public void setDateOfBirth(String days, String months, String years){
        driver.findElement(this.days).click();
        driver.findElement(this.months).click();
        driver.findElement(this.years).click();
    }

    public boolean signUpNewsletter (){
        driver.findElement(this.newsletter).click();
        return true;    }
    public boolean signUpOffers (){
        driver.findElement(this.specialOffers).click();
        return true;
    }

    public String getFirstName() {
        String firstName = driver.findElement(this.firstName).getAttribute("value");
        return firstName;
    }

    public void setFirstName(String firstName) {
        driver.findElement(this.firstName).clear();
        driver.findElement(this.firstName).sendKeys(firstName);
    }

    public String getLastName() {
        String lastName = driver.findElement(this.lastName).getAttribute("value");
        return lastName;
    }

    public void setLastName(String lastName) {
        driver.findElement(this.lastName).clear();
        driver.findElement(this.lastName).sendKeys(lastName);
    }
    public String getAddress1() {
        String address1 = driver.findElement(this.address1).getAttribute("value");
        return address1;
    }

    public void setAddress1(String address1) {
        driver.findElement(this.address1).sendKeys(address1);
    }

    public String getAddress2() {
        String address2 = driver.findElement(this.address2).getAttribute("value");
        return address2;
    }

    public void setAddress2(String address2) {
        driver.findElement(this.address2).sendKeys(address2);
    }

    public String getCity() {
        String city = driver.findElement(this.city).getAttribute("value");
        return city;
    }

    public void setCity(String city) {
        driver.findElement(this.city).sendKeys(city);
    }
//fix line 152 to 161 and also check CreateAccountTest.java
    public WebElement getState() {
        WebElement state = driver.findElement(this.state);
        return state;
    }

    public void setState(String state) {
        driver.findElement(this.state);
        Select setState = new Select(getState());
        setState.selectByIndex(Integer.parseInt(state));
    }

    public String getPostcode() {
        String postcode = driver.findElement(this.postcode).getAttribute("value");
        return postcode;
    }

    public void setPostcode(String postcode) {
        driver.findElement(this.postcode).sendKeys(postcode);
    }

    public String getCountry() {
        String country = driver.findElement(this.country).getAttribute("value");
        return country;
    }

    public void setCountry(String country) {
        driver.findElement(this.country).click();
    }

    public String getOtherInfo() {
        String otherInfo = driver.findElement(this.otherInfo).getAttribute("value");
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        driver.findElement(this.otherInfo).sendKeys(otherInfo);
    }

    public String getHomePhone() {
        String homePhone = driver.findElement(this.homePhone).getAttribute("value");
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        driver.findElement(this.homePhone).sendKeys(homePhone);
    }

    public String getMobilePhone() {
        String mobilePhone = driver.findElement(this.mobilePhone).getAttribute("value");
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        driver.findElement(this.mobilePhone).sendKeys(mobilePhone);
    }

    public String getAddressAlias() {
        String addressAlias = driver.findElement(this.addressAlias).getAttribute("value");
        return addressAlias;
    }

    public void setAddressAlias(String addressAlias) {
        driver.findElement(this.postcode).sendKeys(addressAlias);
    }

}


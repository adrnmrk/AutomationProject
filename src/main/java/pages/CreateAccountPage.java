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
        return driver.findElement(this.customerFirstname).getAttribute("value");

    }
    public void setCustomerLastname(String customerLastname) {
        driver.findElement(this.customerLastname).sendKeys(customerLastname);
    }
    public String getCustomerLastname(){
        return driver.findElement(this.customerLastname).getAttribute("value");

    }
    public void setCompanyName(String companyName){
        driver.findElement(this.companyName).sendKeys(companyName);
    }
    public String getCompanyName() {
        return driver.findElement(this.companyName).getAttribute("value");

    }
    //check if the registered email from the previous page is used
    public String getEmail() {
        return driver.findElement(this.email).getAttribute("value");

    }
    public void setPassword (String password){
        driver.findElement(this.password).sendKeys(password);
    }
    public String getPassword(){
        return driver.findElement(this.password).getAttribute("value");

    }
//start updating the code here. Similar implementation to the state dropdown
    public String getDayDateOfBirth() {
        String dayDateOfBirth = driver.findElement(this.days).getText();
        Select dayDateOfBirthDrop = new Select(driver.findElement(this.days));
        WebElement optionDay = dayDateOfBirthDrop.getFirstSelectedOption();
        return optionDay.getText();
    }
    public String getMonthDateOfBirth() {
        String monthDateOfBirth = driver.findElement(this.months).getText();
        Select monthDateOfBirthDrop = new Select(driver.findElement(this.months));
        WebElement optionMonth = monthDateOfBirthDrop.getFirstSelectedOption();
        return optionMonth.getText();
    }
    public String getYearDateOfBirth(){
        String yearDateOfBirth = driver.findElement(this.years).getText();
        Select yearDateOfBirthDrop = new Select(driver.findElement(this.years));
        WebElement optionYear = yearDateOfBirthDrop.getFirstSelectedOption();
        return optionYear.getAttribute("value");
    }

    //select the date of birth by selecting each dropdown for DD MM YYYY
    public void setDateOfBirth(int days, int months, String years){
        driver.findElement(this.days).click();
        driver.findElement(this.months).click();
        driver.findElement(this.years).click();

        Select daysDropDown = new Select(driver.findElement(this.days));
        daysDropDown.selectByIndex(days);

        Select monthsDropDown = new Select(driver.findElement(this.months));
        monthsDropDown.selectByIndex(months);

        Select yearsDropDown = new Select(driver.findElement(this.years));
        yearsDropDown.selectByValue(years);
    }

    public boolean signUpNewsletter (){
        driver.findElement(this.newsletter).click();
        return true;    }
    public boolean signUpOffers (){
        driver.findElement(this.specialOffers).click();
        return true;
    }

    public String getFirstName() {
        return driver.findElement(this.firstName).getAttribute("value");
    }

    public void setFirstName(String firstName) {
        driver.findElement(this.firstName).clear();
        driver.findElement(this.firstName).sendKeys(firstName);
    }

    public String getLastName() {
        return driver.findElement(this.lastName).getAttribute("value");
    }

    public void setLastName(String lastName) {
        driver.findElement(this.lastName).clear();
        driver.findElement(this.lastName).sendKeys(lastName);
    }
    public String getAddress1() {
        return driver.findElement(this.address1).getAttribute("value");

    }

    public void setAddress1(String address1) {
        driver.findElement(this.address1).sendKeys(address1);
    }

    public String getAddress2() {
        return driver.findElement(this.address2).getAttribute("value");
    }

    public void setAddress2(String address2) {
        driver.findElement(this.address2).sendKeys(address2);
    }

    public String getCity() {
        return driver.findElement(this.city).getAttribute("value");
    }

    public void setCity(String city) {
        driver.findElement(this.city).sendKeys(city);
    }

    //this method retrieves the dropdown list, then selects the array index and return the equivalent state name
    public String getState() {
        String state = driver.findElement(this.state).getText();
        Select stateDropDown = new Select(driver.findElement(this.state));
        WebElement optionState = stateDropDown.getFirstSelectedOption();
        return optionState.getText();

    }
    //this method selects the dropdown for the State field
    public void setState(int state) {
        Select stateDropDown = new Select(driver.findElement(this.state));
        stateDropDown.selectByIndex(state);
    }

    public String getPostcode() {
        return driver.findElement(this.postcode).getAttribute("value");
    }

    public void setPostcode(String postcode) {
        driver.findElement(this.postcode).sendKeys(postcode);
    }

    public String getCountry() {
        return driver.findElement(this.country).getAttribute("value");
    }

    public void setCountry(String country) {
        driver.findElement(this.country).click();
    }

    public String getOtherInfo() {
        return driver.findElement(this.otherInfo).getAttribute("value");
    }

    public void setOtherInfo(String otherInfo) {
        driver.findElement(this.otherInfo).sendKeys(otherInfo);
    }

    public String getHomePhone() {
        return driver.findElement(this.homePhone).getAttribute("value");
    }

    public void setHomePhone(String homePhone) {
        driver.findElement(this.homePhone).sendKeys(homePhone);
    }

    public String getMobilePhone() {
        return driver.findElement(this.mobilePhone).getAttribute("value");
    }

    public void setMobilePhone(String mobilePhone) {
        driver.findElement(this.mobilePhone).sendKeys(mobilePhone);
    }

    public String getAddressAlias() {
        return driver.findElement(this.addressAlias).getAttribute("value");
    }

    public void setAddressAlias(String addressAlias) {
        driver.findElement(this.postcode).sendKeys(addressAlias);
    }

}


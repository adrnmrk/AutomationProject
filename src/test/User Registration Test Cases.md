# User Registration Test Cases
## Positive Scenarios
### Test Case ID 01: Automated User Registration Process (Happy Flow)
1. Open the [automation](http://automationpractice.com/index.php) practice site.
2. Select the **Sign In** button.
3. From the *Create an Account* section, enter a valid email address.
4. Select the **Create an Account** button.
5. Fill-out the following details using valid inputs:
    * Personal Information
    * Address Information
    * Contact Information
6. Click on the **Register** button.
7. Validate that the user account is created.

## Negative Scenarios
### Test Case ID 02: Verify Invalid Email Address Error
1. Open the [automation](http://automationpractice.com/index.php) practice site.
2. Select the **Sign In** button.
3. From the *Create an Account* section, enter an INVALID email address.
4. Select the **Create an Account** button.
5. Validate that an error message *Invalid email address.* is displayed.

### Test Case ID 03: Verify Error Messages for Mandatory Fields
1. Open the [automation](http://automationpractice.com/index.php) practice site.
2. Select the **Sign In** button.
3. From the *Create an Account* section, enter a valid email address.
4. Select the **Create an Account** button.
5. In the *Account Creation* page, do not fill out any of the mandatory fields (marked with &ast;).
6. Select the **Register** button.
7. Validate that error messages are displayed for the mandatory fields.

### Test Case ID 04: Verify Error Messages for Entering Incorrect or Invalid Values in the Registration Fields. 
1. Open the [automation](http://automationpractice.com/index.php) practice site.
2. Select the **Sign In** button.
3. From the *Create an Account* section, enter a valid email address.
4. Select the **Create an Account** button.
5. In the *Account Creation* page, enter incorrect or invalid values in the fields. For example, entering only *numbers* in the **first name**, **last name**, or **city** fields; entering only *alphabets* in the **mobile number** or **postal code** fields, and so forth.
6. Select the **Register** button.
7. Verify that the error messages for the appropriate fields appear.


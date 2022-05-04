package htm.index.parabank.com.parasoft.parabank.pages;


import com.google.common.base.Verify;
import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    //Enter First name
    By firstname = By.id("customer.firstName");

    public void enterFristName(String text) {
        sendTextToElement(firstname, text);
    }

    //Enter Last name
    By lastname = By.id("customer.lastName");

    public void enterLastName(String text) {
        sendTextToElement(lastname, text);
    }

    //Enter Address
    By address = By.id("customer.address.street");

    public void enterAddress(String text) {
        sendTextToElement(address, text);
    }

    //Enter City
    By city = By.id("customer.address.city");

    public void enterCity(String text) {
        sendTextToElement(city, text);
    }

    //Enter State
    By state = By.id("customer.address.state");

    public void enterState(String text) {
        sendTextToElement(state, text);
    }

    //Enter Zip Code
    By zip = By.id("customer.address.zipCode");

    public void enterZip(String text) {
        sendTextToElement(zip, text);
    }

    //Enter Phone
    By phone = By.id("customer.phoneNumber");

    public void enterPhoneNumber(String text) {
        sendTextToElement(phone, text);
    }

    //Enter SSN
    By ssn = By.id("customer.ssn");

    public void enterSSN(String text) {
        sendTextToElement(ssn, text);
    }

    //Enter Username
    By username = By.id("customer.username");

    public void enterUsername(String text) {
        sendTextToElement(username, text);
    }

    //Enter Password
    By password = By.id("customer.password");
    public void enterpassword(String text) {
        sendTextToElement(password, text);
    }

    //Enter Confirm Password
    By confirmpasss = By.id("repeatedPassword");
    public void enterConfimpass(String text) {
        sendTextToElement(confirmpasss, text);
    }

    //Click on REGISTER button
    By registerBtn = By.xpath("//tbody/tr[13]/td[2]/input[1]");
    public void clickRegisterBtn() {
        clickOnElement(registerBtn);
    }

    //Verify the text 'Your account was created successfully. You are now logged in.’
    By accountText = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");

    public String verifyAccountSuccessfullyText() {
        return getTextFromElement(accountText);
    }




    //Verify the text ‘Signing up is easy!’
    By signingUpText = By.xpath("//h1[@class='title']");
    public String verifySigningUpText() {
     return getTextFromElement(signingUpText);
    }


}

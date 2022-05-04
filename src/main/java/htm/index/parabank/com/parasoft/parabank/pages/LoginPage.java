package htm.index.parabank.com.parasoft.parabank.pages;


import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


    //Enter valid username
    By username = By.name("username");

    public void enterUsername(String text) {
        sendTextToElement(username, text);
    }

    //Enter valid password
    By password = By.name("password");

    public void enterPassword(String text) {
        sendTextToElement(password, text);
    }

    //Click on ‘LOGIN’ button
    By logIn = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]");

    public void clickOnlogIn() {
        clickOnElement(logIn);
    }

    //Verify the ‘Accounts Overview’ text is display
    By accountsOverviewtext = By.xpath("//a[contains(text(),'Accounts Overview')]");

    public String verifyAccountsOverviewText() {
        return getTextFromElement(accountsOverviewtext);
    }

    //Verify the error message ‘The username and password could not be verified.’
    By errorMessage = By.xpath("//p[contains(text(),'The username and password could not be verified.')]");

    public String verifyErrorMessage() {
        return getTextFromElement(errorMessage);
    }


    //Click on ‘Log Out’ link
    By logout = By.xpath("//a[contains(text(),'Log Out')]");

    public void clickLogout() {
        clickOnElement(logout);

    }

    //Verify the text ‘Customer Login’
    By customerlogin = By.xpath("h2[contains(text(),'Customer Login')]");

    public String verifyCustomerLogin() {
        return getTextFromElement(customerlogin);
    }




    //locate ‘Register’ link and click on it
    By register = By.xpath("//a[contains(text(),'Register')]");
    public void clickRegister() {
        clickOnElement(register);
    }




}










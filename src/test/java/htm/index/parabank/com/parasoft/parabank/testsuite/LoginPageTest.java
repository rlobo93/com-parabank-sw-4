package htm.index.parabank.com.parasoft.parabank.testsuite;


import htm.index.parabank.com.parasoft.parabank.pages.LoginPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        //Enter valid username
        loginPage.enterUsername("ronjira");
        Thread.sleep(100);

        //Enter valid password
        loginPage.enterPassword("ron12345");
        Thread.sleep(100);

        //Click on ‘LOGIN’ button
        loginPage.clickOnlogIn();
        Thread.sleep(100);

        //Verify the ‘Accounts Overview’ text is display
        String expectedErrorMessage = "Accounts Overview";
        String actualErrorMessage = loginPage.verifyAccountsOverviewText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");

    }

    @Test
    public void verifyTheErrorMessage() throws InterruptedException {
        //Enter invalid username
        loginPage.enterUsername("ronjira2");
        Thread.sleep(1000);

        //Enter invalid password
        loginPage.enterPassword("ron1234576");
        Thread.sleep(100);

        //Click on ‘LOGIN’ button
        loginPage.clickOnlogIn();
        Thread.sleep(100);

        //Verify the error message ‘The username and password could not be verified.’
        String expectedErrorMessage = "The username and password could not be verified.";
        String actualErrorMessage = loginPage.verifyErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }

    @Test
    public void userShouldLogOutSuccessfully() throws InterruptedException {

        //Enter valid username
        loginPage.enterUsername("ronjira");
        Thread.sleep(100);

        //Enter valid password
        loginPage.enterPassword("ron12345");

        Thread.sleep(100);

        //Click on ‘LOGIN’ button
        loginPage.clickOnlogIn();
        Thread.sleep(100);

        //Click on ‘Log Out’ link
        loginPage.clickLogout();
        Thread.sleep(100);

        //Verify the text ‘Customer Login’
        String expectedErrorMessage1 = "Customer Login";
        String actualErrorMessage1 = loginPage.verifyCustomerLogin();
        Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1, "Error message not displayed");
    }


}

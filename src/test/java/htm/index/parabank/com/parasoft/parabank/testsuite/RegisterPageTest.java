package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.LoginPage;
import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyThatSigningUpPageDisplay() throws InterruptedException {

        //locate ‘Register’ link and click on it
        loginPage.clickRegister();


        //Verify the text ‘Signing up is easy!’
        String expectedErrorMessage1 = "Signing up is easy!";
        String actualErrorMessage1 = registerPage.verifySigningUpText();
        Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1, "Error message not displayed");

    }

    @Test
    public void userSholdRegisterAccountSuccessfully() throws InterruptedException {

        //locate ‘Register’ link and click on it
        loginPage.clickRegister();
        Thread.sleep(1000);

        //Enter First name
        registerPage.enterFristName("Ron");
        Thread.sleep(1000);

        //Enter Last name
        registerPage.enterLastName("Jira");
        Thread.sleep(1000);

        //Enter Address
        registerPage.enterAddress("150 london street");
        Thread.sleep(1000);

        //Enter City
        registerPage.enterCity("london");
        Thread.sleep(1000);

        //Enter State
        registerPage.enterState("london");
        Thread.sleep(1000);

        //Enter Zip Code
        registerPage.enterZip("ub10 10ub");
        Thread.sleep(1000);

        //Enter Phone
        registerPage.enterPhoneNumber("07123456789");
        Thread.sleep(1000);

        //Enter SSN
        registerPage.enterSSN("1234");
        Thread.sleep(1000);

        //Enter Username
        registerPage.enterUsername("ronjira");
        Thread.sleep(1000);

        //Enter Password
        registerPage.enterpassword("ron12345");
        Thread.sleep(1000);

        //Enter Confirm
        registerPage.enterConfimpass("ron12345");
        Thread.sleep(1000);

        //Click on REGISTER button
        registerPage.clickRegisterBtn();
        clickOnElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));
        Thread.sleep(1000);

        //Verify the text 'Your account was created successfully. You are now logged in.’

        String expectedErrorMessage1 = "Your account was created successfully. You are now logged in.";
        String actualErrorMessage1 = registerPage.verifyAccountSuccessfullyText();
        Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1, "Error message not displayed");
    }

}

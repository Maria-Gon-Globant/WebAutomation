package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LogoutPage;
import utils.baseTest.BaseTest;

public class LogoutTest extends BaseTest {

    @BeforeTest
    public void Login(){
        LoginPage loginPage = loadLoginPage();
        loginPage.sendUsername();
        loginPage.sendPassword();
        loginPage.clickLoginButton();
    }
}

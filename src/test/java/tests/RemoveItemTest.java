package tests;

import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.baseTest.BaseTest;

public class RemoveItemTest extends BaseTest {

    @BeforeMethod
    public void Login(){
        LoginPage loginPage = loadLoginPage();
        loginPage.sendUsername();
        loginPage.sendPassword();
        loginPage.clickLoginButton();
    }
}

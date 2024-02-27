package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LogoutPage;
import utils.baseTest.BaseTest;
import static org.testng.Assert.assertTrue;

public class LogoutTest extends BaseTest {

    @BeforeMethod
    public void Login(){
        LoginPage loginPage = loadLoginPage();
        loginPage.sendUsername();
        loginPage.sendPassword();
        loginPage.clickLoginButton();
    }

    @Test
    @Parameters({"loginTitle"})
    public void Logout(String title){
        LogoutPage logoutPage = new LogoutPage(getDriver());
        logoutPage.clickBurgerMenuButton();
        logoutPage.getImplicitWait();
        logoutPage.clickLogoutButton();

        assertTrue(logoutPage.areInLogin(title), "The title does not match");
    }
}

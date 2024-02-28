package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ItemPage;
import pages.LoginPage;
import utils.baseTest.BaseTest;

import static org.testng.Assert.assertTrue;

public class PurchaseProductTest extends BaseTest {

    @BeforeMethod
    public void Login(){
        LoginPage loginPage = loadLoginPage();
        loginPage.sendUsername();
        loginPage.sendPassword();
        loginPage.clickLoginButton();
    }

    @Test
    @Parameters({"successText"})
    public void PurchaseProduct(String text){
        ItemPage itemPage = new ItemPage(getDriver());
        itemPage.clickItem1();
        itemPage.clickItem2();
        itemPage.clickItem3();

        CartPage cartPage = itemPage.clickCartButton();

        cartPage.clickCheckoutButton();

        cartPage.sendName();
        cartPage.sendLastName();
        cartPage.sendZip();

        cartPage.clickContinueButton();
        cartPage.clickFinishButton();

        assertTrue(cartPage.successfulPurchase(text), "The purchase was not successful");

    }
}

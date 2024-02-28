package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ItemPage;
import pages.LoginPage;
import utils.baseTest.BaseTest;
import static org.testng.Assert.assertEquals;

public class RemoveItemTest extends BaseTest {
    private static final int numItems = 3;

    @BeforeMethod
    public void Login(){
        LoginPage loginPage = loadLoginPage();
        loginPage.sendUsername();
        loginPage.sendPassword();
        loginPage.clickLoginButton();
    }

    @Test
    public void RemoveItem(){
        ItemPage itemPage = new ItemPage(getDriver());
        itemPage.clickItem1();
        itemPage.clickItem2();
        itemPage.clickItem3();

        CartPage cartPage = itemPage.clickCartButton();

        itemPage.clickRemoveItem1();
        itemPage.clickRemoveItem2();
        itemPage.clickRemoveItem3();

        itemPage.getImplicitWait();

        assertEquals(cartPage.getSize(),numItems);

    }
}

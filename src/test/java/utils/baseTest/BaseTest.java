package utils.baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.LoginPage;
import utils.MyDriver;

public class BaseTest {
    MyDriver driver;

    @BeforeMethod
    @Parameters({"url"})
    public void googleSetUp(String url){
        driver = new MyDriver();
        driver.getDriver().navigate().to(url);
    }

    public LoginPage loadLoginPage() {
        return new LoginPage(driver.getDriver());
    }

    public WebDriver getDriver() {
        return driver.getDriver();
    }

    @AfterMethod()
    public void closeGoogle() {
        driver.getDriver().close();
    }

}

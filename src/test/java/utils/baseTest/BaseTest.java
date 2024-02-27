package utils.baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.MyDriver;

public class BaseTest {
    MyDriver driver;

    @BeforeMethod
    @Parameters({"url"})
    public void googleSetUp(String url){
        driver = new MyDriver();
        driver.getDriver().navigate().to(url);
    }

}

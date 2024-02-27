package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
    private WebDriver driver;
    public MyDriver() {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver",path+"/driver/chromedriver");
        driver = new ChromeDriver();
    }
    public WebDriver getDriver() {
        return this.driver;
    }

}

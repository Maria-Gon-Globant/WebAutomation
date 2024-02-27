package pages;

import org.openqa.selenium.WebDriver;
import utils.basePage.BasePage;

public class LoginPage extends BasePage {
    private static final String usernameText = "standard_user";
    private static final String passwordText = "secret_sauce";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

}

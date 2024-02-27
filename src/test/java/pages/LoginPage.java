package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class LoginPage extends BasePage {
    private static final String usernameText = "standard_user";
    private static final String passwordText = "secret_sauce";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void sendUsername(){
        this.username.click();
        this.username.sendKeys(usernameText);
    }

    public void sendPassword(){
        this.password.click();
        this.password.sendKeys(passwordText);
    }

    public void clickLoginButton(){
        this.loginButton.click();
    }


}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class CartPage extends BasePage {

    private static final String name = "Mike";
    private static final String lastName = "Scott";
    private static final int zip = 11111;


    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#checkout")
    private WebElement checkoutButton;

    @FindBy(css = "#continue")
    private WebElement continueButton;

    @FindBy(css = "#finish")
    private WebElement finishButton;

    public void clickCheckoutButton(){
        this.checkoutButton.click();
    }
    public void clickContinueButton(){
        this.continueButton.click();
    }
    public void clickFinishButton(){
        this.finishButton.click();
    }
}

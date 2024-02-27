package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class AddItemPage extends BasePage {
    public AddItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name = 'add-to-cart-sauce-labs-backpack']")
    private WebElement item1;

    @FindBy(css = "[id = 'add-to-cart-sauce-labs-bike-light']")
    private WebElement item2;

    @FindBy(css = "[data-test = 'add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement item3;
}

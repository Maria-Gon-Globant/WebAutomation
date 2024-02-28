package pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class ItemPage extends BasePage {
    public ItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name = 'add-to-cart-sauce-labs-backpack']")
    private WebElement addItem1;

    //I put them here because if someone wants to test removing the items without going to the cart page,
    //they can use the same web elements
    @FindBy(name = "remove-sauce-labs-backpack")
    private WebElement removeItem1;

    @FindBy(css = "[id = 'add-to-cart-sauce-labs-bike-light']")
    private WebElement addItem2;
    @FindBy(id = "remove-sauce-labs-bike-light")
    private WebElement removeItem2;

    @FindBy(css = "[data-test = 'add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement assItem3;
    @FindBy(css = "[data-test = 'remove-sauce-labs-bolt-t-shirt']")
    private WebElement removeItem3;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartButton;

    public void clickItem1(){
        this.addItem1.click();
    }
    public void clickItem2(){
        this.addItem2.click();
    }
    public void clickItem3(){
        this.assItem3.click();
    }

    public CartPage clickCartButton(){
        this.cartButton.click();
        return new CartPage(getDriver());
    }

    public void clickRemoveItem1(){
        this.removeItem1.click();
    }
    public void clickRemoveItem2(){
        this.removeItem2.click();
    }
    public void clickRemoveItem3(){
        this.removeItem3.click();
    }

}

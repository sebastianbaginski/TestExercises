package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage {

    public ProductInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='group_1']/option[2]")
    WebElement sizeMSelect;

    @FindBy(className = "touchspin-up")
    WebElement quantityUp;

    @FindBy(className = "add-to-cart")
    WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a")
    WebElement proceedToCheckoutButton;

    public void chooseMSize() throws InterruptedException {
        sizeMSelect.click();
        Thread.sleep(1000);
    }

    public void enterQuantity() {
        quantityUp.click();
        quantityUp.click();
        quantityUp.click();
        quantityUp.click();
    }

    public void addToCartButton() {
        addToCartButton.click();
        proceedToCheckoutButton.click();
    }

}
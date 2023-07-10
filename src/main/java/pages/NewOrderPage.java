package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrderPage {

    public NewOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "confirm-addresses")
    WebElement confirmAddressButton;

    @FindBy(name = "confirmDeliveryOption")
    WebElement confirmShippingMethodButton;

    @FindBy(id = "payment-option-1")
    WebElement paymentOptionRadio;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    WebElement conditionsCheckbox;

    @FindBy(xpath = "//*[@id='payment-confirmation']/div[1]/button")
    WebElement placeOrderButton;

    public void orderPlacement() {
        confirmAddressButton.click();
        confirmShippingMethodButton.click();
        paymentOptionRadio.click();
        conditionsCheckbox.click();
        placeOrderButton.click();

    }
}

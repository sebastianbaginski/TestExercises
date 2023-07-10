package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage {

    public AddressesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Create new address')]")
    WebElement createNewAddress;

    @FindBy(className = "alert-success")
    WebElement newAddressAddedSuccessAlert;

    public void clickOnAddNewAddressBtn() {
        createNewAddress.click();
    }

    public boolean isNewAddressAddedSuccessAlert() {
        return newAddressAddedSuccessAlert.isDisplayed();
    }
}

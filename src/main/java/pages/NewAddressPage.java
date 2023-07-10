package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddressPage {

    public NewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "field-alias")
    WebElement aliasInput;

    @FindBy(id = "field-address1")
    WebElement addressInput;

    @FindBy(id = "field-city")
    WebElement cityInput;

    @FindBy(id = "field-postcode")
    WebElement postcodeInput;

    @FindBy(id = "field-phone")
    WebElement phoneInput;

    @FindBy(className = "btn-primary")
    WebElement saveNewAddressBtn;

    public void addNewAddress(String alias, String address, String city, String zip, String phone) {
        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        postcodeInput.sendKeys(zip);
        phoneInput.sendKeys(phone);
        saveNewAddressBtn.submit();
    }
}
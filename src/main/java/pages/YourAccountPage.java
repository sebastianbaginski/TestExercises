package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage {

    public YourAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addresses-link")
    WebElement addressesLink;

    @FindBy(className = "ui-autocomplete-input")
    WebElement searchCatalogInput;

    @FindBy(xpath = "//span[contains(text(), 'Hummingbird printed sweater')]")
    WebElement chosenSweater;


    public void clickOnAddressesBtn() {
        addressesLink.click();
    }

    public void productSearch() throws InterruptedException {
        searchCatalogInput.sendKeys("Hummingbird Printed Sweater");
        Thread.sleep(1000);
        chosenSweater.click();

    }

}
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='main']/div/div[2]/div[1]/div[2]/div/a")
    WebElement proceedToCheckout;

    public void checkout() {
        proceedToCheckout.click();
    }
}



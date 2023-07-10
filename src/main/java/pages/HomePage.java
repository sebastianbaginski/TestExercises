package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//span[contains(text(), 'Sign in')]")
    WebElement signInBtn;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSignIn() {
        signInBtn.click();
    }
}

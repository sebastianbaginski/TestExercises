package steps;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Exercise2 {

    private static WebDriver driver;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void exercise2Test() throws InterruptedException, IOException {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.loginToApp("qswgnxbobzjtlizpia@cazlg.com", "Haslo123");
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.productSearch();

        ProductInfoPage productInfoPage = new ProductInfoPage(driver);
        productInfoPage.chooseMSize();
        productInfoPage.enterQuantity();
        productInfoPage.addToCartButton();

        CartPage cartPage = new CartPage(driver);
        cartPage.checkout();

        NewOrderPage newOrderPage = new NewOrderPage(driver);
        newOrderPage.orderPlacement();

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshots/scrshot.png"));

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
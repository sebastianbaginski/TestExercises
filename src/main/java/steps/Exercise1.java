package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.*;

public class Exercise1 {

    public static WebDriver driver;
    String url = "https://mystore-testlab.coderslab.pl/index.php";

    @Given("Użytkownik otwiera przeglądarkę oraz przechodzi do aplikacji MyStore")
    public void openApp() {
        System.setProperty("webDriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @And("Użytkownik przechodzi do strony logowania")
    public void goToSignInPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();
    }

    @And("Użytkownik wpisuje poprawny adres email i haslo oraz zatwierdza logowanie")
    public void logIntoApp() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.loginToApp("qswgnxbobzjtlizpia@cazlg.com", "Haslo123");
    }

    @When("Użytkownik przechodzi do strony z adresami, klikając w kafelek Addresses")
    public void goToAddresses() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.clickOnAddressesBtn();
        AddressesPage addressesPage = new AddressesPage(driver);
        addressesPage.clickOnAddNewAddressBtn();

    }

    @Then("Użytkownik dodaje nowy adres, podając nazwę {string}, ulicę {string}, miasto {string}, kod pocztowy {string}, numer telefonu {string}")
    public void addNewAddress(String alias, String address, String city, String zip, String phone) {
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.addNewAddress(alias, address, city, zip, phone);
    }

    @And("Użytkownik sprawdza czy dane w dodanym adresie są poprawne")
    public void verifyNewAddressAddedInfo() {
        AddressesPage addressesPage = new AddressesPage(driver);
        Assert.assertTrue(addressesPage.isNewAddressAddedSuccessAlert());
    }

    @And("Przeglądarka zostaje zamknięta")
    public void tearDown() {
        driver.quit();
    }
}
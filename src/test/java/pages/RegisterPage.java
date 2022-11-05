package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{


    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    // Object Repository
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountButton;

    @FindBy(xpath = "(//a[text()='Register'])[1]")
    WebElement registerButton;

    @FindBy(id = "input-firstname")
    WebElement firstNameTextField;

    @FindBy(css = "#input-lastname")
    WebElement lastNameTextField;

    @FindBy(id = "input-email")
    WebElement emailTextField;

    @FindBy(id = "input-telephone")
    WebElement telephoneTextField;

    @FindBy(css = "#input-password")
    WebElement passwordTextField;

    @FindBy(id = "input-confirm")
    WebElement confirmPasswordTextField;

    @FindBy(name = "agree")
    WebElement agreeCb;

    @FindBy(css = ".btn.btn-primary")
    WebElement continueButton;


    // Business Logic


}

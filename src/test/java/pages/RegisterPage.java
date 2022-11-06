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

    @FindBy(xpath="//h1")
    WebElement successMsg;


    // Business Logic


    public void navigateToRegistrationPage(){
        myAccountButton.click();
        registerButton.click();
    }

    public void registerNewUser(String firstName, String lastName, String email, String telephone, String password, String confirmPassword){
        firstNameTextField.sendKeys(firstName);
        lastNameTextField.sendKeys(lastName);
        emailTextField.sendKeys(email);
        telephoneTextField.sendKeys(telephone);
        passwordTextField.sendKeys(password);
        confirmPasswordTextField.sendKeys(confirmPassword);
        agreeCb.click();
        continueButton.click();
    }

    public void verifySucessfulRegistration(){
        BasePage.verifyTitle(successMsg,"Your Account Has Been Created!");
    }
}

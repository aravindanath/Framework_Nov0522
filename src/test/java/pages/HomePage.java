package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }



    // Object Repository
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountButton;

    @FindBy(xpath = "(//a[text()='Register'])[1]")
    WebElement registerButton;

    @FindBy(xpath = "(//a[text()='Logout'])[1]")
    WebElement logout;




    // Business Logic


    public void navigateToRegistrationPage(){
        myAccountButton.click();
        registerButton.click();
    }

    public void navigateToLogout(){
        myAccountButton.click();
        logout.click();
    }



}

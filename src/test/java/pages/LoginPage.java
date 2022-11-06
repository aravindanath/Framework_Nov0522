package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-email")
    WebElement email;

    @FindBy(id = "input-password")
    WebElement paswd;

    @FindBy(linkText = "Forgotten Password")
    WebElement ForgotPwdLink;

//    @FindBy(className = "btn btn-primary")
//    WebElement loginbtn;

    @FindBy(xpath = "//a[text() = 'Continue']")
    WebElement continuebtn;

    @FindBy(xpath = "//input[@type = 'submit' and @value='Login']")
    WebElement loginbtn;

    @FindBy(linkText = "Address Book")
    WebElement AddressBook;

    @FindBy(linkText = "Wish List")
    WebElement WishList;

    @FindBy(linkText = "Order History")
    WebElement OrderHistory;

    @FindBy(linkText = "Downloads")
    WebElement Downloads;

    @FindBy(linkText = "Recurring payments")
    WebElement Recurringpayments;

    @FindBy(linkText = "Reward Points")
    WebElement RewardPoints;

    @FindBy(linkText = "Returns")
    WebElement Returns;

    @FindBy(linkText = "Transactions")
    WebElement Transactions;

    @FindBy(linkText = "Newsletter")
    WebElement NewLetter;



    //input[@type = 'submit' and @value='Login']

    // Object Repository

    // Business Logic


}

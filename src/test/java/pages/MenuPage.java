package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage{


    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class= 'nav navbar-nav']/li[1]/a[text() ='Desktops' ]")
    WebElement menuDesktop;


    // Object Repository

    // Business Logic


}

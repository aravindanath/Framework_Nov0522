package testScripts;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.RegisterPage;

public class TC_RF_001 extends  BaseTest{

    @Test
    public void TC_RF_001(){

        String firstName = BasePage.firstName(),lastName = BasePage.lastName(),email = BasePage.email(),telephone = BasePage.mobileNumber();
        RegisterPage rp = new RegisterPage(driver);
        rp.navigateToRegistrationPage();
        rp.registerNewUser(firstName,lastName,email,telephone,firstName,firstName);
        rp.verifySucessfulRegistration();
        HomePage hp = new HomePage(driver);
        hp.navigateToLogout();


    }
}

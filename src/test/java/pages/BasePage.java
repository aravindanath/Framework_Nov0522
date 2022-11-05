package pages;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public static void drag_drop(WebDriver driver, WebElement element1, WebElement element2){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(element1,element2).perform();
    }


    public static void selectValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }


    public static void selectIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }


    public static void selectText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void sleep(long time){
        try{
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void alerAccept(WebDriver driver){
        Alert alt =  driver.switchTo().alert();
        System.out.println("Alert title: " + alt.getText());
        alt.accept();
    }


    public static void alerDismiss(WebDriver driver){
        Alert alt =  driver.switchTo().alert();
        System.out.println("Alert title: " + alt.getText());
        alt.dismiss();
    }

    public static void alerAccept(WebDriver driver, String text){
        Alert alt =  driver.switchTo().alert();
        System.out.println("Alert title: " + alt.getText());
        alt.sendKeys(text);
        alt.accept();
    }

    public static void mouseHover(WebDriver driver, WebElement element){
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
    }


    public static void verfityTitle(WebElement element, String title){
        String actual = element.getText();
        System.out.println(actual);
        Assert.assertEquals(actual,title,"Title not match");
    }

    public static void scrollToElement(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public static void takeScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot scrShot = (TakesScreenshot)driver;
        File SrcFile= scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("./screen.png");
        FileUtils.copyFile(SrcFile,DestFile);
    }


    public static String city(){
        Faker faker = new Faker(new Locale("en-IND"));
        String city = faker.address().city();
        return city;
    }


    public static String email(){
        Faker faker = new Faker(new Locale("en-IND"));
        String fn = faker.name().firstName();
        return fn+"@gmail.com";
    }

    public static String firstName(){
        Faker faker = new Faker(new Locale("en-IND"));
        String fn = faker.name().firstName();
        return fn;
    }

    public static String lastName(){
        Faker faker = new Faker(new Locale("en-IND"));
        String ln = faker.name().lastName();
        return ln;
    }

    public static String mobileNumber(){
        Faker faker = new Faker(new Locale("en-IND"));
        String ln = faker.number().digits(10);
        return ln;
    }

    public static String currentDtTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String dt =  dtf.format(now)
                .replace("/","_")
                .replace(" ","_").replace(":","_");
        return dt;
    }
}

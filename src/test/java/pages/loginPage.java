package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;

    public  loginPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By User_field = By.id("user-name");
    private static final By Password_field = By.id("password");
    private static final By Login_button = By.id("login-button");
    private static final By Error_message = By.cssSelector("[data-test=error]");

    public void open(){
        driver.get("https://www.saucedemo.com/");
    }


    public void login(String user, String password) {
        driver.findElement(User_field).sendKeys("");
        driver.findElement(Password_field).sendKeys();
        driver.findElement(Login_button).click();

    }

    public String getErrormessage(){

        return driver.findElement(Error_message).getText();
    }

}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ProductsPages;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPages(driver);
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPages {

    WebDriver driver;


    public ProductsPages(WebDriver driver){
        this.driver = driver;

    }

    private static final By Title = By.cssSelector("[data-test=title]");

    public boolean isPageOpened(){
        return driver.findElement(Title).isDisplayed();


    }


}

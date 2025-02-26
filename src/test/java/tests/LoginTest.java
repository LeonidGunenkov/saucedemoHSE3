package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPages;

import java.time.Duration;

public class LoginTest extends BaseTest{

    /*
    1.открыть страницу https://www.saucedemo.com/
    2. Ввести в поле username значение standart_user
    3. Оставить поле password пустым (ввести пробел)
    4. Нажать кнопку login
    5. Проверить, что мы видим сообщение об ошибке с текстом
    epic sadface: Password is required
     */






    @Test
    public void checkNegativeWithEmptyPassword() {
        loginPage.open();
        loginPage.login("standart_user","");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Password is reqired");
    }


    @Test
    public void CheckPositiveLogin(){

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isPageopened());

 }


}



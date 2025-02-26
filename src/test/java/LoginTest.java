import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

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
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.saucedemo.com/");
     driver.findElement(By.id("user-name")).sendKeys("Ke$ha");
     driver.findElement(By.id("password")).sendKeys("Ke$ha");
     driver.findElement(By.id("login-button")).click();

     String errorMassage = driver.findElement(By.cssSelector("[data-test=error]")).getText();

     Assert.assertEquals(errorMassage, "Epic sadface: Username and password do not match any user in this service");

     driver.quit();
 }


}



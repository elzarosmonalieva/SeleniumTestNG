package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Driver;

public class LoginTest {
    @Test
    public void testSuccess(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPagen = new LoginPage();
        loginPagen.login("Admin", "admin123");
        Assertions.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
    @Test
    public void testUnSuccess(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPagen = new LoginPage();
        loginPagen.login("Admin", "adm123");
        Assertions.assertTrue(loginPagen.invalidLog.isDisplayed());
    }
}

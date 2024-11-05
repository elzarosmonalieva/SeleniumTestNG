package tests.sauceDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class LogInTest {
    @Test
    public void logInTest() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        LogIn loginpage = new LogIn();
        loginpage.login("standard_user");
    }

    @Test
    public void dashboardTest() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        LogIn loginpage = new LogIn();
        loginpage.login("standard_user");
        Dashboard addToCart = new Dashboard();
        addToCart.addItems();
        Assertions.assertEquals(addToCart.itemNum.getText(), "6");
    }

    @Test
    public void checkoutTest() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        LogIn loginpage = new LogIn();
        loginpage.login("standard_user");

        Dashboard addToCart = new Dashboard();
        addToCart.addItems();
        addToCart.cart.click();
        Assertions.assertEquals(addToCart.itemNum.getText(), "6");

        Checkout checkout = new Checkout();
        checkout.yourInformation();
        Assertions.assertEquals((checkout.total.getText().replace("Total: $", "")), "140.34");
        checkout.finish.click();
        Assertions.assertTrue(checkout.text.getText().equals("Thank you for your order!"));
    }
}

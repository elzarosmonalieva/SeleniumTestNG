package day1_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement loginField = driver.findElement(By.id("user-name"));// we have found this field by ID
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        Thread.sleep(1000);
        loginField.sendKeys("standard_user");// provides entry to the field
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        WebElement backpack = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        backpack.click();
        WebElement sweater = driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)"));
        sweater.click();
        Thread.sleep(2000);
        WebElement removeBag = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeBag.click();
        driver.quit();




    }
}

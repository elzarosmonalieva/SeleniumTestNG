package day1_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.name("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement logIn = driver.findElement(By.id("login-button"));
        logIn.click();

        WebElement backpack = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        backpack.click();

        WebElement bikeLight = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
        bikeLight.click();

        WebElement tShirt = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        tShirt.click();

        WebElement jacket = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        jacket.click();

        WebElement onesie = driver.findElement(By.name("add-to-cart-sauce-labs-onesie"));
        onesie.click();

        WebElement redTShirt = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        redTShirt.click();

        Thread.sleep(2000);

        //removing the items

        WebElement removeBackpack = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeBackpack.click();

        WebElement removeBikeLight = driver.findElement(By.id("remove-sauce-labs-bike-light"));
        removeBikeLight.click();

        WebElement removeTShirt = driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
        removeTShirt.click();

        WebElement removeJacket = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        removeJacket.click();

        WebElement removeOnsie = driver.findElement(By.id("remove-sauce-labs-onesie"));
        removeOnsie.click();

        WebElement removeRedTShirt = driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
        removeRedTShirt.click();

        driver.quit();



    }
}

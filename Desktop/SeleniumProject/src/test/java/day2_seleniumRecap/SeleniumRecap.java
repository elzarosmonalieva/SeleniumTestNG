package day2_seleniumRecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRecap {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.equals(expectedURL)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        System.out.println(actualURL);

        WebElement inputField = driver.findElement(By.cssSelector("input#user-name"));
        inputField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.cssSelector("input#password"));
        passwordField.sendKeys("secret_sauce");
        //css selector

        //WebElement loginButton = driver.findElement(By.cssSelector("input#login-button"));
        WebElement loginButton = driver.findElement(By.cssSelector("input.login-button"));
        loginButton.click();
        Thread.sleep(2000);

        driver.close();
    }
}

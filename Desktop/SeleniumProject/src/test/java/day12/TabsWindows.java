package day12;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.Set;

import static utils.Driver.driver;

public class TabsWindows {
    @Before
    public void windows() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.cssSelector("#user-name"));
        userName.sendKeys("standard_user");
        WebElement pass = driver.findElement(By.cssSelector("#password"));
        pass.sendKeys("secret_sauce");
        WebElement logIn = driver.findElement(By.cssSelector("#login-button"));
        logIn.click();

    }

    @Test
    public void twitt() {
        WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
        twitter.click();

    }

    @Test
    public void faceb() {
        WebElement face = driver.findElement(By.xpath("//a[text()='Facebook']"));
        face.click();

    }

    @Test
    public void linked() {
        WebElement link = driver.findElement(By.xpath("//a[text()='LinkedIn']"));
        link.click();

    }

    @After
    public void aft() {
        String main = driver.getWindowHandle();
        System.out.println("The URL  " + driver.getCurrentUrl());
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!window.equals(main)) {
                driver.switchTo().window(window);
            }
        }
    }


}

package day11;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import static utils.Driver.driver;

public class JUnitTest {
    @Before
    public void test1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement javaSc = driver.findElement(By.linkText("JavaScript Alerts"));
        javaSc.click();
    }

    @Test
    public void test2() {
        WebElement JsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        JsAlert.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        WebElement result = driver.findElement(By.cssSelector("#result"));
        System.out.println(result.getText());
    }

    @Test
    public void test3() {
        WebElement JsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        JsConfirm.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        WebElement result = driver.findElement(By.cssSelector("#result"));
        System.out.println(result.getText());

    }

    @Test
    public void test4() {
        WebElement JsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        JsPrompt.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Hello World!");
        driver.switchTo().alert().accept();
        WebElement result = driver.findElement(By.cssSelector("#result"));
        System.out.println(result.getText());
    }

}



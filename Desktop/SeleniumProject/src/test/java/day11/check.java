package day11;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import static utils.Driver.driver;

public class check {
    @Before
    public void Test1() {

        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com");
        WebElement js = driver.findElement(By.linkText("JavaScript Alerts"));
        js.click();
    }

    @Test
    public void Test2() {
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();
    }

    @Test
    public void Test3() {
        WebElement JsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        JsConfirm.click();
    }

    @After

    public void Test4() {
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        WebElement result = driver.findElement(By.cssSelector("#result"));
        System.out.println(result.getText());

    }
}


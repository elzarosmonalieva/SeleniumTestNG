package day11;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import static utils.Driver.driver;

public class Alerts {
    @BeforeClass
    public static void a1(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void alerts() {
        WebElement id = driver.findElement(By.xpath("//input[@name='cusid']"));
        id.sendKeys("abc123");
        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
    @Test
    public void cancel (){
        WebElement id = driver.findElement(By.xpath("//input[@name='cusid']"));
        id.sendKeys("abc123");
        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
        System.out.println(driver.switchTo().alert().getText());

    }

}

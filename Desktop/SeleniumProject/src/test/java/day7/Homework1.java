package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement recruitment = driver.findElement(By.xpath("//span[text()='Recruitment']"));
        recruitment.click();
        WebElement payrollAdminCheckbox = driver.findElement(By.xpath("//div[text()='Payroll Administrator']//ancestor::div[@class='oxd-table-row']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
        payrollAdminCheckbox.click();

    }

}

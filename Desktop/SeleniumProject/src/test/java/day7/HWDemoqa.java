package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HWDemoqa {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
        firstName.sendKeys("Liza");
        WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
        lastName.sendKeys("Adams");
        WebElement email = driver.findElement(By.cssSelector("#userEmail"));
        email.sendKeys("adams@gmail.com");
        WebElement gender = driver.findElement(By.xpath("//label[@for = 'gender-radio-2']"));
        gender.click();
        WebElement mobileNum = driver.findElement(By.xpath("//label[@for = 'gender-radio-2']//following::input[@placeholder='Mobile Number']"));
        mobileNum.sendKeys("1234567889");
        WebElement dateOfBirth = driver.findElement(By.cssSelector("#dateOfBirthInput"));
        dateOfBirth.click();
        WebElement year = driver.findElement(By.cssSelector("select[class='react-datepicker__year-select']"));
        Select yearr = new Select(year);
        yearr.selectByValue("2000");
        WebElement month = driver.findElement(By.cssSelector("select[class='react-datepicker__month-select']"));
        Select monthh = new Select(month);
        monthh.selectByVisibleText("September");





    }
}

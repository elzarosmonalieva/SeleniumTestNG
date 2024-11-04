package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/");
        driver.manage().window().maximize();
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='fromPort']"));
        Select city = new Select(dropdown);
        city.selectByVisibleText("Mexico City");

        WebElement destination = driver.findElement(By.xpath("//select[@name='toPort']"));
        Select dest = new Select(destination);
        dest.selectByVisibleText("London");
        Thread.sleep(2000);
        driver.close();
    }
}


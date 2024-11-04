package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement men = driver.findElement(By.cssSelector("#ui-id-5"));
        Actions actions = new Actions(driver);
        WebElement tops = driver.findElement(By.cssSelector("#ui-id-17"));
        WebElement tees = driver.findElement(By.cssSelector("#ui-id-21"));
        actions.moveToElement(men).moveToElement(tops).moveToElement(tees).perform();

        WebElement search = driver.findElement(By.cssSelector("#search"));
        actions.sendKeys(search, "jacket").sendKeys(Keys.RETURN).perform();

        List<WebElement> jackets = driver.findElements(By.xpath("//a[@class='product-item-link']"));
        boolean isFound = false;
        for(WebElement j:jackets){
            if(j.getText().contains("Jacket")){
                System.out.println("pass");
                isFound = true;
                break;
            }
            if(!isFound){
                System.out.println("fail");
            }
        }
    }
}

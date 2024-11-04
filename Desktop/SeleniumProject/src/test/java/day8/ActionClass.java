package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/home");
        WebElement developers = driver.findElement(By.cssSelector("button[class='bstack-mm-btn bstack-mm-btn-developers']"));
        Actions action = new Actions(driver);
        action.moveToElement(developers).perform();

        WebElement products = driver.findElement(By.cssSelector("button[class='bstack-mm-btn bstack-mm-btn-products']"));
        action.contextClick(products).perform();

        WebElement signIn = driver.findElement(By.cssSelector("a[title='Sign in']"));
        action.click(signIn).perform();
        //WebElement userName = driver.findElement(By.xpath("//input[@id='user_email_login']"));
      //action.sendKeys(userName, "elzar").perform();
        //WebElement password = driver.findElement(By.cssSelector("#user_password"));
       // password.sendKeys("hi");
        //action.keyDown(userName, Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
        //action.keyDown(password,Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();



    }
}

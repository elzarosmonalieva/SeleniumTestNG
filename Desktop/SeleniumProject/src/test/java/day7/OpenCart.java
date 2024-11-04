package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opencart.abstracta.us/");
        WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
        if(search.isDisplayed()){
            System.out.println("Search bar is displayed");
        }else{
            System.out.println("Search bar is not displayed");
        }
        search.sendKeys("apple");
        WebElement searchIcon = driver.findElement(By.xpath("//i[@class='fa fa-search']"));
        if(searchIcon.isDisplayed()){
            System.out.println("Search icon is displayed");
        }else{
            System.out.println("Search icon is not displayed");
        }
        searchIcon.click();

        String expectedUrl = "https://opencart.abstracta.us/index.php?route=product/search&search=apple";
        String actualUrl = driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("Navigated to correct page");
        }else{
            System.out.println("Navigated to wrong page");
        }

    }
}

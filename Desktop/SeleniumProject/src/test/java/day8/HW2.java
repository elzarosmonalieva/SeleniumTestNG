package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HW2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.way2automation.com/way2auto_jquery/droppable.php#load_box");
       WebElement target=driver.findElement(By.xpath("//div[@id='draggable']/p" ));
       WebElement source = driver.findElement(By.xpath("//div[@id='droppable']/p"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).build().perform();

    }
}

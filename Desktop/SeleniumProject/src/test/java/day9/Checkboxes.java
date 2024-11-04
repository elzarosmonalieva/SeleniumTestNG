package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Checkboxes")).click();
       WebElement box1= driver.findElement(By.xpath("//br/preceding::input"));
        if(box1.isSelected()){
            System.out.println("It is selected");
        }else{
            System.out.println("not selected");
        }

        WebElement box2 = driver.findElement(By.xpath("//br/following::input"));
        if(box2.isSelected()){
            box2.click();
        }else{
            System.out.println("It is not selected");
        }

    }
}

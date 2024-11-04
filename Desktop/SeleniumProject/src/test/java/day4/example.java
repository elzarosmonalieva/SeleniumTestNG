package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='option-3']"));
        if(checkbox3.isSelected()){
            System.out.println("option 3 is selected");
        }else{
            System.out.println("option 3 is not selected");
        }

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option-1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='option-2']"));
        WebElement checkbox4 = driver.findElement(By.xpath("//input[@value='option-4']"));
        checkbox1.click();
        checkbox2.click();
        checkbox4.click();

        if(checkbox1.isSelected() && checkbox2.isSelected()&& checkbox4.isSelected()){
            System.out.println("all of them are selected");
        }else{
            System.out.println("some of them are not selected");
        }

        WebElement yellow = driver.findElement(By.cssSelector("input[value='yellow']"));
        yellow.click();
        WebElement pumpkin = driver.findElement(By.cssSelector("input[value='pumpkin']"));
        if(pumpkin.isSelected()){
            System.out.println("pumpkin is selected by default");
        }else{
            System.out.println("Test failed!");
        }
        checkbox1.click();
        checkbox2.click();
        if(!checkbox1.isSelected() &&! checkbox2.isSelected()){
            System.out.println("Checkboxes 1 and 2 are deselected");
        }else{
            System.out.println("Test failed one of the checkboxes is not deselected");
        }
        Thread.sleep(2000);

        WebElement green = driver.findElement(By.cssSelector("input[value='green']"));
        green.click();


      if(green.isSelected() && !yellow.isSelected()){
          System.out.println("Green is selected and yellow is deselected");
      }else{
          System.out.println("Error!");
      }





    }
}

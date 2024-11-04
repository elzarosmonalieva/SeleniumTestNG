package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DEMOQA {
    public static void main(String[] args) {
        WebDriver demoq = new ChromeDriver();
        demoq.navigate().to("https://demoqa.com/text-box");
        demoq.manage().window().fullscreen();

        WebElement fullName = demoq.findElement(By.cssSelector("input[id=userName]"));
        fullName.sendKeys("Lisa Adams");
        WebElement email = demoq.findElement(By.cssSelector("#userEmail"));
        email.sendKeys("elz@gmail.com");
        WebElement currentAddress = demoq.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        currentAddress.sendKeys("234 School St");
        WebElement permanentAddress = demoq.findElement(By.cssSelector("#permanentAddress"));
        permanentAddress.sendKeys("897 Elk Grove Village");
        WebElement submit = demoq.findElement(By.cssSelector(".btn.btn-primary"));
        submit.click();
        System.out.println(fullName.getText());
        if(fullName.getText().contains("Lisa Adams")){
            System.out.println("name verified");
        }else{
            System.out.println("name is not verified");
        }

        if(email.getText().contains("elz@gmail.com")){
            System.out.println("email verified");
        }else{
            System.out.println("email is not verified");
        }

        if(currentAddress.getText().contains("234 School St")){
            System.out.println("Current address verified");
        }else{
            System.out.println("Current address is not verified");
        }

        if(fullName.getText().contains("897 Elk Grove Village")){
            System.out.println("Permanent address is verified");
        }else{
            System.out.println("Permanent address is not verified");
        }







    }
}

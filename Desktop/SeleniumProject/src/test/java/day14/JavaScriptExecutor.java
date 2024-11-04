package day14;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class JavaScriptExecutor {
    @Test
    public void fillOut(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement username = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement address = driver.findElement(By.id("currentAddress"));
        js.executeAsyncScript("let args=arguments, callback = arguments[arguments.length-1];"+"setTimeout(function() {"+"args[0].value = 'codewise academy'," +
                "args[1].value='codewise@gmail.com';" +
                "args[2].value = '2250 E Devon';" +
                "callback();" +
                "}, 0);", username,email, address);

        WebElement permAddress = driver.findElement(By.id("permanentAddress"));
        js.executeScript("arguments[0].value='permanent address';",permAddress);
        WebElement subm = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click()",subm);

//        js.executeScript("document[0].value='codewise academy';", username);
//        js.executeScript("document[0].value='codewise@gmail.com';", email);
//        js.executeScript("document[0].value='2250 E Devon ave';", address);
        js.executeScript("window.scrollBy(0,3000)");// will scroll down
    }
}

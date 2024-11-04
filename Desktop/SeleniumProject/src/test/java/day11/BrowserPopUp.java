package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class BrowserPopUp {

    @Test
    public void testBrowserPopUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.geolocation",2);//2 is a block
        options.setExperimentalOption("prefs", prefs);

        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com/");

        WebElement search = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        search.sendKeys("doordash"+ Keys.ENTER);
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='VtPCGb']//g-raised-button")));
            WebElement dialog = driver.findElement(By.xpath("//div[@class='VtPCGb']//g-raised-button"));
            dialog.click();
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }


    }
}

package day12;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LetsCode {
    WebDriver driver = Driver.getDriver();

    @Before
    public void bef() {

        driver.get("https://www.letskodeit.com/practice");
        System.out.println("URL " + driver.getCurrentUrl());

    }

    @Test
    public void test1() {
        String mainWindow = driver.getWindowHandle();
        WebElement tab = driver.findElement(By.cssSelector("#opentab"));
        tab.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String windoww: windowHandles){
            if(!windoww.equals(mainWindow)){
                driver.switchTo().window(windoww);
            }
        }
        System.out.println("new tab: " + driver.getCurrentUrl());
        driver.switchTo().window(mainWindow);
        System.out.println("last at: " + driver.getCurrentUrl());
    }

    @Test
    public void test2() {
        String mainWindow = driver.getWindowHandle();
        WebElement window = driver.findElement(By.cssSelector("#openwindow"));
        window.click();
        Set<String> winHand = driver.getWindowHandles();
        for (String handle : winHand) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        System.out.println("switched to " + driver.getCurrentUrl());
        driver.switchTo().window(mainWindow);
        System.out.println("last at: " + driver.getCurrentUrl());
    }
}

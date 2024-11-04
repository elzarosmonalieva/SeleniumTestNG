package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class IFrames {

    @Test
    public void iframe1(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demo.guru99.com/test/guru99home/");
        WebElement iframe = driver.findElement(By.xpath("//div[@id='rt-showcase']//iframe"));
        driver.switchTo().frame(iframe);
        WebElement text = driver.findElement(By.cssSelector("a[class='ytp-title-link yt-uix-sessionlink']"));
        System.out.println(text.getText());
    }
    @Test
    public void iframe2(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement ifr = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(ifr);
    }
}

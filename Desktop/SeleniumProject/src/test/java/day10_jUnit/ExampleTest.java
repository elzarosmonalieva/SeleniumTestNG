package day10_jUnit;

import org.checkerframework.checker.units.qual.Temperature;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class ExampleTest {
    @Test
    public void verifyCheckbox2() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement checkboxes = driver.findElement(By.linkText("Checkboxes"));
        checkboxes.click();
        WebElement box2 = driver.findElement(By.xpath("//br/following::input"));
        Assert.assertTrue(box2.isSelected());

        WebElement box1 = driver.findElement(By.xpath("//br/preceding::input"));
        Assert.assertTrue(!box1.isSelected());
    }
@Test
    public void checkbox(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement AB = driver.findElement(By.linkText("A/B Testing"));
        AB.click();
        WebElement text = driver.findElement(By.xpath("//h3"));
        String abtext = text.getText();
        Assert.assertTrue(abtext.contains("Test Control"));

    }
}


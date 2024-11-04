package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class ex {
    @Test
    public void duesFifty() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> lastname = driver.findElements(By.xpath("//table[@id='table1']//tr//td[1]"));
        List<WebElement> name = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
        List<WebElement> dues = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[4]"));
        for (int i =0; i >= 3; i++) {

            System.out.println(name.get(i).getText() + " " + lastname.get(i).getText() + " is due " + dues.get(i).getText() + " dollars ");
        }
    }
}

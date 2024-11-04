package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class Table {
    @Test
    public void table() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//tr//td[1]"));
        List<WebElement> lastNames = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
        List<WebElement> dues = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[4]"));
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i).getText() + " " + lastNames.get(i).getText() + " " + dues.get(i).getText());
        }
    }

    @Test
    public void table2() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> names = driver.findElements(By.xpath(" //table[@id='table2']/tbody//td[1]"));
        List<WebElement> lastNames = driver.findElements(By.xpath("//table[@id='table2']/tbody//td[2]"));
        List<WebElement> dues = driver.findElements(By.xpath(" //table[@id='table2']/tbody//td[4]"));
        for (int i = 0; i < names.size(); i++) {
            String due = dues.get(i).getText().substring(1);
            double d = Double.parseDouble(due);
            if(d>50){
                System.out.println(names.get(i).getText()+" "+lastNames.get(i).getText()+" "+d);
            }
            }
        }}



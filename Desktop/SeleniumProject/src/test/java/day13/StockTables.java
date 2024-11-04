package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.stylesheets.LinkStyle;
import utils.Driver;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StockTables {
    @Test

    public void task1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demo.guru99.com/test/table.html");

        List<WebElement> col2 = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < col2.size(); i++) {
            System.out.println(col2.get(i).getText());
        }
    }

    @Test

    public void task2() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://omayo.blogspot.com/");
        List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//tr//td[1]"));
        List<WebElement> age = driver.findElements(By.xpath("//table[@id='table1']//tr//td[2]"));
        List<WebElement> place = driver.findElements(By.xpath("//table[@id='table1']//tr//td[3]"));
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String s =names.get(i).getText()+" "+age.get(i).getText()+" "+place.get(i).getText();
            a.add(s);
        }
        Collections.sort(a);
        System.out.println(a);
    }

    @Test
    public void test3(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.cnbc.com/");
        List<WebElement>name = driver.findElements(By.xpath("(//table[@class='BasicTable-table'])[2]/tbody/tr/td[@class='BasicTable-symbol']"));
        List<WebElement> price = driver.findElements(By.xpath(""));
    }

}

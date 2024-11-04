package day10_jUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;
import java.util.List;

import static utils.Driver.driver;

public class EatThisMuchClass {
    @BeforeClass
    public static void test() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.eatthismuch.com/");
    }
        @Test
        public void test1(){
            WebElement text = driver.findElement(By.xpath("//section[@id='create']/h2"));
            Assert.assertTrue(text.getText().contains("Create your meal plan right here in seconds"));

        }
        @Test
        public void test2(){
        WebElement calories = driver.findElement(By.xpath("//div[@class='calculator svelte-1p7c7q7']//preceding::input[@type='number']"));
        calories.clear();
        calories.sendKeys("2000");

        WebElement generate = driver.findElement(By.xpath("//button[@type='submit']"));
        generate.click();

        String cal = driver.findElement(By.xpath("(//div[@class='tooltip-target svelte-1eq8gs4'])[1]")).getText();
        System.out.println(cal);
        int calor=Integer.parseInt(cal.split(" ")[0]);
        Assert.assertTrue(calor>=1900 && calor<=2100);
        WebElement mealPlan = driver.findElement(By.xpath("(//h3)[1]"));
        Assert.assertTrue(mealPlan.getText().equals("Today's Meal Plan"));
        List<WebElement> meals = driver.findElements(By.xpath("//h4"));
        Assert.assertEquals(3, meals.size());
    }

    @Test
    public void delete(){
        WebElement calories = driver.findElement(By.xpath("//div[@class='calculator svelte-1p7c7q7']//preceding::input[@type='number']"));
        calories.clear();
        calories.sendKeys("1900");

        WebElement numberMeals = driver.findElement(By.xpath("(//span[@class='input svelte-1p7c7q7'])[2]//select"));
        Select sth = new Select(numberMeals);
        sth.selectByValue("5");

        WebElement generate = driver.findElement(By.xpath("//button[@type='submit']"));
        generate.click();

        WebElement snack1 = driver.findElement(By.xpath("(//div[@class='food svelte-k5vk40'])[3]//a"));
        snack1.click();
        driver.navigate().back();

        WebElement refresh = driver.findElement(By.xpath("(//button[@aria-label='Regenerate Meal'])[2]"));
        refresh.click();




    }
}

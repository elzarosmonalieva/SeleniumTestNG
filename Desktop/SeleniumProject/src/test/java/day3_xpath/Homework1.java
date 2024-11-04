package day3_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.cssSelector("input[name=user-name]"));
        userName.sendKeys("standard_user");
        WebElement pass = driver.findElement(By.cssSelector("input[data-test = password]"));
        pass.sendKeys("secret_sauce");
        WebElement logIn = driver.findElement(By.cssSelector("input[value = Login]"));
        logIn.click();

        WebElement tShirt = driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-bolt-t-shirt"));
        tShirt.click();
        WebElement jacket = driver.findElement(By.cssSelector("button[name=add-to-cart-sauce-labs-fleece-jacket]"));
        jacket.click();
        WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click();
        WebElement removeJacket = driver.findElement(By.xpath("//button[@data-test='remove-sauce-labs-fleece-jacket']"));
        removeJacket.click();
        WebElement continueShop = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_medium']"));
        continueShop.click();
        WebElement onsie = driver.findElement(By.cssSelector("button[data-test=add-to-cart-sauce-labs-onesie]"));
        onsie.click();
        WebElement cartClick = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartClick.click();

        String expectedPrice = "15.99";
        String actualPrice = driver.findElement(By.xpath("//div[text()='15.99']")).getText();
        String price = actualPrice.replace("$", "");

        if (expectedPrice.equals(price)) {
            System.out.println("Prices are same");
        } else {
            System.out.println("Prices are not same");
        }

        WebElement checkout = driver.findElement(By.xpath("//button[text()='Checkout']"));
        checkout.click();

        WebElement firstName = driver.findElement(By.cssSelector("input[data-test=firstName]"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.cssSelector("input#last-name"));
        lastName.sendKeys("Doe");
        WebElement zip = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        zip.sendKeys("12345");
        Thread.sleep(3000);
        WebElement submit = driver.findElement(By.cssSelector("input.submit-button.btn.btn_primary.cart_button.btn_action"));
        submit.click();
        WebElement finish = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']"));
        finish.click();
        WebElement backHome = driver.findElement(By.xpath("//button[@name='back-to-products']"));
        boolean isDisplayed = backHome.isDisplayed();
        if(isDisplayed){
            System.out.println("Back Home button is displayed");
        }else{
            System.out.println("Back Home button is not displayed");
        }



    }
}


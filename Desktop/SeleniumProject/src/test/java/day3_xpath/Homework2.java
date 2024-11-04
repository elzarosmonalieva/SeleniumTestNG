package day3_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(" https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.cssSelector("input[name=user-name]"));
        userName.sendKeys("standard_user");
        WebElement pass = driver.findElement(By.cssSelector("input[data-test = password]"));
        pass.sendKeys("secret_sauce");
        WebElement logIn = driver.findElement(By.cssSelector("input[value = Login]"));
        logIn.click();

        WebElement backpack = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
        backpack.click();
        WebElement bikeLight = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']"));
        bikeLight.click();
        WebElement tShirt = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        tShirt.click();
        WebElement jacket = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        jacket.click();
        WebElement onesie = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-onesie']"));
        onesie.click();
        WebElement redTShirt = driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
        redTShirt.click();

        WebElement cart = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        cart.click();
        Thread.sleep(2000);

        WebElement yourCart = driver.findElement(By.xpath("//span[@class='title']"));
        boolean yourCart1 = yourCart.isDisplayed();
        if(yourCart1){
            System.out.println("Your Cart is displayed");
        }else{
            System.out.println("Your Cart is not displayed");
        }

        WebElement QTY = driver.findElement(By.xpath("//div[@class='cart_quantity_label']"));
        boolean QTYisDisplayed = QTY.isDisplayed();
        if(QTYisDisplayed){
            System.out.println("QTY is displayed");
        }else{
            System.out.println("QTY is not displayed");
        }

        WebElement description = driver.findElement(By.xpath("//div[@class='cart_desc_label']"));
        boolean descriptionIsDisp = description.isDisplayed();
        if(descriptionIsDisp){
            System.out.println("Description is displayed");
        }else{
            System.out.println("Description is not displayed");
        }

        WebElement removeJacket = driver.findElement(By.xpath("//button[@data-test='remove-sauce-labs-fleece-jacket']"));
        removeJacket.click();
        WebElement checkout = driver.findElement(By.xpath("//button[text()='Checkout']"));
        checkout.click();
        WebElement firstName = driver.findElement(By.cssSelector("input[data-test=firstName]"));
        firstName.sendKeys("Ivan");
        WebElement lastName = driver.findElement(By.cssSelector("input#last-name"));
        lastName.sendKeys("Ivanov");
        WebElement zip = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        zip.sendKeys("67890");
        WebElement submit = driver.findElement(By.cssSelector("input.submit-button.btn.btn_primary.cart_button.btn_action"));
        submit.click();
        List<String> texts = new ArrayList<>(List.of("Payment Information","Shipping Information", "Price Total"));
        List<WebElement> text = driver.findElements(By.xpath("//div[@class='summary_info_label']"));

    }
}

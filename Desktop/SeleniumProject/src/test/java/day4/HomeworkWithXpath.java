package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkWithXpath {
    public static void main(String[] args) {
        //tagname[@attribute='value'];
        //tagname[text() = 'text'] -> locating by text;
        //tagname[contains(@attribute, 'partial text')]-> contains
        //tagname[starts-with(@attribute, 'value_prefix')]
        //(//tagname[starts-with(@attribute, 'value_prefix')])[2]->

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://cashwise.us/main");
        String url = driver.getCurrentUrl();
        if(url.contains("cashwise")){
            System.out.println("URL contains cashwise");
        }else{
            System.out.println("URL doesnt contain cashwise");
        }

        WebElement email = driver.findElement(By.xpath("//p[contains(text(),'hello@codewise.com')]"));
        if(email.isDisplayed()){
            System.out.println("Cashwise is displayed");
        }else{
            System.out.println("Cashwise is not displayed");
        }

        WebElement signIn = driver.findElement(By.cssSelector("button[class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root css-1wgjx4y']"));
        if(signIn.isDisplayed()){
            System.out.println("Sign in button is displayed");
        }else{
            System.out.println("Sign in button is not displayed");
        }

        WebElement signUp = driver.findElement(By.cssSelector("button[class='MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButtonBase-root css-k6k41x']"));
        if(signUp.isDisplayed()){
            System.out.println("Sign up button is displayed");
        }else{
            System.out.println("Sign up button is not displayed");
        }



    }
}

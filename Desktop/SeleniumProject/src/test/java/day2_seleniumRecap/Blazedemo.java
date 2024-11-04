package day2_seleniumRecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Blazedemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.blazedemo.com/");

        WebElement departCity = driver.findElement(By.cssSelector("select.form-inline"));
        departCity.click();
        WebElement cityBoston = driver.findElement(By.cssSelector("option[value = Boston"));
        cityBoston.click();
        WebElement destination = driver.findElement(By.cssSelector("select[name = toPort]"));
        destination.click();
        WebElement destinationCity = driver.findElement(By.cssSelector("option[value = Dublin"));
        destinationCity.click();
        WebElement findFlights = driver.findElement(By.cssSelector("input.btn.btn-primary"));
        findFlights.click();

        List<String> expectedAirlines = new ArrayList<>(List.of("Virgin America", "United Airlines", "Aer Lingus", "Virgin America", "Lufthansa"));
        List<WebElement> actual = driver.findElements(By.cssSelector("input[name=airline]"));
        for (int i = 0; i < expectedAirlines.size(); i++) {
            if (actual.get(i).getAttribute("value").equals(expectedAirlines.get(i))) {
                System.out.println("actual airline ia as expected " + actual.get(i).getAttribute("value"));
            } else {
                System.out.println("actual airline ia not as expected " + actual.get(i).getAttribute("value"));
            }
        }
        WebElement text = driver.findElement(By.linkText("Travel The World"));
        text.click();
        String homePageUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.blazedemo.com/index.php";
        if(expectedUrl.equals(homePageUrl)){
            System.out.println("user gets navigated to the homepage");
        }else{
            System.out.println("user is not at the homepage");
        }
        Thread.sleep(2000);
        driver.close();
    }
}

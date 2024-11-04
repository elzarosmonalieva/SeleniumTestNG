package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
        driver.manage().window().fullscreen();
        WebElement dropdown = driver.findElement(By.cssSelector("#cars"));
        Select drop = new Select(dropdown);
        drop.selectByVisibleText("Volvo");
        drop.selectByVisibleText("Saab");
        drop.selectByVisibleText("Opel");
        List<WebElement> selectElement = drop.getAllSelectedOptions();
        String[] expectedOptions = {"Volvo", "Saab", "Opel"};
        if (drop.isMultiple()) {
            System.out.println("Dropdown has multiple options");
        } else {
            System.out.println("Dropdown doesnt have multiple options");
        }

        if (expectedOptions.length == selectElement.size()) {
            for (int i = 0; i < selectElement.size(); i++) {
                String selectedText = selectElement.get(i).getText();
                if (selectedText.equals(expectedOptions[i])) {
                    System.out.println("Selected option: " + selectedText);
                } else {
                    System.out.println("Verification failed");
                }
            }
        }

        drop.deselectByVisibleText("Opel");
        drop.deselectByVisibleText("Volvo");
        selectElement = drop.getAllSelectedOptions();
        for(WebElement select: selectElement){
            String selected = select.getText();
            if(selected.equals("Saab")){
                System.out.println("Only saab left");
            }else{
                System.out.println("Fail!");
            }
        }
    }
}

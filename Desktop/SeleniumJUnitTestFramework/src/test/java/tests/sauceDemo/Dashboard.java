package tests.sauceDemo;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Dashboard {
    public Dashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory ']")
    public List<WebElement> items;

    @FindBy(xpath = "//a[@class='shopping_cart_link']//span")
    public WebElement itemNum;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement cart;

    public void addItems() {
        for (WebElement item : items) {
            item.click();
        }

    }
}

package tests.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Checkout {
    public Checkout() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn_action btn_medium checkout_button ']")
    public WebElement checkoutButton;
    @FindBy(id = "first-name")
    public WebElement firstName;
    @FindBy(id = "last-name")
    public WebElement lastName;
    @FindBy(id = "postal-code")
    public WebElement zipCode;
    @FindBy(id = "continue")
    public WebElement submit;
    @FindBy(xpath = "//div[@class='summary_total_label']")
    public WebElement total;
    @FindBy(xpath = "//button[@id='finish']")
    public WebElement finish;
    @FindBy(xpath = "//h2[@class='complete-header']")
    public WebElement text;

    public void yourInformation() {
            checkoutButton.click();
            firstName.sendKeys("Lisa");
            lastName.sendKeys("Adams");
            zipCode.sendKeys("12345");
            submit.click();
    }
}

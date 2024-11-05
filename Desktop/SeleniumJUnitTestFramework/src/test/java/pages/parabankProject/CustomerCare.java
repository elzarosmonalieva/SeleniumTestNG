package pages.parabankProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.List;

import static utilities.Driver.driver;

public class CustomerCare {
    public CustomerCare() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='contact']")
    public WebElement contact;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(name = "phone")
    public WebElement phone;
    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement message;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement sendToCusCare;
//    @FindBy(xpath = "mmm")
//    public List<WebElement> itemss;
//    List<WebElement> items = driver.findElements(By.xpath("mmm"));

    public void sendMessage() {
        contact.click();
        name.sendKeys("Lisa");
        email.sendKeys("lisa123@gmail.com");
        phone.sendKeys("12345");
        message.sendKeys("Hi! I cant log in to my account");
        SeleniumUtils.waitForSec(10);
        sendToCusCare.click();
    }


}

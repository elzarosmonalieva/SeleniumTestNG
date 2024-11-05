package tests.paraBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CustomerSupport {
    public CustomerSupport(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[text()='contact']")
    public WebElement contactLogo;
    @FindBy(css = "#name")
    public WebElement name;
    @FindBy(css="#email")
    public WebElement email;
    @FindBy (xpath = "//input[@name='phone']")
    public WebElement phone;
    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement message;
    @FindBy(xpath = "//input[@value='Send to Customer Care']")
    public WebElement sendButton;
    @FindBy (id="rightPanel")
    public WebElement customerCare;


    public void contactSupport(){
        contactLogo.click();
        name.sendKeys("Liza");
        email.sendKeys("elois@gmail.com");
        phone.sendKeys("1234567");
        message.sendKeys("I can not log in to my account help me immediately");
        sendButton.click();
    }
}

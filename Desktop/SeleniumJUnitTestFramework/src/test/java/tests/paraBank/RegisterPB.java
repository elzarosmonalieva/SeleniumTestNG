package tests.paraBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.SeleniumUtils;

public class RegisterPB {
    public RegisterPB() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register;
    @FindBy(id = "customer.firstName")
    public WebElement firstName;
    @FindBy(name = "customer.lastName")
    public WebElement lastName;
    @FindBy(id = "customer.address.street")
    public WebElement address;
    @FindBy(name = "customer.address.city")
    public WebElement city;
    @FindBy(id = "customer.address.state")
    public WebElement state;
    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;
    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneNumber;
    @FindBy(css = "input[id='customer.ssn']")
    public WebElement ssn;
    @FindBy(id = "customer.username")
    public WebElement username;
    @FindBy(id = "customer.password")
    public WebElement password;
    @FindBy(id = "repeatedPassword")
    public WebElement confirm;
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement registerButton;

    public void registration() throws InterruptedException {
        register.click();
        firstName.sendKeys("Adam");
        lastName.sendKeys("Adamov");
        address.sendKeys("school street 1111");
        city.sendKeys("Quens");
        state.sendKeys("Illinois");
        zipCode.sendKeys("12345");
        phoneNumber.sendKeys("89765432");
        ssn.sendKeys("1234567");
        username.sendKeys("user1000");
        password.sendKeys("batch7");
       confirm.sendKeys("hello");
        SeleniumUtils.waitForSec(10);
       registerButton.click();
    }


}

package tests.sauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogIn {
    public LogIn(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="user-name")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id="login-button")
    public WebElement loginButton;

    public void login(String username){
        userName.sendKeys(username);;
        password.sendKeys("secret_sauce");
        loginButton.click();

    }
}

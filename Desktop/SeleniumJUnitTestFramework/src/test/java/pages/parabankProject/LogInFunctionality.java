package pages.parabankProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.Driver.driver;

public class LogInFunctionality {
    public LogInFunctionality(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath ="//input[@name='username']")
    public WebElement userName;
    @FindBy (xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy (css = "input[value='Log In']")
    public WebElement logInButton;

    public void logInToApp(){
        userName.sendKeys("user1000");
        password.sendKeys("batch7");
        logInButton.click();
    }
}

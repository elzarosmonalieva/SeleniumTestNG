package tests.paraBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogIn_ParaBank {
public LogIn_ParaBank(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

@FindBy(css = "input[name='password']")
    public WebElement password;

@FindBy(xpath = "//input[@value='Log In']")
    public WebElement logIn;

public void setLogIn(){
    userName.sendKeys("ais1232");
    password.sendKeys("helloeveryone");
    logIn.click();
}
}

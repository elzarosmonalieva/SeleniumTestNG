package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import pages.LoginPage;
import pages.PIMPage;
import utilities.Driver;

public class PIMTest {
    LoginPage login = new LoginPage();
    PIMPage pim = new PIMPage();
    CommonPage common = new CommonPage();
    WebDriver driver = Driver.getDriver();

    @BeforeEach
    public void login(){
        login.login("Admin","admin123");
    }
    @Test
    public void verifyAdminCanCreateEmployee(){
        common.pimTab.click();
        pim.addEmployee();
        String expectedName = pim.firstName+" "+pim.lastName;

    }
}

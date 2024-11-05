package tests.parabankTest;

import org.junit.jupiter.api.Test;
import pages.parabankProject.CustomerCare;
import pages.parabankProject.LogInFunctionality;
import utilities.Driver;

public class ParaBankTest {
    @Test
    public void test1(){
        Driver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        LogInFunctionality loggg = new LogInFunctionality();
        loggg.logInToApp();
        CustomerCare customCare = new CustomerCare();
        customCare.sendMessage();
    }
    @Test
    public void test2(){
        Driver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        LogInFunctionality loggg = new LogInFunctionality();
        loggg.logInToApp();
    }




}

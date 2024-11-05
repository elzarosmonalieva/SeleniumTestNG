package tests.paraBank;

import org.junit.jupiter.api.Test;
import utilities.Driver;

public class ParaBankTest {

    @Test
    public void test1() throws InterruptedException {
        Driver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=E62CF7F756B2681B75DE995C0D4B13AD");
        RegisterPB register = new RegisterPB();
        register.registration();
        CustomerSupport support = new CustomerSupport();
        support.contactSupport();
        LogIn_ParaBank logIn = new LogIn_ParaBank();
        logIn.setLogIn();
    }
}

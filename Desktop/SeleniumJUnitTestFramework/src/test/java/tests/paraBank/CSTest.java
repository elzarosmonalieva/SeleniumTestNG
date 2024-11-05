package tests.paraBank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilities.Driver;

public class CSTest {
    @Test
    public void test1(){
        Driver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        LogIn_ParaBank login =  new LogIn_ParaBank();
        login.setLogIn();
        CustomerSupport support = new CustomerSupport();
        support.contactSupport();
        System.out.println(support.customerCare.getText());
        //Assertions.assertTrue(support.customerCare.getText().contains("hi batch7."));
        Assertions.assertEquals(support.customerCare.getText(), "Customer Care\n" +
                "Thank you Liza\n" +
                "A Customer Care Representative will be contacting you.");
    }
}

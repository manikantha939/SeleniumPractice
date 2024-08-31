
package Handelling_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
    @Test(invocationCount = 3)
    public void createCustomer(){
        Reporter.log("createCustomer", true);
    }
    @Test(priority =0)
    public void deleteCustomer(){
        Reporter.log("deleteCustomer", true);
    }

    @Test(priority = 0)
    public void modifyCustomer(){
        Reporter.log("modifyCustomer",true);
    }
}
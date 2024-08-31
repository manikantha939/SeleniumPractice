
package Handelling_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
    @Test
    public void createCustomer(){
//        Assert.fail();
        Reporter.log("createCustomer", true);
    }

    @Test(priority =0, dependsOnMethods = {"createCustomer","modifyCustomer"})
    public void deleteCustomer(){
        Reporter.log("deleteCustomer", true);
    }

    @Test(priority = 0, dependsOnMethods = "createCustomer")
    public void modifyCustomer(){
        Reporter.log("modifyCustomer",true);
    }
}
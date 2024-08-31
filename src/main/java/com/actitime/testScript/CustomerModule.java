package com.actitime.testScript;

import com.actitime.generic.BaseClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class CustomerModule extends BaseClass {
    @Test()
    public void createCustomer(){
        Reporter.log("createCustomer",true);
        Assert.fail();
    }
    @Test
    public void modifyCustomer(){
        Reporter.log("modifyCustomer",true);
    }
    @Test
    public void deleteCustomer(){
        Reporter.log("deleteCustomer",true);
    }

}

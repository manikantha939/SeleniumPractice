
package Handelling_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTest {
    @Test(groups = {"smoke"})
    public void testMethod1(){
        Reporter.log("testMethod 1 in smoke group", true);
    }

    @Test(groups = {"smoke","regression"})
    public void testMethod2(){
        Reporter.log("testMethod 2 in smoke and regression group", true);
    }
    @Test(groups = {"regression"})
    public void testMethod3(){
        Reporter.log("testMethod 3 in regression group", true);
    }
    @Test(groups = {"regression","functional"})
    public void testMethod4(){
        Reporter.log("testMethod 4 in regression and functional group", true);
    }
}
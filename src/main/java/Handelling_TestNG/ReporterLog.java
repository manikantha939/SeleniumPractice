package Handelling_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class ReporterLog {
    @Test
    public void testA(){
        Reporter.log("Hello World");//It will print only inside the HTMl report
        Reporter.log("Hello World", false);
    }
    @Test
    public void testB(){
        Reporter.log("Bye World", true); //It will print both in HTMl report and console
    }

    @Test
    public void testC(){
        System.out.println("Hi World");//It will print only on the console
    }
}
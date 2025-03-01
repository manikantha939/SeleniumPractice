package Handelling_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
    public WebDriver driver;

    @Parameters("BROWSER")
    @Test
    public void launchGoogleTest(String BROWSER){
        if(BROWSER.equals("chrome")){
            driver=new ChromeDriver();
        } else if (BROWSER.equals("firefox")) {
            driver=new FirefoxDriver();
        } else if (BROWSER.equals("edge")) {
            driver=new EdgeDriver();
        }else {
            System.out.println("Please select proper browser");
        }
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Parameters("BROWSER")
    @Test
    public void launchMyntraTest(String BROWSER){
        if(BROWSER.equals("chrome")){
            driver=new ChromeDriver();
        } else if (BROWSER.equals("firefox")) {
            driver=new FirefoxDriver();
        } else if (BROWSER.equals("edge")) {
            driver=new EdgeDriver();
        }else {
            System.out.println("Please select proper browser");
        }
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Parameters("BROWSER")
    @Test
    public void launchAmazonTest(String BROWSER){
        if(BROWSER.equals("chrome")){
            driver=new ChromeDriver();
        } else if (BROWSER.equals("firefox")) {
            driver=new FirefoxDriver();
        } else if (BROWSER.equals("edge")) {
            driver=new EdgeDriver();
        }else {
            System.out.println("Please select proper browser");
        }
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Parameters("BROWSER")
    @Test
    public void launchFlipkartTest(String BROWSER){
        if(BROWSER.equals("chrome")){
            driver=new ChromeDriver();
        } else if (BROWSER.equals("firefox")) {
            driver=new FirefoxDriver();
        } else if (BROWSER.equals("edge")) {
            driver=new EdgeDriver();
        }else {
            System.out.println("Please select proper browser");
        }
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

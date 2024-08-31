package Handling_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");


//        //https://www.softwaretestingmaterial.com/javascriptexecutor-selenium-webdriver/


        JavascriptExecutor jse = (JavascriptExecutor)driver;

//        jse.executeScript("document.getElementById('input-email').setAttribute('value','ravi.kiran1@gmail.com')");
//        jse.executeScript("document.getElementById('input-password').setAttribute('value','rkiran')");
//        jse.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@value='Login']")));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('hello world')");
    }
}

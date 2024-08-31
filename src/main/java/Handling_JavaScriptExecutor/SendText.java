package Handling_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        Thread.sleep(2000);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("document.getElementsByName('q')[0].value='hello'");
//        js.executeScript("document.getElementById('APjFqb').value='Olympics'");
        js.executeScript("alert('hello world')");
    }
}

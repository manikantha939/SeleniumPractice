package Handling_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReloadThePage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        JavascriptExecutor js= (JavascriptExecutor) driver;Thread.sleep(2000);
        js.executeScript("location.reload()");
    }
}

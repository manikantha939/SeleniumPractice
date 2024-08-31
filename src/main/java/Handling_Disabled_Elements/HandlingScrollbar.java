package Handling_Disabled_Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingScrollbar {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.bbc.com/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0,2000)");Thread.sleep(5000);
//        js.executeScript("window.scrollBy(0,3000)");

//        js.executeScript("window.scrollBy(0,3000)");Thread.sleep(5000);
//        js.executeScript("window.scrollTo(0,2000)");//it will not do any scroll

        js.executeScript("window.scrollBy(0,3000)");Thread.sleep(5000);
        js.executeScript("window.scrollTo(0,-2000)");//it will scroll to intial position
    }
}

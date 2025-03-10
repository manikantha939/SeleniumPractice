package Handling_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClickAnElementUsingJavascriptExecutor {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.google.com/");
        WebElement imageEle = driver.findElement(By.xpath("//a[text()='Images']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",imageEle);
    }
}

package Handling_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getURL {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        String url = (String) js.executeScript("return document.URL");
        System.out.println(url);
    }
}

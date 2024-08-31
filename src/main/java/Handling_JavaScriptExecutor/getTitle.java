package Handling_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        String title =js.executeScript("return document.title").toString();
        System.out.println(title);
    }
}

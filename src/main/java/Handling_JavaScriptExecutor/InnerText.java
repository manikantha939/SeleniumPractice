package Handling_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String sText =  js.executeScript("return document.documentElement.innerText;").toString();
        System.out.println(sText);
    }
}

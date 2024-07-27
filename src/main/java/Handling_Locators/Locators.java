package Handling_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("file:///C:/Users/user1/Desktop/amazon.html");

//		driver.findElement(By.tagName("a")).click();
//		driver.navigate().back();
//		driver.findElement(By.id("sample")).click();
//		driver.navigate().back();
//		driver.findElement(By.name("hello1")).click();
//		driver.navigate().back();
//		driver.findElement(By.className("navigation")).click();
//		driver.navigate().back();
        driver.findElement(By.linkText("Amazon")).click();
//		driver.navigate().back();
//		driver.findElement(By.partialLinkText("flipkart")).click();

    }
}

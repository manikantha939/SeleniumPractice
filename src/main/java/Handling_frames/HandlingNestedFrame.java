package Handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingNestedFrame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("D:\\Projects\\SeleniumPractice\\testData\\nestedIframe\\T1.html");
        driver.findElement(By.id("t1")).sendKeys("1");
        driver.switchTo().frame(0);
        driver.findElement(By.id("t2")).sendKeys("2");
        driver.switchTo().frame("f2");
        driver.findElement(By.id("t3")).sendKeys("3");
        driver.switchTo().parentFrame();
        driver.findElement(By.id("t2")).sendKeys("4");
        driver.switchTo().frame(driver.findElement(By.id("f2")));
        driver.findElement(By.id("t3")).sendKeys("5");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t1")).sendKeys("6");


        //usage
//		driver.switchTo().frame(0).switchTo().frame(0);
//		driver.findElement(By.id("t3")).sendKeys("3");
//
//		driver.switchTo().parentFrame().switchTo().parentFrame();
//		driver.findElement(By.id("t1")).sendKeys("1");

    }
}

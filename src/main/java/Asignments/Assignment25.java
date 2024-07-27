package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment25 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.linkText("Iframe with in an Iframe")).click();

        //approach 1
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello world");

        //approach 2
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"))).switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"))).findElement(By.xpath("//input[@type='text']")).sendKeys("Hello world");
    }
}

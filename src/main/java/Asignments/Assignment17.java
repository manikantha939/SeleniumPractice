package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

public class Assignment17 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://pib.gov.in/indexd.aspx");
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//a[text()='Ministry of Defence']")).click();
        driver.switchTo().alert().accept();
        System.out.println(driver.getTitle());
    }
}

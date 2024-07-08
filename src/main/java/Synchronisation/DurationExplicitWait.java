package Synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DurationExplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://online.actitime.com/fireflink3/login.do");
        driver.findElement(By.id("username")).sendKeys("manikantha.a@fireflink.com");
        driver.findElement(By.name("pwd")).sendKeys("Password@123"+ Keys.ENTER);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleContains("Enter"));
//        wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
        String title = driver.getTitle();
        System.out.println(title);
    }
}

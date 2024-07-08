package Synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DurationImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://online.actitime.com/fireflink3/login.do");
        driver.findElement(By.id("username")).sendKeys("manikantha.a@fireflink.com");
        driver.findElement(By.name("pwd")).sendKeys("Password@123"+ Keys.ENTER);
//        driver.findElement(By.partialLinkText("Login")).click();
        driver.findElement(By.id("logoutLink")).click();
    }
}

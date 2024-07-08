package Handling_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class UsageOfSelect1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();

        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        Select s1=new Select(day);
        Select s2=new Select(month);
        Select s3=new Select(year);
        s1.selectByIndex(5);
        s2.selectByValue("6");
        s3.selectByVisibleText("1997");
        driver.quit();
    }
}
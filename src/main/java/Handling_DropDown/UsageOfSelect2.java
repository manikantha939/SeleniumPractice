package Handling_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class UsageOfSelect2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();

        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        Select s=new Select(month);Thread.sleep(2000);
        s.selectByIndex(2);Thread.sleep(2000);
        s.selectByValue("6");Thread.sleep(2000);
        s.selectByVisibleText("Aug");Thread.sleep(2000);
        driver.quit();
    }
}
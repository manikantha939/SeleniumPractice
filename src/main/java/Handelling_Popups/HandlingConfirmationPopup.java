package Handelling_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingConfirmationPopup {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demo.automationtesting.in/Alerts.html");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.findElement(By.linkText("Alert with OK & Cancel")).click();

        driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
        driver.switchTo().alert().accept();
        String text = driver.findElement(By.id("demo")).getText();
        System.out.println(text);
        driver.close();
    }
}

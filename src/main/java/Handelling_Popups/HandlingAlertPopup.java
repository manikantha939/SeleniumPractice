package Handelling_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingAlertPopup {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
        String alertPopupText = driver.switchTo().alert().getText();
        System.out.println(alertPopupText);
        driver.switchTo().alert().accept();
        driver.close();
    }
}

package Handelling_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandlingChildWindowPopup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://secure.indeed.com/");
        driver.findElement(By.id("login-google-button")).click();
        driver.findElement(By.id("apple-signin-button")).click();
        Set<String> allWid = driver.getWindowHandles();
        for (String wid: allWid) {
            driver.switchTo().window(wid);
            System.out.println(driver.getTitle());
            Thread.sleep(2000);
            driver.close();
        }
    }
}

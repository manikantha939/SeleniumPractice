package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Assignment14 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://secure.indeed.com/");
        String parentWindowTitle = driver.getTitle();
        driver.findElement(By.id("login-google-button")).click();
        driver.findElement(By.id("apple-signin-button")).click();
        Set<String> allWid = driver.getWindowHandles();
        for (String wid : allWid) {
            driver.switchTo().window(wid);
            String windowTitle = driver.getTitle();
            if (!windowTitle.equals(parentWindowTitle)) {
                System.out.println("child browser " + windowTitle + "is Closed");
                driver.close();
            }
        }
    }
}

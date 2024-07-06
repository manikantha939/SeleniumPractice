package methods_of_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DurationThread {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://online.actitime.com/fireflink3/login.do");
        driver.findElement(By.id("username")).sendKeys("manikantha.a@fireflink.com");
        driver.findElement(By.name("pwd")).sendKeys("Password@123");
        driver.findElement(By.partialLinkText("Login")).click();
//        Thread.sleep(2000);
        try {
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.id("logoutLink")).click();
    }

}

package methods_of_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duration {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/fireflink3/login.do");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("manikantha.a@fireflink.com");
        driver.findElement(By.name("pwd")).sendKeys("Password@123"+ Keys.ENTER);
//        driver.findElement(By.partialLinkText("Login")).click();
        driver.findElement(By.id("logoutLink")).click();
    }
}

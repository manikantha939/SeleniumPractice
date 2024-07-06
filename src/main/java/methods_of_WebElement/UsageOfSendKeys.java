package methods_of_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("virat@gmail.com");
        email.sendKeys(Keys.CONTROL+"AC");
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys(Keys.CONTROL+"V");
    }
}

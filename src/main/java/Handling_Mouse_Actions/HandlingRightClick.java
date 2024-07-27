package Handling_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class HandlingRightClick {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.instagram.com");
        WebElement link = driver.findElement(By.linkText("Forgot password?"));
        Actions actions=new Actions(driver);
        actions.contextClick(link).perform();Thread.sleep(2000);
        Robot r=new Robot();Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_T);
        driver.quit();

        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
    }
}

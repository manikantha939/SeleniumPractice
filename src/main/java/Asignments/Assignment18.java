package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class Assignment18 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max" + Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 15 Pro Max')])[3]")).click();
//		driver.findElement(By.partialLinkText("Apple iPhone 15 Pro Max")).click();
        Set<String> allWid = driver.getWindowHandles();
        for (String wid : allWid) {
            driver.switchTo().window(wid);
            System.out.println(driver.getTitle());
        }
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(By.id("add-to-cart-button"))).perform();
        Thread.sleep(5000);
        driver.findElement(By.id("add-to-cart-button")).click();
    }
}

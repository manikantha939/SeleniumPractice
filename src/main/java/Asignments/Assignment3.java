package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Qspiders" + Keys.ENTER);
        List<WebElement> allLinkTag = driver.findElements(By.tagName("a"));
        for (WebElement link : allLinkTag) {
            System.out.println(link.getAttribute("href"));
            System.out.println("-----------------------------------------------");
        }

    }
}

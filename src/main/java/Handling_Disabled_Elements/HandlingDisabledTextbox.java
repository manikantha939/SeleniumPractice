package Handling_Disabled_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingDisabledTextbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("file:///D:/Projects/SeleniumPractice/testData/HandlingDisabledElements/JavascriptExecute1.html");
        WebElement t1 = driver.findElement(By.id("t1"));
        WebElement t2 = driver.findElement(By.id("t2"));
        boolean res = t1.isEnabled();
        boolean res2 = t2.isEnabled();
        System.out.println(res);
        System.out.println(res2);
        t1.sendKeys("virat");
        JavascriptExecutor js= (JavascriptExecutor) driver;Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').value='sachin'");Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').value=''");Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').click()");
    }
}

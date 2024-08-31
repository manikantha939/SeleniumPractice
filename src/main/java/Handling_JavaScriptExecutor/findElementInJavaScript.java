package Handling_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class findElementInJavaScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://online.actitime.com/fireflink3/login.do");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        //click onElement using argument
        int count=0;
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        for (int i=0;i<elements.size();i++){
            String text = (String) js.executeScript("return arguments[0].innerText",elements.get(i));
            System.out.println(text);
            count++;
        }
        System.out.println(count);
    }
}

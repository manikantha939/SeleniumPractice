package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Assignment23 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.myntra.com/");
        Actions actions=new Actions(driver);
        List<WebElement> allEle = driver.findElements(By.xpath("//div[@class='desktop-navContent']"));
        for (WebElement ele:allEle) {
           actions.moveToElement(ele).pause(2000).perform();
        }
        driver.close();
    }
}

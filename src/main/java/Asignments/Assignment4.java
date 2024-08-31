package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        WebElement searchTbx = driver.findElement(By.name("q"));
        searchTbx.click();
        searchTbx.sendKeys("iphone 14 pro max");
        Thread.sleep(2000);
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'iphone 15')]/.."));
        for (WebElement ele : elements) {
            System.out.println(ele.getText());
        }
    }
}

package Handling_Disabled_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingScrollbarParticularElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.bbc.com/");
        WebElement culture = driver.findElement(By.xpath("//h2[text()='Culture']"));
        int yAxis = culture.getLocation().getY();
        Actions actions=new Actions(driver);
        actions.moveToElement(culture).perform();

//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0,"+yAxis+")");

    }
}

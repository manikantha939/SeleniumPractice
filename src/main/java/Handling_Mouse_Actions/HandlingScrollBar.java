package Handling_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.accessibility.AccessibleTable;
import java.time.Duration;

public class HandlingScrollBar {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com/");
        WebElement link = driver.findElement(By.linkText("Sign Up"));
        Actions actions=new Actions(driver);
        //scrollByAmount(x,y) will scroll the webPage based on the mentioned pixels
//        actions.scrollByAmount(0,200).perform();
        //scrollToElement(ele) will scroll the webpage until webElement is visible
        actions.scrollToElement(link).perform();
    }
}

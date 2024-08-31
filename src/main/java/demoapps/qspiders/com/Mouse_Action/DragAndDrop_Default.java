package demoapps.qspiders.com.Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop_Default {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
        WebElement dragMe = driver.findElement(By.xpath("//div[text()='Drag Me']"));
        Actions actions = new Actions(driver);
//        actions.dragAndDropBy(dragMe, 50,80).perform();
        actions.moveByOffset(50, 80).perform();
        driver.close();
    }
}

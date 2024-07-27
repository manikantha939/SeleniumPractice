package demoapps.qspiders.com.Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class DragAndDrop_DragMultiple {
    public static void main(String[] args) throws AWTException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");

        WebElement laptopCharger = driver.findElement(By.id("dragElement1"));
        WebElement mobileCover = driver.findElement(By.id("dragElement2"));
        WebElement laptopCover = driver.findElement(By.id("dragElement3"));
        WebElement mobileCharger = driver.findElement(By.id("dragElement4"));
        WebElement mobileAccessories = driver.findElement(By.id("dropZone1"));
        WebElement laptopAccessories = driver.findElement(By.id("dropZone2"));

        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        Actions actions=new Actions(driver);
        actions.moveToElement(laptopCharger).click().moveToElement(laptopCover).click()
                .clickAndHold().pause(2000).dragAndDrop(laptopCover,laptopAccessories).release(laptopAccessories).build().perform();
        actions.moveToElement(mobileCover).click().moveToElement(mobileCharger).click()
                .clickAndHold().pause(2000).dragAndDrop(mobileCharger,mobileAccessories).release().build().perform();
        r.keyRelease(KeyEvent.VK_CONTROL);
    }
}

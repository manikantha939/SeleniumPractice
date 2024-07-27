package demoapps.qspiders.com.Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHover_icon {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
        WebElement input = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
        input.sendKeys("abc");
        WebElement infoEle = driver.findElement(By.xpath("//img[contains(@src,'message-hint')]"));
        Actions actions=new Actions(driver);

        WebElement hide = driver.findElement(By.xpath("//img[contains(@src, '/assets/hide')]"));
        actions.click(hide).perform();
        actions.moveToElement(infoEle).perform();

        WebElement element = driver.findElement(By.xpath("//h1[text()='Password : ']/../..//ul"));
        System.out.println(element.getText());
    }
}

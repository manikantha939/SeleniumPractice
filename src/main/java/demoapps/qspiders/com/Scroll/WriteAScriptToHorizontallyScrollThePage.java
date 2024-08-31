package demoapps.qspiders.com.Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WriteAScriptToHorizontallyScrollThePage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
//        driver.findElement(By.linkText("Horizontal")).click();
//        driver.findElement(By.linkText("Open In New Tab")).click();
//        Set<String> allWid = driver.getWindowHandles();
//        for (String wid: allWid) {
//            driver.switchTo().window(wid);
//        }
//        Actions actions=new Actions(driver);
//        String currentUrl = driver.getCurrentUrl();
//        wait.until(ExpectedConditions.urlContains(currentUrl));
//        while(true) {
//            actions.scrollByAmount(400, 0).perform();
//        }

        //Within the frame
        driver.findElement(By.xpath("//section[text()='Within The Frame']")).click();
        driver.findElement(By.xpath("//section[text()='Within The Frame']/../..//a[text()='Horizontal']")).click();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
//        driver.switchTo().frame(driver.findElement(By.tagName("//iframe")));
        Thread.sleep(2000);
//        Actions actions=new Actions(driver);
        while (true) {
//            actions.scrollByAmount(50, 0).perform();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(200,0)");
        }
    }
}

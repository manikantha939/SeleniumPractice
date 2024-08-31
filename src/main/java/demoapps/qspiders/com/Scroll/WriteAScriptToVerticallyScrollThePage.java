package demoapps.qspiders.com.Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WriteAScriptToVerticallyScrollThePage {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
        //New Tab
        //Vertical scroll
        driver.findElement(By.linkText("Vertical")).click();
        //Infinte scroll
//        driver.findElement(By.linkText("Infinite")).click();
        driver.findElement(By.linkText("Open In New Tab")).click();
        Set<String> allWid = driver.getWindowHandles();
        for (String wid : allWid) {
            driver.switchTo().window(wid);
        }
        Actions a = new Actions(driver);
        String title = driver.getTitle();
        wait.until(ExpectedConditions.titleIs(title));
        //Vertical scroll
        WebElement element = driver.findElement(By.tagName("span"));

//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,200)");

        a.scrollToElement(element).perform();

//        while (true) {
//            a.scrollByAmount(0, 20).build().perform();
//        }


        //Within the frame
        /*driver.findElement(By.xpath("//section[text()='Within The Frame']")).click();
        driver.findElement(By.xpath("//section[text()='Within The Frame']/../..//a[text()='Vertical']")).click();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        List<WebElement> h1 = driver.findElements(By.tagName("h1"));
        for (WebElement ele : h1) {
            System.out.println(ele.getText());
        }
        Actions actions = new Actions(driver);
//        WebElement element = driver.findElement(By.tagName("span"));
//        actions.scrollToElement(element).perform();
        actions.scrollByAmount(0, 30).build().perform();*/
//        while (true) {
//            System.out.println("hello");
//            actions.scrollToElement(element).perform();
//            actions.scrollByAmount(0, 200).perform();
//        }


//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);" driver.findElement(By.tagName("iframe")))

    }


}

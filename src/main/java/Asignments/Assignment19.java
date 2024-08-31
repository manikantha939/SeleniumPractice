package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Assignment19 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
        driver.findElement(By.id("browserButton2")).click();
        Set<String> allWid = driver.getWindowHandles();
//        for (String wid : allWid) {
//            driver.switchTo().window(wid);
//            String url = driver.getCurrentUrl();
//            if(url.equals("https://demoapps.qspiders.com/ui/browser/SignUpPage")){
//                driver.findElement(By.id("confirm-password")).sendKeys("123");
//                break;
//            }
//        }

        Iterator<String> i = allWid.iterator();
        while (i.hasNext()) {
            String wid = i.next();
            driver.switchTo().window(wid);
            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.equals("https://demoapps.qspiders.com/ui/browser/SignUpPage")) {
                driver.findElement(By.id("confirm-password")).sendKeys("123");
                break;
            }
        }
        driver.quit();
    }
}

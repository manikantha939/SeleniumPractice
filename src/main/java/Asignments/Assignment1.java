package Asignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Dimension dimension = new Dimension(555, 333);Thread.sleep(2000);
        driver.manage().window().setSize(dimension);
        driver.get("https://www.facebook.com/");Thread.sleep(2000);
        driver.navigate().to("https://www.instagram.com/");Thread.sleep(2000);
        driver.navigate().back();Thread.sleep(2000);
        driver.navigate().forward();Thread.sleep(2000);
        driver.navigate().refresh();Thread.sleep(2000);
        String title = driver.getTitle();Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();Thread.sleep(2000);
        driver.manage().deleteAllCookies();Thread.sleep(2000);
        driver.manage().window().minimize();Thread.sleep(2000);
        driver.quit();
    }
}

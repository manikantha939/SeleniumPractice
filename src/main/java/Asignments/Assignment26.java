package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Assignment26 {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        //approach 1
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.get("https://www.hdfcbank.com/");
//        WebElement Login = driver.findElement(By.xpath("//button[text()='Login']"));
//        Actions actions=new Actions(driver);
//        actions.moveToElement(Login).perform();
//        driver.findElement(By.linkText("NetBanking")).click();
//        Set<String> allWid;
//        allWid= driver.getWindowHandles();
//        for (String wid:allWid) {
//            driver.switchTo().window(wid);
//        }
//        driver.switchTo().frame(0);
//        driver.findElement(By.partialLinkText("Know")).click();
//        allWid= driver.getWindowHandles();
//        for (String wid:allWid) {
//            driver.switchTo().window(wid);
//        }
//        List<WebElement> allLanguanges = driver.findElements(By.xpath("//p[contains(text(),'preferred language')]/a"));
//        for (WebElement ele: allLanguanges) {
//            System.out.println(ele.getText());
//        }


        //approach 2
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.hdfcbank.com/");
        WebElement Login = driver.findElement(By.xpath("//button[text()='Login']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(Login).perform();
        driver.findElement(By.linkText("NetBanking")).click();
        switchToNewWindow();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        driver.findElement(By.partialLinkText("Know")).click();
        switchToNewWindow();
        List<WebElement> allLanguanges = driver.findElements(By.xpath("//p[contains(text(),'preferred language')]/a"));
        for (WebElement ele : allLanguanges) {
            System.out.println(ele.getText());
        }
    }

    public static void switchToNewWindow() {
        Set<String> allWid = driver.getWindowHandles();
        for (String wid : allWid) {
                driver.switchTo().window(wid);
                System.out.println(driver.getCurrentUrl());
            }
        }
}

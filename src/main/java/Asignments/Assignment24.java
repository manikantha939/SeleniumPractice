package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assignment24 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Admin@1234");
        driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
        driver.findElement(By.id("submitButton")).click();
        driver.switchTo().parentFrame();

        By signupMessage = By.xpath("//div[text()='Sign up successful!']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(signupMessage));
        System.out.println(driver.findElement(signupMessage).getText());

        driver.switchTo().frame(1);
        driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
        driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
        driver.findElement(By.id("submitButton")).click();
        driver.switchTo().parentFrame();

        By loginMessage = By.xpath("//div[text()='Login successful!']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginMessage));
        System.out.println(driver.findElement(loginMessage).getText());
    }
}

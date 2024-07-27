package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Assignment13 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
        driver.findElement(By.id("policynumber")).sendKeys("123");
        driver.findElement(By.id("dob")).click();

        WebElement month = driver.findElement(By.className("ui-datepicker-month"));
        Select s1 = new Select(month);
        s1.selectByVisibleText("Jun");

        WebElement year = driver.findElement(By.className("ui-datepicker-year"));
        Select s2 = new Select(year);
        s2.selectByValue("1997");

        driver.findElement(By.xpath("//a[text()='6']")).click();

        driver.findElement(By.id("alternative_number")).sendKeys("9999999999");

        driver.findElement(By.id("renew_policy_submit")).click();

        WebElement policynumberError = driver.findElement(By.id("policynumberError"));
        if (policynumberError.isDisplayed()) {
            System.out.println(policynumberError.getText());
        } else {
            System.out.println("Policy number is valid");
        }
        driver.quit();
    }
}

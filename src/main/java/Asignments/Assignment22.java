package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Assignment22 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.vtiger.com/");
		WebElement company = driver.findElement(By.linkText("Company"));
		Actions actions=new Actions(driver);
		actions.moveToElement(company).perform();
		driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(2000);
		WebElement login = driver.findElement(By.id("loginspan"));
		actions.doubleClick(login).perform();
        boolean displayed = driver.findElement(By.xpath("//button[text()='Sign in']")).isDisplayed();
        System.out.println(displayed);
        String title = driver.getTitle();
        if (title.contains("Login")){
            System.out.println(title+" page is displayed");
        }else {
            System.out.println("Login page is not displayed");
        }
		driver.quit();
	}
}

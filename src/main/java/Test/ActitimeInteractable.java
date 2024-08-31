package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActitimeInteractable {
	public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--headless");

		WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
        Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Clients']")).click();
//
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		WebElement element = driver.findElement(By.xpath("//span[text()='Clients']/following-sibling::div[@class='header-submenu']/descendant::div[text()='Design']"));
//		js.executeScript("arguments[0].click();",element);


//		driver.findElement(By.xpath("//span[text()='Clients']/following-sibling::div[@class='header-submenu']/descendant::div[text()='Design']")).click();
//		Thread.sleep(10000);
//		if(driver.getCurrentUrl().contains("designers"))
//		{
//            driver.quit();
//		}


        Actions actions=new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//a[text()='Men']"));
        actions.moveToElement(element).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Topwear']/parent::li/following-sibling::li/a[text()='T-Shirts']")).click();
    }
}

package Handling_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingMouseHover {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.vtiger.com/");
		WebElement company = driver.findElement(By.linkText("Company"));
		Actions actions=new Actions(driver);
		actions.moveToElement(company).perform();
		driver.findElement(By.linkText("Contact Us")).click();
		String contact = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println(contact);
		driver.quit();
	}
}

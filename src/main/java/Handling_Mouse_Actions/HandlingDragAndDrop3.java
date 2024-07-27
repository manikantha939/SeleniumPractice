package Handling_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingDragAndDrop3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
        WebElement drag = driver.findElement(By.xpath("//div[text()='Drag Me']"));

        WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
        WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
        WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
        WebElement laptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
    }
}

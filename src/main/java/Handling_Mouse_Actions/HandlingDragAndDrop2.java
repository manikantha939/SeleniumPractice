package Handling_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingDragAndDrop2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
        WebElement drag = driver.findElement(By.xpath("//div[text()='Drag Me']"));
        int x = drag.getLocation().getX();
        System.out.println(x);
        int y = drag.getLocation().getY();
        System.out.println(y);
        Actions actions=new Actions(driver);
        Thread.sleep(2000);
        actions.clickAndHold(drag).moveByOffset(100,50).release().build().perform();
//        actions.dragAndDropBy(drag,200,200).perform();
    }
}

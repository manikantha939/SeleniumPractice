package Handling_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingDragAndDrop1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
        WebElement drag1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
        WebElement drag2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
        WebElement drag3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
        WebElement drop = driver.findElement(By.id("column-3"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(drag1,drop).perform();
        Thread.sleep(2000);
        //whenever we perform composite actions we can make use od build() which returns Action type object
        actions.clickAndHold(drag2).pause(2000).moveToElement(drop).release().build().perform();
        Thread.sleep(2000);
        actions.clickAndHold(drag3).pause(2000).release(drop).build().perform();

        driver.quit();
    }
}

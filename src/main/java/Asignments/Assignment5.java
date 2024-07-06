package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement searchTbx = driver.findElement(By.name("q"));
		searchTbx.click();
		searchTbx.sendKeys("iphone 14 pro max"+ Keys.ENTER);
        String mName = null;
		List<WebElement> listOfNames = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 14 Pro Max')]"));
        List<WebElement> listOfPrice = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
//        System.out.println(listOfPrice.size());
//        System.out.println(listOfNames.size());
        for(int i=0;i<listOfNames.size();i++){
            System.out.println("Mobile Name: "+listOfNames.get(i).getText()+",       Price: "+listOfPrice.get(i).getText());
        }

    }
}

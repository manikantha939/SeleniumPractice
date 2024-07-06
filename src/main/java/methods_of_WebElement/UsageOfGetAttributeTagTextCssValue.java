package methods_of_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttributeTagTextCssValue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement button = driver.findElement(By.tagName("button"));
		//getAttribute
		String type = button.getAttribute("type");
		System.out.println("Attribute of type is: "+ type);
		//getTagName
		String tagName = button.getTagName();
		System.out.println("Tage name is: "+tagName);
		//getText
		String text = button.getText();
		System.out.println("Text is: "+text);
		String cssValue = button.getCssValue("background-color");
		System.out.println("CssValue of background-color is: "+cssValue);
        driver.close();
	}
}

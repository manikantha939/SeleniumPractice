package methods_of_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayed {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        boolean res= driver.findElement(By.linkText("Create a Page")).isDisplayed();
        if (res){
            System.out.println("Pass: It is displayed");
        }else {
            System.out.println("Fail: It is not displayed");
        }
    }
}

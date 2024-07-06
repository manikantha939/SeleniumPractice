package methods_of_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement login= driver.findElement(By.tagName("button"));
        boolean res = login.isEnabled();
        if (res==true){
            System.out.println("Pass: button is enabled");
        }else {
            System.out.println("Fail: button is not enabled");
        }
    }
}

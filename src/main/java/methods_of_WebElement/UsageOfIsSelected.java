package methods_of_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
        driver.findElement(By.xpath("//label[@for='filled-in-box']")).click();
        WebElement checkbox = driver.findElement(By.id("filled-in-box"));
        boolean res = checkbox.isSelected();
        if (!res){
            System.out.println("Fail: Checkbox is not selected");
        }else {
            System.out.println("Pass: Checkbox is selected");
        }
    }
}

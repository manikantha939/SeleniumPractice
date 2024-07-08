package Handling_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class IsMultiple {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        driver.get("file:///D:/Projects/SeleniumPractice/testData/multiSelectDropdown.html");

        driver.get("https://facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();

        WebElement ele = driver.findElement(By.id("month"));//month or mtr
        Select s=new Select(ele);
        if (s.isMultiple()){
            System.out.println("Multiple select dropdown");
        }else {
            System.out.println("Is not a multiple select dropdown");
        }
    }
}

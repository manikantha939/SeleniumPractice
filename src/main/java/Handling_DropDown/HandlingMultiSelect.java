package Handling_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HandlingMultiSelect {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("file:///D:/Projects/SeleniumPractice/testData/multiSelectDropdown.html");
        WebElement mtr = driver.findElement(By.id("mtr"));
        Select select=new Select(mtr);
        select.selectByIndex(0);
        select.selectByValue("2");
        select.selectByVisibleText("Dosa");
        select.deselectByIndex(2);
        select.deselectByVisibleText("Bisibelebath");
        select.deselectByValue("1");
        select.deselectAll();
    }
}

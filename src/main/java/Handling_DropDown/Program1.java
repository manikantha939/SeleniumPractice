package Handling_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

/*
Write a script to select all the option in the dropdown and deselect them in descending order
 */

public class Program1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("file:///D:/Projects/SeleniumPractice/testData/multiSelectDropdown.html");
        WebElement mtr = driver.findElement(By.id("mtr"));
        Select s=new Select(mtr);
        List<WebElement> options = s.getOptions();
        int count = options.size();
        for (WebElement ele: options) {
            s.selectByVisibleText(ele.getText());
        }
        for (int i=count-1;i>=0;i--){
            s.deselectByIndex(i);
        }
//        for (WebElement ele: options) {
//            s.deselectByValue(ele.getAttribute("value"));
//        }
//        for (WebElement ele: options) {
//            s.deselectByVisibleText(ele.getText());
//        }
    }
}

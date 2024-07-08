package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.*;

public class Assignment8 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("file:///D:/Projects/SeleniumPractice/testData/multiSelectDropdown.html");

        WebElement mtr = driver.findElement(By.id("mtr"));
        Select s=new Select(mtr);

        List<WebElement> options = s.getOptions();
        List<String> optionText = new ArrayList<>();

        for (WebElement opt:options) {
            optionText.add(opt.getText());
        }
        System.out.println("Options before sorting");
        for (String text:optionText) {
            System.out.println(text);
        }

        Collections.sort(optionText);

        System.out.println("------------------");

        for (String text: optionText) {
            System.out.println(text);
        }
        driver.quit();
    }
}

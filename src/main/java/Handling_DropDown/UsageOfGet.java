package Handling_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class UsageOfGet {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("file:///D:/Projects/SeleniumPractice/testData/multiSelectDropdown.html");
        WebElement mtr = driver.findElement(By.id("mtr"));
        Select s = new Select(mtr);
        //GetFirstSelectedOption
        System.out.println("getFirstSelectedOption(): ");
        s.selectByValue("3");
        s.selectByVisibleText("Bisibelebath");
        System.out.println(s.getFirstSelectedOption().getText());

        System.out.println("----------------------------------");

        //getAllSelectEdOptions
        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
        for (WebElement ele :
                allSelectedOptions) {
            System.out.println(ele.getText());
        }

        System.out.println("----------------------------------");

        //getOptions
        List<WebElement> options = s.getOptions();
        for (WebElement ele : options) {
            System.out.println(ele.getText());
        }

        System.out.println("----------------------------------");

        //getWrappedElements
        WebElement wrappedElement = s.getWrappedElement();
        System.out.println(wrappedElement.getText());
    }
}

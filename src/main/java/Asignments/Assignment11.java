package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Assignment11 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("file:///D:/Projects/SeleniumPractice/testData/multiSelectDropdown.html");

        WebElement mtr = driver.findElement(By.id("mtr"));
        Select s=new Select(mtr);

        List<WebElement> options = s.getOptions();
        HashSet<String> uniqueOption = new HashSet<>();
        HashSet<String> duplicateOption = new HashSet<>();

//        for (WebElement ele:options) {
//            String text = ele.getText();
//            if (!uniqueOption.add(text)) {
//                duplicateOption.add(text);
//            }
//        }
//
//        System.out.print("duplicate options are: ");
//
//        for (String text: duplicateOption) {
//            System.out.print(text);
//        }

		//approach  2
        for (WebElement ele:options) {
            String text = ele.getText();
            if (uniqueOption.contains(text)){
                System.out.println(text);
            }else {
                uniqueOption.add(text);
            }

        }
        driver.quit();
    }
}

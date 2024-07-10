package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("file:///D:/Projects/SeleniumPractice/testData/multiSelectDropdown.html");

        WebElement mtr = driver.findElement(By.id("mtr"));
        Select s=new Select(mtr);
        List<WebElement> options = s.getOptions();
        HashSet<String> option = new HashSet<>();
        for (WebElement ele:options) {
            String text = ele.getText();
            option.add(text);
        }

        for (String dishName:option) {
            System.out.println(dishName);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("Please mention the dish: ");
        String dish = scanner.next();
        if(option.equals(dish)){
            System.out.println(dish+" Dish is present");
        } else {
            System.out.println(dish+" Dish is not present");
        }
    }
}

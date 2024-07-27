package Handelling_MultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.tagName("textarea")).sendKeys("java");
        Thread.sleep(2000);
//        List<WebElement> allSugs = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
//        int size = allSugs.size();
//        System.out.println(size);
//        for (WebElement ele : allSugs) {
//            String text = ele.getText();
//            System.out.println(text);
//        }
//        allSugs.get(size-1).click();
//        driver.quit();


        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='pcTkSc']/..//div[@role='option']"));
        for (WebElement element:elements) {
            System.out.println(element.getText());

        }
    }
}

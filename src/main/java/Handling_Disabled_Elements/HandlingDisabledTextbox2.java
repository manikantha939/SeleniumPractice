package Handling_Disabled_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class HandlingDisabledTextbox2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("file:///D:/Projects/SeleniumPractice/testData/HandlingDisabledElements/JavascriptExecute2.html");
        List<WebElement> allTBs = driver.findElements(By.tagName("input"));
//        Iterator<WebElement> ele=allTBs.iterator();
//        while (ele.hasNext()){
//            WebElement next = ele.next();
//            if(next.isEnabled()){
//                next.sendKeys("Virat");
//            }else {
//                String id = next.getAttribute("id");
//                JavascriptExecutor js= (JavascriptExecutor) driver;
//                js.executeScript("document.getElementById('"+id+"').value='Sachin'");
//            }
//        }
        for (WebElement ele: allTBs) {
            boolean res=ele.isEnabled();
            if (res==true){
                ele.sendKeys("Virat");
            }else {
                String id = ele.getAttribute("id");
                JavascriptExecutor js= (JavascriptExecutor) driver;
                js.executeScript("document.getElementById('"+id+"').value='Sachin'");
            }

        }
    }
}

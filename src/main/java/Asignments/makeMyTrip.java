package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class makeMyTrip {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/railways/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='commonModal__close']")));
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        Thread.sleep(5000);

        //approach -> 1
//        List<WebElement> elements = driver.findElements(By.xpath("//p[@data-testid='train-name']"));
//        for (WebElement ele:elements) {
//            String text = ele.getText();
//            if(text.equalsIgnoreCase("Shatabdi Express")){
////                String text1 = ele.findElement(By.xpath("following-sibling::div//p[@data-testid='listing-train-number']")).getText();
//                String text1 = ele.findElement(By.xpath("../div//p[@data-testid='listing-train-number']")).getText();
//                System.out.println(text1);
//            }
//        }

        //approach -> 2
        List<WebElement> elements = driver.findElements(By.xpath("//div[@data-testid='listing-card']"));
        for (WebElement ele: elements) {
            String text=ele.findElement(By.xpath("//p[@data-testid='train-name']")).getText();
            if(text.equalsIgnoreCase("Shatabdi Express")){
                String text1 = ele.findElement(By.xpath("//p[@data-testid='listing-train-number']")).getText();
                System.out.println(text1);
            }
        }
    }
}

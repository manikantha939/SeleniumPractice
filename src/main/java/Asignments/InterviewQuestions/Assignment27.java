package Asignments.InterviewQuestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment27 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println(js.executeScript("return document.title"));
        String url = (String) js.executeScript("return document.URL");
        System.out.println(url);
    }
}

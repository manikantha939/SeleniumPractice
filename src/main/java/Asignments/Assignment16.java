package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

public class Assignment16 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the partial title");
        String expectedTitle = scan.nextLine();

        driver.get("https://secure.indeed.com/");
        driver.findElement(By.id("login-google-button")).click();
        driver.findElement(By.id("apple-signin-button")).click();
        Set<String> allWid = driver.getWindowHandles();
        for (String wid: allWid) {
            driver.switchTo().window(wid);
            String actualTitle = driver.getTitle();
            System.out.println(actualTitle);
            if(actualTitle.contains(expectedTitle)){
                driver.close();
            }

        }
    }
}

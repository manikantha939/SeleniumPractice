package Handling_DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class LoginToActitimeUsingProperty {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./Test_Data/Handling_DataDrivenTestingFile/Commondata.properties");
        Properties p=new Properties();
        p.load(fis);
        String url = p.getProperty("url");
        String username = p.getProperty("username");
        String password = p.getProperty("password");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(url);
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.name("pwd")).sendKeys(password);
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        driver.close();
    }
}

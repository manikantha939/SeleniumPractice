package methods_of_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://swiggy.com");
        //title
        String title=driver.getTitle();
        System.out.println(title);
        //geturl
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.close();
    }
}

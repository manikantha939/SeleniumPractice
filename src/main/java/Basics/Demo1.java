package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("hello");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //	d.get("https://www.facebook.com");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().to("https://www.instagram.com");
    }
}

package methods_of_WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().deleteAllCookies();

//		Options o1=driver.manage();
//		org.openqa.selenium.WebDriver.Window w1=o1.window();
//		w1.fullscreen();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.manage().window().minimize();

        //getSize()
        Dimension d2=driver.manage().window().getSize();
        System.out.println(d2);
        //getPosition()
        Point p1 = driver.manage().window().getPosition();
        System.out.println(p1);
        driver.manage().window().setPosition(new Point(11, 33));
        driver.manage().window().setSize(new Dimension(10, 50));

        driver.quit();
    }
}

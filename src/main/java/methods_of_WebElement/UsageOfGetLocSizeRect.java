package methods_of_WebElement;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocSizeRect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        WebElement firstnameTbx = driver.findElement(By.name("firstname"));
        WebElement lastnameTbx = driver.findElement(By.name("lastname"));
        Point loc = firstnameTbx.getLocation();
        int x1 = loc.getX();
        int y1 = loc.getY();
        Dimension size = firstnameTbx.getSize();
        int h1 = size.getHeight();
        int w1 = size.getWidth();

        int y2 = lastnameTbx.getLocation().getY();
        int h2 = lastnameTbx.getSize().getHeight();
        int w2 = lastnameTbx.getSize().getWidth();

        if (y1==y2 && h1==h2 && w1==w2){
            System.out.println("Pass: same size");
        }else {
            System.out.println("Fail: different Size");
        }

        Rectangle rect1 = firstnameTbx.getRect();
        System.out.println("firstnameTbx rect: "+rect1);
        Rectangle rect2 = lastnameTbx.getRect();
        System.out.println("lastnameTbx rect: "+rect2);
        driver.close();
    }
}

package methods_of_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://10.10.10.23:8080/");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);

        String expectedTitle = "Sign in [Jenkins]";
        String expectedUrl = "http://10.10.10.23:8080/login?from=%2F";

        if(title.equalsIgnoreCase(expectedTitle) && url.contains(expectedUrl)) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        driver.quit();
    }
}

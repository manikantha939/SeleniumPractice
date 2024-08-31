package Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoTaksScreenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        TakesScreenshot ts= (TakesScreenshot) driver;
//        File fin=new File("D:\\Projects\\SeleniumPractice\\src\\test\\java\\Screenshot");
//        File src = ts.getScreenshotAs(OutputType.FILE);
//        File dest=new File("./screenshots/img.png");
//        FileUtils.copyFile(src,dest);

        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File("./screenshots/img.png"));
    }
}

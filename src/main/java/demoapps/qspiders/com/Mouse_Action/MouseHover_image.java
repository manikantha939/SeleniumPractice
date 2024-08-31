package demoapps.qspiders.com.Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHover_image {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/mouseHover/mouseHoverimage?sublist=1");
        WebElement image = driver.findElement(By.xpath("//img[@alt='order placed']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(image).perform();

        String tooltip = image.getAttribute("title");
        System.out.println(tooltip);
    }
}

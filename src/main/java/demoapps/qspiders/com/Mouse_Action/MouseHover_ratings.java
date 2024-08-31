package demoapps.qspiders.com.Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.ListIterator;

public class MouseHover_ratings {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/mouseHover/rating?sublist=2");
        List<WebElement> ratings = driver.findElements(By.xpath("//h1[text()='Rate this product']/..//label"));
        Actions actions = new Actions(driver);
        ListIterator<WebElement> li = ratings.listIterator();
        while (li.hasNext()) {
            WebElement next = li.next();
            actions.moveToElement(next).click().perform();
        }
        System.out.println(driver.findElement(By.xpath("//h1[text()='Rate this product']/..//p")).getText());
    }
}

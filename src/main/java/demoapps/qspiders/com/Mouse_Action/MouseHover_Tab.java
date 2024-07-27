package demoapps.qspiders.com.Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MouseHover_Tab {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");
        List<WebElement> tabsList = driver.findElements(By.xpath("//ul[contains(@class,'flex items-center')]/li"));
        Actions actions=new Actions(driver);
        ArrayList<String > tab=new ArrayList<>();
        Iterator<WebElement> tabs=tabsList.iterator();
        while (tabs.hasNext()) {
            WebElement next = tabs.next();
            actions.moveToElement(next).pause(2000).build().perform();
            tab.add(next.getText());
        }
        for (String a:tab) {
            System.out.println(a);
            System.out.println("----------------");
        }
    }
}

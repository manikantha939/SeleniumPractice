package Asignments;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Assignment21 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://online.actitime.com/fireflink3/login.do");
        driver.findElement(By.id("username")).sendKeys("manikantha.a@fireflink.com");
        driver.findElement(By.name("pwd")).sendKeys("Password@123");
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.xpath("//div[contains(@onclick,'openHelpAndSupportMenu(event)')]")).click();
        driver.findElement(By.linkText("About your actiTIME")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Read Service Agreement")).click();
        Set<String> allwid = driver.getWindowHandles();
        for (String wid: allwid) {
            driver.switchTo().window(wid);
        }
        System.out.println(driver.getCurrentUrl());
        List<WebElement> elements = driver.findElements(By.tagName("h2"));
        ListIterator<WebElement> list=elements.listIterator(1);
        ArrayList<String> elist=new ArrayList<>();
        while (list.hasNext()){
            WebElement next = list.next();
            System.out.println(next.getText());
            elist.add(next.getText());
        }

        System.out.println("---------------------------------------------");
        ListIterator<String> elee=elist.listIterator(elist.size());
        while (elee.hasPrevious()){
            String previous = elee.previous();
            System.out.println(previous);
        }

//        ListIterator<WebElement> list=elements.listIterator();
//        while (list.hasPrevious()){
//
//            WebElement next1 = list.previous();
//            System.out.println(next1.getText());
//        }
        driver.quit();
    }
}

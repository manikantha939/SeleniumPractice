package Asignments;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;

public class Assignment20 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");

//        WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
//        WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
//        WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
//        WebElement laptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
//        WebElement mobileAccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
//        WebElement laptopAccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
//
//        Actions a=new Actions(driver);
//        a.dragAndDrop(mobileCharger,mobileAccessories).perform();
//        a.dragAndDrop(laptopCharger,laptopAccessories).perform();
//        a.dragAndDrop(mobileCover,mobileAccessories).perform();
//        a.dragAndDrop(laptopCover,laptopAccessories).perform();
//        Thread.sleep(2000);
//        String color = null;
//        ArrayList<WebElement> allElements=new ArrayList<>();
//        try{
//            WebElement mobileChargerEle = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
//            WebElement laptopChargerEle = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
//            WebElement mobileCoverEle = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
//            WebElement laptopCoverEle = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
//            allElements.add(mobileChargerEle);
//            allElements.add(laptopChargerEle);
//            allElements.add(mobileCoverEle);
//            allElements.add(laptopCoverEle);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        for (WebElement ele: allElements) {
//            color = ele.getAttribute("style");
//            if(color.contains("lightgreen")){
//                System.out.println(ele.getText()+" drag and dropped to right container");
//            }else {
//                System.out.println(ele.getText()+" drag and dropped to wrong container");
//            }
//        }




        //optimized
        By mobileCharger=By.xpath("//div[text()='Mobile Charger']");
        By laptopCharger=By.xpath("//div[text()='Laptop Charger']");
        By mobileCover=By.xpath("//div[text()='Mobile Cover']");
        By laptopCover=By.xpath("//div[text()='Laptop Cover']");
        By mobileAccessories = By.xpath("//div[text()='Mobile Accessories']");
        By laptopAccessories = By.xpath("//div[text()='Laptop Accessories']");

        Actions a=new Actions(driver);
        a.dragAndDrop(driver.findElement(mobileCharger),driver.findElement(mobileAccessories)).perform();
        a.dragAndDrop(driver.findElement(laptopCharger),driver.findElement(laptopAccessories)).perform();
        a.dragAndDrop(driver.findElement(mobileCover),driver.findElement(mobileAccessories)).perform();
        a.dragAndDrop(driver.findElement(laptopCover),driver.findElement(laptopAccessories)).perform();
        String color = null;
        ArrayList<WebElement> allElements=new ArrayList<>();
        try{
            allElements.add(driver.findElement(mobileCharger));
            allElements.add(driver.findElement(laptopCharger));
            allElements.add(driver.findElement(mobileCover));
            allElements.add(driver.findElement(laptopCover));
        }catch (StaleElementReferenceException e){
            System.out.println(e.getMessage());
        }
        for (WebElement ele: allElements) {
            color = ele.getAttribute("style");
            if(!color.contains("lightgreen"))
                System.out.println(ele.getText()+" drag and dropped to wrong container");
        }
        driver.quit();
    }
}

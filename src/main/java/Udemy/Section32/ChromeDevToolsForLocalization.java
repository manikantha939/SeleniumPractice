package Udemy.Section32;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v127.emulation.Emulation;

import java.util.Optional;

public class ChromeDevToolsForLocalization {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:\\localnode\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

//        Map<String,Object> coordinates=new HashMap<String,Object>();
//        coordinates.put("latitude",40);
//        coordinates.put("longitude",3);
//        coordinates.put("accuracy",1);
//        driver.executeCdpCommand("Emulation.setGeolocationOverride",coordinates);
//        driver.manage().window().maximize();
//        driver.get("http://google.com");
//        driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
//        driver.findElements(By.cssSelector(".yuRUbf")).get(0).click();


//        devTools.send(Emulation.setGeolocationOverride(Optional.empty(),Optional.empty(),Optional.empty()));
        devTools.send(Emulation.clearGeolocationOverride());
        Thread.sleep(2000);
        devTools.send(Emulation.setGeolocationOverride(Optional.of(40), Optional.of(3), Optional.of(1)));

//        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
    }
}

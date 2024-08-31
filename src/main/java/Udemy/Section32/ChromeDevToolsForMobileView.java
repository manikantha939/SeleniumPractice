package Udemy.Section32;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.util.HashMap;
import java.util.Map;

public class ChromeDevToolsForMobileView {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://localnode//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        //send command - approach 1
//        devTools.send(Emulation.setDeviceMetricsOverride(600,1000,50, true, Optional.empty(),
//                Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),
//                Optional.empty(),Optional.empty(),Optional.empty()));

        //executeCdpCommand - approach 2
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 600);
        deviceMetrics.put("height", 1000);
        deviceMetrics.put("deviceScaleFactor", 50);
        deviceMetrics.put("mobile", true);
        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);

        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.cssSelector(".navbar-toggler")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Library")).click();

    }
}

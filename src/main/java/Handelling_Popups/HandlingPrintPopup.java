package Handelling_Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class HandlingPrintPopup {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium.dev");

        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_CONTROL);
    }
}

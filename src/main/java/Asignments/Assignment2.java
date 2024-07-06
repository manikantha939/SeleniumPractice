package Asignments;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        WebElement emailTbx = driver.findElement(By.id("email"));
        Thread.sleep(2000);
        emailTbx.sendKeys("virat@gmail.com" + Keys.CONTROL + "AC");
        WebElement passwordTbx = driver.findElement(By.id("pass"));
        passwordTbx.sendKeys(Keys.CONTROL + "V");
        emailTbx.clear();
        passwordTbx.clear();
        int emailH1 = emailTbx.getSize().getHeight();
        int emailW1 = emailTbx.getSize().getWidth();
        int passH1 = driver.findElement(By.id("passContainer")).getSize().getHeight();
        int passW1 = driver.findElement(By.id("passContainer")).getSize().getWidth();
        if (emailH1 == passH1 && emailW1 == passW1) {
            System.out.println("Pass: both are Same size");
        } else {
            System.out.println("Fail: difference in the size");
        }
        WebElement login = driver.findElement(By.name("login"));
        String tagName = login.getTagName();
        System.out.println("tagName of LOGIN button: " + tagName);
        String tagText = login.getText();
        System.out.println("tagText of LOGIN button: " + tagText);
        String AttributeValue = login.getAttribute("type");
        System.out.println("AttributeValue of LOGIN button: " + AttributeValue);
        String cssValue = login.getCssValue("font-size");
        System.out.println("cssValue of LOGIN button: " + cssValue);
        boolean enabledLogin = login.isEnabled();
        if (enabledLogin) {
            System.out.println("Pass: Login button is enabled");
        } else {
            System.out.println("Fail: Login button is disabled");
        }
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        WebElement signup = driver.findElement(By.name("websubmit"));
        boolean signupDisplayed = signup.isDisplayed();
        if (!signupDisplayed) {
            System.out.println("Fail: signup button is not displayed");
        } else {
            System.out.println("Pass: signup button is displayed");
        }
        WebElement femaleRadiobutton = driver.findElement(By.xpath("//label[contains(text(),'Female')]/../input"));
        int femaleRadioButton = femaleRadiobutton.getLocation().getY();
        int maleRadioButton = driver.findElement(By.xpath("//label[contains(text(),'Male')]/../input")).getLocation().getY();
        int customRadioButton = driver.findElement(By.xpath("//label[contains(text(),'Custom')]/../input")).getLocation().getY();
        if (femaleRadioButton == maleRadioButton && maleRadioButton == customRadioButton) {
            System.out.println("Radio buttons are aligned");
        } else {
            System.out.println("Radio buttons are mis-aligned");

        }
        femaleRadiobutton.click();
        if (femaleRadiobutton.isSelected()) {
            System.out.println("Pass: radio button is selected");
        } else {
            System.out.println("Fail: radio button is not selected");
        }
        signup.submit();
    }
}

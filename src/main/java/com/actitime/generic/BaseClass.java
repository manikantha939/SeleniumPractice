package com.actitime.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseClass {
    public WebDriver driver=new ChromeDriver();

    @BeforeClass
    public void openBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost/login.do");
        Reporter.log("openBrowser",true);
    }
    @BeforeMethod
    public void login(){
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
    }
    @AfterMethod
    public void logout(){
        driver.findElement(By.id("logoutLink")).click();
        Reporter.log("logout",true);
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
        Reporter.log("closeBrowser", true);
    }

}

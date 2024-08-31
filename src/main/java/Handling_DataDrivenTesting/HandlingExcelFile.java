package Handling_DataDrivenTesting;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

public class HandlingExcelFile {
    public static void main(String[] args) throws IOException, InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

//        FileInputStream propFile = new FileInputStream("D:\\Projects\\SeleniumPractice\\Test_Data\\Handling_DataDrivenTestingFile\\Commondata.properties");
//        Properties p = new Properties();
//        p.load(propFile);
//        String url = p.get("url").toString();
//        driver.get(url);

        FileInputStream fis = new FileInputStream("D:\\Projects\\SeleniumPractice\\Test_Data\\Handling_DataDrivenTestingFile\\Actitime_signin_Testcase.xlsx");
//        FileOutputStream fout = new FileOutputStream("D:\\Projects\\SeleniumPractice\\Test_Data\\Handling_DataDrivenTestingFile\\Actitime_signin_Testcase.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        ArrayList<String> val = new ArrayList<>();
        int lastRow = wb.getSheet("Actitime_Signin_TestCase").getLastRowNum();

        for (int i = 1; i <= lastRow; i++) {
            int lastCellNum = wb.getSheet("Actitime_Signin_TestCase").getRow(i).getLastCellNum();
            for (int j = 0; j < lastCellNum; j++) {
                String actitimeSigninTestCase = wb.getSheet("Actitime_Signin_TestCase").getRow(i).getCell(j).getStringCellValue();
                System.out.println(actitimeSigninTestCase);
                val.add(actitimeSigninTestCase);
            }
            Thread.sleep(2000);
            for (String v:val) {
                System.out.println(v);
            }
//            driver.findElement(By.id("username")).sendKeys(val.get(0));Thread.sleep(2000);
//            driver.findElement(By.name("pwd")).sendKeys(val.get(1));Thread.sleep(2000);
//            driver.findElement(By.xpath("//div[text()='Login ']")).click();Thread.sleep(2000);
//            WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
//            boolean displayed = logout.isDisplayed();
//            if (displayed) {
//                wb.getSheet("Actitime_Signin_TestCase").getRow(i).getCell(2).setCellValue("Pass");
//                wb.write(fout);
//                wb.close();
//                logout.click();
//            } else {
//                wb.getSheet("Actitime_Signin_TestCase").getRow(i).getCell(2).setCellValue("Fail");
//                wb.write(fout);
//                wb.close();
//            }
        }
    }
}

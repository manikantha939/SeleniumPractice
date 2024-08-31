package Asignments;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class Assignment32 {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://online.actitime.com/fireflink3/login.do");

        FileInputStream fis = new FileInputStream("./Test_Data/Handling_DataDrivenTestingFile/Actitime_signin_Testcase.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        int count = wb.getSheet("testscript").getLastRowNum();
        for (int i = 0; i < count; i++) {
            String un = wb.getSheet("testscript").getRow(i).getCell(0).getStringCellValue();
            String pwd = wb.getSheet("testscript").getRow(i).getCell(1).getStringCellValue();

            driver.findElement(By.id("username")).sendKeys(un);
            driver.findElement(By.name("pwd")).sendKeys(pwd);
            driver.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(2000);
            try {
                driver.findElement(By.id("logoutLink")).click();
                wb.getSheet("testscript").getRow(i).getCell(2).setCellValue("Pass");

            } catch (NoSuchElementException e) {
//                System.out.println(e.getMessage());
                wb.getSheet("testscript").getRow(i).getCell(2).setCellValue("Fail");
            }
            FileOutputStream fout = new FileOutputStream("./Test_Data/Handling_DataDrivenTestingFile/Actitime_signin_Testcase.xlsx");
            wb.write(fout);
        }
        driver.close();
    }
}

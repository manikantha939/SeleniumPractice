package Udemy.Section30;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class DataExcel {
    static XSSFWorkbook wb;
    static int rowCount;
    FileInputStream fis;

    public static void setData(boolean value, int count) throws FileNotFoundException {
//        for (int i=1;i<rowCount;i++){
        if (value) {
            wb.getSheetAt(0).getRow(count).getCell(2).setCellValue("Pass");
        } else {
            wb.getSheetAt(0).getRow(count).getCell(2).setCellValue("Fail");
        }
//        }
    }

    @Test(dataProvider = "driveTest")
    public void testCaseData(String username, String password, String Status) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://online.actitime.com/fireflink3/login.do");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.name("pwd")).sendKeys(password);
        driver.findElement(By.xpath("//div[text()='Login ']")).click();

        Thread.sleep(2000);
        String title = driver.getTitle();
        int count = 1;
        if (!title.equalsIgnoreCase("actiTIME - Login")) {
            System.out.println("pass");
            setData(true, count);
            count++;
        } else {
            System.out.println("fail");
            setData(false, count);
            count++;

        }
        FileOutputStream fout = new FileOutputStream("D:\\Projects\\SeleniumPractice\\Test_Data\\Handling_DataDrivenTestingFile\\Actitime_signin_Testcase1.xlsx");
        wb.write(fout);
        wb.close();
        driver.quit();
    }

    @DataProvider(name = "driveTest")
    public Object[][] getData() throws IOException {
        DataFormatter formatter = new DataFormatter();
        fis = new FileInputStream("D:\\Projects\\SeleniumPractice\\Test_Data\\Handling_DataDrivenTestingFile\\Actitime_signin_Testcase1.xlsx");
        wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        rowCount = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(0);
        int column = row.getLastCellNum();
        Object data[][] = new Object[rowCount - 1][column];
        for (int i = 0; i < rowCount - 1; i++) {
            row = sheet.getRow(i + 1);
            for (int j = 0; j < column; j++) {
                XSSFCell cell = row.getCell(j);
                System.out.println(cell.getStringCellValue());
                data[i][j] = formatter.formatCellValue(cell);
            }
        }
        return data;
    }

    public static class test {
//        public static void main(String[] args) throws IOException {
//            DataDrivenExcel d=new DataDrivenExcel();
//            ArrayList<String> purchase = d.excelData("Purchase");
//            Iterator<String> i = purchase.iterator();
//            while (i.hasNext()){
//                String next = i.next();
//                System.out.println(next);
//            }
//
//        }
    }
}

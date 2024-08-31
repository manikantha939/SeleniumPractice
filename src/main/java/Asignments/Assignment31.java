package Asignments;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

public class Assignment31 {
    static Workbook wb;

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        FileInputStream fis = new FileInputStream("D:\\Projects\\SeleniumPractice\\Test_Data\\Handling_DataDrivenTestingFile\\Actitime_signin_Testcase.xlsx");
        wb = WorkbookFactory.create(fis);
        int rowCount = wb.getSheet("Actitime_Signin_TestCase").getLastRowNum();

        for (int i = 1; i <= rowCount; i++) {
            ArrayList<String> data = getData(i);
            String username = data.get(0);
            String password = data.get(1);

            driver.get("https://online.actitime.com/fireflink3/login.do");
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.name("pwd")).sendKeys(password);
            driver.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(2000);

            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.contains("login")) {
                setData(i, false);
            } else {
                setData(i, true);
                driver.findElement(By.xpath("//div/a[text()='Logout']")).click();
            }
        }

        FileOutputStream fout = new FileOutputStream("D:\\Projects\\SeleniumPractice\\Test_Data\\Handling_DataDrivenTestingFile\\Actitime_signin_Testcase.xlsx");
        wb.write(fout);
        wb.close();

        driver.quit();
    }

    //To get the data from specified row
    public static ArrayList<String> getData(int row) throws IOException {
        ArrayList<String> a = new ArrayList<>();
        int lastCell = wb.getSheet("Actitime_Signin_TestCase").getRow(row).getLastCellNum();
        for (int i = 0; i < lastCell - 1; i++) {
//            CellType ceelType = wb.getSheet("Actitime_Signin_TestCase").getRow(row).getCell(i).getCellType();
//            System.out.println(ceelType);
//            if (ceelType==CellType.STRING) {
            String value = wb.getSheet("Actitime_Signin_TestCase").getRow(row).getCell(i).getStringCellValue();
            a.add(value);
//            }else if (ceelType==CellType.NUMERIC){
//                double value = wb.getSheet("Actitime_Signin_TestCase").getRow(row).getCell(i).getNumericCellValue();
//                a.add(String.valueOf(value));
//            }
        }
        return a;
    }

    //To write the data into specified column
    public static void setData(int row, boolean status) throws IOException {
        int cellNum = getCell("Status");
        System.out.println(cellNum);
//        int cellNum = wb.getSheet("Actitime_Signin_TestCase").getRow(row).getLastCellNum();
        if (status) {
            wb.getSheet("Actitime_Signin_TestCase").getRow(row).getCell(cellNum).setCellValue("Pass");//cellNum or cellNum-1
        } else {
            wb.getSheet("Actitime_Signin_TestCase").getRow(row).getCell(cellNum).setCellValue("Fail");
        }
    }

    //to get the particular column number
    public static int getCell(String columnName) {
        Row firstRow = wb.getSheet("Actitime_Signin_TestCase").getRow(0);
        Iterator<Cell> cellIterator = firstRow.cellIterator();
        int count = 0;
        int column = 0;
        while (cellIterator.hasNext()) {
            Cell cellValue = cellIterator.next();
            if (cellValue.getStringCellValue().equalsIgnoreCase(columnName)) {
                column = count;
                break;
            }
            count++;
        }
        return column;
    }
}
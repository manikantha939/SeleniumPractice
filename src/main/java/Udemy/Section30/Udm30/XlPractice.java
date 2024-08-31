package Udemy.Section30.Udm30;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class XlPractice {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("testData/DataDriven.xlsx");
        Workbook wb = WorkbookFactory.create(fin);
        Sheet sh = wb.getSheet("Sheet1");
        Row row = sh.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(cell.getStringCellValue());
        wb.close();

        //to generate random number
        Random ran = new Random();
        for (int i = 0; i < 5; i++) {
            int v = ran.nextInt(1000);
            System.out.println(v);
        }
    }
}

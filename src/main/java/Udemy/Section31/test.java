package Udemy.Section31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {

    }

    public ArrayList<String> excelDataRead(String row) {
        ArrayList<String> a = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("D:\\Projects\\SeleniumPractice\\Test_Data\\Handling_DataDrivenTestingFile\\fruitName.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            int sheets = wb.getNumberOfSheets();
            for (int i = 0; i < sheets; i++) {
                if (wb.getSheetName(i).equalsIgnoreCase("sheet1")) {
                    XSSFSheet sheet = wb.getSheetAt(i);
                    Iterator<Row> rows = sheet.iterator();
                    Row firstRow = rows.next();
                    Iterator<Cell> ce = firstRow.cellIterator();
                    int k = 0;
                    int column = 0;
                    while (ce.hasNext()) {
                        Cell value = ce.next();
                        if (value.getStringCellValue().equalsIgnoreCase("price")) {
                            column = k;
                        }
                        k++;
                    }
                    System.out.println("column: " + column);

                    while (rows.hasNext()) {
                        Row r = rows.next();
                        if (r.getCell(column).getStringCellValue().equalsIgnoreCase(row)) {
                            Iterator<Cell> cv = r.cellIterator();
                            while (cv.hasNext()) {
                                Cell c = cv.next();
                                if (c.getCellType() == CellType.STRING) {
                                    a.add(cv.next().getStringCellValue());
                                } else {
                                    a.add(NumberToTextConverter.toText(cv.next().getNumericCellValue()));
                                }

                            }
                        }

                    }


                }

            }
        } catch (Exception e) {

        }
        return a;
    }


}

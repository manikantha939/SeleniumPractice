package Udemy.Section30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class XLread {
	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("testData/DataDriven.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		int numberOfSheets = workbook.getNumberOfSheets();
		for (int i=0;i<numberOfSheets;i++){
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")){
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> ce = firstRow.cellIterator();
				int k=0;
				int column=0;
				while (ce.hasNext()){
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Data1")) {
						column=k;
					}
					k++;
				}
				System.out.println(column);
			}
		}

	}
}

package Udemy.Section30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class DataDrivenExcel {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }
//    public ArrayList<String> excelData(String row) throws IOException {
//        FileInputStream fis=new FileInputStream("D:\\Projects\\SeleniumPractice\\Test_Data\\Handling_DataDrivenTestingFile\\demodata.xlsx");
//        XSSFWorkbook wb=new XSSFWorkbook(fis);
//
//        ArrayList<String > a=new ArrayList<>();
//
//        int sheets = wb.getNumberOfSheets();
//        for (int i=0;i<sheets;i++){
////            String sheetName = wb.getSheetName(i);
////            System.out.println(sheetName);
//            if(wb.getSheetName(i).equalsIgnoreCase("testdata")){
//                XSSFSheet sheet = wb.getSheetAt(i);
//                Iterator<Row> rows = sheet.iterator();
//                Row firstRow = rows.next();
//                Iterator<Cell> ce = firstRow.cellIterator();
//                int k=0;
//                int column=0;
//                while (ce.hasNext()){
//                    Cell next = ce.next();
//                    if(next.getStringCellValue().equalsIgnoreCase("TestCases")){
//                        column=k;
//                        break;
//                    }
//                    k++;
//                }
////                System.out.println(column);
//                while (rows.hasNext()){
//                    Row r = rows.next();
//                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase(row)){
//                        Iterator<Cell> cv = r.cellIterator();
//                        while (cv.hasNext()){
//                            a.add(cv.next().getStringCellValue());
//                        }
//                    }
//                }
//            }
//        }
////        for (String s: a) {
////            System.out.println(s);
////        }
//        return a;
//    }
}

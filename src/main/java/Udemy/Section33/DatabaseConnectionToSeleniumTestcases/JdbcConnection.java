package Udemy.Section33.DatabaseConnectionToSeleniumTestcases;

import java.sql.*;

public class JdbcConnection {
    public static void main(String[] args) throws SQLException, InterruptedException {
        String host = "localhost";
        String port = "3306";
        String databaseName = "qadbt";
        Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + databaseName,
                "root", "Password@123");
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select * from Employeeinfo;");
        resultSet.next();
        int row = resultSet.getRow();
        System.out.println(row);
        int columnCount = resultSet.getMetaData().getColumnCount();
        System.out.println(columnCount);
        Object[][] data = new Object[row][columnCount];
        System.out.println(data);
//        while (resultSet.next()){
//            String name = resultSet.getString("name");
//            String loc = resultSet.getString("location");
//            WebDriver driver=new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://online.actitime.com/fireflink3/login.do");
//            driver.findElement(By.id("username")).sendKeys(name);
//            driver.findElement(By.name("pwd")).sendKeys(loc);
//
//
//            Thread.sleep(2000);
//            driver.quit();
//        }
    }
}

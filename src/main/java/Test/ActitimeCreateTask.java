package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ActitimeCreateTask {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        //random
//        Random random=new Random();
//        int id = random.nextInt(1000);
//        String designOfFramework="Design of Framework"+id;
//        String developmentOfFramework="Development of Framework"+id;
//        String executionOfFramework="Execution of Framework"+id;
//
//        //loginpage
//        driver.get("http://localhost/login.do");
//        driver.findElement(By.id("username")).sendKeys("admin");
//        driver.findElement(By.name("pwd")).sendKeys("manager");
//        driver.findElement(By.xpath("//div[text()='Login ']")).click();
//
//        //tasks
//        driver.findElement(By.xpath("//div[text()='TASKS']")).click();
//        driver.findElement(By.xpath("//div[text()='Add New Task']")).click();
//        driver.findElement(By.xpath("//div[text()='Create new tasks']")).click();
//
//        Thread.sleep(2000);
//        driver.findElement(By.id("createTasksPopup_customerSelector")).click();
//        driver.findElement(By.xpath("//a[text()='Boston Chocolate']")).click();
//
//        driver.findElement(By.id("createTasksPopup_projectSelector")).click();
//        driver.findElement(By.xpath("//a[text()='Consulting']")).click();
//
//        driver.findElement(By.xpath("(//div[@id='createTasksPopup_createTasksTableContainer']//input[@placeholder='Enter task name'])[1]")).sendKeys(designOfFramework);
//        driver.findElement(By.xpath("(//div[@id='createTasksPopup_createTasksTableContainer']//input[@placeholder='Enter task name'])[1]/../..//button[text()='set deadline']")).click();
//        driver.findElement(By.xpath("//button[text()='August 2024']/../../../../../../../..//td[@class='x-date-active']//*[text()='30']")).click();
//        driver.findElement(By.id("ext-gen58")).click();
//        driver.findElement(By.xpath("//a[text()='design']")).click();
//        driver.findElement(By.xpath("(//div[@id='createTasksPopup_createTasksTableContainer']//input[@placeholder='Enter task name'])[1]/../..//td[@class='addToTTCell']")).click();
//
//        driver.findElement(By.xpath("(//div[@id='createTasksPopup_createTasksTableContainer']//input[@placeholder='Enter task name'])[2]")).sendKeys(developmentOfFramework);
//        driver.findElement(By.xpath("(//div[@id='createTasksPopup_createTasksTableContainer']//input[@placeholder='Enter task name'])[2]/../..//button[text()='set deadline']")).click();
//        driver.findElement(By.xpath("//button[text()='August 2024']/../../../../../../../..//td[@class='x-date-active']//*[text()='30']")).click();
//        driver.findElement(By.id("ext-gen58")).click();
//        driver.findElement(By.xpath("//a[text()='programming']")).click();
//        driver.findElement(By.xpath("(//div[@id='createTasksPopup_createTasksTableContainer']//input[@placeholder='Enter task name'])[2]/../..//td[@class='addToTTCell']")).click();
//
//        driver.findElement(By.xpath("(//div[@id='createTasksPopup_createTasksTableContainer']//input[@placeholder='Enter task name'])[3]")).sendKeys(executionOfFramework);
//        driver.findElement(By.xpath("(//div[@id='createTasksPopup_createTasksTableContainer']//input[@placeholder='Enter task name'])[3]/../..//button[text()='set deadline']")).click();
//        driver.findElement(By.xpath("//button[text()='August 2024']/../../../../../../../..//td[@class='x-date-active']//*[text()='30']")).click();
//        driver.findElement(By.id("ext-gen58")).click();
//        driver.findElement(By.xpath("//a[text()='testing']")).click();
//        driver.findElement(By.xpath("(//div[@id='createTasksPopup_createTasksTableContainer']//input[@placeholder='Enter task name'])[3]/../..//td[@class='addToTTCell']")).click();
//
//        driver.findElement(By.id("createTasksPopup_commitBtn")).click();
//
//
//        //time track
//        driver.findElement(By.xpath("//div[text()='TIME-TRACK']")).click();
//        List<WebElement> tasks = driver.findElements(By.className("task"));
//        for (WebElement task: tasks) {
//            String taskName = task.getText();
//            System.out.println(taskName);
//            Thread.sleep(2000);
//            if(task.getText().equals(designOfFramework) || task.getText().equals(developmentOfFramework) ||task.getText().equals(executionOfFramework)){
//                driver.findElement(By.xpath("//span[text()='"+taskName+"']")).click();
//                Thread.sleep(2000);
//                driver.findElement(By.className("selectedStatusContainer")).click();
//                driver.findElement(By.xpath("//a[text()='Completed']")).click();
//                driver.findElement(By.id("editTaskPopup_commitBtn")).click();
//            }
//        }
//    }

    public static void main(String[] args)
    {
        int num=145;
        System.out.println(reverseNumber(num,0));
    }

    public static  int reverseNumber(int num, int rev) {
        if(num>0) {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
//            if(num>0) {
//                rev = reverseNumber(num,rev);
//            }
        }
        return rev;
    }
}

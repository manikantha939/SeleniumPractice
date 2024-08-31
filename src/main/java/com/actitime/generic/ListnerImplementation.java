package com.actitime.generic;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ListnerImplementation extends BaseClass implements ITestListener {

//    @Override
//    public void onTestStart(ITestResult result) {
//        System.out.println("onTestStart"+ result.getName());
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        System.out.println("onTestSuccess"+ result.getName());
//    }

    @Override
    public void onTestFailure(ITestResult result) {
        String res = result.getName().concat("-"+result.id());
        System.out.println("onTestFailure"+ result.getName());

        TakesScreenshot ts= (TakesScreenshot) driver;
        try {
            FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),
                    new File("./screenshots/"+res+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public void onTestSkipped(ITestResult result) {
//        System.out.println("onTestSkipped"+ result.getName());
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//        System.out.println("onTestFailedButWithinSuccessPercentage"+ result.getName());
//    }
//
//    @Override
//    public void onTestFailedWithTimeout(ITestResult result) {
//        System.out.println("onTestFailedWithTimeout"+ result.getName());
//    }
//
//    @Override
//    public void onStart(ITestContext context) {
//        System.out.println("onStart"+ context.getName());
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//        System.out.println("onFinish"+ context.getName());
//    }
}

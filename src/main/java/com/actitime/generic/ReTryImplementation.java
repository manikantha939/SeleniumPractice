package com.actitime.generic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryImplementation implements IRetryAnalyzer {
    int counter = 0;
    int retryLimit = 5;

    @Override
    public boolean retry(ITestResult result) {
        if (counter < retryLimit) {
            counter++;
            return true;
        } else {
            return false;
        }

    }
}

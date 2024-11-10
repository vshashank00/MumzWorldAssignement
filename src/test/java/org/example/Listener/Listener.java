package org.example.Listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.example.Utils.Report;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends Report implements ITestListener{
    ExtentReports extentReports=Report.getReportObject();
    ExtentTest test;
    @Override
    public void onTestStart(ITestResult result) {
        extentReports.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }
}

package org.example.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestResult;

public abstract class Report {
    static ExtentReports extent;
    public  static ExtentReports getReportObject()
    {
        String path = System.getProperty("user.dir")+"/Reports//index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter (path);
        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("Test Results");
        extent =new ExtentReports();
        extent.attachReporter (reporter);
        extent.setSystemInfo("Tester", "Shashank");
        return extent;
    }}


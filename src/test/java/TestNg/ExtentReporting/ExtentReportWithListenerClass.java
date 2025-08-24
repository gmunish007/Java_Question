package TestNg.ExtentReporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportWithListenerClass {

    public void getReport(){
        String systemPath = System.getProperty("user.dir");
        ExtentSparkReporter reporter = new ExtentSparkReporter(systemPath+"\\reports\\extentReport.html");
        reporter.config().setReportName("Extent Report");
        reporter.config().setDocumentTitle("First Report");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
    }
}

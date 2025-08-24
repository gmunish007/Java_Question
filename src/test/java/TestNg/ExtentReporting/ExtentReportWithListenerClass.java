package TestNg.ExtentReporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class ExtentReportWithListenerClass {

    static WebDriver driver;

    @BeforeMethod
    public void getDriver(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    public static ExtentReports getReport() {
        String systemPath = System.getProperty("user.dir");
        ExtentSparkReporter reporter = new ExtentSparkReporter(systemPath + "\\reports\\extentReport.html");
        reporter.config().setReportName("Extent Report");
        reporter.config().setDocumentTitle("First Report");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        return extent;
    }

    public static void getScreenshot(String testname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("user.dir" + "\\screenshot\\" + testname + "_img.png"));
    }
}

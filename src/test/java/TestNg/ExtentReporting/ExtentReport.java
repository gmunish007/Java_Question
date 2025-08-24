package TestNg.ExtentReporting;

import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

    public ExtentReports extent;

    @BeforeTest
    public void config(){

        String path = System.getProperty("user.dir")+"\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path); //creating extent report and setting configuration
        reporter.config().setDocumentTitle("Extent report title");
        reporter.config().setReportName("Report Name");

        extent = new ExtentReports(); //execution part
        extent.attachReporter(reporter); // attaching above created report
    }

    @Test
    public void initialDemo(){

        extent.createTest("Initial Demp"); // creating report of this method and adding it to extent report

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String getTitle = driver.getTitle();
        System.out.println("Title is:"+getTitle);
        String getUrl = driver.getCurrentUrl();
        System.out.println("Url is :"+getUrl);

        extent.flush(); // signifies that execution is complete
    }
}

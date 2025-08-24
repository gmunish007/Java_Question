package TestNg.Listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class Listeners1 implements ITestListener {

    WebDriver driver;

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);

        System.out.println("this method will launch on script failure.");

        // taking screenshot on script start
        WebDriver driver = TestngListeners.driver;

        TakesScreenshot obj = (TakesScreenshot)driver;
        File file = obj.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("failure.png "));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);

        System.out.println("this method will launch on script start.");
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }

    @Override
    public boolean isEnabled() {
        return ITestListener.super.isEnabled();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);

        System.out.println("this will print after every success.");
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }
}

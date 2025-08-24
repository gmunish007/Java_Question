package TestNg.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getDataFromProperties {

    @Test
    public void getData() throws IOException {
        Properties ps = new Properties();
        FileInputStream fs = new FileInputStream("D:\\Testing\\Projects\\InterviewQuestions\\src\\test\\java\\TestData.properties");
        ps.load(fs);

        WebDriver driver = new ChromeDriver();
        driver.get(ps.getProperty("url"));
        driver.manage().window().maximize();
    }
}

package Cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {

    static WebDriver driver;

    @Before
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--Headless=new");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().window().maximize();
    }

    @After(order=2)
    public void tearDown(){
        System.out.println("teat down");
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    @After(order=0)
    public void tear(){
        System.out.println("print last");
    }
}

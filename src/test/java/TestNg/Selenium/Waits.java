package TestNg.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // implicitly wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("aaa")));
    }
}

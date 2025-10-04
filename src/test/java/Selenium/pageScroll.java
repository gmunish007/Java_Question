package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageScroll {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,500)"); // scroll to 500 pixels
        js.executeScript("window.scrollBy(0, 500)"); // scroll up by 500 pixels
    }
}

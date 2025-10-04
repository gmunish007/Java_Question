package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;

import java.time.Duration;

public class windowSwitch {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Actions a = new Actions(driver);
        WebElement conClick = driver.findElement(By.xpath("//a[@aria-label='Search for Images ']"));

        a.moveToElement(conClick).keyDown(Keys.CONTROL).click().build().perform();

        Set<String> windowHandles = driver.getWindowHandles();



    }
}

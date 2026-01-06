import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;

public class calendarUI {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        String month = "12";
        String date = "7";
        String year = "2030";

        String[] expectedResult = {month, date, year};

        // click on calendar
        driver.findElement(By.className("react-date-picker__inputGroup")).click();

        // click on calendar
        driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();

        // click on month from calendar
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

        // click on year from calendar
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

        // click on year
        driver.findElement(By.xpath("//button[text()='" + year + "']")).click();

        // clicking on month
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month) - 1).click();

        // clicking on date
        driver.findElement(By.xpath("//button/abbr[text()='" + date + "']")).click();

        // Get current date from calendar
        //String currentDate = driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).getText();

        List<WebElement> dateLst = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

        for (int i = 0; i < dateLst.size(); i++) {
            System.out.println(dateLst.get(i).getAttribute("value"));
            Assert.assertEquals(dateLst.get(i).getAttribute("value"), expectedResult[i + 1]);
        }
    }
}

package JavaQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytripCalendarEvent {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.className("commonModal__close")).click();

        String monthName = "February";
        //DayPicker-Months

        // click on calendar
        driver.findElement(By.cssSelector("div[class='flt_fsw_inputBox dates inactiveWidget ']")).click();

        // get the name of month
        List<WebElement> monthList = driver.findElements(By.xpath("//div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']"));

        for (int i = 0; i < monthList.size(); i++) {
            System.out.println(monthList.get(i).getText());

            Thread.sleep(2000);

            if (monthList.get(i).getText().contains(monthName)) {
                List<WebElement> dateList = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/parent::div/div[@class='DayPicker-Body']/div/div[@class='DayPicker-Day']/div/p[1]"));

                for (int i1 = 0; i1 < dateList.size(); i1++) {
                    System.out.println(dateList.get(i1).getText());

                    if (dateList.get(i1).getText().matches("18")) {
                        dateList.get(i1).click();
                        break;
                    }
                }
            }
        }
    }
}

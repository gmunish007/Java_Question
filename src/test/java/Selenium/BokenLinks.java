package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BokenLinks {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        SoftAssert softAssert = new SoftAssert();

        int linkSize = driver.findElements(By.tagName("a")).size();
        System.out.println(linkSize);

        String hrefAtt = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
        System.out.println(hrefAtt);

        // checking all urls from footer
        List<WebElement> lst = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

        for (int i = 0; i < lst.size(); i++) {
            //System.out.println(lst.get(i).getAttribute("href"));

            String urlDriver = lst.get(i).getDomAttribute("href");

            //URL is the class
            //openConnection is method of URl class
            // HttpURLConnection is the return type of openConnection()
            //(HttpURLConnection) typecasting object
            HttpURLConnection conn = (HttpURLConnection) new URL(urlDriver).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int responseCode = conn.getResponseCode();

            System.out.println("responseCode: " + responseCode);

            if(responseCode > 400){
                System.out.println(lst.get(i).getText()+" "+responseCode); //this will print the text that are broken with response code ?400
                softAssert.assertTrue(false);
            }

        }


        driver.quit();
    }
}

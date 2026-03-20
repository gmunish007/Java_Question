import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class brokenLinks {

	public static void main(String[] args) throws IOException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		// page scroll to the botton
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 1800)");

		// Taking page screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File("C:\\\\Users\\\\MU20261457\\\\Desktop\\\\screenshot.png"));

		// Get href value of all links from the footer section
		List<WebElement> linkLst = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		for (WebElement link : linkLst) {
			String url = link.getAttribute("href");
			System.out.println(url);

			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			int respCode = conn.getResponseCode();

			System.out.println(respCode);
			
			if(respCode > 400) {
				System.out.println("broken link is: "+link.getText()+" with code: "+respCode);
				Assert.assertTrue(false);
			}
		}
	}
}

package Selenium.Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class explicitWaitAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().window().maximize();

		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(4));

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.xpath("//div[@class='form-check-inline']/label/following-sibling::label")).click();

		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		// click on okay button on pop up window
		driver.findElement(By.id("okayBtn")).click();

		WebElement dropDown = driver.findElement(By.cssSelector("select[class='form-control']"));

		Select st = new Select(dropDown);
		st.selectByValue("consult");

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("signInBtn")).click();

		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-footer']/button")));

		// click on Add button
		List<WebElement> btnLst = driver.findElements(By.xpath("//div[@class='card-footer']/button"));

		/*
		 * for(int i=0; i<btnLst.size(); i++) { btnLst.get(i).click(); }
		 */

		for (WebElement option : btnLst) {
			option.click();
		}

		// click checkout button
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();

	}
}

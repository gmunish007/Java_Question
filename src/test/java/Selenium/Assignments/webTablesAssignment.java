package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class webTablesAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");

		Thread.sleep(2000);

		// print number of rows inside Table
		System.out.println("Number of Rows inside the table: "
				+ driver.findElements(By.cssSelector("table[class='table-display'] tbody tr")).size());

		// print number of columns inside table
		System.out.println("Number of Columns inside the table: "
				+ driver.findElements(By.cssSelector("table[class='table-display'] tbody tr th")).size());

		// print second row data from table
		System.out.println("Print data of Second Row from the table: "
				+ driver.findElements(By.cssSelector("table[class='table-display'] tbody tr:nth-child(1) th")).size());
	}

}

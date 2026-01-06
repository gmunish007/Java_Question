package Selenium.Streams;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

public class sorting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Get table 1 column data
		List<WebElement> elementList = driver
				.findElements(By.cssSelector("table[class='table table-bordered'] tbody tr td:nth-child(1)"));

		
		// Convert the list into Stream, get text of each element, sort it, and then print it
		elementList.stream().map(s -> s.getText()).sorted().forEach(s -> System.out.println("Stream data: "+s));

		
		// convert the list into Stream, get text of it, store it into a List 1
		List<String> originalLst = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		
		// sort the list above created and store it into a new List
		List<String> sortedList = originalLst.stream().sorted().collect(Collectors.toList());
		
		// Apply Assert to verify if both list equals each other
		Assert.assertTrue(originalLst.equals(sortedList));
		
		
	
		
	}
}

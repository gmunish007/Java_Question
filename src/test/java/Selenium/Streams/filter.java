package Selenium.Streams;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;

public class filter {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		String search = "Potato";
		// click on search field
		driver.findElement(By.id("search-field")).sendKeys(search);

		// get search result from the table
		List<WebElement> items = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		
		// apply filter on it, get its text and check if it contains input value and store it in a List filteredList.
		List<WebElement> filteredList = items.stream().filter(s -> s.getText().contains(search)).collect(Collectors.toList());
		
		// Apply assert value on it to check if the size of both matches or not
		Assert.assertEquals(items, filteredList);

	}
}

package Selenium.Streams;

import java.util.List;

import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettingParticularValue {

	public static void main(String[] args) {

		// get price of Rice

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Get table 1 column data
		List<WebElement> elementList = driver
				.findElements(By.cssSelector("table[class='table table-bordered'] tbody tr td:nth-child(1)"));

		// scan column with value "Beans" and get the price of it
		List<String> price = elementList.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
				.collect(Collectors.toList());

		price.forEach(a -> System.out.println(a));

	}

	private static String getPriceVeggie(WebElement s) {

		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}

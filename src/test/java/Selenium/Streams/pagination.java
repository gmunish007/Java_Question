package Selenium.Streams;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class pagination {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.manage().window().maximize();

		// getting 1st column data and storing in a List
		/*
		 * List<WebElement> elementList = driver.findElements(By.
		 * xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		 */

		List<String> price;

		do {

			// getting 1st column data for each page while loop executes and storing in a
			// List
			List<WebElement> rows = driver
					.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));

			price = rows.stream().filter(s -> s.getText().contains("Carrot")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());

			price.forEach(a -> System.out.println(a));

			// if Beans is not found in the list, then the size of list will be 0 and click
			// on Next button to move to next page
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size() < 1); // this do while loop will run till the size of price is less then 1
		// since price scope is only local to the do loop, we will declare it outside
		// the do loop

	}

	private static String getPriceVeggie(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;

	}

}

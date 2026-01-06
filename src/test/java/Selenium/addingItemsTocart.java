package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class addingItemsTocart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String[] names = { "Cucumber", "Brocolli", "Beetroot" };
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.manage().window().maximize();

		addItems(driver, names);

		// click Cart button
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

		// click Proceed to Checkout button
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEE')]")).click();

		// apply explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		
		// input promo code
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");

		// click promo apply button
		driver.findElement(By.cssSelector(".promoBtn")).click();

		// apply explicit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		// Get promo code success message
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	public static void addItems(WebDriver driver, String[] names) {

		List<WebElement> products = driver.findElements(By.className("product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {

			String name = products.get(i).getText().split("-")[0].trim();
			System.out.println(name);

			// converting Array names into ArrayList as ArrayList has contains() available.
			List<String> arrayLst = Arrays.asList(names);

			if (arrayLst.contains(name)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == names.length) {
					break;
				}
			}
		}
	}
}

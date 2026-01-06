package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class actionClass {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement move = driver.findElement(By.id("nav-link-accountList"));

		// clicking input box
		// press shift key
		// input mouse keyword in capital letters
		// select all characters by double clicking on it

		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mouse")
				.doubleClick().build().perform();

		
		// hover over Sign in Button
		// Right clicking on Sign in button
		
		a.moveToElement(move).contextClick().build().perform();
		
		System.out.println("upload this file now.");

	}
}

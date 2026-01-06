package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class linkCounts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();

		// print count of links present on the entire web page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Count of links present in Footer section
		// Limiting the scope of driver from Web page to just footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// getting count of links from first column in footer section
		WebElement footer1stCol = driver.findElement(By.id("gf-BIG"));

		WebElement colDriver = footer1stCol.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));

		System.out.println("Size of links in 1st column of footer: " + colDriver.findElements(By.tagName("a")).size());

		// click on each link in 1st column of footer section
		Actions a = new Actions(driver);
		a.moveToElement(colDriver).keyDown(Keys.CONTROL).click().build().perform();
		
		
		// Getting the titles of each page when clicked
		Set<String> getWindowID = driver.getWindowHandles();
		Iterator<String> iterateID = getWindowID.iterator();
		
		// use While loop to iterate each page and getting the title of it
		while(iterateID.hasNext()){
			
			driver.switchTo().window(iterateID.next());
			System.out.println(driver.getTitle());
		}		
	}
}

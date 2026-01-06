import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class additionInsideTable {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		// scroll the web page to the center using JS
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		Thread.sleep(3000);
		
		// scrolling inside the table using JS so the code can pick all the values from the table as well 
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		// get list of all numbers from the table
		
		List<WebElement> tableValue = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int num = 0;
		
		for(int i=0; i<tableValue.size(); i++) {
			
			//print list of all numbers by converting them to int from String
			//System.out.println(Integer.parseInt(tableValue.get(i).getText()));
			
			//addition of all numbers to num
			num = num + Integer.parseInt(tableValue.get(i).getText());
		}
		System.out.println(num);
		
		int addition = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		System.out.println(addition);
		
		Assert.assertEquals(num, addition);
		
	}

}

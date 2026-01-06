package Selenium.Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class dynamicDropDownAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String input = "Ind";
		String output = "India";

		// input value in input field
		driver.findElement(By.id("autocomplete")).sendKeys(input);

		Thread.sleep(2000);

		// get the list of options from drop down
		List<WebElement> lstOption = driver.findElements(By.id("ui-id-1"));

		for (int i = 0; i < lstOption.size(); i++) {
			System.out.println(lstOption.get(i).getText());
			
			if(lstOption.get(i).getText().contains(output)) {
				lstOption.get(i).click();
				break;
			}	
		}
		Thread.sleep(2000);
		
		// get text from input and print
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		WebElement value = driver.findElement(By.id("autocomplete"));
		
		Assert.assertEquals(output, value.getAttribute("value"));
	}
}

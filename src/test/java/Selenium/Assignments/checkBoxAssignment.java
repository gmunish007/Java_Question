package Selenium.Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class checkBoxAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		// Click the check box
		driver.findElement(By.name("checkBoxOption1")).click();

		// Assert the check box is checked
		Assert.assertTrue(driver.findElement(By.name("checkBoxOption1")).isSelected());

		// un check the check box
		driver.findElement(By.id("checkBoxOption1")).click();

		// Assert the check box is unchecked
		Assert.assertFalse(driver.findElement(By.name("checkBoxOption1")).isSelected());

		// count the check boxes
		System.out.println("Checkbox count: "
				+ driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label")).size());
	}

}

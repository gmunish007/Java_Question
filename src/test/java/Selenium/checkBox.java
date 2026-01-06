import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;

public class checkBox {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.xpath("//input[contains(@name, '$chk_SeniorCitizenDiscount')]")).click();		

		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());

		List<WebElement> str = driver.findElements(By.xpath("//input[@type='checkbox']"));

		int count = 0;

		for (WebElement option : str) {
			count++;
		}

		System.out.println(count);

		// another was of counting checkboxes:
		System.out.println("Count of Checkbox: " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//div[@class='ad-row']/div[2]/span/following-sibling::span[2]")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.className("paxinfo")).getText(), "4 Adult");

		System.out.println(driver.findElement(By.className("paxinfo")).getText());
	}

}

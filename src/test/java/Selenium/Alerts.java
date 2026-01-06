import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String name = "Munish";

		driver.findElement(By.name("enter-name")).sendKeys(name);

		// click on Alert button
		driver.findElement(By.xpath("//input[@value='Alert']")).click();

		// Print Alert window text
		System.out.println(driver.switchTo().alert().getText());

		String alertTxt = driver.switchTo().alert().getText();

		// Apply assert to verify text matching
		String strWhole = alertTxt.split(",")[0];

		for (int i = 0; i < strWhole.length();  i++) {
			String strUpdated = strWhole.split(" ")[1];

			System.out.println(strUpdated);
			Assert.assertEquals(strUpdated, name);
		}

		// switch to Alert window
		driver.switchTo().alert().accept();
		driver.quit();
	}
}

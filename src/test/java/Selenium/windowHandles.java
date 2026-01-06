
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.Iterator;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'Free Access to')]")).click();

		// Get all windows in a Set
		Set<String> windw = driver.getWindowHandles();

		System.out.println();

		// pulling parent and child window ID from SET
		Iterator<String> id = windw.iterator();

		// Gets the ID of parent and child window
		String parentID = id.next();
		String childID = id.next();

		System.out.println("parent id: " + parentID);
		System.out.println("child ID: " + childID);

		// switch to child window by passing child window ID as argument
		driver.switchTo().window(childID);

		Thread.sleep(2000);

		// Retrieve email address from the statement
		// Split the text with at keyword
		// Trim the spaces at the beginning
		// again split the text with empty space and get the email address with 0th index

		String emailID = driver.findElement(By.className("red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailID);

		driver.switchTo().window(parentID);
		
		driver.findElement(By.id("username")).sendKeys(emailID);

	}
}
